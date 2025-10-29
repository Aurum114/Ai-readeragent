package repository

import (
	"ai-note-assistant/backend/internal/model"
	"ai-note-assistant/backend/storage"
	"time"
)

func EnsureChat(uid uint, chatID *uint) (uint, error) {
	if chatID != nil && *chatID > 0 {
		return *chatID, nil
	}
	c := model.Chat{UserID: uid, Title: "新对话", LastMessageAt: time.Now()}
	if err := storage.DB.Create(&c).Error; err != nil {
		return 0, err
	}
	return c.ID, nil
}

func AddMessage(chatID uint, role, content string) error {
	m := model.Message{ChatID: chatID, Role: role, Content: content}
	if err := storage.DB.Create(&m).Error; err != nil {
		return err
	}
	return storage.DB.Model(&model.Chat{}).Where("id=?", chatID).Update("last_message_at", m.CreatedAt).Error
}

func ListChats(uid uint) ([]model.Chat, error) {
	var cs []model.Chat
	err := storage.DB.Where("user_id=?", uid).Order("last_message_at desc").Find(&cs).Error
	return cs, err
}
func ListMessages(chatID uint) ([]model.Message, error) {
	var ms []model.Message
	err := storage.DB.Where("chat_id=?", chatID).Order("id").Find(&ms).Error
	return ms, err
}
