<script setup>
</script>

<template>
  <div class="app">
    <!-- 어플리케이션 이름 -->
    <div class="title">
      <h1>SSAFIT</h1>
    </div>

    <!-- 로그인 버튼 -->
    <RouterLink to="/login" class="btn btn-login">
      로그인
    </RouterLink>

    <!-- 카카오 로그인 버튼 -->
    <button class="btn btn-kakao-login">
      카카오 로그인
    </button>

    <!-- 회원가입 -->
    <div class="signup">
      <RouterLink to="/signup">회원가입</RouterLink>    </div>

  </div>
</template>

<style scoped>
.app {
  background: url(@/assets/index.jpg), #f4f4f4;
  background-size: cover;
}

.title {
  color: white;
  font-size: 30px;
  position: absolute;
  top: 40%;
  left: 50%;
  transform: translate(-50%, -50%);
  letter-spacing: 0.3em;
}

.btn-login {
  position: absolute;
  top: 70%;
  left: 50%;
  background-color: rgb(180, 214, 245);
  color: white;
}

.btn-login:hover {
  background-color: rgb(148, 197, 243);
  color: white;
}

.btn-kakao-login {
  position: absolute;
  top: 78%;
  left: 50%;
  background-color: rgb(250, 237, 151);
  color: rgb(70, 38, 3);
}

.btn-kakao-login:hover {
  background-color: rgb(246, 225, 93);
  color: rgb(70, 38, 3);
}

.signup {
  position: absolute;
  top: 84%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 20px;
  font-weight: bold;
  transition: font-size 0.3s;
}

.signup a {
  color:rgb(70, 38, 3)
}

.signup:hover {
  font-size: 24px;
}
</style>
