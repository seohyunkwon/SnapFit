<template>
  <div class="icons">
    
    <div v-show="video.uploaderNo != loginNo" class="membr mb-3 icon-div" @click="toMember(video.uploaderNo)">
      <ProfileImage :img-size="imgSize" :img-src="video.profileImg"></ProfileImage>
      <b>{{ video.uploaderName }}</b>
    </div>
    <div class="like mb-3 icon-div" @click="toggleLike">
      <img src="@/assets/icon/heart.png" class="icon" v-show="!isLike">
      <img src="@/assets/icon/heart-fill.png" class="icon" v-show="isLike">
      <br>
      <b>{{ likeList.length }}</b>
    </div>
    <div class="comment icon-div mb-3" @click.stop="showCommentDetail">
      <img src="@/assets/icon/comment.png" class="icon">
      <br>
      <b>{{ commentList.length }}</b>
    </div>
    <div class="icon-div mb-3" v-show="video.uploaderNo == loginNo" @click="deleteVideo(video.no)">
      <img src="@/assets/icon/bin.png" class="icon">
      <br><b>삭제</b>
    </div>
  </div>
</template>

<script setup>
import { ref, watch, onMounted } from 'vue'
import api from '@/api'
import ProfileImage from '../member/ProfileImage.vue';
import router from '@/router';

const loginNo = sessionStorage.getItem('no')

const toMember = (no) => {
  router.push(`/member/${no}`).then(() => {
    window.location.reload();
  });

}

const props = defineProps({
  video: Object,
  likeList: Array,
  commentList: Array,
  isLike: Boolean,
  toggleLike: Function,
  showCommentDetail: Function,
})

const imgSize = {
  'width': '60px',
  'height': '60px'
}

const checkLike = function () {
  if (props.video == null) return
  api(`http://localhost:8080/like/video?videoNo=${props.video.no}&memberNo=${sessionStorage.getItem('no')}`)
    .then((res) => {
      if (res.status == 200) {
        props.isLike = true
      } else {
        props.isLike = false
      }
    }).catch((err) => console.log(err))
}

watch(
  () => props.video,
  () => {
    checkLike()
  },
  { immediate: true }
)

onMounted(() => {
  checkLike()
})

const deleteVideo = (no) => {
  if(!confirm('동영상을 삭제하시겠습니까?')) return
  api({
    url: 'http://localhost:8080/video/' + no,
    method: 'DELETE',
  }).then((res) => {
    if(res.status == 200) {
      alert('동영상이 삭제되었습니다.')
      window.location.reload(router.currentRoute)
    } else {
      alert('동영상 삭제에 실패했습니다. 잠시 후 다시 시도해주세요.')
    }
  }).catch((err) => console.log(err))
}
</script>

<style scoped>
.icons {
  position: absolute;
  right: 20px;
  top: 52%;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.icon {
  width: 45px;
  filter: invert(100%) sepia(12%) saturate(7500%) hue-rotate(181deg) brightness(110%) contrast(111%);
}

.icon:hover {
  animation: icon-shake 1s infinite !important;
}

.icon-div {
  color: white;
  text-align: center;
  font-weight: bold;
}

@keyframes icon-shake {
  0% {
    transform: rotate(0deg);
  }

  25% {
    transform: rotate(10deg);
  }

  50% {
    transform: rotate(0deg);
  }

  75% {
    transform: rotate(-10deg);
  }

  100% {
    transform: rotate(0deg);
  }
}
</style>