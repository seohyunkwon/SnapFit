import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import VueVideoPlayer from '@videojs-player/vue'
import 'video.js/dist/video-js.css'


const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(VueVideoPlayer)

app.mount('#app')
