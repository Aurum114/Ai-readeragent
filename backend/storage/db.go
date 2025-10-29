package storage

import (
	"ai-note-assistant/backend/config"
	"ai-note-assistant/backend/internal/model"
	"fmt"
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

var DB *gorm.DB

func dsn(c *config.Config) string {
	return fmt.Sprintf("%s:%s@tcp(%s:%s)/%s?charset=utf8mb4&parseTime=True&loc=Local",
		c.MySQLUser, c.MySQLPassword, c.MySQLHost, c.MySQLPort, c.MySQLDB)
}

func InitDB(cfg *config.Config) error {
	var err error
	DB, err = gorm.Open(mysql.Open(dsn(cfg)), &gorm.Config{})
	if err != nil {
		return err
	}
	return DB.AutoMigrate(&model.User{}, &model.File{}, &model.Chat{}, &model.Message{}, &model.Note{})
}
