package visitor

import "fmt"

type Visitor interface {
	visit()
}

type ProductionVisitor struct {
}

func (v ProductionVisitor) visit() {
	fmt.Println("这是生产环境")
}

type TestingVisitor struct {
}

func (t TestingVisitor) visit() {
	fmt.Println("这是测试环境")
}
