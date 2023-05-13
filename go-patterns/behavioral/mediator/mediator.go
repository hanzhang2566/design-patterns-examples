package mediator

type Mediator interface {
	register(c Colleague)
	relay(c Colleague)
}

type FooMediator struct {
	colleagues []Colleague
}

func (fm *FooMediator) register(c Colleague) {
	if contains := fm.contains(c); contains {
		return
	}
	fm.colleagues = append(fm.colleagues, c)
	c.setMedium(fm)
}

func (fm *FooMediator) relay(c Colleague) {
	for _, colleague := range fm.colleagues {
		if colleague == c {
			continue
		}
		colleague.receive()
	}
}

func (fm *FooMediator) contains(c Colleague) bool {
	for _, colleague := range fm.colleagues {
		if colleague == c {
			return true
		}
	}
	return false
}
