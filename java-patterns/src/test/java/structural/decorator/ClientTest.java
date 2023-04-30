package structural.decorator;

import org.junit.Test;
import structural.decorator.impl.SneakerFinery;
import structural.decorator.impl.TShirtFinery;


/**
 * Usage: 装饰模式的测试类 <br/>
 * Date: 2023/4/24 14:36 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Finery person = new Person("hanzhang");
        System.out.println("\n第一种：");
        // 装饰器
        FineryDecorator tShirt = new TShirtFinery();
        FineryDecorator sneaker = new SneakerFinery();
        tShirt.decorate(person);
        sneaker.decorate(tShirt);
        sneaker.wear();
    }

    @Test
    public void test02() {
        Person hanzhang = new Person("hanzhang");
        System.out.println("\n第二种：");
        SneakerFinery sneakerFinery = new SneakerFinery();
        TShirtFinery tShirtFinery = new TShirtFinery();
        sneakerFinery.decorate(hanzhang);
        tShirtFinery.decorate(sneakerFinery);
        tShirtFinery.wear();
    }
}
