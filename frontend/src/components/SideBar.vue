<template>
  <aside class="sidebar" :class="{hidden:collapsed}">
    <h3>已上传文件</h3>
    <div class="section">
      <div v-for="f in files" :key="f.id" class="file-item">
        <span>{{ f.name }}</span>
        <small>{{ (f.size/1024).toFixed(1) }}KB</small>
      </div>
      <input type="file" @change="onUpload" />
    </div>

    <h3>对话</h3>
    <div class="section">
      <div v-for="c in chats" :key="c.id" class="file-item" @click="$emit('selectChat', c.id)">
        <span>{{ c.title }}</span>
        <small>{{ new Date(c.lastMessageAt).toLocaleString() }}</small>
      </div>
    </div>
  </aside>
</template>
<script setup>
import { ref, onMounted } from 'vue'
import { api } from '../api/clients'

defineProps({ collapsed: Boolean })
const files = ref([])
const chats = ref([])

onMounted(async()=>{
  files.value = (await api.listFiles()).data || []
  chats.value = (await api.listChats()).data || []
})

const onUpload = async (e)=>{
  const file = e.target.files?.[0]
  if(!file) return
  const fd = new FormData()
  fd.append('file', file)
  await api.uploadFile(fd)
  files.value = (await api.listFiles()).data || []
}
</script>