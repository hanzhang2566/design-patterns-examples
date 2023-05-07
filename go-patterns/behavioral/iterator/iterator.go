package iterator

import "fmt"

type Home struct {
	id int
}

func (h Home) String() string {
	return fmt.Sprintf("id = %d", h.id)
}

type Iterator interface {
	hasNext() bool
	next() Home
}

type HomeIterator struct {
	homes []Home
}

func (hi *HomeIterator) hasNext() bool {
	return len(hi.homes) > 0
}

func (hi *HomeIterator) next() Home {
	home := hi.homes[0]
	hi.homes = hi.homes[1:]
	return home
}

type Iterable interface {
	getHomeIterator() HomeIterator
}

type HomeIterable struct {
	HomeIterator
}

func (hi *HomeIterable) getHomeIterator() HomeIterator {
	return hi.HomeIterator
}
