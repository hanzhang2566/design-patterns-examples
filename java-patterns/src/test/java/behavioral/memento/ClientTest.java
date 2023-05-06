package behavioral.memento;

import org.junit.Test;

/**
 * Usage: 备忘录测试 <br/>
 * Date: 2023/5/6 10:50 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test() {
        // 创建容器
        Client client = new Client();
        SnapshotManager snapshotManager = new SnapshotManager();

        // 保存 #1 和 #2 的快照
        client.setState("State #1");
        snapshotManager.pushSnapshot(client.createSnapshot());
        client.setState("State #2");
        snapshotManager.pushSnapshot(client.createSnapshot());

        // 设置新的状态
        client.setState("State #3");
        System.out.println("Current State: " + client.getState());

        client.restoreSnapshot(snapshotManager.popSnapshot());
        System.out.println("Second saved State: " + client.getState());

        client.restoreSnapshot(snapshotManager.popSnapshot());
        System.out.println("First saved State: " + client.getState());
    }
}
