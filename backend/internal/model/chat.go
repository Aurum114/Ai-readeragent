package model

import "time"

type Chat struct {
	ID            uint `gorm:"primarykey"`
	UserID        uint
	Title         string
	LastMessageAt time.Time
	Messages      []Message
}

type Message struct {
	ID        uint `gorm:"primarykey"`
	ChatID    uint
	Role      string // user/ai
	Content   string `gorm:"type:text"`
	CreatedAt time.Time
}
