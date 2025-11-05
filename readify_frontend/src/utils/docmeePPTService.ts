import { ElMessage } from 'element-plus';

// 文多多AiPPT API服务
class DocmeePPTService {
  private apiKey: string = '';
  private baseUrl: string = 'https://open.docmee.cn/api';
  private token: string = '';
  private tokenExpireTime: number = 0;

  constructor() {
    // 从环境变量中获取API密钥
    this.apiKey = import.meta.env.VITE_DOCMEE_API_KEY || '';
  }

  // 设置API密钥（可选，允许在运行时覆盖）
  setApiKey(apiKey: string): void {
    this.apiKey = apiKey;
    this.token = ''; // 重置token，下次使用时会重新生成
    this.tokenExpireTime = 0;
  }

  // 生成API Token
  private async generateToken(): Promise<string> {
    // 检查token是否有效
    if (this.token && Date.now() < this.tokenExpireTime) {
      return this.token;
    }

    try {
      const response = await fetch(`${this.baseUrl}/user/createApiToken`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Api-Key': this.apiKey
        },
        body: JSON.stringify({
          uid: `user_${Date.now()}`, // 生成唯一的用户ID
          limit: 5, // 限制生成次数，避免滥用
          timeOfHours: 2 // 过期时间2小时
        })
      });

      const data = await response.json();
      
      if (data.code === 0 && data.data) {
        this.token = data.data.token;
        this.tokenExpireTime = Date.now() + (data.data.expireTime * 1000); // 转换为毫秒
        return this.token;
      } else {
        throw new Error(data.message || '生成Token失败');
      }
    } catch (error) {
      console.error('生成Token失败:', error);
      throw error;
    }
  }

  // 使用直接生成PPT的方式 - 按照最新API规范实现
  private async directGeneratePptx(markdownContent: string, title: string): Promise<string> {
    const token = await this.generateToken();
    
    try {
      // 确保标题有效，作为主题使用
      const effectiveSubject = (title && typeof title === 'string' && title.trim()) || '未命名演示文稿';
      
      console.log('使用的主题:', effectiveSubject);
      
      // 按照最新API文档构建请求参数
      const requestData = {
        stream: false, // 非流式生成
        pptxProperty: false, // 不返回PPT数据结构
        length: "medium", // 默认中等篇幅
        subject: effectiveSubject // 使用标题作为主题
      };
      
      console.log('发送给API的参数:', JSON.stringify(requestData));
      
      const response = await fetch(`${this.baseUrl}/ppt/directGeneratePptx`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'token': token
        },
        body: JSON.stringify(requestData)
      });

      // 无论状态码是什么，都记录完整的响应信息
      console.log('API响应状态码:', response.status);
      
      // 尝试解析响应数据
      let data;
      try {
        data = await response.json();
        console.log('API响应完整数据:', JSON.stringify(data));
      } catch (jsonError) {
        console.error('解析API响应失败:', jsonError);
        throw new Error(`API响应格式错误: ${jsonError instanceof Error ? jsonError.message : String(jsonError)}`);
      }
      
      // 检查响应数据结构，按照新API的格式
      if (data.code !== 0 || !data.data || !data.data.pptInfo || !data.data.pptInfo.fileUrl) {
        // 详细记录失败原因
        const errorMessage = data.message || '未知错误';
        const errorCode = data.code !== undefined ? data.code : '未知';
        console.error(`PPT生成失败 - 错误码: ${errorCode}, 错误信息: ${errorMessage}`);
        throw new Error(`PPT生成失败: ${errorMessage}, 错误代码: ${errorCode}`);
      }
      
      // 成功情况 - 按照新API格式获取文件URL
      console.log('PPT生成成功，文件URL:', data.data.pptInfo.fileUrl);
      return data.data.pptInfo.fileUrl;
    } catch (error) {
      console.error('PPT生成过程中的异常:', error);
      if (error instanceof Error) {
        throw new Error(`PPT生成失败: ${error.message}`);
      }
      throw error;
    }
  }
  
  // 格式化Markdown以适应PPT生成
  private formatMarkdownForPPT(markdown: string): string {
    // 确保保留所有标题和内容
    // 这里不做复杂的格式化，避免破坏标题结构
    const lines = markdown.split('\n');
    const formattedLines = [];
    
    // 确保保留第一行（我们添加的标题）
    if (lines.length > 0) {
      formattedLines.push(lines[0]); // 保留第一行标题
      
      // 对剩余行进行处理，但不要过滤掉太多内容
      for (let i = 1; i < lines.length; i++) {
        const line = lines[i];
        // 保留非空行或者标题后跟着的空行
        if (line.trim() || (i === 1 && formattedLines[0].trim().startsWith('#'))) {
          formattedLines.push(line);
        }
      }
    }
    
    return formattedLines.join('\n');
  }

  // 导出PPT的简化方法
  async exportPptxFromMarkdown(markdownContent: string, title: string): Promise<string> {
    try {
      // 检查API密钥是否已配置
      if (!this.apiKey || this.apiKey === 'your_docmee_api_key_here') {
        throw new Error('文多多API密钥未配置，请在.env.development和.env.production文件中设置VITE_DOCMEE_API_KEY');
      }
      
      // 确保提供有效的标题，使用更严格的检查
      let effectiveTitle = '未命名演示文稿'; // 默认标题
      if (title && typeof title === 'string' && title.trim()) {
        effectiveTitle = title.trim();
      }
      
      console.log('准备导出PPT，标题:', effectiveTitle);
      
      ElMessage.info('开始生成PPT，请稍候...');
      
      // 使用直接生成PPT的方式，按照最新API规范
      // 注意：由于API不直接接受markdown内容，我们只传递标题作为主题
      const fileUrl = await this.directGeneratePptx(markdownContent, effectiveTitle);
      
      ElMessage.success('PPT生成成功！');
      return fileUrl;
    } catch (error) {
      console.error('导出PPT失败:', error);
      const errorMessage = error instanceof Error ? error.message : String(error);
      ElMessage.error('导出PPT失败: ' + errorMessage);
      throw new Error(`PPT导出流程失败: ${errorMessage}`);
    }
  }
}

// 导出单例实例
export const docmeePPTService = new DocmeePPTService();