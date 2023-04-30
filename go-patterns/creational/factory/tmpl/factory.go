package tmpl

// Factory Creator
type Factory interface {
	getOperator() Operator
}

// AddFactory Concrete Product
type AddFactory struct {
}

func (af AddFactory) getOperator() Operator {
	return Add{}
}

// MulFactory Concrete Product
type MulFactory struct {
}

func (mf MulFactory) getOperator() Operator {
	return Mul{}
}
