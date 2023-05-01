package behavioral.template;

import org.junit.Test;

/**
 * Usage: 模板模式测试 <br/>
 * Date: 2023/4/28 11:20 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void FooTest() {
        Template foo = new Pig();
        foo.template();
    }
}
