<template>
    <Profile>
        <img :src="getSrc" class="user-img" :style="imgSize">
    </Profile>
</template>

<script setup>
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
}
</style>
