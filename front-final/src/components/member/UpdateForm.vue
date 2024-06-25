<template>
    <form>
        <div class="form-group">
            <label for="nickname">닉네임</label>
            <input type="text" id="nickname" v-model="nickname" class="form-control mb-2">
            <span v-if="isValidNickname != null && isValidNickname" class="valid">사용 가능한 닉네임입니다.</span>
            <span v-if="isValidNickname != null && !isValidNickname" class="error mb-2">이미 사용 중인 닉네임입니다.</span>
            <div v-show="isValidNickname != null && !isValidNickname && recommend_nickname_list.length > 0">
                추천 닉네임 : <span class="recommend-span" v-for="nickname in recommend_nickname_list" 
                :key="nickname.index" 
                @click="changeNicknameInput(nickname)">{{ nickname }}</span>
            </div>
        </div>
        <div class="form-group">
            <label for="password">비밀번호</label>
            <input type="password" id="password" v-model="password" class="form-control">
        </div>
        <div class="form-group">
            <label for="passwordcheck">비밀번호 확인</label>
            <input type="password" id="passwordcheck" v-model="passwordcheck" class="form-control">
            <span v-if="equalPassword != null && equalPassword" class="valid">비밀번호가 일치합니다.</span>
            <span v-if="equalPassword != null && !equalPassword" class="error">비밀번호가 일치하지 않습니다.</span>
        </div>
        <div class="form-group">
            <label for="profileImg">프로필 이미지</label><br>
            <input class="file-input" type="file" id="profileImg" @change="handleUpload" accept="image/*">
        </div>
        <button @click.prevent="updateMember(member.no)" class="button mb-2">수정</button>
        <a class="delete" @click="deleteMember">탈퇴하기</a>
    </form>
</template>

<script setup>
import { ref, defineProps, watch } from 'vue'
import api from '@/api'
import { useRouter } from 'vue-router'
import { useMemberStore } from '@/stores/member';
import { HttpStatusCode } from 'axios';
import axios from 'axios';

const router = useRouter()

const props = defineProps({
    member: Object
})

const nickname = ref(props.member?.nickname || '')
const password = ref('')
const profileImg = ref(null)
const passwordcheck = ref('')
const checkPassword = ref(false)
const equalPassword = ref(null)
const isValidNickname = ref(null)

let file;
const handleUpload = (event) => {
    file = event.target.files[0]
    if (file) {
        profileImg.value = file
    }
}

const updateMember = function (no) {
    if (equalPassword.value != null && !equalPassword.value) {
        alert('비밀번호를 확인해주세요.')
        return
    }
    if(!isValidNickname.value) {
        alert('닉네임을 확인해주세요.')
        return
    }
    const formData = new FormData()
    if (profileImg.value) {
        formData.append('file', profileImg.value);
    }
    formData.append('nickname', nickname.value)
    if (checkPassword.value) {
        formData.append('password', password.value)
    }

    api({
        url: `http://localhost:8080/member/${no}`,
        method: 'PUT',
        data: formData,
        headers: {
            'Content-Type': 'multipart/form-data'
        }
    }).then(response => {
        alert('회원 정보가 수정되었습니다.')
        router.push(`/member/${no}`).then(() => {
            window.location.reload();
        });

    }).catch(error => {
        console.error('회원 정보 수정 실패:', error)
        alert('회원 정보 수정에 실패했습니다.')
    })
}

const onFileChange = (event) => {
    const file = event.target.files[0]
    if (file) {
        profileImg.value = file
    }
}

const memberStore = useMemberStore()

const deleteMember = () => {
    if(!confirm('정말 탈퇴하시겠습니까?')) return
    memberStore.deleteMember()
}

watch(password, () => {
    checkPassword.value = true
    equalPassword.value = password.value === passwordcheck.value
})

watch(passwordcheck, () => {
    checkPassword.value = true
    equalPassword.value = password.value === passwordcheck.value
})

watch(nickname, () => {
    if(nickname.value === '') {
        isValidNickname.value = null
        return
    }
    api({
        url: 'http://localhost:8080/member',
        method: 'POST',
        data: {
            key: "nickname",
            value: nickname.value
        }
    }).then((res) => {
        if(res.status == HttpStatusCode.NoContent) {
            isValidNickname.value = true
            return
        }
        isValidNickname.value = false
        recommend('닉네임', nickname.value)
        return
    }).catch(err => console.log(err))
});


const recommend_nickname_list = ref([])

const changeNicknameInput = function(newNickname) {
    nickname.value = newNickname
}

const GOOGLE_API_KEY = 'AIzaSyB6rEmR5jltp1rL_RatJe3Ns31D7ku82gw'
const recommend = function(key, value) {
    axios({
        url: `https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent`,
        method:'POST',
        headers: {
        "Content-Type": "application/json",        
      },      
      params: {
        key: GOOGLE_API_KEY,
      },
      data: {
        "contents":[
            {"parts":[
                {"text":`사용자가 ${value}라는 닉네임을 입력했는데 이미 존재하는 닉네임래. 비슷한 닉네임 3개 "줄넘김 없이, 다른 특수문자나 공백 없이 각 닉네임 앞에 + 붙여서" 추천해줘`}
            ]
            }
        ]
    }
    }).then((res) => {
        
            recommend_nickname_list.value = (res.data.candidates[0].content.parts[0].text)
                    .split('+')
                    .map(str => str.trim()) 
                    .filter(Boolean);
        
    }).catch((err) => console.log(err))
}
</script>

<style scoped>
.form-group {
    margin-bottom: 1rem;
}

.error, .valid {
    font-size: 0.8rem;
    display: block;
}

.error {
    color: red;
}

.valid {
    color: green;
}

input[type="text"], input[type="password"], input[type="file"] {
    width: 70%;
    padding: 0.5rem;
    border-radius: 30px;
    border: 1px solid #ced4da;
    background-color: #f8f9fa;
    margin: auto;
}

.file-input {
    background: transparent !important;
    border: none !important;
}

button {
    margin: auto;
    display: block;
    width: 50%;
    padding: 10px;
    border-radius: 30px;
    border: none;
    background-color: rgb(183, 218, 247);
}
button:hover {
    background-color: rgb(220, 237, 251);
}
form {
    text-align: center;
    padding: 10px;
    padding-top: 20px;
}
label {
    font-size: 18px;
}
.delete {
    color: black;
}
.delete:hover {
    color: rgb(230, 7, 7)
}
.recommend-span {
    padding: 3px;
    padding-left: 5px;
    padding-right: 5px;
    color: white;
    margin: 3px;
    border-radius: 30px;
    background-color: rgb(123, 135, 146);
}

.recommend-span:hover {
    color: white;
    background-color: rgb(96, 122, 146);
}

</style>
