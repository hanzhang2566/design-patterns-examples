package creational.factory.tmpl.impl.factory;


import creational.factory.tmpl.impl.operator.AddOperator;
import creational.factory.tmpl.BaseOperatorFactory;
import creational.factory.tmpl.Operator;

/**
 * Usage: ConcreteCreator <br/>
 * Date: 2023/4/26 10:34 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class AddOperatorFactory extends BaseOperatorFactory {
    /**
     * 返回运算类
     *
     * @return Operator
     */
    @Override
    public Operator getOperator() {
        return new AddOperator();
    }
}
