package visitor

import "testing"

func Test01(t *testing.T) {
	e := ConcreteElement{}
	e.Accept(new(ProductionVisitor)) // output: 这是生产环境
	e.Accept(new(TestingVisitor))    // output: 这是测试环境
}
