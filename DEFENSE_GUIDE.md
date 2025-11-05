# 科小记（Readify Parent）项目答辩讲解稿

> 面向大三计科本科答辩的讲解提纲与演示脚本

## 1. 项目一句话简介
- 科小记是一款“智能阅读笔记助手”，通过多智能体协作与文档理解，为用户自动生成结构化的阅读笔记与思维导图，并支持可追踪的思考过程与多模型问答。

## 2. 整体架构与模块划分
```
Ai-readeragent/
├─ readify_frontend/   # 前端：Vue 3 + TS + Element Plus + markmap.js
├─ readify_server/     # 服务端：Spring Boot 3 + MyBatis-Plus + MySQL + WebSocket
└─ readify_agi/        # AI智能体底座：Python FastAPI + LangChain + ChromaDB
```
- 前端（Vue 3 + TS）：登录注册、项目管理、文件上传、对话、笔记与思维导图可视化；内置 Live2D 数字看板娘增强交互氛围。
- 服务端（Java Spring Boot）：用户认证（JWT）、项目/文件/会话/思维导图等领域服务，统一业务编排与权限隔离，向前端提供 REST 与实时通道。
- AGI（Python FastAPI）：多智能体协作引擎，完成文档解析、向量化检索、知识问答、笔记与思维导图内容生成，并以流式方式回传“思考过程 + 最终答案”。

## 3. 主要功能清单（端到端）
- 智能问答
  - 基于文档内容与检索增强，支持 OpenAI、DeepSeek、Qwen 等多模型。
  - 前端 `Chat.vue` 实现思考过程（thought）与最终答案（final_answer）的分步流式呈现。
- 智能笔记生成
  - 自动输出分层级的结构化笔记，便于复盘与分享。
- 思维导图可视化
  - 基于 markmap 将层级笔记渲染为交互式思维导图，直观呈现知识结构。
- 多格式文档处理
  - 支持 PDF/TXT/DOCX 等；AGI 侧可结合 LlamaParse、PyPDF 完成解析。
- 项目/文件/会话管理
  - Java 服务端提供完善的用户、项目、文件、会话与权限隔离逻辑（JWT）。
- 实时交互反馈
  - WebSocket/SSE 流式输出，实时显示“思考过程”，提高可解释性与参与感。
- 数字看板娘（Live2D）
  - 首页内置 Live2D 模块，支持拖拽/缩放，提升互动与展示效果。

## 4. 技术栈与关键依赖
- 前端
  - Vue 3、TypeScript、Element Plus、Vite
  - markmap-lib/markmap-view、markdown-it、highlight.js
- 服务端
  - Spring Boot 3.2.2、MyBatis-Plus、MySQL 8、Spring Security + JWT
  - WebSocket/SSE、MapStruct、Reactor Netty
- AGI 智能体
  - Python 3.9、FastAPI、LangChain、SQLAlchemy
  - 向量存储：ChromaDB（本地 `data/vector_store`）
  - 文档解析：LlamaParse、PyPDF
  - 模型接入：OpenAI、DeepSeek、Qwen（可配置多厂商 API Key 与 Base URL）

## 5. 设计亮点（可作为“特色/优越性”阐述）
- 多智能体协作架构
  - 通过协调 Agent 将复杂任务拆分给专业 Agent（问答、笔记、文本修复等），支持持续扩展新 Agent，具备良好可塑性。
- 可解释的流式交互
  - AGI 侧输出分为 `thought` 与 `final_answer`，前端实时渲染思考轨迹，便于用户理解模型推理路径，提高信任度。
- 检索增强与私有知识问答
  - 文档解析与向量化检索（ChromaDB）结合大模型，实现“基于我的资料来回答”的私有知识场景。
- 工程化与分层清晰
  - DDD 风格的 Java 后端分层（domain/infrastructure/interfaces），前后端与 AGI 解耦，配置化程度高，便于团队协作与维护。
- 体验导向的可视化表达
  - markmap 思维导图 + Markdown 高亮渲染，降低使用门槛，提升复习与汇报效率；Live2D 提升展示氛围。

## 6. 为什么这些技术选型更优
- Vue 3 + Vite + Element Plus
  - 研发体验与性能俱佳，生态完善，组件丰富，适合快速构建中后台产品。
