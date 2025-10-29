package service

import (
	"ai-note-assistant/backend/internal/repository"
	"fmt"
)

type ChatReply struct {
	Reply  string
	ChatID uint
}

// 占位：返回简单模板化回答
func Send(uid uint, chatID *uint, message string) (*ChatReply, error) {
	cid, err := repository.EnsureChat(uid, chatID)
	if err != nil {
		return nil, err
	}
	if err := repository.AddMessage(cid, "user", message); err != nil {
		return nil, err
	}

	reply := fmt.Sprintf("收到啦！这是占位 AI 回复：\n- 你的提问：%s\n- 我可以基于上传文件自动生成摘要与思维导图（开发中）", message)
	if err := repository.AddMessage(cid, "ai", reply); err != nil {
		return nil, err
	}
	return &ChatReply{Reply: reply, ChatID: cid}, nil
}
