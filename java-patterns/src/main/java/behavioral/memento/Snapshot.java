package behavioral.memento;

import lombok.Getter;

/**
 * Usage: 快照类，保存对象的快照信息 <br/>
 * Date: 2023/5/6 10:46 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Snapshot {
    @Getter
    private final String state;

    public Snapshot(String state) {
        this.state = state;
    }
}
