<template>
  <div class="d-flex justify-content-end mb-3">
    <select @change="handleVideoSelection" v-show="loginNo == member.no">
      <option value="myVideos">나의 영상</option>
      <option value="likedVideos">좋아요한 영상</option>
    </select>

  </div>
  <div class="video-list row" v-show="videoList != null">
    <div class="col-md-6 mb-1" v-for="(video, index) in videoList" :key="index">
      <div class="video-container" @click="showVideos(index)">
        <VideoPlayer :video="video" />
        <div class="icons">
          영상 보기
        </div>
      </div>
    </div>
  </div>
  <CommentModal v-if="showCommentModal" :videoNo="no" :comment-list="commentList" @closeModal="closeModal"
    @addComment="fetchComments(selectedVideoNo)" />
</template>

<script setup>
import api from '@/api';
import { onMounted, ref } from 'vue';
import VideoPlayer from '../video/VideoPlayer.vue';
import CommentModal from '@/components/comment/CommentDetail.vue';
import { useRoute, useRouter } from 'vue-router';
import { useVideoStore } from '@/stores/video';

const router = useRouter();
const route = useRoute()
const videoStore = useVideoStore()
const loginNo = sessionStorage.getItem('no');

const videoList = ref([]);
const showCommentModal = ref(false);
const commentList = ref([]);

const props = defineProps({
  member: Object
});

const getMyVideos = () => {
  api({
    url: 'http://localhost:8080/video/member/' + props.member?.no,
    method: 'GET'
  }).then((res) => {
    videoList.value = res.data.filter((video) => video.no != null);
    videoStore.video_list.value = videoList.value

  }).catch((err) => console.log(err));
}
const getLikeVideos = () => {
  api({
    url: 'http://localhost:8080/video/like/' + props.member?.no,
    method: 'GET'
  }).then((res) => {
    videoList.value = res.data.filter((video) => video.no != null);
    videoStore.video_list.value = videoList.value

  }).catch((err) => console.log(err));
}
const showVideos  = (index) => {
  const selectedOption = document.querySelector('select').value
    videoStore.videoIndex = index
    let type;
    let no;
    if(selectedOption === 'myVideos') {
      type= 'my'
      no = route.params.no
    } else type= 'like'
    router.push({path: '/video', query: {type: type, no: no}})
}


const handleVideoSelection = (event) => {
  const selectedOption = event.target.value;
  if (selectedOption === "myVideos") {
    getMyVideos();
  } else if (selectedOption === "likedVideos") {
    getLikeVideos();
  }
};


onMounted(() => {
  getMyVideos()
});


const closeModal = () => {
  showCommentModal.value = false;
};

</script>

<style scoped>
.video-list {
  width: 100%;
  max-height: calc(100vh - 150px);
}

.video-container {
  position: relative;
  overflow: hidden;
  transition: transform 0.3s ease-in-out;
}

.video-container:hover {
  transform: scale(1.05);
  filter: brightness(50%);
}

.icons {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  display: flex;
  opacity: 0;
  transition: opacity 0.3s;
  text-align: center;
  color: white;
  font-size: 20px;
}

.video-container:hover .icons {
  opacity: 1;
}

.col-md-6 {
  padding-right: 0px !important;
}

select {
  border: none;
}
</style>
