package creational.factory.tmpl;


/**
 * Usage: Creator <br/>
 * Date: 2023/4/26 10:34 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public abstract class BaseOperatorFactory {
    /**
     * 返回运算类
     *
     * @return Operator
     */
    protected abstract Operator getOperator();

}
