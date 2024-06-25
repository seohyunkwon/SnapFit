import { ref } from 'vue'
import { defineStore } from 'pinia'
import api from '@/api.js'
import router from '@/router'
import { HttpStatusCode } from 'axios'

export const useMemberStore = defineStore('member', () => {
  const id = ref(null)
  const no = ref(null)

  const API_KEY = '14ee8a7f4bd8a6cc315d3da449a0c3cb'
  const REDIRECT_URL = 'http://localhost:8080/kakao/oauth'

  const kakaoLogin = function() {
    console.log("kakao")
    window.location.href = `https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=${API_KEY}&redirect_uri=${REDIRECT_URL}`
  }

  const login = function(member) {
    api.post('http://localhost:8080/login', member)
      .then((res) => {
        id.value = JSON.parse(atob(res.data.split('.')[1])).sub
        no.value = JSON.parse(atob(res.data.split('.')[1])).no

        sessionStorage.setItem("id", id.value)
        sessionStorage.setItem("no", no.value)
        sessionStorage.setItem("token", res.data)

        router.replace("/video")
      })
      .catch((err) => {
        alert('로그인에 실패했습니다.')
        return false
      })
  }

  const signup = function(member) {
    api.post('/signup', member)
      .then((res) => {
        if (res.status == HttpStatusCode.Created) {
          alert('회원가입에 성공했습니다!')
          router.push('/login')
          return
        }
        alert('회원가입에 실패했습니다.')
        router.replace('/signup')
      })
      .catch(e => console.log(e))
  }

  const logout = () => {
    sessionStorage.removeItem('no')
    sessionStorage.removeItem('id')
    sessionStorage.removeItem('token')
    router.push('/')
  }

  return {
    id,
    no,
    login,
    signup,
    logout,
    kakaoLogin
  }
})
