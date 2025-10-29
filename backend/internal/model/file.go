package model

import "time"

type File struct {
	ID        uint `gorm:"primarykey"`
	UserID    uint
	Name      string
	Path      string
	Size      int64
	CreatedAt time.Time
}
