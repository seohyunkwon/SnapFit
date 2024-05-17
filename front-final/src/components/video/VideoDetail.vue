<template>
    <div class="video">
        <!-- video -->
        <video src="@/assets/videos/video_01.mp4" autoplay loop></video>

        <!-- content -->
        <div class="content">
            <h5>혀기의 상체운동</h5>
            <p>밭대 헬스장에서 운동하는 혀기,,,<br>화이팅..!<br>줄넘김<br>test</p>
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
import { ref } from 'vue'
import CommentDetail from '@/components/video/CommentDetail.vue'
const isCommentVisiable = ref(false)

const showCommentDetail = function() {
    isCommentVisiable.value = true;
}

const closeComment = function() {
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