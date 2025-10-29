<template>
  <div class="topbar">
    <div class="brand">
      <img src="/logo.png" alt="logo"/>
      <span class="name">书小记</span>
    </div>
    <div class="top-actions">
      <button @click="$emit('login-click')">登录 / 注册</button>
    </div>
  </div>
</template>