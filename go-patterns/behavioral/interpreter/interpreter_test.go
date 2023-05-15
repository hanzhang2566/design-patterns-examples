package interpreter

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test01(t *testing.T) {
	robert := TerminalExpression{data: "Robert"}
	john := TerminalExpression{data: "John"}

	expression := OrExpression{
		expr01: robert,
		expr02: john,
	}

	assert.Equal(t, true, expression.interpreter("John"))
	assert.Equal(t, false, expression.interpreter("hanzhang"))
}

func Test02(t *testing.T) {
	julie := TerminalExpression{data: "Julie"}
	married := TerminalExpression{data: "Married"}

	expression := AndExpression{
		expr01: julie,
		expr02: married,
	}

	assert.Equal(t, true, expression.interpreter("Married Julie"))
	assert.Equal(t, false, expression.interpreter("hanzhang"))
}
