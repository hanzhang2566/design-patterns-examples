package mediator

import "fmt"

type Colleague interface {
	receive()
	send()
	setMedium(m Mediator)
}

type FooColleague struct {
	Mediator
}

func (fc *FooColleague) receive() {
	fmt.Println("FooColleague.receive")
}

func (fc *FooColleague) send() {
	fmt.Println("FooColleague.send")
	fc.Mediator.relay(fc)
}

func (fc *FooColleague) setMedium(m Mediator) {
	fc.Mediator = m
}

type BarColleague struct {
	Mediator
}

func (bc *BarColleague) receive() {
	fmt.Println("BarColleague.receive")
}

func (bc *BarColleague) send() {
	fmt.Println("BarColleague.send")
	bc.relay(bc)
}

func (bc *BarColleague) setMedium(m Mediator) {
	bc.Mediator = m
}
