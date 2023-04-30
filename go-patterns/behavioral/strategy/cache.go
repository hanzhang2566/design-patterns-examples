package strategy

// Cache context
type Cache struct {
	algorithm Algorithm
}

// NewCache getContext
func NewCache(a Algorithm) *Cache {
	return &Cache{
		algorithm: a,
	}
}

func (c *Cache) SetAlg(a Algorithm) {
	c.algorithm = a
}

func (c *Cache) Delete() {
	c.algorithm.Delete(c)
}
