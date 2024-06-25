<template>
    <Profile>
<<<<<<< HEAD
        <img :src="getSrc" class="user-img" :style="imgSize">
=======
        <img src="@/assets/user/profile.png" class="user-img" :style="imgSize">
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
    </Profile>
</template>

<script setup>
<<<<<<< HEAD
import { computed, defineProps } from 'vue';

const props = defineProps({
    imgSize: Object,
    imgSrc: String
})

const getSrc = computed(() => {
    let src;
    if(props.imgSrc == null || props.imgSrc == 'default.png') {
        src = new URL(`../../assets/member/default.png`, import.meta.url).href;
    } else {
        src = new URL(`../../assets/member/${props.imgSrc}`, import.meta.url).href;
    } 
    return src
})


</script>

<style scoped>

Profile {
    border-radius: 50%;
    overflow: hidden;
}

.user-img {
    border-radius: 50%;
    display: block;
    object-fit: cover;
=======
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
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
</style>
