package observer

import "testing"

func Test01(t *testing.T) {
	secretary := Secretary{}
	foo := FooObserver{
		name:    "foo",
		Subject: &secretary,
	}
	bar := BarObserver{
		name:    "bar",
		Subject: &secretary,
	}
	secretary.attach(foo)
	secretary.attach(bar)
	secretary.setAction("老板回来了")
	secretary.public()
}
