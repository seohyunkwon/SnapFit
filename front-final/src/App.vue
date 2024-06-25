<<<<<<< HEAD
<template>
  <div id="app" class="app">
    <TheHeader v-if="$route.meta.header === 1" />
    <RouterView></RouterView>
    <TheFooter v-if="$route.meta.header === 1" />
=======

<template>
  <div id="app" class="app">
    <TheHeader v-if="$route.meta.header === 1"/>
    <RouterView></RouterView>
    <TheFooter v-if="$route.meta.header === 1"/>
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
  </div>
</template>

<script setup>
import { RouterLink, RouterView, useRouter } from 'vue-router';
import TheHeader from "@/components/commons/TheHeader.vue";
import TheFooter from "@/components/commons/TheFooter.vue";

const router = useRouter();
const isDefaultRoute = (router.currentRoute.value.path === '/');

</script>

<style scoped>
</style>
