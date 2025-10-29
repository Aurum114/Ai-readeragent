package controller

import (
	"ai-note-assistant/backend/internal/repository"
	"ai-note-assistant/backend/internal/service"
	"github.com/gin-gonic/gin"
)

type FileController struct{}

func (f *FileController) Upload(c *gin.Context) {
	file, err := c.FormFile("file")
	if err != nil {
		c.JSON(400, gin.H{"msg": "文件缺失"})
		return
	}
	res, err := service.SaveFile(1, file) // TODO: 从 token 解析 uid
	if err != nil {
		c.JSON(500, gin.H{"msg": err.Error()})
		return
	}
	c.JSON(200, gin.H{"id": res.ID, "name": res.Name, "size": res.Size})
}

func (f *FileController) List(c *gin.Context) {
	fs, _ := repository.ListFiles(1)
	c.JSON(200, fs)
}
