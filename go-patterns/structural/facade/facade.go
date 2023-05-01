package facade

import "fmt"

type statable interface {
	domestic()
	external()
}

type commerce struct {
}

func (c commerce) state() {
	fmt.Println("欢迎来中国投资")
}

type defense struct {
}

func (c defense) state() {
	fmt.Println("犯我德邦者，虽远必诛")
}

type education struct {
}

func (c education) state() {
	fmt.Println("之乎者也")
}

type foreign struct {
}

func (c foreign) state() {
	fmt.Println("坚决维护和平共处五项原则")
}

type spokesman struct {
	commerce
	defense
	education
	foreign
}

func (sm spokesman) domestic() {
	sm.commerce.state()
	sm.education.state()
}

func (sm spokesman) external() {
	sm.defense.state()
	sm.foreign.state()
}
