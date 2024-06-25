import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
<<<<<<< HEAD
import VueVideoPlayer from '@videojs-player/vue'
import 'video.js/dist/video-js.css'

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9

const app = createApp(App)

app.use(createPinia())
app.use(router)
<<<<<<< HEAD
app.use(VueVideoPlayer)
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9

app.mount('#app')
