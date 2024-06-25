<template>
  <div class="follow-modal">
    <div class="modal-content">
      <div class="justify-content-between">
        <span style="font-size: 20px;">{{ followStore.type === 'following' ? '팔로잉' : '팔로워' }} 보기</span>
        <span class="close" @click="$emit('closeModal')">&times;</span>
      </div>
      <div class="follows">
        <div class="follow row" v-for="follow in followStore.modalList" :key="follow.no">
          <div class="col-sm-8 d-flex" style="text-align: center;">
            <ProfileImage @click="clickMember(follow)" :img-src="follow.profileImg" :img-size="imgSize" class="col-sm-3" style="margin: auto"></ProfileImage>
            <span @click="clickMember(follow)" :data-no="follow.no" class="col-sm-9" style="margin: auto;">{{ follow.nickname }}</span>
          </div>
          <div class="col" style="margin: auto;" v-show="loginNo === memberNo">
            <button @click="followStore.deleteFollow(follow.no)">삭제</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { useRoute, useRouter } from 'vue-router';
import { ref, defineEmits, computed } from 'vue';
import ProfileImage from '../member/ProfileImage.vue';
import { useFollowStore } from '@/stores/follow';

const route = useRoute()

const followStore = useFollowStore();
const loginNo = sessionStorage.getItem('no')
const member = ref(null)
const memberNo = computed(() => {
    return route.params.no
})

const imgSize = {
  width: '50px',
  height: '50px'
};

const emit = defineEmits('closeModal');

const router = useRouter();

const clickMember = function(member) {
  emit('closeModal', member.no);
};
</script>

<style scoped>
.follow-modal {
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
  border: 1px solid #888;
  width: 80%;
  max-width: 600px;
  top: 20%;
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

.follows {
  margin-top: 20px;
}

.follow {
  border-bottom: 1px solid #ddd;
  padding: 10px 0;
}

.follow p {
  margin: 5px 0;
}

button {
  background-color: #ddd;
  border: none;
  border-radius: 10px;
  padding: 5px;
  padding-left: 10px;
  padding-right: 10px;
}
</style>
