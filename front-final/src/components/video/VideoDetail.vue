<template>
  <div v-if="video != null" class="video-detail" :class="{ 'slide-left': direction === 'left', 'slide-right': direction === 'right' }">
    <VideoPlayer :video="video" @click="handleClick">
    </VideoPlayer>
    <VideoIcons 
        :video="video"
        :likeList="likeList" 
        :commentList="commentList" 
        :isLike="isLike" 
        :toggleLike="toggleLike" 
        :showCommentDetail="showCommentDetail" />

    <!-- content -->
    <div class="content">
      <h5>{{ video?.title }}</h5>
      <p>{{ video?.content }}</p>
    </div>

    <!-- comment modal -->
    <CommentDetail 
      v-if="isCommentVisible" 
      @close-modal="closeComment" 
      :comment-list="commentList" 
      :video-no="props.video.no" 
      @add-comment="getComments" />
  </div>
</template>

<script setup>
import { ref, computed, watch, onMounted, defineEmits } from 'vue'
import api from '@/api'
import ProfileImage from '@/components/member/ProfileImage.vue'
import CommentDetail from '@/components/comment/CommentDetail.vue'
import VideoPlayer from './VideoPlayer.vue'
import VideoIcons from './VideoIcons.vue'



const props = defineProps({
  video: Object
})

const emit = defineEmits(['nextVideo'])

const commentList = ref([])
const likeList = ref([])
const isLike = ref(null)
const isCommentVisible = ref(false)

const getComments = function () {
  if (props.video == null) return
  api({
    url: `http://localhost:8080/comment/${props.video.no}/${sessionStorage.getItem('no')}?orderBy=like`,
    method: 'GET'
  }).then((res) => {
    commentList.value = res.data
  }).catch((err) => {
    console.error("VideoDetail error:", err)
  })
}

const getLikes = function () {
  if (props.video == null) return
  api({
    url: 'http://localhost:8080/like/video?videoNo=' + props.video.no,
    method: 'GET'
  }).then((res) => {
    likeList.value = res.data
  }).catch((err) => {
    console.error("VideoDetail error:", err)
  })
}

const toggleLike = function () {
  const url = `http://localhost:8080/like/video`
  const data = {
    videoNo: props.video.no,
    memberNo: sessionStorage.getItem('no')
  }

  let method = 'POST'
  if (isLike.value) {
    method = 'DELETE'
  }
  api({
    url: url,
    method: method,
    data: data
  }).then((res) => {
    if (res.status == 200 || res.status == 201) {
      isLike.value = !isLike.value
    } else {
      alert('잠시 후 다시 시도해주세요..')
    }
  }).catch((err) => console.log(err))
}

const checkLike = function () {
  if (props.video == null) return
  api(`http://localhost:8080/like/video?videoNo=${props.video.no}&memberNo=${sessionStorage.getItem('no')}`)
    .then((res) => {
      if (res.status == 200) {
        isLike.value = true
      } else {
        isLike.value = false
      }
    }).catch((err) => console.log(err))
}

const showCommentDetail = () => {
  isCommentVisible.value = true;
}

const closeComment = () => {
  isCommentVisible.value = false;
}

watch(
  () => props.video,
  (newVideo) => {
    getComments()
    getLikes()
    checkLike()
    
  },
  { immediate: true }
)

watch(isLike, () => {
  getLikes()
})

onMounted(() => {
  checkLike()
})

const handleClick = (event) => {
  const Y = event.clientY;
  emit('nextVideo', Y > 450 ? 1 : -1)
}
</script>

<style scoped>
.video-detail {
  width: 390px;
  height: 844px;
  position: relative;
  transition: transform 0.5s ease-in-out;
}

.content {
  position: absolute;
  top: 600px;
  left: 10px;
  width: 70%;
  color: white;
  text-align: start;
}

.content h5 {
  font-weight: 600;
}

.slide-left {
  transform: translateX(-100%);
}

.slide-right {
  transform: translateX(100%);
}
</style>
