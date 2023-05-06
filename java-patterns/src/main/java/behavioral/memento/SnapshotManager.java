package behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Usage: {@link Snapshot} 管理器 <br/>
 * Date: 2023/5/6 10:51 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SnapshotManager {
    private final Deque<Snapshot> snapshotList = new LinkedList<>();

    public void pushSnapshot(Snapshot state) {
        snapshotList.push(state);
    }

    public Snapshot popSnapshot() {
        return snapshotList.pop();
    }
}
