package main

import (
	"ai-note-assistant/backend/config"
	"ai-note-assistant/backend/internal/router"
	"ai-note-assistant/backend/storage"
	"log"
)

func main() {
	cfg := config.Load()
	if err := storage.InitDB(cfg); err != nil {
		log.Fatal(err)
	}
	app := router.New(cfg)
	log.Println("Backend started on :8080 (MySQL)")
	if err := app.Run(":8080"); err != nil {
		log.Fatal(err)
	}
}
