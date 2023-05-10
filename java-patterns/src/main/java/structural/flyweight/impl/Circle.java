package structural.flyweight.impl;

import structural.flyweight.Shape;

/**
 * Usage: 圆形 <br/>
 * Date: 2023/5/10 12:00 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Circle implements Shape {
    private final String mShapeName = "圆形";

    @Override
    public void draw(String color) {
        System.out.println("绘制" + mShapeName + ": " + color);
    }
}
