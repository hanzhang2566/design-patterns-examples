package singleton

import "sync"

type doubleChecked struct {
}

var dcs *doubleChecked

var lock = sync.Mutex{}

func GetDoubleChecked() *doubleChecked {
	if dcs == nil {
		lock.Lock()
		defer lock.Unlock()
		if dcs == nil {
			dcs = &doubleChecked{}
		}
	}

	return dcs
}

type onceSingleton struct {
}

var os *onceSingleton

var once = sync.Once{}

func GetOnceSingleton() *onceSingleton {
	if os == nil {
		once.Do(func() {
			os = &onceSingleton{}
		})
	}
	return os
}
