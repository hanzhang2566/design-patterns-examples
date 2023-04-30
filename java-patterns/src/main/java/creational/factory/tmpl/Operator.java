package creational.factory.tmpl;

/**
 * Usage: Product <br/>
 * Date: 2023/4/11 18:00 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Operator {
    /**
     * 用来计算的方法
     *
     * @param n1 number1
     * @param n2 number2
     * @return result
     */
    int calc(int n1, int n2);
}
