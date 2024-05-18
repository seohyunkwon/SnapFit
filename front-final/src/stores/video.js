import { ref } from 'vue'
import { defineStore } from 'pinia'

export const useVideoStore = defineStore('video', () => {
  const videos = ref([])
  return { 
    videos
  }
})
