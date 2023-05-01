package builder

//type Builder interface {
//	Build()
//}
//
//type ConcreteBuilder struct {
//	p Product
//}
//
//func (cb *ConcreteBuilder) Build() {
//	cb.p = Product{true}
//}
//
//type Product struct {
//	built bool
//}
//
//type Director struct {
//	Builder
//}
//
//func (d Director) Construct() {
//	d.Build()
//}

type Person struct {
	name, address string
}

func (p Person) construct(builder Builder) Person {
	return Person{
		name:    builder.name,
		address: builder.address,
	}
}

type Builder struct {
	name, address string
}

func (b *Builder) setName(name string) *Builder {
	b.name = name
	return b
}

func (b *Builder) setAddress(address string) *Builder {
	b.address = address
	return b
}

func (b *Builder) build() Person {
	return Person{}.construct(*b)
}
