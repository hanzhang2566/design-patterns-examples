package state

import "fmt"

type time interface {
	transfer(w *work)
}

type morning struct {
}

func (m *morning) transfer(w *work) {
	fmt.Println("transfer to afternoon")
	w.time = &afternoon{}
}

type afternoon struct {
}

func (m *afternoon) transfer(w *work) {
	fmt.Println("transfer to evening")
	w.time = &evening{}
}

type evening struct {
}

func (m *evening) transfer(w *work) {
	fmt.Println("transfer to morning")
	w.time = &morning{}
}
