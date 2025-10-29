<template>
  <div style="max-width:420px;margin:40px auto;padding:24px;border:1px solid #eee;border-radius:12px;background:#fff">
    <h2 style="margin-top:0">注册</h2>
    <input v-model="username" placeholder="用户名" style="width:100%;padding:10px;margin:8px 0;border:1px solid #ddd;border-radius:8px"/>
    <input v-model="password" type="password" placeholder="密码" style="width:100%;padding:10px;margin:8px 0;border:1px solid #ddd;border-radius:8px"/>
    <button @click="onRegister" style="width:100%;padding:10px;border:none;border-radius:10px;background:#f39abc;color:#fff">注册</button>
  </div>
</template>
<script setup>
import { ref } from 'vue'
import { api } from '../api/clients'
import { useRouter } from 'vue-router'

const username = ref('')
const password = ref('')
const router = useRouter()

const onRegister = async ()=>{
  await api.register({ username: username.value, password: password.value })
  router.push('/login')
}
</script>