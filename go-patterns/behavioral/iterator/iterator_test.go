package iterator

import (
	"fmt"
	"testing"
)

func Test01(t *testing.T) {
	var homes []Home
	homes = append(homes, Home{id: 1})
	homes = append(homes, Home{id: 2})
	homes = append(homes, Home{id: 3})

	homeIterable := HomeIterable{HomeIterator: HomeIterator{homes: homes}}
	iterator := homeIterable.getHomeIterator()
	for iterator.hasNext() {
		home := iterator.next()
		fmt.Println(home.String())
	}
}
