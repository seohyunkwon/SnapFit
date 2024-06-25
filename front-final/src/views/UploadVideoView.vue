<template>
  <div id="app">
    <h5 class="mb-3" style="letter-spacing: 0.05em;">나의 운동을<br><b style="color: rgb(49, 108, 197); font-size: 23px;">SNAPFIT</b>에 공유해주세요!</h5>
    <form @submit.prevent="handleSubmit">
      <div>
        <label for="title">제목</label>
        <input type="text" id="title" class="input" v-model="title" required />
      </div>

      <div>
        <label for="content">본문</label>
        <textarea id="content" v-model="content" class="input" required></textarea>
      </div>

      <div>
        <label for="exercise">운동 카테고리 선택</label>
        <select id="exercise" v-model="exerciseNo" class="input" required>
          <option value="">카테고리를 선택하세요</option>
          <option v-for="exercise in exercise_list"
            :key="exercise.no"
            :value="exercise.no">{{ exercise.name }}</option>
        </select>
      </div>

      <div>
        <label for="video">동영상 업로드</label>
        <input type="file" id="video" @change="handleVideoUpload" accept="video/*" required />
      </div>

      <div v-if="thumbnail">
        <label>동영상 썸네일</label>
        <img :src="thumbnail" alt="동영상 썸네일" />
      </div>

      <button type="submit">업로드</button>
    </form>
  </div>
</template>

<script setup>
import { HttpStatusCode } from 'axios';
import { ref, onMounted } from 'vue'
import api from '@/api';



const title = ref('')
const content = ref('')
const exerciseNo = ref('')
const videoFile = ref(null)
const thumbnail = ref('')

const exercise_list = ref([])

onMounted(() => {
  api({
    url: 'http://localhost:8080/exercise'
  }).then((res) => {
    exercise_list.value = res.data
  }).catch((err) => console.log(err))
})

let file;
const handleVideoUpload = (event) => {
  file = event.target.files[0]
  if (file) {
    videoFile.value = file
    generateThumbnail(file)
  }
}

const generateThumbnail = (file) => {
  const video = document.createElement('video')
  video.preload = 'metadata'

  video.onloadedmetadata = () => {
    video.currentTime = Math.min(10, video.duration)
  }

  video.onseeked = () => {
    const canvas = document.createElement('canvas')
    canvas.width = video.videoWidth
    canvas.height = video.videoHeight
    const ctx = canvas.getContext('2d')
    ctx.drawImage(video, 0, 0, canvas.width, canvas.height)
    thumbnail.value = canvas.toDataURL('image/png')
  }

  const url = URL.createObjectURL(file)
  video.src = url
}

const handleSubmit = () => {
  const video = {
    uploader_no: sessionStorage.getItem('no'),
    exercise_no: exerciseNo.value,
    title: title.value,
    content: content.value
  }


  const formData = new FormData();
  formData.append('file', file);
  formData.append('title', title.value);
  formData.append('content', content.value);
  formData.append('exercise_no', exerciseNo.value);
  formData.append('uploader_no', sessionStorage.getItem('no'));

  api({
    url: 'http://localhost:8080/video',
    method: 'POST',
    headers: {
      'Content-Type': 'multipart/form-data'
    },
    data: formData
  }).then((res) => {
    console.log(res)
    if (res.status == HttpStatusCode.Created) {
      alert('등록 성공')
      router.push('/video')
      return
    }
    alert('등록 실패')
  })
}
</script>

<style scoped>
#app {
  margin-top: 120px;
  padding-bottom: 80px;
  width: 80%;
  height: 700px;
  overflow: scroll;
  margin-left: auto;
  margin-right: auto;
}

form {
  display: flex;
  flex-direction: column;
}

form div {
  margin-bottom: 1rem;
}

label {
  font-weight: bold;
}

input,
textarea,
select {
  width: 100%;
  padding: 0.5rem;
  margin-top: 0.5rem;
}

button {
  border-radius: 30px;
  padding: 0.5rem;
  background-color: #b2def6;
  color: white;
  border: none;
  cursor: pointer;
}

button:hover {
  background-color: #9ddafb;
}

img {
  max-width: 100%;
  height: auto;
  margin-top: 1rem;
}

.input {
  border-radius: 30px;
  border: none;
  background-color: rgb(238, 236, 236);
}
@keyframes slideIn {
  from {
    transform: translateX(-100%);
    opacity: 0;
  }
  to {
    transform: translateX(0);
    opacity: 1;
  }
}

h5 {
  animation: slideIn 1s ease-out;
}

</style>