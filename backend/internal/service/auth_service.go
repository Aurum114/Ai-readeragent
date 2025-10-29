package service

import (
	"ai-note-assistant/backend/internal/model"
	"ai-note-assistant/backend/internal/repository"
	"ai-note-assistant/backend/pkg/hash"
	"errors"
)

func Register(username, password string) error {
	if username == "" || password == "" {
		return errors.New("用户名或密码不能为空")
	}
	if _, err := repository.GetUserByName(username); err == nil {
		return errors.New("用户名已存在")
	}
	h, _ := hash.Hash(password)
	return repository.CreateUser(&model.User{Username: username, Password: h})
}

func Verify(username, password string) (*model.User, error) {
	u, err := repository.GetUserByName(username)
	if err != nil {
		return nil, errors.New("用户不存在")
	}
	if !hash.Check(password, u.Password) {
		return nil, errors.New("密码错误")
	}
	return u, nil
}
