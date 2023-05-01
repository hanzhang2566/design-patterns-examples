package decorator

import "testing"

func Test01(t *testing.T) {
	person := Person{name: "hanzhang"}
	shirt := TShirt{}
	shirt.decorate(person)
	sneaker := Sneaker{}
	sneaker.decorate(shirt)
	sneaker.wear()
}

func Test02(t *testing.T) {
	person := Person{name: "hanzhang"}
	sneaker := Sneaker{}
	sneaker.decorate(person)
	shirt := TShirt{}
	shirt.decorate(sneaker)
	// output: T恤球鞋装扮的hanzhang
	shirt.wear()
}
