<template>
    <div id="app">
        <ExerciseTypes />
    </div><!-- end of app div -->
</template>

<script setup>
import ExerciseTypes from '@/components/ranking/ExerciseTypes.vue';
</script>

<style scoped>
#app {
    display: flex;
    align-items: center;
    vertical-align: center;
    height: 664px;
    overflow-y: auto;
    max-height: calc(100vh - 150px);
    padding-top: 300px;
    margin-top: 80px;
}

#app::-webkit-scrollbar {
    width: 0px;
}

#app::-webkit-scrollbar-thumb {
    background-color: transparent;
}

#app::-webkit-scrollbar-track {
    background-color: transparent;
}
</style>