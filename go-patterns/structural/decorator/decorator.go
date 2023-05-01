package decorator

import "fmt"

// finery component
type finery interface {
	wear()
}

// Person concrete component
type Person struct {
	name string
}

func (p Person) wear() {
	fmt.Printf("装扮的%s\n", p.name)
}

// fineryDecorator Decorator
type fineryDecorator struct {
	finery
}

func (fd *fineryDecorator) decorate(f finery) {
	fd.finery = f
}

func (fd *fineryDecorator) wear() {
	if fd.finery == nil {
		return
	}
	fd.finery.wear()
}

// Sneaker concrete Decorator
type Sneaker struct {
	fineryDecorator
}

func (s Sneaker) wear() {
	fmt.Printf("球鞋")
	s.fineryDecorator.wear()
}

// Sneaker concrete Decorator
type TShirt struct {
	fineryDecorator
}

func (s TShirt) wear() {
	fmt.Printf("T 恤")
	s.fineryDecorator.wear()
}
