package behavioral.visitor;

import org.junit.Test;

/**
 * Usage: 访问者模式 <br/>
 * Date: 2023/5/15 12:39 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerDisplayVisitor());
    }
}
