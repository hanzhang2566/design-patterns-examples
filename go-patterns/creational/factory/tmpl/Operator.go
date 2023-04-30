package tmpl

// Operator Product
type Operator interface {
	calc(n1, n2 int) int
}

// Add Concrete Product
type Add struct {
}

func (a Add) calc(n1, n2 int) int {
	return n1 + n2
}

// Mul Concrete Product
type Mul struct {
}

func (a Mul) calc(n1, n2 int) int {
	return n1 * n2
}
