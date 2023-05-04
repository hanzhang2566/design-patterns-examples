package behavioral.state;

import behavioral.state.impl.Morning;
import org.junit.Test;

/**
 * Usage: 状态模式测试 <br/>
 * Date: 2023/5/4 10:18 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Work work = new Work(new Morning());
        work.process();
        work.process();
        work.process();
        work.process();
    }
}
