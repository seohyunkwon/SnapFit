<template>
<<<<<<< HEAD
    <div class="app d-flex flex-column">
        <!-- title div -->
        <div class="title">
            <div class="line" style="animation-delay: 0s;">
                <h1>WELCOME!</h1>
            </div>
            <div class="line" style="animation-delay: 0.5s;">
                <p>언제 어디서나 SNAPFIT!</p>
            </div>
            <div class="line" style="animation-delay: 1s;">
                <p>나만의 코치와 함께 도전해보세요!</p>
            </div>
=======
    <div class="app">
        <!-- title div -->
        <div class="title">
            <h1>WELCOME!</h1>
            <p>
                언제 어디서나 SSAFIT!<br />
                나만의 코치와 함께 도전해보세요!
            </p>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
        </div>

        <!-- 로그인 폼 div -->
        <div class="login-form">
<<<<<<< HEAD
            <form @submit.prevent="doLogin">
                <!-- 아이디 input -->
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="id" placeholder="아이디" v-model="id"/>
=======
            <form>
                <!-- 아이디 input -->
                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="id" placeholder="아이디" />
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
                    <label for="id">아이디</label>
                </div>
                <!-- 비밀번호 input -->
                <div class="form-floating">
<<<<<<< HEAD
                    <input type="password" class="form-control" id="password" placeholder="비밀번호" v-model="password"/>
=======
                    <input type="password" class="form-control" id="password" placeholder="비밀번호" />
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
                    <label for="password">비밀번호</label>
                </div>
                <!-- 비밀번호 찾기 div -->
                <div class="find-pwd">
                    비밀번호를 잊으셨나요? <a href="/">비밀번호 찾기</a>
                </div>
                <!-- 제출 버튼 -->
                <input type="submit" class="btn btn-login" value="로그인" />
            </form>
        </div>
        <!-- 회원가입 링크 -->
        <div class="signup">
            <RouterLink to="/signup">회원가입</RouterLink>
        </div>
    </div>
</template>

<<<<<<< HEAD

<script setup>
import { ref } from 'vue'
import { useMemberStore } from '@/stores/member';

const memberStore = useMemberStore()

const id = ref('')
const password = ref('')

const doLogin = () => {
    const member = {
        id: id.value,
        password: password.value
    }
    memberStore.login(member)
}


</script>

<style scoped>

/* 페이드 인 및 슬라이드 인 애니메이션 정의 */
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

/* title 클래스에 애니메이션 적용 */
.title {
    position: absolute;
    top: 30%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
}

.line {
    display: inline-block;
    opacity: 0;
    animation: fadeInSlideIn 1s forwards;
=======
<script setup>
</script>

<style scoped>
.title {
    position: absolute;
    top: 45%;
    left: 43%;
    transform: translate(-50%, -50%);
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

<<<<<<< HEAD
/* 로그인 폼 스타일 */
.login-form {
    position: absolute;
    top: 50%;
=======
.login-form {
    position: absolute;
    top: 60%;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
    left: 50%;
    transform: translate(-50%, -50%);
    width: 80%;
}

.find-pwd {
    position: absolute;
    top: 110%;
    left: 20%;
    color: gray !important;
    font-size: 15px;
}

.btn-login {
    position: absolute;
    top: 155%;
    left: 50%;
    background-color: rgb(180, 214, 245) !important;
    color: white;
}

.btn-login:hover {
    color: white;
    background-color: rgb(134, 193, 249) !important;
}

input {
    border: none !important;
    background-color: rgb(242, 242, 242) !important;
    border-radius: 30px !important;
}

.signup a {
    position: absolute;
<<<<<<< HEAD
    top: 72%;
=======
    top: 82%;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
    left: 50%;
    transform: translate(-50%, -50%);
    color: gray !important;
    font-size: 15px;
}
<<<<<<< HEAD


=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</style>