<template>
  <div class="chat">
    <div v-for="(m,i) in messages" :key="i" class="message" :class="m.role">
      <div>{{ m.content }}</div>
    </div>
  </div>
</template>
<script setup>
defineProps({ messages: { type:Array, default:()=>[] }})
</script>