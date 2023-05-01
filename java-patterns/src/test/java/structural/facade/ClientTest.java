package structural.facade;

import org.junit.Test;

/**
 * Usage: 门面模式测试 <br/>
 * Date: 2023/4/29 14:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Statable statable = new Spokesman();
        statable.domestic();
    }

    @Test
    public void test02() {
        Statable statable = new Spokesman();
        statable.foreign();
    }
}
