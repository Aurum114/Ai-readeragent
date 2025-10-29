package service

import "fmt"

type NoteResult struct{ NoteMarkdown string }

// 占位：根据 fileId/chatId 生成 Markdown 笔记
func GenerateNote(fileId *uint, chatId *uint) (*NoteResult, error) {
	md := "# 自动笔记\n\n- 这是基础模板（待接入大模型/解析）\n- 支持：标题、要点、关键术语、问答\n"
	if fileId != nil {
		md += fmt.Sprintf("\n> 来自文件: #%d\n", *fileId)
	}
	if chatId != nil {
		md += fmt.Sprintf("\n> 来自对话: #%d\n", *chatId)
	}
	return &NoteResult{NoteMarkdown: md}, nil
}
