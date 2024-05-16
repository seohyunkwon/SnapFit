<template>
    <div class="app">
        <!-- title div -->
        <div class="title">
            <h1>WELCOME!</h1>
            <p>
                언제 어디서나 SSAFIT!<br />
                나만의 코치와 함께 도전해보세요!
            </p>
        </div>

        <!-- 로그인 폼 div -->
        <div class="login-form">
            <form>
                <!-- 아이디 input -->
                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="id" placeholder="아이디" />
                    <label for="id">아이디</label>
                </div>
                <!-- 비밀번호 input -->
                <div class="form-floating">
                    <input type="password" class="form-control" id="password" placeholder="비밀번호" />
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

<script setup>
</script>

<style scoped>
.title {
    position: absolute;
    top: 45%;
    left: 43%;
    transform: translate(-50%, -50%);
}

.title h1 {
    color: rgb(30, 42, 212);
    font-size: 40px;
    letter-spacing: 0.2em;
}

.title p {
    padding-left: 10px;
}

.login-form {
    position: absolute;
    top: 60%;
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
    top: 82%;
    left: 50%;
    transform: translate(-50%, -50%);
    color: gray !important;
    font-size: 15px;
}
</style>