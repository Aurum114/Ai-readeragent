package model

type Note struct {
	ID      uint `gorm:"primarykey"`
	UserID  uint
	FileID  *uint
	ChatID  *uint
	Content string `gorm:"type:text"` // Markdown
}
