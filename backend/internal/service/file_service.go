package service

import (
	"ai-note-assistant/backend/internal/model"
	"ai-note-assistant/backend/internal/repository"
	"mime/multipart"
	"os"
	"path/filepath"
)

func SaveFile(uid uint, header *multipart.FileHeader) (*model.File, error) {
	os.MkdirAll("storage/uploads", 0755)
	path := filepath.Join("storage/uploads", header.Filename)
	if err := func() error { return save(header, path) }(); err != nil {
		return nil, err
	}
	f := &model.File{UserID: uid, Name: header.Filename, Path: path, Size: header.Size}
	if err := repository.CreateFile(f); err != nil {
		return nil, err
	}
	return f, nil
}

func save(h *multipart.FileHeader, path string) error {
	in, err := h.Open()
	if err != nil {
		return err
	}
	defer in.Close()
	out, err := os.Create(path)
	if err != nil {
		return err
	}
	defer out.Close()
	_, err = out.ReadFrom(in)
	return err
}
