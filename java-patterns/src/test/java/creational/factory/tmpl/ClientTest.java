package creational.factory.tmpl;

import creational.factory.tmpl.impl.factory.MulOperatorFactory;
import creational.factory.tmpl.impl.factory.AddOperatorFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Usage: Client <br/>
 * Date: 2023/4/30 22:35 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        BaseOperatorFactory baseOperatorFactory = new AddOperatorFactory();
        Operator operator = baseOperatorFactory.getOperator();
        Assert.assertEquals(3, operator.calc(1, 2));
    }

    @Test
    public void test02() {
        BaseOperatorFactory baseOperatorFactory = new MulOperatorFactory();
        Operator operator = baseOperatorFactory.getOperator();
        Assert.assertEquals(2, operator.calc(1, 2));
    }
}
