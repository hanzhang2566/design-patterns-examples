package mediator

import (
	"fmt"
	"testing"
)

func Test01(t *testing.T) {
	mediator := FooMediator{}
	fc := FooColleague{}
	bc := BarColleague{}
	mediator.register(&fc)
	mediator.register(&bc)

	fc.send()
	fmt.Println("--------------")
	bc.send()
}
