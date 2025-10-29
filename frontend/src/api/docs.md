# AI 笔记助手 · 前端联调接口文档

Base URL（Dev）: `http://localhost:8080/api`
Base URL（Prod via Nginx）: `/api`

## Auth
- POST /auth/register { username, password }
- POST /auth/login { username, password } => { token }
- GET  /auth/me => { id, username }

## File
- POST /files/upload  (form-data: file) => { id, name, size }
- GET  /files/list => [{ id, name, size, createdAt }]

## Chat & Notes
- GET  /chat/list => [{ id, title, lastMessageAt }]
- POST /chat/send { chatId?, fileId?, message } => { reply, chatId }
- POST /notes/generate { fileId | chatId } => { noteMarkdown }
- POST /mindmap/generate { noteMarkdown } => { nodes:[], edges:[] }

## 角色数字人（占位）
- POST /characters/model { novelText } => { characterIds:[] }
- POST /characters/chat { characterId, message } => { reply }