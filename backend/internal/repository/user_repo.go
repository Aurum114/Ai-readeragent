package repository

import (
	"ai-note-assistant/backend/internal/model"
	"ai-note-assistant/backend/storage"
)

func CreateUser(u *model.User) error { return storage.DB.Create(u).Error }
func GetUserByName(name string) (*model.User, error) {
	var u model.User
	if err := storage.DB.Where("username = ?", name).First(&u).Error; err != nil {
		return nil, err
	}
	return &u, nil
}
func GetUserByID(id uint) (*model.User, error) {
	var u model.User
	if err := storage.DB.First(&u, id).Error; err != nil {
		return nil, err
	}
	return &u, nil
}
