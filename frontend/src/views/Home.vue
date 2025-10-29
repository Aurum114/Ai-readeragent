<template>
  <div style="display:flex;flex-direction:column;height:100%">
    <ChatWindow :messages="messages"/>
    <ChatInput @send="onSend"/>
  </div>
</template>
<script setup>
import { ref } from 'vue'
import ChatWindow from '../components/ChatWindow.vue'
import ChatInput from '../components/ChatInput.vue'
import { api } from '../api/clients'

const messages = ref([
  { role:'ai', content:'你好，我是你的 AI 笔记助手「书小记」。上传 PDF/DOCX/TXT，我可自动生成结构化笔记与思维导图～' }
])

const onSend = async (text)=>{
  messages.value.push({ role:'user', content:text })
  const { data } = await api.sendChat({ message: text })
  messages.value.push({ role:'ai', content: data.reply })
}
</script>