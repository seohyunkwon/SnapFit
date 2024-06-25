<template>
    <div class="app">
        <!-- title div -->
        <div class="title">
<<<<<<< HEAD
            <div class="line" style="animation-delay: 0s;">
                <h1>WELCOME!</h1>
            </div>
            <div class="line" style="animation-delay: 0.5s;">
                <p>언제 어디서나 SNAPFIT!<br>나만의 코치와 함께 도전해보세요!</p>
            </div>
=======
            <h1>WELCOME!</h1>
            <p>
                언제 어디서나 SSAFIT!<br>
                나만의 코치와 함께 도전해보세요!
            </p>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
        </div>

        <!-- 회원가입 폼 div -->
        <div class="signup-form">
<<<<<<< HEAD
            <form @submit.prevent="doSignup">
                <!-- 아이디 input  -->
                <div class="form-floating mb-3">
                    <input v-model="id" type="text" class="form-control" id="id" placeholder="아이디" required>
                    <label for="id">아이디</label>
                    <span v-if="isValidId != null && isValidId" class="valid mb-3">사용 가능한 아이디입니다.</span>
                    <span v-if="isValidId != null && !isValidId" class="error">이미 사용 중인 아이디입니다.</span>
                    <div v-show="isValidId != null && !isValidId && recommend_id_list.length > 0">
                        추천 아이디 : <span class="recommend-span" v-for="id in recommend_id_list" :key="id.index" @click="changeIdInput(id)">{{ id }}</span>
                    </div>
                </div>
                <!-- 비밀번호 input  -->
                <div class="form-floating mb-3">
                    <input v-model="password" type="password" class="form-control" id="password" placeholder="비밀번호" required>
=======
            <form>
                <!-- 아이디 input  -->
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="id" placeholder="아이디">
                    <label for="id">아이디</label>
                </div>
                <!-- 비밀번호 input  -->
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="password" placeholder="비밀번호">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
                    <label for="password">비밀번호</label>
                </div>
                <!-- 비밀번호 확인 input  -->
                <div class="form-floating mb-3">
<<<<<<< HEAD
                    <input v-model="passwordCheck" type="password" class="form-control" id="passwordCheck" placeholder="비밀번호" required>
                    <label for="passwordCheck">비밀번호 확인</label>
                    <span v-if="isValidPassword != null && isValidPassword" class="valid">비밀번호가 일치합니다.</span>
                    <span v-if="isValidPassword != null && !isValidPassword" class="error">비밀번호가 일치하지 않습니다.</span>
                </div>
                <!-- 닉네임 input  -->
                <div class="form-floating mb-3">
                    <input v-model="nickname" type="text" class="form-control" id="nickname" placeholder="닉네임" required>
                    <label for="nickname">닉네임</label>
                    <span v-if="isValidNickname != null && isValidNickname" class="valid">사용 가능한 닉네임입니다.</span>
                    <span v-if="isValidNickname != null && !isValidNickname" class="error">이미 사용 중인 닉네임입니다.</span>
                    <div v-show="isValidNickname != null && !isValidNickname && recommend_nickname_list.length > 0">
                        추천 닉네임 : <span class="recommend-span" v-for="nickname in recommend_nickname_list" 
                        :key="nickname.index" 
                        @click="changeNicknameInput(nickname)">{{ nickname }}</span>
                    </div>
                </div>
                <!-- 생년월일 input  -->
                <div class="form-floating mb-3">
                    <input v-model="birthDate" type="date" class="form-control" id="birth" placeholder="생년월일" required>
=======
                    <input type="password" class="form-control" id="passwordCheck" placeholder="비밀번호">
                    <label for="passwordCheck">비밀번호 확인</label>
                </div>
                <!-- 닉네임 input  -->
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nickname" placeholder="닉네임">
                    <label for="nickname">닉네임</label>
                </div>
                <!-- 생년월일 input  -->
                <div class="form-floating mb-3">
                    <input type="date" class="form-control" id="birth" placeholder="생년월일">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
                    <label for="birth">생년월일</label>
                </div>
                <!-- 성별 input  -->
                <div class="form-floating mb-3 gender">
                    <div class="form-check form-check-inline">
<<<<<<< HEAD
                        <input v-model="gender" class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="0" required>
                        <label class="form-check-label" for="inlineRadio1">여성</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input v-model="gender" class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="1" required>
=======
                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1"
                            value="option1">
                        <label class="form-check-label" for="inlineRadio1">여성</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2"
                            value="option2">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
                        <label class="form-check-label" for="inlineRadio2">남성</label>
                    </div>
                </div>
                <!-- 제출 버튼 -->
