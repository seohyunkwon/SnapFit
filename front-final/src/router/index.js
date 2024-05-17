import VideoList from '@/components/member/VideoList.vue'
import LoginView from '@/views/LoginView.vue'
import MyPageView from '@/views/MyPageView.vue'
import RankingView from '@/views/RankingView.vue'
import SignupView from '@/views/SignupView.vue'
import VideoView from '@/views/VideoView.vue'
import WelcomeView from '@/views/WelcomeView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'welcome',
      component: WelcomeView,
      meta :  {
        header: 0
      }
    },
    {
      path: '/login',
      name: 'login',
      component: LoginView,
      meta : {
        header: 0
      }
    },
    {
      path: '/signup',
      name: 'signup',
      component: SignupView,
      meta : {
        header: 0
      }
    },
    {
      path: '/video',
      name: 'video',
      component: VideoView,
      meta : {
        header: 1
      }
    },
    {
      path: '/mypage',
      name: 'mypage',
      component: MyPageView,
      meta : {
        header: 1
      },
      children: [
        {
          path: "",
          name: "videoList",
          component: VideoList
        }
      ]
    },
    {
      path: '/ranking',
      name: 'ranking',
      component: RankingView,
      meta : {
        header: 1
      }
    }
    
  ]
})

export default router
