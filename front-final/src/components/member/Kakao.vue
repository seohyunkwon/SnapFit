<script setup>
import router from '@/router';
import { useRoute } from 'vue-router'
import { onMounted } from 'vue'
const route = useRoute()
import axios from 'axios'


const API_KEY = '14ee8a7f4bd8a6cc315d3da449a0c3cb'
const REDIRECT_URL = 'http://localhost:5173/kakao/oauth'

onMounted(() => {
    console.log('onMounted')
    const code = route.query.code
    console.log(code)


    axios({
        url: 'https://kauth.kakao.com/oauth/token',
        method: 'POST',
        headers: { "Content-Type": "application/x-www-form-urlencoded;charset=utf-8" },
        data: {
            code: code,
            client_id: API_KEY,
            redirect_uri: REDIRECT_URL,
            grant_type: 'authorization_code'
        }
    }).then((res) => {
        console.log(res.data)
        console.log(res)
    
    }).catch((err) => console.log(err))
})

</script>

<template>

</template>