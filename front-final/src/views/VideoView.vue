<template>
  <div id="app">
    <VideoDetail v-if="videoStore.currentVideo" :video="videoStore.currentVideo" @next-video="nextVideo"/>
  </div>
</template>

<script setup>
import { useVideoStore } from '@/stores/video'
import VideoDetail from '@/components/video/VideoDetail.vue'
import { onMounted, watch } from 'vue'
import { useRoute } from 'vue-router'
import api from '@/api'

const videoStore = useVideoStore()
const route = useRoute()

const getVideos = async () => {
  console.log("index = ", videoStore.videoIndex)
  let url = 'http://localhost:8080/video'
  let data = null
  if(route.query.type === 'follow') {
    url = `http://localhost:8080/video/${route.query.type}/${sessionStorage.getItem('no')}`
  }
  if(route.query.type === 'like') {
    url = `http://localhost:8080/video/like/${sessionStorage.getItem('no')}`
    data = null
  }

  if(route.query.type === 'my') {
    url = `http://localhost:8080/video/member/${route.query.no}`
    data = null
  }

  if(route.query.type === 'exercise') {
    url = `http://localhost:8080/video/exercise/${route.query.no}` 
    data = {
      key: 'exercise_no',
      value: route.query.no
    }
  }
  api({
    url: url,
    data: data
  }).then((res) => {
    videoStore.video_list.value = res.data
    if(route.query.type === null) {
      shuffle(videoStore.video_list)
    }
    if (videoStore.video_list.value.length > 0) {
      videoStore.currentVideo = res.data[videoStore.videoIndex]
    }
  }).catch((err) => {
    console.error("VideoDetail error:", err)
  })
}

onMounted(() => {
  getVideos()
})

watch(
  () => route.query,
  (newQuery, oldQuery) => {
    if (newQuery !== oldQuery) {
      getVideos()
    }
  },
  { immediate: true }
)

const nextVideo = function(Y) {
  videoStore.nextVideo(Y)
}
</script>

<style scoped>
#app {
  overflow: hidden;
  height: 800px;
}
</style>
