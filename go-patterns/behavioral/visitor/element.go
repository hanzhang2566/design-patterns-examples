package visitor

type Element interface {
	accept(visitor Visitor)
}

type ConcreteElement struct {
}

func (ce ConcreteElement) Accept(visitor Visitor) {
	visitor.visit()
}

type EnvExample struct {
	Element
}

func (e EnvExample) Print(visitor Visitor) {
	e.Element.accept(visitor)
}
