# AI 笔记助手（Vue3 + Gin + GORM + MySQL + Nginx）

- 前端：Vue3 + Vite（白底、樱花粉顶/侧栏、ChatGPT 风格）
- 后端：Go (Gin + GORM) 分层 SSM 风格（Controller → Service → Repository → Model）
- 数据库：MySQL
- 部署：Nginx 反向代理 + 可选 docker-compose

## 快速开始（docker-compose，一键启动）
```bash
cd deploy
docker compose up -d
```

- 前端：http://localhost/
- 后端 API：http://localhost/api
- MySQL：容器名 `mysql`, 端口 `3306`，数据库 `ai_note`，root 密码 `${MYSQL_ROOT_PASSWORD}`

> 如果你本机已有 MySQL，请修改 `deploy/docker-compose.yml` 中的 `mysql` 服务，或在 `backend/.env` 配置自定义 DSN。

## 本地开发（不使用 Docker）
### 后端
```bash
cd backend
cp .env.example .env
# 如需修改 MySQL 连接，编辑 .env 中的 MYSQL_* 变量
go mod tidy
go run main.go  # :8080
```

### 前端
```bash
cd frontend
npm i
npm run dev  # :5173
```

### Nginx（生产）
- 将 `frontend/dist/` 放入 `/usr/share/nginx/html`
- 使用 `deploy/nginx.conf`（内含 /api 反代到 `backend:8080`）

## 目录结构
```
ai-note-assistant/
├─ frontend/   # Vue3 + Vite
├─ backend/    # Go + Gin + GORM + MySQL
└─ deploy/     # nginx.conf + docker-compose.yml
```