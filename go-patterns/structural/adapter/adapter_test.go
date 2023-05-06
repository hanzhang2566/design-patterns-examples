package adapter

import "testing"

func Test01(t *testing.T) {
	chinese := Chinese{
		English{},
	}

	chinese.greet()
	chinese.info()
}
