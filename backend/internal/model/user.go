package model

import "time"

type User struct {
	ID        uint   `gorm:"primarykey"`
	Username  string `gorm:"uniqueIndex;size:64"`
	Password  string `json:"-"`
	CreatedAt time.Time
}
