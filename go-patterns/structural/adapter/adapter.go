package adapter

import "fmt"

type Target interface {
	greet()
	info()
}

type English struct {
}

func (e English) greet() {
	fmt.Println("How are you?")
}

func (e English) info() {
	fmt.Println("I can speak English")
}

type Chinese struct {
	English
}

func (c Chinese) info() {
	fmt.Println("我可以说中文")
}
