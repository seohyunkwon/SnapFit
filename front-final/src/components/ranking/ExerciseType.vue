<template>
    <div class="col type" :style="randomBackgroundColor" @click="showRanking(exercise)">
        <h4>
            <span class="emoji">{{ randomEmoji }}</span>
            <span class="exercise-name">{{ exercise.name }}</span>
        </h4>
    </div>

    <RankingDetail v-if="isRankingVisible" @close-modal="closeRanking" :video-list="videoList" :exercise="exercise"></RankingDetail>
</template>

<script setup>
import api from '@/api';
import { ref, defineProps, computed } from 'vue';
import { useRouter } from 'vue-router';
import { useVideoStore } from '@/stores/video';
import RankingDetail from './RankingDetail.vue';

const router = useRouter()
const videoStore = useVideoStore()
const props = defineProps({
    exercise: Object
})

const videoList = ref([])

const isRankingVisible = ref(false)

const showRanking = (exercise) => {
    api('http://localhost:8080/video/exercise/'+exercise.no)
    .then((res) => {
        console.log("res = ",res)
        videoList.value = res.data
    })
    isRankingVisible.value = true;
}

const closeRanking = () => {
  isRankingVisible.value = false;
}

const getRandomBlueColor = () => {
  const min = 180; 
  const max = 260;

  const color_r = Math.floor((Math.random() * (max - min)) + min).toString(16).padStart(2, '0');
  const color_g = Math.floor((Math.random() * (max - min)) + min).toString(16).padStart(2, '0');
  const color_b = Math.floor((Math.random() * (max - min)) + min).toString(16).padStart(2, '0');

  return `#${color_r}${color_g}${color_b}`;
};

const emojis = ['😊', '😎', '🚀', '🌟', '💪', '🎉', '👍', '✨', '🌈', '🎈', '💥', '🔥', '🌺', '🍀', '🌼', '⚽', '🏀', '🏈', '⚾', '🎾', '🏐', '🏓', '🏋️‍♂️', '🏋️‍♀️', '🚴‍♂️', '🚴‍♀️', '🏊‍♂️', '🏊‍♀️', '🏄‍♂️', '🏄‍♀️', '🏌️‍♂️', '🏌️‍♀️', '🏋️‍♂️', '🏋️‍♀️', '🚣‍♂️', '🚣‍♀️', '🧗‍♂️', '🧗‍♀️', '🚵‍♂️', '🚵‍♀️', '🧘‍♂️', '🧘‍♀️', '🛀'];

const randomEmoji = computed(() => {
  const index = Math.floor(Math.random() * emojis.length);
  return emojis[index];
});

const randomBackgroundColor = computed(() => ({
  backgroundColor: getRandomBlueColor()
}));

</script>


<style scoped>
.type {
    margin: 5px;
    width: 45%;
    height: 100px;
    background-color: rgb(199, 232, 252);
    border-radius: 30px;
}
.type:hover {
    filter: brightness(80%)
}
h4 {
    margin: 0;
    padding: 10px;
    padding-top: 25px;
    display: flex;
    align-items: center;
}

.emoji {
    font-size: 24px;
    margin-right: 10px;
}

.exercise-name {
    font-size: 18px;
    font-weight: bold;
}
</style>
