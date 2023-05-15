package command

import "fmt"

type Stock struct {
	name     string
	quantity int
}

func (s Stock) Buy() {
	fmt.Printf("name : %s, quantity : %d bought. \n", s.name, s.quantity)
}

func (s Stock) Sell() {
	fmt.Printf("name : %s, quantity : %d sold. \n", s.name, s.quantity)
}
