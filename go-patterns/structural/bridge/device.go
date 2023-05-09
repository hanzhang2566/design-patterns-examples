package bridge

type Device interface {
	getVolume() int
	setVolume(volume int)
}

type Radio struct {
	volume int
}

func (r *Radio) getVolume() int {
	return r.volume
}

func (r *Radio) setVolume(volume int) {
	if volume < 0 {
		r.volume = 0
		return
	}
	if volume > 100 {
		r.volume = 100
		return
	}
	r.volume = volume
}

type Phone struct {
	volume int
}

func (p *Phone) getVolume() int {
	return p.volume
}

func (p *Phone) setVolume(volume int) {
	if volume < 0 {
		p.volume = 0
		return
	}
	if volume > 100 {
		p.volume = 100
		return
	}
	p.volume = volume
}
