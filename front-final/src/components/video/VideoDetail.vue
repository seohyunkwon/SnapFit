<template>
    <div class="video">
        <!-- video -->
        <video>
            <source :src="`@/assets/videos/video_${video.no}.mp4`" type="video/mp4" autoplay loop>
        </video>

        <!-- content -->
        <div class="content">
            <h5>{{ video.title }}</h5>
            <p>{{ video.content }}</p>
        </div>

        <!-- like, comment, share -->
        <div class="icons">
            <div class="like mb-3 icon-div">
                <img src="@/assets/icon/heart.png" class="icon">
                <p>1.3M</p>
            </div>
            <div class="comment mb-3 icon-div" @click="showCommentDetail">
                <img src="@/assets/icon/comment.png" class="icon">
                <p>0.8K</p>
            </div>
            <div class="share mb-3 icon-div">
                <img src="@/assets/icon/share.png" class="icon">
                <p>1K</p>
            </div>
        </div>
        <CommentDetail v-if="isCommentVisiable" @close-modal="closeComment"></CommentDetail>
    </div>
</template>

<script setup>
import { ref, onMounted, defineProps } from 'vue'
import { defineConfig } from 'vite';
import CommentDetail from '@/components/comment/CommentDetail.vue'

const props = defineProps({
    video: {
        type: Object,
        required: true
    }
})

const config = defineConfig({
    assetsInclude: ['**/*.mov', '**/*.mp4']
})

const isCommentVisiable = ref(false)

const showCommentDetail = () => {
    isCommentVisiable.value = true;
}

const closeComment = () => {
    isCommentVisiable.value = false;
}


 
</script>

<style scoped>
.video {
    width: 390px;
    height: 844px;
}

video {
    width: 390px;
    height: 844px;
}

.icons {
    position: absolute;
    top: 70%;
    left: 87%;
    transform: translate(-50%, -50%);
}

.content {
    position: absolute;
    top: 75%;
    left: 35%;
    transform: translate(-50%, -50%);
    color: white;
    text-align: start;
}

.content h5 {
    font-weight: 600;
}

.icon {
    width: 45px;
    filter: invert(100%) sepia(12%) saturate(7500%) hue-rotate(181deg) brightness(110%) contrast(111%);
}

.icon:hover {
    animation: icon-shake 1s infinite !important;
}

.icon-div {
    color: white;
    text-align: center;
    font-weight: bold;
}

@keyframes icon-shake {
    0% {
        transform: rotate(0deg);
    }

    25% {
        transform: rotate(10deg);
    }

    50% {
        transform: rotate(0deg);
    }

    75% {
        transform: rotate(-10deg);
    }

    100% {
        transform: rotate(0deg);
    }
}
</style>
