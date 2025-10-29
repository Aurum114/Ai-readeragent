package repository

import (
	"ai-note-assistant/backend/internal/model"
	"ai-note-assistant/backend/storage"
)

func CreateFile(f *model.File) error { return storage.DB.Create(f).Error }
func ListFiles(uid uint) ([]model.File, error) {
	var fs []model.File
	err := storage.DB.Where("user_id=?", uid).Order("id desc").Find(&fs).Error
	return fs, err
}
