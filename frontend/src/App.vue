<template>
  <div id="app">
    <TopBar @login-click="goLogin"/>
    <div class="layout">
      <SideBar :collapsed="collapsed" @selectChat="onSelectChat"/>
      <div class="content">
        <router-view />
      </div>
    </div>
    <button class="toggle-sidebar" @click="collapsed = !collapsed">{{ collapsed? '➡' : '⬅' }}</button>
  </div>
</template>
<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import TopBar from './components/TopBar.vue'
import SideBar from './components/SideBar.vue'
const collapsed = ref(false)
const router = useRouter()
const goLogin = ()=> router.push('/login')
const onSelectChat = (id)=> router.push({ name: 'Home', query: { chatId:id }})
</script>