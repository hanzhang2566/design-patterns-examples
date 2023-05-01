package structural.proxy;

import org.junit.Test;


/**
 * Usage: 代理模式测试类 <br/>
 * Date: 2023/4/24 14:36 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        PursuerProxy pursuerProxy = new PursuerProxy("hanzhang");
        pursuerProxy.giveDoll();
        pursuerProxy.giveFlower();
    }
}
