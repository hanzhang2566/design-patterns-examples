package builder

import (
	"fmt"
	"testing"
)

func Test01(t *testing.T) {
	var builder = &Builder{}
	build := builder.setName("hanzhang").setAddress("Shanghai").build()
	fmt.Println(build)
}
