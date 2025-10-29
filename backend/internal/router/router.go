package router

import (
	"ai-note-assistant/backend/config"
	"ai-note-assistant/backend/internal/controller"
	"ai-note-assistant/backend/internal/middleware"
	"github.com/gin-gonic/gin"
)

func New(cfg *config.Config) *gin.Engine {
	r := gin.Default()
	r.Use(middleware.CORS())

	authc := controller.NewAuth(cfg)
	fc := &controller.FileController{}
	cc := &controller.ChatController{}

	api := r.Group("/api")
	{
		auth := api.Group("/auth")
		auth.POST("/register", authc.Register)
		auth.POST("/login", authc.Login)
		auth.GET("/me", authc.Me)

		files := api.Group("/files")
		files.POST("/upload", fc.Upload)
		files.GET("/list", fc.List)

		chat := api.Group("/chat")
		chat.POST("/send", cc.Send)
		chat.GET("/list", cc.List)

		note := api.Group("/notes")
		note.POST("/generate", controller.Generate)

		mm := api.Group("/mindmap")
		mm.POST("/generate", controller.Mindmap)
	}
	return r
}
