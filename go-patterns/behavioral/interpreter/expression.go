package interpreter

import "strings"

type Expression interface {
	interpreter(context string) bool
}

type TerminalExpression struct {
	data string
}

func (te TerminalExpression) interpreter(context string) bool {
	return strings.Contains(context, te.data)
}

type OrExpression struct {
	expr01, expr02 Expression
}

func (os OrExpression) interpreter(context string) bool {
	return os.expr01.interpreter(context) || os.expr02.interpreter(context)
}

type AndExpression struct {
	expr01, expr02 Expression
}

func (os AndExpression) interpreter(context string) bool {
	return os.expr01.interpreter(context) && os.expr02.interpreter(context)
}
