package middleware

import (
	"ai-note-assistant/backend/config"
	"github.com/gin-gonic/gin"
	"github.com/golang-jwt/jwt/v5"
	"strings"
)

func Auth(cfg *config.Config) gin.HandlerFunc {
	return func(c *gin.Context) {
		bearer := c.GetHeader("Authorization")
		if !strings.HasPrefix(bearer, "Bearer ") {
			c.AbortWithStatusJSON(401, gin.H{"msg": "未授权"})
			return
		}
		token := strings.TrimPrefix(bearer, "Bearer ")
		_, err := jwt.Parse(token, func(t *jwt.Token) (interface{}, error) { return []byte(cfg.JWTSecret), nil })
		if err != nil {
			c.AbortWithStatusJSON(401, gin.H{"msg": "无效令牌"})
			return
		}
		c.Next()
	}
}
