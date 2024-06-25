<template>
  <div class="comment-modal">
    <div class="modal-content">
      <div class="justify-content-between">
        <span style="font-size: 20px;">댓글보기</span>
        <span class="close" @click="$emit('closeModal')">&times;</span>
      </div>
      <div class="comments">
        <div class="comment row" v-for="comment in commentList" :key="comment.no">
          <div class="col-sm-3" style="text-align: center" @click="pushMemberPage(comment)">
            <ProfileImage :img-src="comment.profileImg" :img-size="imgSize"></ProfileImage>
            <b>{{ comment.memberName }}</b>
          </div>
          <div class="col-sm-6 jutify-content-between">
            <p>{{  comment.content  }}</p>
          </div>
          <div class="col-md-1">
            <img v-if="memberNo == comment.memberNo" class="icon" @click="deleteComment(comment)" src="@/assets/icon/bin.png">
          </div>
          <div @click="toggleComment(comment)" class="col-sm-2" style="text-align: center;">
            <img src="@/assets/icon/heart.png" class="icon" v-show="!comment.isLike">
            <img src="@/assets/icon/heart-fill.png" class="icon" v-show="comment.isLike">
            <p>{{ comment.likeCount }}</p>
          </div>
        </div>
      </div>
      <div class="comment-input row">
        <input type="text" placeholder="댓글을 입력하세요" class="col-sm-9" v-model="content"/>
        <button @click="addComment" class="col-sm-3">작성</button>
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

const route = useRoute()

const props = defineProps({
  commentList: Array,
  videoNo: Number
});

const imgSize = {
  'width': '50px',
  'height': '50px'
}

const memberNo = ref(sessionStorage.getItem('no'))

const content = ref('')

const emit = defineEmits(['closeModal', 'addComment']);

const addComment = () => {
  if (content.value.trim() !== '') {
    const comment = {
      memberNo: sessionStorage.getItem('no'),
      content: content.value,
      videoNo: props.videoNo
    };

    api({
      url: 'http://localhost:8080/comment',
      method: 'POST',
      data: comment
    }).then((res) => {
      if(res.status == 201) {
        content.value = '';
        emit('addComment')
      } else {
        alert('댓글 등록에 실패했습니다. 잠시 후 다시 시도해주세요.')
      }
    }).catch((err) => {
      console.log(err)
    })
  }
};

const toggleComment = (comment) => {
  const data = {
    memberNo: sessionStorage.getItem('no'),
    commentNo: comment.no
  }

  const method = comment.isLike ? 'DELETE' : 'POST'

  api({
    url: 'http://localhost:8080/like/comment',
    method: method,
    data: data
  }).then((res) => {
    if(res.status == 201 || res.status == 200) {
        content.value = '';
        emit('addComment')
      } else {
        alert('댓글 좋아요에 실패했습니다. 잠시 후 다시 시도해주세요.')
      }
  })
}

const deleteComment = function(comment) {
  if(!confirm('삭제하시겠습니까?')) return
  api({
    url: `http://localhost:8080/comment/${comment.no}`,
    method: 'DELETE'
  }).then((res) => {
    if(res.status == 200) {
      emit('addComment')
      return
    } else {
      alert('댓글 삭제에 실패했습니다. 잠시 후 다시 시도해주세요.')
    }
  })
}

const pushMemberPage = function(comment) {
  router.push("/member/"+comment.memberNo)
}

watch(() => route.params.no, (newNo) => {
    fetchData(newNo)
})
</script>




<style scoped>
.icon {
  width: 20px;
  height: 20px;
}
.comment-modal {
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

.comments {
  margin-top: 20px;
}

.comment {
  border-bottom: 1px solid #ddd;
  padding: 10px 0;
}

.comment p {
  margin: 5px 0;
}

.comment-input {
  margin-top: 20px;
}

.comment-input input {
  width: calc(100% - 110px);
  padding: 10px;
  border: 1px solid #ddd;
  margin-left: 5px;
}

.comment-input button {
  border: none;
  margin-left: 10px;
  background-color: #007bff;
  color: white;
  cursor: pointer;
}

.comment-input button:hover {
  background-color: #0056b3;
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
