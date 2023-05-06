package memento

type Snapshot struct {
	state string
}

func (s *Snapshot) GetState() string {
	return s.state
}

func NewSnapshot(state string) *Snapshot {
	return &Snapshot{state: state}
}

type SnapshotManager struct {
	snapshots []*Snapshot
}

func (sm *SnapshotManager) Push(snapshot *Snapshot) {
	sm.snapshots = append(sm.snapshots, snapshot)
}

func (sm *SnapshotManager) Pop() *Snapshot {
	snapshot := sm.snapshots[len(sm.snapshots)-1]
	sm.snapshots = sm.snapshots[:len(sm.snapshots)-1]
	return snapshot
}

type Client struct {
	state string
}

func (c *Client) CreateSnapshot() *Snapshot {
	return NewSnapshot(c.state)
}

func (c *Client) RestoreSnapshot(snapshot *Snapshot) {
	c.state = snapshot.GetState()
}

func (c *Client) SetState(state string) {
	c.state = state
}

func (c *Client) GetState() string {
	return c.state
}
