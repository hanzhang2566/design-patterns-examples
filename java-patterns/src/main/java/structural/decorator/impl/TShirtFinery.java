package structural.decorator.impl;


import structural.decorator.FineryDecorator;

/**
 * Usage: ConcreteDecoratorA  <br/>
 * Date: 2023/4/24 14:08 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class TShirtFinery extends FineryDecorator {
    /**
     * 聚合穿衣接口的方法
     */
    @Override
    public void wear() {
        System.out.print("T恤");
        super.wear();
    }
}
