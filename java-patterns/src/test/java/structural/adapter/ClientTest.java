package structural.adapter;

import org.junit.Test;

/**
 * Usage: 适配器测试 <br/>
 * Date: 2023/5/6 10:37 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Target target = new ChineseComposite();
        target.greet();
        target.info();
    }

    @Test
    public void test02() {
        Target target = new ChineseExtend();
        target.greet();
        target.info();
    }
}
