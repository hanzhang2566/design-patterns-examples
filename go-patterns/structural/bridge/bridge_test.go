package bridge

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestBasicRemote(t *testing.T) {
	phone := Phone{volume: 30}
	remote := BasicRemote{Device: &phone}
	remote.volumeUp()
	remote.volumeUp()
	remote.volumeDown()
	assert.Equal(t, 35, phone.getVolume())
}

func TestAdvancedRemote01(t *testing.T) {
	radio := Radio{volume: 30}
	remote := AdvancedRemote{BasicRemote{BasicRemote{Device: &radio}}}
	remote.volumeUp()
	remote.volumeUp()
	remote.volumeDown()
	assert.Equal(t, 35, radio.getVolume())
}

func TestAdvancedRemote02(t *testing.T) {
	radio := Radio{volume: 30}
	remote := AdvancedRemote{BasicRemote{BasicRemote{Device: &radio}}}
	remote.mute()
	assert.Equal(t, 0, radio.getVolume())
}
