# 📚 科小记 Server

<div align="center">
  <h3>科小记智能读书助手的服务端引擎</h3>
  <p>基于领域驱动设计的智能读书助理后端服务</p>

</div>

## ✨ 功能特点

科小记 Server 是一个基于Java Spring Boot的智能阅读助手后端服务，专注于提供强大的读书笔记管理功能和智能分析能力。

- 📚 **智能笔记管理** - 自动整理和组织阅读笔记，支持多种笔记类型
- 🧠 **思维导图生成** - 通过AI分析文本内容，自动生成结构化的思维导图
- 💬 **对话历史记录** - 保存用户与AI的交流历史，包含思考过程和上下文
- 🔄 **实时流式输出** - 通过WebSocket提供AI响应的实时流式输出
- 🛡️ **安全认证授权** - 完善的JWT认证和Spring Security保护
- 📄 **文件处理** - 支持多种文档格式的上传、解析和管理
- 👥 **多用户支持** - 完整的用户管理和项目隔离机制

## 🛠️ 技术栈

- **后端框架**: Spring Boot 3.2.2
- **持久化**: MyBatis-Plus 3.5.5, MySQL 8.3.0
- **安全认证**: Spring Security, JWT
- **API文档**: SpringDoc OpenAPI (Swagger)
- **实时通信**: WebSocket、SSE
- **对象映射**: MapStruct 1.5.5
- **构建工具**: Maven

## 📋 前提条件

- JDK 17 或更高版本
- MySQL 8.0+
- Maven 3.6+

## 🚀 快速开始

### 环境配置

1. 克隆仓库：

```bash
git clone https://github.com/your-organization/readify-server.git
cd readify-server
```

2. 配置数据库：

修改 `src/main/resources/application.yml` 文件中的数据库连接信息。
运行 src/db/下的sql脚本创建数据库
### 构建项目

使用Maven构建项目：

```bash
./mvnw clean package
```

### 启动服务

```bash
# Linux/Unix
./start.sh

# Windows
start.bat
```

服务默认在 `http://localhost:8080` 启动

## 🧩 项目结构

```
readify-server/
├── src/
│   ├── main/
│   │   ├── java/com/readify/server/
│   │   │   ├── config/                # 配置类
│   │   │   ├── domain/                # 领域模型和服务
│   │   │   │   ├── auth/              # 认证授权领域
│   │   │   │   ├── conversation/      # 会话管理领域
│   │   │   │   ├── file/              # 文件管理领域
│   │   │   │   ├── mind_map/          # 思维导图领域
│   │   │   │   ├── notetask/          # 笔记任务领域
│   │   │   │   ├── project/           # 项目管理领域
│   │   │   │   └── user/              # 用户管理领域
│   │   │   ├── infrastructure/        # 基础设施层
│   │   │   │   ├── common/            # 通用组件
│   │   │   │   ├── persistence/       # 持久化实现
│   │   │   │   ├── security/          # 安全相关实现
│   │   │   │   └── utils/             # 工具类
│   │   │   ├── interfaces/            # 接口层
│   │   │   │   ├── auth/              # 认证接口
│   │   │   │   ├── conversation/      # 会话接口
│   │   │   │   ├── file/              # 文件接口
│   │   │   │   ├── mind_map/          # 思维导图接口
│   │   │   │   ├── project/           # 项目接口
│   │   │   │   └── user/              # 用户接口
│   │   │   └── websocket/             # WebSocket实现
│   │   └── resources/                 # 配置文件和静态资源
│   └── test/                          # 测试代码
├── .mvn/                              # Maven包装器配置
├── pom.xml                            # Maven依赖配置
└── README.md                          # 项目文档
```
