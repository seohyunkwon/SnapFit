import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import axios, { HttpStatusCode } from 'axios'
import router from '@/router'

const REST_API_URL = 'http://localhost:8080'

export const useMemberStore = defineStore('member', () => {
  const loginMember = ref(null)

  const login = function(member) {
    console.log(member)
   axios.post(`${REST_API_URL}/login`, member)
   .then((res) => {
    const id = JSON.parse(atob(res.data.split('.')[1])).sub;
    sessionStorage.setItem("loginUserId", id)
    router.replace("/video")
   })
   .catch( (err) => {
     alert('로그인에 실패했습니다.')
   })
  }

const signup = function(member) {
    axios.post(`${REST_API_URL}/signup`, member)
    .then((res) => {
      if(res.status == HttpStatusCode.Created) {
        alert('회원가입에 성공했습니다!')
        router.push('/login')
        return
      }
      alert('회원가입에 실패했습니다.')
      router.replace('/signup')
    })
    .catch(e => console.log(e))
}


  return {
     loginMember,
     login,
     signup
  }
})
