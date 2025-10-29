<template>
  <div style="max-width:420px;margin:40px auto;padding:24px;border:1px solid #eee;border-radius:12px;background:#fff">
    <h2 style="margin-top:0">登录</h2>
    <input v-model="username" placeholder="用户名" style="width:100%;padding:10px;margin:8px 0;border:1px solid #ddd;border-radius:8px"/>
    <input v-model="password" type="password" placeholder="密码" style="width:100%;padding:10px;margin:8px 0;border:1px solid #ddd;border-radius:8px"/>
    <button @click="onLogin" style="width:100%;padding:10px;border:none;border-radius:10px;background:#f39abc;color:#fff">登录</button>
    <p style="text-align:center;margin-top:12px">没有账号？ <a href="/register">去注册</a></p>
  </div>
</template>
<script setup>
import { ref } from 'vue'
import { api } from '../api/clients'
import { useAuth } from '../store'
import { useRouter } from 'vue-router'

const username = ref('')
const password = ref('')
const auth = useAuth()
const router = useRouter()

const onLogin = async ()=>{
  const { data } = await api.login({ username: username.value, password: password.value })
  auth.setToken(data.token)
  router.push('/')
}
</script>