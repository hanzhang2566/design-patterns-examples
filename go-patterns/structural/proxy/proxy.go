package proxy

import "fmt"

// gift Subject
type gift interface {
	giveDoll()
	giveFlower()
}

// pursuer real subject
type pursuer struct {
	name string
}

func (p pursuer) giveDoll() {
	fmt.Printf("%s送洋娃娃", p.name)
}

func (p pursuer) giveFlower() {
	fmt.Printf("%s送鲜花", p.name)
}

// pursuerProxy proxy
type pursuerProxy struct {
	pursuer
}

func (pp pursuerProxy) giveDoll() {
	fmt.Printf("%s送洋娃娃\n", pp.name)
}

func (pp pursuerProxy) giveFlower() {
	fmt.Printf("%s送鲜花\n", pp.name)
}
