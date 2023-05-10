package structural.flyweight;

import org.junit.Assert;
import org.junit.Test;
import structural.flyweight.impl.Circle;
import structural.flyweight.impl.Rectangle;

/**
 * Usage: 享元模式测试 <br/>
 * Date: 2023/5/10 12:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape(Circle.class);
        circle.draw("white");
        Shape rectangle = factory.getShape(Rectangle.class);
        rectangle.draw("black");
        Shape circle2 = factory.getShape(Circle.class);
        circle2.draw("red");
        Assert.assertEquals(circle.hashCode(), circle2.hashCode());
    }
}
