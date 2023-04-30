package prototype

type resume struct {
	name string
}

func (r resume) getName() string {
	return r.name
}

func (r resume) clone() cloneable {
	return resume{
		name: r.name,
	}
}
