package tmpl

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test01(t *testing.T) {
	operator := AddFactory{}.getOperator()
	result := operator.calc(1, 2)
	assert.Equal(t, 3, result)
}

func Test02(t *testing.T) {
	operator := MulFactory{}.getOperator()
	result := operator.calc(1, 2)
	assert.Equal(t, 2, result)
}
