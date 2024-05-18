<template>
    <div id='app'>
        <VideoDetail v-if="video_list.length > 0" :video="video_list[idx]" />
    </div>
</template>

<script setup>
import { useVideoStore } from '@/stores/video'
import VideoDetail from '@/components/video/VideoDetail.vue'
import { ref, onMounted, watch } from 'vue'
import axios from 'axios'

const videoStore = useVideoStore()
const video_list = ref([])
const idx = ref(0) // 시작할 때 0으로 설정

onMounted(() => {
    axios({
        url: "http://localhost:8080/video"
    }).then((res) => {
        videoStore.videos.value = res.data
        video_list.value = videoStore.videos.value
        console.log("video_list = ", video_list.value) 
    })
})

watch(video_list, () => {
    // video_list가 변경될 때마다 idx를 다시 0으로 설정하여 첫 번째 비디오를 표시
    idx.value = 0
})
</script>

<style scoped>
#app {
    overflow: hidden;
    height: 800px;
    background-color: aqua;
}
</style>
