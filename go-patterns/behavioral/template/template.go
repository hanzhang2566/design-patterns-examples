package template

import "fmt"

type templateIfc interface {
	whoami() string
}

type Template struct {
	steps templateIfc
}

func (t Template) temp() {
	fmt.Println("who are u?")
	fmt.Printf("I'm %s\n", t.whoami())
}

func (t Template) whoami() string {
	return t.steps.whoami()
}

type pig struct {
}

func (p pig) whoami() string {
	return "pig"
}
