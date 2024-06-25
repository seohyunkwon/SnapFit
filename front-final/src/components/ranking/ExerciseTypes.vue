<template>
<<<<<<< HEAD
    <div class="app">
        <div class="banners">
            <div class="title mb-3" :class="{ 'title-animate': titleVisible }">
                <h3>지금 주목 받는 운동은?</h3>
                <h5><b style="color: rgb(36, 132, 249);" class="logo">SNAPFIT</b>에서 확인해보세요🔥</h5>
            </div>
    
            <div class="mb-3" v-show="!showMoreButton" style="padding-top: 450px;">
                <h3><b style="color: rgb(36, 132, 249);" class="logo">SNAPFIT</b>에서<br> 다양한 운동을 확인해보세요!</h3>
            </div>
        </div>
      
        <div class="exercise-types">
            <div class="types row row-cols-2">
                <ExerciseType v-for="exercise in visibleExercises" :key="exercise.no" :exercise="exercise" />
                <div v-if="showMoreButton" @click="showMoreExercises" class="box d-flex align-items-center justify-content-center">
                    <h4 style="margin: 0px auto;">더 보기</h4>
                </div>
            </div>
        </div>
    </div>
=======
        <div class="types row row-cols-2">
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>   
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>  
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>   
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>   
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>   
            <ExerciseType></ExerciseType>
            <ExerciseType></ExerciseType>  
        </div>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</template>

<script setup>
import ExerciseType from '@/components/ranking/ExerciseType.vue'
<<<<<<< HEAD
import { ref, onMounted } from 'vue';
import api from '@/api';

const exerciseList = ref([])
const visibleExercises = ref([])
const showMoreButton = ref(false)
const titleVisible = ref(false)

const getExercise = () => {
    api('http://localhost:8080/exercise')
        .then((res) => {
            exerciseList.value = res.data
            updateVisibleExercises()
        })
}

onMounted(() => {
    getExercise()
    setTimeout(() => {
        titleVisible.value = true
    }, 100) 
})

const updateVisibleExercises = () => {
    visibleExercises.value = exerciseList.value.slice(0, 3)
    showMoreButton.value = exerciseList.value.length > 3
}

const showMoreExercises = () => {
    visibleExercises.value = exerciseList.value
    showMoreButton.value = false
}
</script>

<style scoped>
.app {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 700px;
    overflow: scroll;
    padding-top: 50px;
}
.exercise-types {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;
}

.types {
    width: 95%;
}

.box {
    margin: 5px;
    width: 45%;
    height: 100px;
    background-color: rgb(155, 155, 160);
    border-radius: 30px;
}

@keyframes slideDownFadeIn {
    0% {
        opacity: 0;
        transform: translateY(-50px);
    }
    100% {
        opacity: 1;
        transform: translateY(0);
    }
}

.title {
    opacity: 0;
    transition: opacity 2.5s ease-out, transform 2.5s ease-out;
}

.title-animate {
    animation: slideDownFadeIn 2.5s forwards;
}

@keyframes bounce {
    0%, 20%, 50%, 80%, 100% {
        transform: translateY(0);
    }
    40% {
        transform: translateY(-20px);
    }
    60% {
        transform: translateY(-10px);
    }
}

.logo {
    display: inline-block;
    animation: bounce 2s infinite;
}

.app::-webkit-scrollbar {
    width: 0px;
}

.app::-webkit-scrollbar-thumb {
    background-color: transparent;
}

.app::-webkit-scrollbar-track {
    background-color: transparent;
}
</style>
=======
</script>

<style scoped>
.types{
    width: 95%;
    margin: 0 auto;
}


</style>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
