package flyweight

import "fmt"

type Shape interface {
	draw(color string)
}

type Circle struct {
	name string
}

func NewCircle(name string) Circle {
	return Circle{name: name}
}

func (c Circle) draw(color string) {
	fmt.Println(c.name, "绘画", color)
}

type Rectangle struct {
	name string
}

func NewRectangle(name string) Rectangle {
	return Rectangle{name: name}
}

func (r Rectangle) draw(color string) {
	fmt.Println(r.name, "绘画", color)
}

type ShapeFactory struct {
	cache map[string]Shape
}

func NewShapeFactory() ShapeFactory {
	return ShapeFactory{
		cache: make(map[string]Shape),
	}
}

func (sf ShapeFactory) getShape(shapeType string) Shape {
	if shape, ok := sf.cache[shapeType]; !ok {
		if shapeType == "c" {
			c := NewCircle("circle")
			sf.cache["c"] = c
			return c
		} else if shapeType == "r" {
			r := NewRectangle("rectangle")
			sf.cache["r"] = r
			return r
		} else {
			panic("no type")
		}
	} else {
		return shape
	}
}
