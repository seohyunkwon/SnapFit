<template>
    <div class="app">
        <!-- title div -->
        <div class="title">
            <h1>WELCOME!</h1>
            <p>
                언제 어디서나 SSAFIT!<br>
                나만의 코치와 함께 도전해보세요!
            </p>
        </div>

        <!-- 회원가입 폼 div -->
        <div class="signup-form">
            <form>
                <!-- 아이디 input  -->
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="id" placeholder="아이디">
                    <label for="id">아이디</label>
                </div>
                <!-- 비밀번호 input  -->
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="password" placeholder="비밀번호">
                    <label for="password">비밀번호</label>
                </div>
                <!-- 비밀번호 확인 input  -->
                <div class="form-floating mb-3">
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
                    <label for="birth">생년월일</label>
                </div>
                <!-- 성별 input  -->
                <div class="form-floating mb-3 gender">
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1"
                            value="option1">
                        <label class="form-check-label" for="inlineRadio1">여성</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2"
                            value="option2">
                        <label class="form-check-label" for="inlineRadio2">남성</label>
                    </div>
                </div>
                <!-- 제출 버튼 -->
                <input type="submit" class="btn btn-signup" value="회원가입">
            </form>
        </div>
    </div>
</template>

<script setup>
</script>

<style scoped>
.title {
    position: absolute;
    top: 25%;
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

.signup-form {
    position: absolute;
    top: 59%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 80%;

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
</style>