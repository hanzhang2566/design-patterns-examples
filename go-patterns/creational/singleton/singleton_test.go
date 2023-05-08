package singleton

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestGetDoubleChecked(t *testing.T) {
	i1 := GetDoubleChecked()
	i2 := GetDoubleChecked()
	assert.True(t, i1 == i2)
}

func TestGetOnceSingleton(t *testing.T) {
	i1 := GetOnceSingleton()
	i2 := GetOnceSingleton()
	assert.True(t, i1 == i2)
}
