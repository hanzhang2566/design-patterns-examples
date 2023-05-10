package structural.flyweight;

import structural.flyweight.Shape;
import structural.flyweight.impl.Circle;
import structural.flyweight.impl.Rectangle;

import java.util.HashMap;
import java.util.Map;

/**
 * Usage: 形状工厂，用来管理已有享元对象 <br/>
 * Date: 2023/5/10 12:02 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ShapeFactory {
    private Map<String, Shape> cache = new HashMap<>();

    public Shape getShape(Class<?> clazz) {
        Shape shape = cache.get(clazz.getCanonicalName());
        if (shape == null) {
            if (clazz == Circle.class) {
                shape = new Circle();
            } else if (clazz == Rectangle.class) {
                shape = new Rectangle();
            }
            cache.put(clazz.getCanonicalName(), shape);
        }
        return shape;
    }
}
