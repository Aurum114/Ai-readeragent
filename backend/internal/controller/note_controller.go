package controller

import (
	"ai-note-assistant/backend/internal/service"
	"github.com/gin-gonic/gin"
)

type noteReq struct {
	FileID *uint `json:"fileId"`
	ChatID *uint `json:"chatId"`
}
type mindReq struct {
	NoteMarkdown string `json:"noteMarkdown"`
}

func Generate(c *gin.Context) {
	var r noteReq
	if err := c.ShouldBindJSON(&r); err != nil {
		c.JSON(400, gin.H{"msg": "参数错误"})
		return
	}
	res, _ := service.GenerateNote(r.FileID, r.ChatID)
	c.JSON(200, res)
}

func Mindmap(c *gin.Context) {
	var r mindReq
	if err := c.ShouldBindJSON(&r); err != nil {
		c.JSON(400, gin.H{"msg": "参数错误"})
		return
	}
	m, _ := service.GenerateMindMap(r.NoteMarkdown)
	c.JSON(200, m)
}
