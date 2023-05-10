package flyweight

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test01(t *testing.T) {
	factory := NewShapeFactory()
	r1 := factory.getShape("r")
	r2 := factory.getShape("r")
	assert.Equal(t, r1, r2)
}
