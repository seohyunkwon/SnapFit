<template>
    <div class="video-modal">
      <div class="modal-content">
        <div class="justify-content-between">
          <span style="font-size: 20px;">랭킹보기</span>
          <span class="close" @click="$emit('closeModal')">&times;</span>
        </div>
        <div class="videos">
          <div class="video row" v-for="(video, index) in videoList" :key="index"
          @click="showRanking(exercise, index)">
            <div class="col-sm-3" style="text-align: center">
              <b>{{ index  + 1}}위</b>
            </div>
            <div class="col-sm-6 jutify-content-between">
              <p>{{  video.title  }}</p>
            </div>
            <div class="col-md-1">
                <p>{{ video.likeCount }}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref, watch } from 'vue';
  import { defineProps, defineEmits } from 'vue';
  import api from '@/api';
  import ProfileImage from '../member/ProfileImage.vue';
  import router from '@/router';
  import { useRoute } from 'vue-router';
  import { useVideoStore } from '@/stores/video';
  
  const route = useRoute()
  const videoStore = useVideoStore()
  const props = defineProps({
    videoList: Array,
    exercise: Object
  });
  
  const imgSize = { 
    'width': '50px',
    'height': '50px'
  }
    
  const content = ref('')


const showRanking = (exercise, index) => {
    videoStore.videoIndex = index
    router.push({path: '/video', query: {type: 'exercise', no: exercise.no}})
    then(() => {
            window.location.reload();
    });
}

  
//   const emit = defineEmits(['closeModal', 'addComment']);
  
//   const toggleComment = (comment) => {
//     const data = {
//       memberNo: sessionStorage.getItem('no'),
//       commentNo: comment.no
//     }
  
//     const method = comment.isLike ? 'DELETE' : 'POST'
  
//     api({
//       url: 'http://localhost:8080/like/comment',
//       method: method,
//       data: data
//     }).then((res) => {
//       if(res.status == 201 || res.status == 200) {
//           content.value = '';
//           emit('addComment')
//         } else {
//           alert('댓글 좋아요에 실패했습니다. 잠시 후 다시 시도해주세요.')
//         }
//     })
//   }
  
//   const pushMemberPage = function(comment) {
//     router.push("/member/"+comment.memberNo)
//   }
  
//   watch(() => route.params.no, (newNo) => {
//       fetchData(newNo)
//   })
  </script>
  
  
  
  
  <style scoped>
  .icon {
    width: 20px;
    height: 20px;
  }
  .video-modal {
    position: fixed;
    z-index: 1000;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0, 0, 0, 0.4);
  }
  
  .modal-content {
    background-color: #fefefe;
    margin: 15% auto;
    padding: 20px;
    width: 85%;
    top: 10%;
    height: 500px;
    overflow: scroll;
  }
  
  .close {
    color: #aaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
  }
  
  .close:hover,
  .close:focus {
    color: black;
    text-decoration: none;
    cursor: pointer;
  }
  
  .videos {
    margin-top: 20px;
  }
  
  .video {
    border-bottom: 1px solid #ddd;
    padding: 10px 0;
  }

  .video:hover {
    background-color: #ddd;
  }
  
  .video p {
    margin: 5px 0;
  }
  
  .modal-content::-webkit-scrollbar {
      width: 0px;
  }
  
  .modal-content::-webkit-scrollbar-thumb {
      background-color: transparent;
  }
  
  .modal-content::-webkit-scrollbar-track {
      background-color: transparent;
  }
  
  input {
    border-radius: 30px !important;
  }
  
  button {
    border-radius: 30px !important;
    background-color: #97c6fa !important;
  }
  
  button:hover {
    background-color: #7ab4f7 !important;
  }
  </style>
  