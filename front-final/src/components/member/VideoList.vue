<template>
    <div class="video-list row row-cols-2">
        <VideoDetail class="col"/>
        <VideoDetail class="col"/>
        <VideoDetail class="col"/>
        <VideoDetail class="col"/>
        <VideoDetail class="col"/>
        <VideoDetail class="col"/>
    </div>
</template>

<script setup>
import VideoDetail from '@/components/video/VideoDetail.vue';
</script>

<style scoped>
.video-list {
    width: 100%;n
    height: 464px;
    overflow-y: auto;
    max-height: calc(100vh - 150px);
}
.video-list::-webkit-scrollbar {
    width: 0px;
}

.video-list::-webkit-scrollbar-thumb {
    background-color: transparent;
}

.video-list::-webkit-scrollbar-track {
    background-color: transparent;
}
</style>