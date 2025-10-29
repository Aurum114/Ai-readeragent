package controller

import (
	"ai-note-assistant/backend/internal/service"
	"github.com/gin-gonic/gin"
)

type ChatController struct{}

type chatReq struct {
	ChatID  *uint  `json:"chatId"`
	FileID  *uint  `json:"fileId"`
	Message string `json:"message"`
}

func (cc *ChatController) Send(c *gin.Context) {
	var r chatReq
	if err := c.ShouldBindJSON(&r); err != nil {
		c.JSON(400, gin.H{"msg": "参数错误"})
		return
	}
	res, err := service.Send(1, r.ChatID, r.Message) // TODO: 从 token 获取 uid
	if err != nil {
		c.JSON(500, gin.H{"msg": err.Error()})
		return
	}
	c.JSON(200, gin.H{"reply": res.Reply, "chatId": res.ChatID})
}

func (cc *ChatController) List(c *gin.Context) {
	c.JSON(200, []any{})
}
