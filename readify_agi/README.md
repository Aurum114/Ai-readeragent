# 📚 科小记 AGI

<div align="center">
  <h3>科小记智能读书助手的AGI底座</h3>
  <p>基于多智能体协作的复杂任务解决方案</p>
  
</div>


## 🛠️ 技术栈

- **后端框架**: FastAPI, Python 3.9
- **大语言模型**: OpenAI, Qwen, Deepseek...
- **Agent框架**: LangChain
- **数据库**: SQLAlchemy, MySQL
- **向量数据库**: ChromaDB
- **文档处理**: LlamaParse, PyPDF
- **异步处理**: Uvicorn, ASGI

## 📋 前提条件

- Python 3.9 或更高版本
- Conda 或 pip 包管理工具

## 🚀 快速开始

### 环境配置

1. 使用 Conda 创建环境：

```bash
# 创建并激活环境
conda env create -f environment.yml
conda activate readify_agi
```

2. 或直接使用 pip 安装依赖：

```bash
pip install -r requirements.txt
```

### 启动服务

```bash
python main.py
```

服务默认在 `http://localhost:8090` 启动

## 🧩 项目结构

```
readify_agi/
├── app/                    # 应用核心代码
│   ├── api/                # API 接口定义
│   ├── core/               # 核心功能模块
│   ├── models/             # 数据模型
│   ├── repositories/       # 数据访问层
│   ├── services/           # 业务逻辑服务
│   ├── static/             # 静态资源
│   └── utils/              # 工具函数
├── prompt/                 # 提示词模板
├── static/                 # 全局静态资源
├── test/                   # 测试代码
├── main.py                 # 应用入口
├── environment.yml         # Conda 环境配置
└── README.md               # 项目文档
```

## 💻 开发指南

### 创建专业 Agent

继承基础的 `AgentService` 类来创建专业 Agent：

```python
from app.services.agent_service import AgentService

class CustomAgentService(AgentService):
    """自定义专业 Agent"""
    
    def __init__(self, db, project_id, model_name="gpt-4o", temperature=0.5):
        super().__init__(db, project_id, model_name, temperature)
        self.description = "专门处理特定领域任务的智能体"
        # 设置专用的提示模板
        self.prompt_template = "..."
```

### 配置并使用协调 Agent

```python
from app.services.coordinator_agent_service import CoordinatorAgentService

# 创建协调 Agent
coordinator = CoordinatorAgentService(db, project_id)

# 注册专业 Agent
coordinator.register_agent("custom", CustomAgentService(db, project_id))

# 处理用户查询
async def handle_response(response):
    print(response)

await coordinator.generate_stream_response(
    query="执行特定任务的指令",
    callback=handle_response,
    db=db,
    project_id=project_id
)
```

## 🤖 现有专业 Agent

- **Agent Service**: 基础智能体服务
- **Coordinator Agent**: 智能体调度器
- **Note Agent**: 笔记生成智能体
- **Ask Agent**: 知识问答智能体

## 🔧 提供能力

- **智能体协调**: 支持多智能体协作，动态分配和管理任务
- **文档处理**: 支持多种格式文档的解析、向量化和语义理解
- **知识问答**: 基于文档内容的智能问答和知识推理
- **笔记管理**: 自动生成和组织文档笔记
- **实时反馈**: 提供流式输出，实时展示智能体思考过程
