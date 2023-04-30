package structural.decorator.impl;


import structural.decorator.FineryDecorator;

/**
 * Usage: ConcreteDecoratorA  <br/>
 * Date: 2023/4/24 14:09 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SneakerFinery extends FineryDecorator {
    /**
     * 聚合穿衣接口的方法
     */
    @Override
    public void wear() {
        System.out.print("球鞋");
        super.wear();
    }
}
