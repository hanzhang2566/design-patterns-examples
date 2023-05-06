package behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * Usage: 客户端，用来存储当前状态 <br/>
 * Date: 2023/5/6 10:46 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Client {
    @Setter
    @Getter
    private String state;

    /**
     * 创建一个快照
     *
     * @return {@link Snapshot}
     */
    public Snapshot createSnapshot() {
        return new Snapshot(state);
    }

    /**
     * 恢复快照
     *
     * @param snapshot {@link Snapshot}
     */
    public void restoreSnapshot(Snapshot snapshot) {
        state = snapshot.getState();
    }
}
