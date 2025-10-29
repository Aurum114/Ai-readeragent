<template>
  <div class="input-bar">
    <textarea v-model="text" placeholder="问我任何问题，或让它为你的文档生成笔记…"/>
    <button @click="send">发送</button>
  </div>
</template>
<script setup>
import { ref } from 'vue'
const emit = defineEmits(['send'])
const text = ref('')
const send = ()=>{
  if(!text.value.trim()) return
  emit('send', text.value)
  text.value=''
}
</script>