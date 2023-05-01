package template

import "testing"

func Test01(t *testing.T) {
	template := Template{steps: pig{}}
	template.temp()
}
