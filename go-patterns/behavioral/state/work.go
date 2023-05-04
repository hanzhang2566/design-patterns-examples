package state

type work struct {
	time
}

func (w *work) process() {
	w.time.transfer(w)
}
