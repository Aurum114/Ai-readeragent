package controller

import (
	"ai-note-assistant/backend/config"
	"ai-note-assistant/backend/internal/repository"
	"ai-note-assistant/backend/internal/service"
	"ai-note-assistant/backend/pkg/jwt"
	"github.com/gin-gonic/gin"
	"net/http"
)

type AuthController struct{ cfg *config.Config }

func NewAuth(cfg *config.Config) *AuthController { return &AuthController{cfg: cfg} }

func (a *AuthController) Register(c *gin.Context) {
	type req struct {
		Username string `json:"username"`
		Password string `json:"password"`
	}
	var r req
	if err := c.ShouldBindJSON(&r); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"msg": "参数错误"})
		return
	}
	if err := service.Register(r.Username, r.Password); err != nil {
		c.JSON(400, gin.H{"msg": err.Error()})
		return
	}
	c.JSON(200, gin.H{"msg": "ok"})
}

func (a *AuthController) Login(c *gin.Context) {
	type req struct {
		Username string `json:"username"`
		Password string `json:"password"`
	}
	var r req
	if err := c.ShouldBindJSON(&r); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"msg": "参数错误"})
		return
	}
	u, err := service.Verify(r.Username, r.Password)
	if err != nil {
		c.JSON(400, gin.H{"msg": err.Error()})
		return
	}
	tok, _ := jwt.Sign(a.cfg.JWTSecret, u.ID, u.Username)
	c.JSON(200, gin.H{"token": tok})
}

func (a *AuthController) Me(c *gin.Context) {
	u, _ := repository.GetUserByName("demo")
	if u == nil {
		c.JSON(200, gin.H{"id": 0, "username": "guest"})
		return
	}
	c.JSON(200, gin.H{"id": u.ID, "username": u.Username})
}
