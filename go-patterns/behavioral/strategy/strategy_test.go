package strategy

import (
	"testing"
)

func Test01(t *testing.T) {
	lfu := LFU{}
	cache := NewCache(lfu)
	cache.Delete()

	// 更换一个策略
	fifo := FIFO{}
	cache.SetAlg(fifo)
	cache.Delete()

	// 再换一个策略
	lru := LRU{}
	cache.SetAlg(lru)
	cache.Delete()
}