<<<<<<< HEAD
                <button type="submit" class="btn btn-signup">회원가입</button>
=======
                <input type="submit" class="btn btn-signup" value="회원가입">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
            </form>
        </div>
    </div>
</template>

<script setup>
<<<<<<< HEAD
import { ref, watch } from 'vue'
import { useMemberStore } from '@/stores/member';
import axios, { HttpStatusCode } from 'axios';
import api from '@/api';

const memberStore = useMemberStore()

const id = ref('');
const password = ref('');
const passwordCheck = ref('');
const nickname = ref('');
const birthDate = ref('');
const gender = ref('');

const doSignup = () => {
    if(!isValidId) {
        alert('아이디 중복 확인을 해주세요.')
        return
    }
    if(!isValidPassword) {
        alert('비밀번호를 다시 확인해주세요')
        return
    }
    if(!isValidNickname) {
        alert('닉네임 중복 확인을 해주세요.')
        return
    }
    // 회원 정보를 담은 객체 생성
    const member = {
        id: id.value,
        password: password.value,
        passwordCheck: passwordCheck.value,
        nickname: nickname.value,
        birthDate: birthDate.value,
        gender: gender.value
    };

    // 여기서 생성한 member 객체를 사용하여 회원 가입 처리 로직을 수행하면 됩니다.
    console.log('Signup information:', member);
    memberStore.signup(member)
    

    // 이후에 서버로 회원 정보를 전송하는 등의 작업을 수행할 수 있습니다.
};

const isValidId = ref(null)
const isValidNickname = ref(null)
const isValidPassword = ref(null)

watch(id, () => {
    if(id.value === '') {
        isValidId.value = null
        return
    }
    api({
        url: 'http://localhost:8080/member',
        method: 'POST',
        data: {
            key: "id",
            value: id.value
        }
    }).then((res) => {
        if(res.status == HttpStatusCode.NoContent) {
            isValidId.value = true
            return
        }
        isValidId.value = false
        recommend('아이디', id.value)
        return
    }).catch(err => console.log(err))
});

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

watch(password, ()=> {
    isValidPassword.value = password.value == passwordCheck.value
})

watch(passwordCheck, ()=> {
    isValidPassword.value = password.value == passwordCheck.value
})

const recommend_id_list = ref([])
const recommend_nickname_list = ref([])

const changeIdInput = function(newId) {
    id.value = newId
}

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
                {"text":`사용자가 ${value}라는 ${key}를 입력했는데 이미 존재하는 ${key}래. 비슷한 ${key} 3개 "줄넘김 없이, 다른 특수문자나 공백 없이 각 ${key} 앞에 + 붙여서" 추천해줘`}
            ]
            }
        ]
    }
    }).then((res) => {
        if(key === '아이디') {
            recommend_id_list.value = (res.data.candidates[0].content.parts[0].text)
                    .split('+')
                    .map(str => str.trim()) 
                    .filter(Boolean);
        } else {
            recommend_nickname_list.value = (res.data.candidates[0].content.parts[0].text)
                    .split('+')
                    .map(str => str.trim()) 
                    .filter(Boolean);
        }
    }).catch((err) => console.log(err))
}
</script>


<style scoped>
@keyframes fadeInSlideIn {
    0% {
        opacity: 0;
        transform: translateY(-50px);
    }
    100% {
        opacity: 1;
        transform: translateY(0);
    }
}

=======
</script>

<style scoped>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
.title {
    position: absolute;
    top: 25%;
    left: 43%;
    transform: translate(-50%, -50%);
<<<<<<< HEAD
    text-align: center;
}

.line {
    display: inline-block;
    opacity: 0;
    animation: fadeInSlideIn 1s forwards;
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}

.title h1 {
    color: rgb(30, 42, 212);
    font-size: 40px;
    letter-spacing: 0.2em;
}

.title p {
    padding-left: 10px;
}

.signup-form {
    position: absolute;
<<<<<<< HEAD
    top: 60%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 80%;
=======
    top: 59%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 80%;

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}

.btn-signup {
    position: absolute;
    top: 107%;
    left: 50%;
    background-color: rgb(180, 214, 245) !important;
    color: white;
}

.btn-signup:hover {
    color: white;
    background-color: rgb(86, 169, 247) !important;
}

input {
    border: none !important;
    background-color: rgb(242, 242, 242) !important;
    border-radius: 30px !important;
}

.gender {
    text-align: center;
    margin-bottom: 15px;
}

.gender .form-check-inline {
    display: inline-block;
    margin-right: 10px;
}
<<<<<<< HEAD

.error {
    color: red;
}

.valid {
    color: blue;
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

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</style>