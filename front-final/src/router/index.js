<<<<<<< HEAD
import Kakao from '@/components/member/Kakao.vue'
import UpdateForm from '@/components/member/UpdateForm.vue'
import VideoList from '@/components/member/VideoList.vue'
import LoginView from '@/views/LoginView.vue'
import MemberView from '@/views/MemberView.vue'
import RankingView from '@/views/RankingView.vue'
import SignupView from '@/views/SignupView.vue'
import UploadVideoView from '@/views/UploadVideoView.vue'
=======
import VideoList from '@/components/member/VideoList.vue'
import LoginView from '@/views/LoginView.vue'
import MyPageView from '@/views/MyPageView.vue'
import RankingView from '@/views/RankingView.vue'
import SignupView from '@/views/SignupView.vue'
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
        header: 0,
        requiresAuth: false
=======
        header: 0
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
      }
    },
    {
      path: '/login',
      name: 'login',
      component: LoginView,
      meta : {
<<<<<<< HEAD
        header: 0,
        requiresAuth: false
=======
        header: 0
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
      }
    },
    {
      path: '/signup',
      name: 'signup',
      component: SignupView,
      meta : {
<<<<<<< HEAD
        header: 0,
        requiresAuth: false
=======
        header: 0
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
      }
    },
    {
      path: '/video',
      name: 'video',
      component: VideoView,
      meta : {
<<<<<<< HEAD
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
=======
        header: 1
      }
    },
    {
      path: '/mypage',
      name: 'mypage',
      component: MyPageView,
      meta : {
        header: 1
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
      },
      children: [
        {
          path: "",
<<<<<<< HEAD
          name: "",
          component: VideoList
        },
        {
          path: 'update',
          name: 'update',
          component: UpdateForm
=======
          name: "videoList",
          component: VideoList
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
        }
      ]
    },
    {
      path: '/ranking',
      name: 'ranking',
      component: RankingView,
      meta : {
<<<<<<< HEAD
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
=======
        header: 1
      }
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
    }
    
  ]
})

<<<<<<< HEAD
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


=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
export default router
