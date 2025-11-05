<template>
  <div class="chat-container">
    <div class="chat-header">
      <h3>对话</h3>
    </div>
    <div class="chat-content">
      <Chat />
    </div>
  </div>
</template>

<script lang="ts" setup>
import Chat from './Chat.vue'
</script>

<style scoped>
.chat-container {
  flex: 1;
  background: var(--bg-panel);
  border-radius: 12px;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.chat-header {
  height: 56px;
  padding: 0 16px;
  display: flex;
  align-items: center;
  border-bottom: 1px solid rgba(255,255,255,0.08);
}

.chat-header h3 {
  margin: 0;
  font-size: 16px;
  font-weight: 500;
  color: var(--text-primary);
}

.chat-content {
  flex: 1;
  overflow: hidden;
}
</style> 
