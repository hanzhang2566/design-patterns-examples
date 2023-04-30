package prototype

type cloneable interface {
	getName() string
	clone() cloneable
}
