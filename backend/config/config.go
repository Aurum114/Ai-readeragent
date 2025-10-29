package config

import "os"

type Config struct {
	JWTSecret     string
	MySQLHost     string
	MySQLPort     string
	MySQLUser     string
	MySQLPassword string
	MySQLDB       string
}

func Load() *Config {
	c := &Config{
		JWTSecret:     os.Getenv("JWT_SECRET"),
		MySQLHost:     os.Getenv("MYSQL_HOST"),
		MySQLPort:     os.Getenv("MYSQL_PORT"),
		MySQLUser:     os.Getenv("MYSQL_USER"),
		MySQLPassword: os.Getenv("MYSQL_PASSWORD"),
		MySQLDB:       os.Getenv("MYSQL_DB"),
	}
	if c.JWTSecret == "" {
		c.JWTSecret = "dev-secret-change-me"
	}
	if c.MySQLHost == "" {
		c.MySQLHost = "127.0.0.1"
	}
	if c.MySQLPort == "" {
		c.MySQLPort = "3306"
	}
	if c.MySQLUser == "" {
		c.MySQLUser = "root"
	}
	if c.MySQLPassword == "" {
		c.MySQLPassword = "Aurum42775237"
	} // default from user
	if c.MySQLDB == "" {
		c.MySQLDB = "ai_note"
	}
	return c
}
