<template>
    <Profile>
        <img src="@/assets/user/profile.png" class="user-img" :style="imgSize">
    </Profile>
</template>

<script setup>
const props = defineProps({
    imgSize: Object
})
</script>

<style scoped>
Profile {
    border-radius: 50%;
}

.user-img {
    max-width: 100%;
    max-height: 100%;
    border-radius: 50%;
}
</style>
