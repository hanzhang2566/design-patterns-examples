package memento

import (
	"fmt"
	"testing"
)

func Test01(t *testing.T) {
	var snapshots []*Snapshot
	client := Client{}
	snapshotManager := SnapshotManager{snapshots: snapshots}

	client.SetState("State #1")
	snapshotManager.Push(client.CreateSnapshot())
	client.SetState("State #2")
	snapshotManager.Push(client.CreateSnapshot())

	client.SetState("State #3")
	fmt.Println("current state:", client.GetState())
	client.RestoreSnapshot(snapshotManager.Pop())
	fmt.Println("Second state:", client.GetState())
	client.RestoreSnapshot(snapshotManager.Pop())
	fmt.Println("First state:", client.GetState())

}
