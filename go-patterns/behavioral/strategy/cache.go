package strategy

// Cache context
type Cache struct {
	storage   map[string]int
	algorithm Algorithm
	cap       int
	max       int
}

// NewCache getContext
func NewCache(a Algorithm) *Cache {
	return &Cache{
		storage:   map[string]int{},
		algorithm: a,
		cap:       0,
		max:       2,
	}
}

func (c *Cache) SetAlg(a Algorithm) {
	c.algorithm = a
}

func (c *Cache) Add(k string, v int) {
	if c.cap == c.max {
		c.Delete()
	}
	c.cap++
	c.storage[k] = v
}

func (c *Cache) Get(k string) {
	delete(c.storage, k)
}

func (c *Cache) Delete() {
	c.algorithm.Delete(c)
	c.cap--
}
