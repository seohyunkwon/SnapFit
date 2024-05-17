<template>
    <header>
        <nav class="navbar fixed-top bg-white">
            <div class="container-fluid d-flex justify-content-between">
                <RouterLink to="/video" class="navbar-brand" href="#">SSAFIT</RouterLink>
                <img src="@/assets/icon/notification.png" class="notification">
            </div>
        </nav>
    </header>
</template>

<script setup>

</script>

<style scoped>
header {
    width: 100%;
}
.logo {
    color: white;
}

.fixed-top {
    height: 80px;
}

.navbar-brand {
    margin-left: 10px;
    font-weight: bold;
    letter-spacing: 0.3rem;
}

.notification {
    width: 35px;
    margin-right: 10px;
}
</style>
