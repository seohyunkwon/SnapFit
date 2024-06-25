import { ref, toRaw } from 'vue'
import { defineStore } from 'pinia'

export const useVideoStore = defineStore('video', () => {
  const video_list = ref([])
  const videoIndex = ref(0)
  const currentVideo = ref(null)
  const direction = ref(null)

  const nextVideo = (Y) => {
    if (Y === 1) {
      direction.value = 'left'
      if (videoIndex.value < toRaw(video_list.value).value.length - 1) {
        videoIndex.value++
      } else {
        videoIndex.value = 0
      } 
    } else {
      direction.value = 'right'
      if (videoIndex.value > 0) {
        videoIndex.value--
      } else {
        videoIndex.value = toRaw(video_list.value).value.length - 1
      }
    }
    
    currentVideo.value = toRaw(video_list.value).value[videoIndex.value]
  }
  return { 
    video_list,
    videoIndex,
    nextVideo,
    currentVideo
    }
})
