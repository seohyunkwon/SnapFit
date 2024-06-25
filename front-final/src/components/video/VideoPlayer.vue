<template>
    <div class="video">
      <video ref="videoPlayer" autoplay muted loop @click="handleClick">
        <source :src="getSrc" type="video/mp4">
      </video>
      <slot></slot>
    </div>
  </template>
  
  <script setup>
  import { ref, computed, watch, onMounted } from 'vue'
  
  const props = defineProps({
    video: Object
  })
  
  const videoPlayer = ref(null)
  
  const getSrc = computed(() => {
    return props.video ? new URL(`../../assets/videos/video_${props.video.no}.mp4`, import.meta.url).href : '';
  })
  
  const handleClick = () => {
  if (videoPlayer.value) {
    videoPlayer.value.muted = !videoPlayer.value.muted;
  }
};

  watch(
    () => props.video,
    (newVideo) => {
      if (videoPlayer.value) {
        videoPlayer.value.load();
      }
    },
    { immediate: true }
  )
  
  onMounted(() => {
    if (videoPlayer.value) {
      videoPlayer.value.load();
    }
  })
  </script>
  
  <style scoped>
  .video {
    width: 100%;
    height: 100%;
    position: relative;
  }
  
  video {
    width: 100%;
    height: 100%;
  }
  </style>
  