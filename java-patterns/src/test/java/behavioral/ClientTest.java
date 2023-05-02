package behavioral;

import behavioral.observer.*;
import org.junit.Test;

/**
 * Usage: 观察者模式测试 <br/>
 * Date: 2023/5/2 22:43 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Subject secretary = new Secretary();
        Observer yes = new FooObserver("foo", secretary);
        Observer no = new BarObserver("bar", secretary);

        secretary.attach(yes);
        secretary.attach(no);
        secretary.setAction("老板回来了");
        secretary.publish();
    }
}
