package observer

import "fmt"

type Observer interface {
	update()
}

type FooObserver struct {
	name string
	Subject
}

func (foo FooObserver) update() {
	fmt.Println("[", foo.name+"]:"+foo.getAction()+"继续工作！")
}

type BarObserver struct {
	name string
	Subject
}

func (bar BarObserver) update() {
	fmt.Println("[", bar.name+"]:"+bar.getAction()+"继续开会！")
}
