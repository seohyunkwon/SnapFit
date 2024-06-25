<template>
    <footer>
        <nav class="navbar fixed-bottom bg-white">
            <div class="container-fluid d-flex justify-content-evenly">
<<<<<<< HEAD
                <RouterLink :to="{ path:'/video', query: { type: 'follow'} }" :search-condition="searchCondition" class="icon-link">
                    <div class="icon-wrapper">
                        <img src="@/assets/icon/heart.png" class="logos">
                        <span class="tooltip-text">Feed</span>
                    </div>
                </RouterLink>
                <RouterLink to="/upload" class="icon-link">
                    <div class="icon-wrapper">
                        <img src="@/assets/icon/video.png" class="logos">
                        <span class="tooltip-text">Upload</span>
                    </div>
                </RouterLink>
                <RouterLink to="/ranking" class="icon-link">
                    <div class="icon-wrapper">
                        <img src="@/assets/icon/ranking.png" class="logos">
                        <span class="tooltip-text">Ranking</span>
                    </div>
                </RouterLink>
                <RouterLink :to="memberLink" class="icon-link">
                    <div class="icon-wrapper">
                        <img src="@/assets/icon/profile.png" class="logos">
                        <span class="tooltip-text">Mypage</span>
                    </div>
                </RouterLink>
=======
                <img src="@/assets/icon/heart.png" class="logos">
                <RouterLink to="/video"><img src="@/assets/icon/video.png" class="logos"></RouterLink>
                <RouterLink to="/ranking"><img src="@/assets/icon/ranking.png" class="logos"></RouterLink>
                <RouterLink to="/mypage"><img src="@/assets/icon/profile.png" class="logos"></RouterLink>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
            </div>
        </nav>
    </footer>
</template>

<<<<<<< HEAD


<script setup>
import { computed } from 'vue'

const memberLink = computed(() => {
    const no = sessionStorage.getItem('no')
    return no ? `/member/${no}` : '/login' 
})
=======
<script setup>

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</script>

<style scoped>
.fixed-bottom {
    height: 100px;
}

.navbar-brand {
    margin-left: 10px;
    font-weight: bold;
    letter-spacing: 0.3rem;
}

.logos {
    width: 40px;
    margin-right: 10px;
<<<<<<< HEAD
    transition: transform 0.5s;
}

.icon-wrapper {
    position: relative;
    display: inline-block;
}

.icon-wrapper:hover .logos {
    transform: rotateY(360deg);
}

.tooltip-text {
    visibility: hidden;
    background-color: rgb(255, 255, 255);
    color: #171717;
    text-align: center;
    border-radius: 6px;
    padding: 10px;
    position: absolute;
    z-index: 1;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    opacity: 0;
    transition: opacity 0.3s;
}

.icon-wrapper:hover .tooltip-text {
    visibility: visible;
    opacity: 1;
}

.icon-link {
    position: relative;
}

.icon-link:hover .tooltip-text {
    visibility: visible;
    opacity: 1;
}
</style>

=======
}
</style>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
