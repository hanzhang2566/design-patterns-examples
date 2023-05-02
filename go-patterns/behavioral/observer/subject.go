package observer

type Subject interface {
	attach(observer Observer)
	detach(observer Observer)
	setAction(action string)
	getAction() string
	public()
}

type Secretary struct {
	observers []Observer
	action    string
}

func (s *Secretary) attach(observer Observer) {
	s.observers = append(s.observers, observer)
}

func (s *Secretary) detach(observer Observer) {
	//TODO implement me
	panic("implement me")
}

func (s *Secretary) setAction(action string) {
	s.action = action
}

func (s *Secretary) getAction() string {
	return s.action
}

func (s *Secretary) public() {
	for _, v := range s.observers {
		v.update()
	}
}
