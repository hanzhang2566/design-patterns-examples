package behavioral.mediator;

import behavioral.mediator.impl.colleague.BarColleague;
import behavioral.mediator.impl.colleague.FooColleague;
import behavioral.mediator.impl.mediator.ForMediator;
import org.junit.Test;

/**
 * Usage: 中介者模式测试 <br/>
 * Date: 2023/5/13 16:41 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Mediator md = new ForMediator();
        Colleague c1 = new FooColleague();
        Colleague c2 = new BarColleague();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
