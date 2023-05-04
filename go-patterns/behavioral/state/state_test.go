package state

import "testing"

func TestState01(t *testing.T) {
	work := work{time: &morning{}}
	work.process()
	work.process()
	work.process()
	work.process()
}
