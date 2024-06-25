<template>
    <header>
        <nav class="navbar fixed-top bg-white">
            <div class="container-fluid d-flex justify-content-between">
<<<<<<< HEAD
                <RouterLink to="/video" class="navbar-brand logo">SNAPFIT</RouterLink>
                <div class="icon-link">
                    <div class="icon-wrapper">
                        <img src="@/assets/icon/logout.png" @click="logout" class="logout logos">
                        <span class="tooltip-text" v-show="isTooltipVisible">Logout</span>
                    </div>
                </div>
=======
                <RouterLink to="/video" class="navbar-brand" href="#">SSAFIT</RouterLink>
                <img src="@/assets/icon/notification.png" class="notification">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
            </div>
        </nav>
    </header>
</template>

<script setup>
<<<<<<< HEAD
import { useMemberStore } from '@/stores/member';
import { ref } from 'vue'
const memberStore = useMemberStore()

let isTooltipVisible = ref(false);

const logout = () => {
    memberStore.logout()
}
=======

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</script>

<style scoped>
header {
    width: 100%;
}
<<<<<<< HEAD


<style scoped>
header {
    width: 100%;
}

@keyframes gradient-animation {
    0% {
        color: #cfe9f6;
    }

    /* 시작 색상 */
    50% {
        color: #4aa8f0;
    }

    /* 중간 색상 */
    100% {
        color: #253587;
    }

    /* 끝 색상 */
}

@keyframes opacity-animation {

    0%,
    100% {
        opacity: 1;
    }

    /* 시작과 끝에서 완전히 불투명 */
    50% {
        opacity: 0.5;
    }

    /* 중간에서 반투명 */
}

.logo {
    color: white;
    font-family: "Bagel Fat One";
    font-size: 20px !important;
    animation: gradient-animation 3s infinite alternate;
    /* 3초간 반복되는 애니메이션 */
}


=======
.logo {
    color: white;
}

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
.fixed-top {
    height: 80px;
}

.navbar-brand {
    margin-left: 10px;
    font-weight: bold;
    letter-spacing: 0.3rem;
}

<<<<<<< HEAD
.logout {
    width: 25px;
    margin-right: 20px;
    cursor: pointer;
}

.logos {
    width: 25px;
    transition: transform 0.5s; /* 회전 트랜지션 추가 */
}

.icon-wrapper {
    position: relative;
    display: inline-block;
}

.icon-wrapper:hover .logos {
    transform: rotateY(360deg); /* 아이콘이 회전하는 트랜지션 */
}

.tooltip-text {
    visibility: hidden;
    background-color: rgb(255, 255, 255);
    color: #171717;
    text-align: center;
    border-radius: 6px;
    padding: 10px;
    position: absolute;
    bottom: calc(100% + 10px); /* 아이콘 아래에 표시되도록 위치 조정 */
    left: 50%;
    transform: translateX(-50%);
    opacity: 0;
    transition: opacity 0.3s, visibility 0.3s; /* 툴팁 트랜지션 추가 */
}

.icon-wrapper:hover .tooltip-text {
    visibility: visible;
    opacity: 1;
=======
.notification {
    width: 35px;
    margin-right: 10px;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
</style>
