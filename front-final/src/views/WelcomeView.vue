<<<<<<< HEAD
<template>
  <div class="app">
    <div class="title">
      <h1>
        <span class="letter" style="animation-delay: 0s;">S</span>
        <span class="letter" style="animation-delay: 0.1s;">N</span>
        <span class="letter" style="animation-delay: 0.2s;">A</span>
        <span class="letter" style="animation-delay: 0.3s;">P</span>
        <span class="letter" style="animation-delay: 0.4s;">P</span>
        <span class="letter" style="animation-delay: 0.5s;">I</span>
        <span class="letter" style="animation-delay: 0.6s;">T</span>
      </h1>
    </div>

=======
<script setup>
</script>

<template>
  <div class="app">
    <!-- 어플리케이션 이름 -->
    <div class="title">
      <h1>SSAFIT</h1>
    </div>

    <!-- 로그인 버튼 -->
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
    <RouterLink to="/login" class="btn btn-login">
      로그인
    </RouterLink>

<<<<<<< HEAD
    <button class="btn btn-kakao-login" @click="memberStore.kakaoLogin">
      카카오 로그인
    </button>

    <div class="signup">
      <RouterLink to="/signup">회원가입</RouterLink>
    </div>
  </div>
</template>


<script setup>
import { useMemberStore } from '@/stores/member';

const memberStore = useMemberStore()

</script>

=======
    <!-- 카카오 로그인 버튼 -->
    <button class="btn btn-kakao-login">
      카카오 로그인
    </button>

    <!-- 회원가입 -->
    <div class="signup">
      <RouterLink to="/signup">회원가입</RouterLink>    </div>

  </div>
</template>

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
<style scoped>
.app {
  background: url(@/assets/index.jpg), #f4f4f4;
  background-size: cover;
}

.title {
  color: white;
<<<<<<< HEAD
=======
  font-size: 30px;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
  position: absolute;
  top: 40%;
  left: 50%;
  transform: translate(-50%, -50%);
<<<<<<< HEAD
}
span {
  font-size: 60px;
  letter-spacing: 0.2em;
  font-family: 'Bagel Fat One' !important;
=======
  letter-spacing: 0.3em;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
/* 페이드 인 및 슬라이드 인 애니메이션 정의 */
@keyframes fadeInSlideIn {
  0% {
    opacity: 0;
    transform: translateY(-100%);
  }
  100% {
    opacity: 1;
    transform: translateY(0);
  }
}

/* 바운싱 애니메이션 정의 */
@keyframes bounce {
  0%, 20%, 50%, 80%, 100% {
    transform: translateY(0);
  }
  40% {
    transform: translateY(-20px);
  }
  60% {
    transform: translateY(-10px);
  }
}

/* title 클래스에 애니메이션 적용 */
.title {
  color: white;
  position: absolute;
  top: 40%;
  left: 50%;
  transform: translate(-50%, -50%);
}

h1 {
  font-size: 70px;
  letter-spacing: 0.1em;
  font-family: 'Bagel Fat One' !important;
  display: flex;
  justify-content: center;
}

/* 각 글자에 애니메이션 적용 */
.letter {
  display: inline-block;
  animation: fadeInSlideIn 2s ease-out, bounce 3s infinite cubic-bezier(0.68, -0.55, 0.27, 1.55);
}

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</style>
