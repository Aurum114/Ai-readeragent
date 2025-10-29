package hash

import "golang.org/x/crypto/bcrypt"

func Hash(pw string) (string, error) {
	b, err := bcrypt.GenerateFromPassword([]byte(pw), bcrypt.DefaultCost)
	return string(b), err
}

func Check(pw, h string) bool {
	return bcrypt.CompareHashAndPassword([]byte(h), []byte(pw)) == nil
}
