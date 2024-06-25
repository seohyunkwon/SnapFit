<<<<<<< HEAD
<!-- RankingView.vue -->
<template>
    <div class="container">
        <ExerciseTypes />
    </div><!-- end of container div -->
=======
<template>
    <div id="app">
        <ExerciseTypes />
    </div><!-- end of app div -->
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
</template>

<script setup>
import ExerciseTypes from '@/components/ranking/ExerciseTypes.vue';
</script>

<style scoped>
<<<<<<< HEAD
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
=======
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
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
