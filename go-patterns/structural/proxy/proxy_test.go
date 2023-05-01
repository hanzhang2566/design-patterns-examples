package proxy

import "testing"

func Test01(t *testing.T) {
	proxy := pursuerProxy{pursuer{name: "hanzhang"}}
	proxy.giveDoll()
	proxy.giveFlower()
}
