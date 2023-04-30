package strategy

import "fmt"

// Algorithm Strategy
type Algorithm interface {
	Delete(c *Cache)
}

// FIFO ConcreteStrategyA
type FIFO struct {
}

func (f FIFO) Delete(c *Cache) {
	fmt.Println("Deleting by FIFO")
}

// LRU ConcreteStrategyA
type LRU struct {
}

func (f LRU) Delete(c *Cache) {
	fmt.Println("Deleting by LRU")
}

// LFU ConcreteStrategyA
type LFU struct {
}

func (f LFU) Delete(c *Cache) {
	fmt.Println("Deleting by LFU")
}
