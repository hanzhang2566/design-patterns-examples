package creational.factory.tmpl.impl.operator;


import creational.factory.tmpl.Operator;

/**
 * Usage: ConcreteCreator <br/>
 * Date: 2023/4/11 18:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class MulOperator implements Operator {
    /**
     * 计算乘法
     *
     * @param n1 number1
     * @param n2 number2
     * @return result
     */
    @Override
    public int calc(int n1, int n2) {
        return n1 * n2;
    }
}
