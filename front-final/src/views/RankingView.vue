<!-- RankingView.vue -->
<template>
    <div class="container">
        <ExerciseTypes />
    </div><!-- end of container div -->
</template>

<script setup>
import ExerciseTypes from '@/components/ranking/ExerciseTypes.vue';
</script>

<style scoped>
.container {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 90vh;
    overflow-y: auto;
    padding: 20px;
    box-sizing: border-box;
}
.container::-webkit-scrollbar {
    width: 0px;
}
.container::-webkit-scrollbar-thumb {
    background-color: transparent;
}

.container::-webkit-scrollbar-track {
    background-color: transparent;
}
</style>
