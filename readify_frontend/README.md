# 📚 科小记

<div align="center">
  
  <h3>智能阅读笔记助手</h3>
  <p>基于AI的智能阅读笔记和思维导图生成工具</p>
  
</div>

## ✨ 功能特点

科小记是一个强大的阅读笔记助手，帮助用户轻松整理知识并生成直观的思维导图。

- 📝 **智能笔记生成** - 自动分析文档内容，生成结构化笔记
- 🧠 **思维导图可视化** - 直观展示知识结构和关系
- 💬 **多种AI模型支持** - 支持OpenAI、Qwen、DeepSeek等多种大语言模型
- 📄 **多格式文档支持** - 支持PDF、TXT、DOCX等多种文档格式
- 🔄 **实时交互反馈** - 思考过程实时展示，提供更好的用户体验
- 📱 **响应式设计** - 适配不同设备屏幕尺寸




## 📋 前提条件

- Node.js 16.x 或更高版本
- NPM 7.x 或更高版本

## 🚀 快速开始

### 安装

```bash
# 克隆项目
git clone https://github.com/yourusername/readify.git
cd readify

# 安装依赖
npm install
```

### 运行开发服务器

```bash
npm run dev
```

服务将在 http://localhost:5173 运行

### 构建生产版本

```bash
npm run build
```

构建后的文件将生成在 `dist` 目录下

### 预览生产版本

```bash
npm run preview
```

## 🎎 数字看板娘（Live2D）

前端首页已内置 Live2D 数字看板娘，默认在 `src/views/Home.vue` 中启用并渲染到 `#live2dcanvas`。

- **资源位置**: `public/live2d/`
  - 模型: `assets/Epsilon2.1.model.json` 及其依赖
  - 脚本: `/live2d/device.min.js`, `/live2d/script.js`
- **初始化方式**: `Home.vue` 中动态加载脚本并调用
  ```js
  loadlive2d('live2dcanvas', '/live2d/assets/Epsilon2.1.model.json', 1.0)
  ```
- **交互说明**: 支持拖拽移动、滚轮缩放、双击重置位置与大小
- **关闭/禁用**: 注释 `Home.vue` 中 Live2D 脚本加载与 `<canvas id="live2dcanvas">`，或移除对应 `Promise.all([...])` 逻辑
- **自定义模型**: 替换 `public/live2d/assets` 下的模型文件并调整引用路径

## 🧩 项目结构

```
readify/
├── public/             # 静态资源
├── src/                # 源代码
│   ├── api/            # API请求
│   ├── assets/         # 资源文件
│   ├── components/     # 组件
│   ├── router/         # 路由配置
│   ├── store/          # Vuex状态管理
│   ├── types/          # TypeScript类型定义
│   ├── utils/          # 工具函数
│   ├── views/          # 页面视图
│   ├── App.vue         # 根组件
│   └── main.ts         # 入口文件
├── index.html          # HTML模板
├── package.json        # 项目依赖
├── tsconfig.json       # TypeScript配置
└── vite.config.ts      # Vite配置
```


## 🔧 配置

在 `.env` 文件中配置环境变量:

```
VITE_API_BASE_URL=http://your-api-url
```

