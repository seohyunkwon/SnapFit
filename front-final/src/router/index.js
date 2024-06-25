import Kakao from '@/components/member/Kakao.vue'
import UpdateForm from '@/components/member/UpdateForm.vue'
import VideoList from '@/components/member/VideoList.vue'
import LoginView from '@/views/LoginView.vue'
import MemberView from '@/views/MemberView.vue'
import RankingView from '@/views/RankingView.vue'
import SignupView from '@/views/SignupView.vue'
import UploadVideoView from '@/views/UploadVideoView.vue'
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
        header: 0,
        requiresAuth: false
      }
    },
    {
      path: '/login',
      name: 'login',
      component: LoginView,
      meta : {
        header: 0,
        requiresAuth: false
      }
    },
    {
      path: '/signup',
      name: 'signup',
      component: SignupView,
      meta : {
        header: 0,
        requiresAuth: false
      }
    },
    {
      path: '/video',
      name: 'video',
      component: VideoView,
      meta : {
        header: 1,
        requiresAuth: true
      }
    },
    {
      path: '/member/:no',
      name: 'member',
      component: MemberView,
      meta : {
        header: 1,
        requiresAuth: true
      },
      children: [
        {
          path: "",
          name: "",
          component: VideoList
        },
        {
          path: 'update',
          name: 'update',
          component: UpdateForm
        }
      ]
    },
    {
      path: '/ranking',
      name: 'ranking',
      component: RankingView,
      meta : {
        header: 1,
        requiresAuth: true
      }
    },
    {
      path: "/upload",
      name: "upload",
      component: UploadVideoView,
      meta : {
        header: 1,
        requiresAuth: true
      }
    },{
      path: '/kakao/oauth',
      name: 'kakao',
      component: Kakao
    }
    
  ]
})

router.beforeEach((to, from, next) => {
  const isAuthenticated = sessionStorage.getItem('token') != null;

  if (to.matched.some(record => record.meta.requiresAuth)) {
    if (!isAuthenticated) {
      next('/');
    } else {
      next();
    }
  } else {
    next();
  }
});


export default router
