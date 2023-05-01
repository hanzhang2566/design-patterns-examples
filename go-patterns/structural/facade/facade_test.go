package facade

import "testing"

func Test01(t *testing.T) {
	s := spokesman{
		commerce:  commerce{},
		defense:   defense{},
		education: education{},
		foreign:   foreign{},
	}
	s.external()
}

func Test02(t *testing.T) {
	s := spokesman{
		commerce:  commerce{},
		defense:   defense{},
		education: education{},
		foreign:   foreign{},
	}
	s.domestic()
}
