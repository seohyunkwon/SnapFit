<template>
    <footer>
        <nav class="navbar fixed-bottom bg-white">
            <div class="container-fluid d-flex justify-content-evenly">
                <img src="@/assets/icon/heart.png" class="logos">
                <RouterLink to="/video"><img src="@/assets/icon/video.png" class="logos"></RouterLink>
                <RouterLink to="/ranking"><img src="@/assets/icon/ranking.png" class="logos"></RouterLink>
                <RouterLink to="/mypage"><img src="@/assets/icon/profile.png" class="logos"></RouterLink>
            </div>
        </nav>
    </footer>
</template>

<script setup>

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
}
</style>