- Spring Boot 3 + MyBatis-Plus
  - 企业级生产可用生态，开发效率高；配合 JWT 安全与 WebSocket 实时通道，满足多用户与实时性需求。
- FastAPI + LangChain + ChromaDB
  - Python 生态对 LLM 兼容性好；LangChain 降低链式/工具调用复杂度；ChromaDB 足够轻量易用，适合教学与演示。
- 多模型可插拔
  - 同时支持 OpenAI/DeepSeek/Qwen 等，便于在可用性、成本与效果间灵活权衡。

## 7. 端到端业务流程（演示时可口述流程）
1) 用户在前端创建项目并上传资料（PDF/DOCX 等）。
2) 服务端保存项目与文件元数据，触发/请求 AGI 进行解析与向量化入库。
3) 用户在对话框提出问题。
4) AGI 协调 Agent：
   - 调用检索获取相关片段 → 组织上下文 → 生成思考过程（thought）与答案（final_answer）。
5) 前端实时显示思考过程与最终答案；若选择笔记/导图，渲染为层级笔记与思维导图。

## 8. 演示脚本（建议 5–8 分钟）
- 开场（30s）
  - 项目目标：让“阅读-理解-输出”更高效，适合学生与研究者。
- 功能巡览（2–3min）
  - 登录 → 创建项目 → 上传文档 → 进入对话页。
  - 提问一个与文档相关的问题，突出“思考过程”实时输出与最终答案。
  - 切换到笔记/思维导图视图，展示结构化结果与可视化效果。
- 技术亮点（2–3min）
  - 三层架构与职责：前端 UI、服务端领域服务、AGI 智能体。
  - 多智能体协作与向量检索增强；多模型适配与流式渲染。
- 总结（30s）
  - 项目价值：提升信息吸收与复盘效率；工程化可扩展，便于二次开发。

## 9. 常见问答（Q&A）
- 如何保障数据隐私？
  - 私有化部署 + 本地向量库（ChromaDB）+ 基于 JWT 的鉴权与项目隔离，敏感资料不出域。
- 模型成本与可用性如何兼顾？
  - 支持 OpenAI/DeepSeek/Qwen 等多家厂商，可按效果与成本选择；亦可切换到国内专线配置。
- 系统如何扩展新能力？
  - 在 AGI 侧新增专业 Agent；在服务端增加对应接口；前端增加入口与 UI，三端解耦迭代快。
- 思维导图如何生成？
  - 将结构化笔记转换为 Markdown/层级节点，由 markmap 在前端进行可视化。

## 10. 运行与部署要点（演示准备）
- 前端（开发）
  - `cd readify_frontend && npm install && npm run dev` → http://localhost:5173
- 服务端（开发）
  - 配置 `src/main/resources/application.yml` 中的 MySQL 与 JWT；`./mvnw spring-boot:run` 或 `start.bat`。
- AGI（开发）
  - `cd readify_agi && pip install -r requirements.txt && python main.py` → 默认端口 8090
  - 配置 `readify_agi/.env`：数据库、各模型 API Key、向量库目录等（见 `app/core/config.py` 字段）。

## 11. 你可以这样讲项目（示例话术）
- “科小记是一个帮助把‘阅读资料→结构化知识→复盘导图’一气呵成的工具。”
- “我把系统拆成三层：前端做交互与可视化，Java 服务端做领域与权限，Python AGI 做智能体与检索增强。”
- “我们的亮点是可解释的流式输出、多智能体协作、以及多模型可插拔，既好用又能扩展。”
- “对于私有知识问答，我们采用本地向量库与权限隔离，兼顾易用与隐私。”

## 12. 仓库内关键文件（便于问到时定位）
- 根 README：`README.md`（项目概览、技术架构、启动步骤）
- 前端入口：`readify_frontend/src/main.ts`，对话核心组件：`readify_frontend/src/components/Chat.vue`
- 服务端配置：`readify_server/src/main/resources/application.yml`，依赖：`readify_server/pom.xml`
- AGI 配置：`readify_agi/app/core/config.py`（环境项来源 `.env`）

---

备注：本讲稿使用项目品牌“科小记”，与仓库内代码包名/目录名可能仍为 Readify 保持兼容；如需代码级重命名可在演示后统一处理。
