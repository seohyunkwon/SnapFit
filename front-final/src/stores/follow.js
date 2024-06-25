import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import api from '@/api'
import { useRoute } from 'vue-router'

export const useFollowStore = defineStore('follow', () => {
  const followingList = ref([])
  const followerList = ref([])
  const type = ref('')
  const modalList = ref([])
  const route = useRoute()

  const isFollowing = ref(null)

  const getFollowing = (no) => {
    api(`http://localhost:8080/follow/following/${no}`)
      .then((res) => {
        followingList.value = res.data
      }).catch((err) => console.log(err))
  }

  const getFollower = (no) => {
    api(`http://localhost:8080/follow/follower/${no}`)
      .then((res) => {
        followerList.value = res.data
      }).catch((err) => console.log(err))
  }

  const chooseFollowing = () => {
    modalList.value = followingList.value
    type.value = 'following'
  }

  const chooseFollower = () => {
    modalList.value = followerList.value
    type.value = 'follower'
  }

  const addFollow = (no) => {
    const url = 'http://localhost:8080/follow'

    api({
      url: url,
      method: 'POST',
      data: {
        followerNo: sessionStorage.getItem('no'),
        followingNo: no
      }
    }).then((res) => {
      if (res.status === 201) {
        api({
          url: "http://localhost:8080/member",
          method: 'POST',
          data: {
            key: 'no',
            value: no
          }
        }).then((res) => {
          getFollowing(route.params.no)
          getFollower(route.params.no)
          checkFollow(no)
        }).catch((err) => console.log(err))
      } else {
        alert('추가에 실패했습니다. 잠시 후 다시 시도해주세요.')
      }
    }).catch((err) => console.log(err))
  }

  const deleteFollow = (no) => {
    const url = 'http://localhost:8080/follow'
    let followerNo = sessionStorage.getItem('no')
    let followingNo = no

    if (type.value === 'follower') {
      followerNo = no
      followingNo = sessionStorage.getItem('no')
    }

    api({
      url: url,
      method: 'DELETE',
      data: {
        followerNo: followerNo,
        followingNo: followingNo
      }
    }).then((res) => {
      if (res.status === 200) {
        if (type.value === 'following') {
          followingList.value = followingList.value.filter(follow => follow.no !== no)
          modalList.value = followingList.value
        } else {
          followerList.value = followerList.value.filter(follow => follow.no !== no)
          modalList.value = followerList.value
        }
        getFollowing(route.params.no)
        getFollower(route.params.no)
        checkFollow(no)
      } else {
        alert('삭제에 실패했습니다. 잠시 후 다시 시도해주세요.')
      }
    }).catch((err) => console.log(err))
  }

  const checkFollow = (no) => {
    api({
      url: `http://localhost:8080/follow?followerNo=${sessionStorage.getItem('no')}&followingNo=${no}`,
      method: 'GET'
    }).then((res) => {
      if(res.status === 200) {
        isFollowing.value = true;
      } else if(res.status === 204) {
        isFollowing.value = false;
      }
    }).catch((err) => {
      console.log(err);
      isFollowing.value = false;
    })
  };

  return {
    followerList,
    followingList,
    modalList,
    type,
    getFollower,
    getFollowing,
    chooseFollowing,
    chooseFollower,
    addFollow,
    deleteFollow,
    isFollowing,
    checkFollow
  }
})
