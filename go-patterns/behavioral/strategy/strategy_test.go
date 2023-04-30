package strategy

import (
	"testing"
)

func Test01(t *testing.T) {
	lfu := LFU{}
	cache := NewCache(lfu)
	cache.Add("one", 1)
	cache.Add("two", 2)
	cache.Add("three", 3)

	// 更换一个算法
	fifo := FIFO{}
	cache.SetAlg(fifo)
	cache.Add("four", 4)

	lru := LRU{}
	cache.SetAlg(lru)
	cache.Add("five", 5)
}
