package prototype

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test01(t *testing.T) {
	c := resume{name: "hanzhang"}
	clone := c.clone()
	assert.Equal(t, "hanzhang", clone.getName())
}
