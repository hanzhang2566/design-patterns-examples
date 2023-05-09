package bridge

type Remote interface {
	volumeUp()
	volumeDown()
}

type BasicRemote struct {
	Device
}

func (br *BasicRemote) volumeUp() {
	br.Device.setVolume(br.getVolume() + 5)
}

func (br *BasicRemote) volumeDown() {
	br.Device.setVolume(br.getVolume() - 5)
}

type AdvancedRemote struct {
	BasicRemote
}

func (ar *AdvancedRemote) mute() {
	ar.setVolume(0)
}
