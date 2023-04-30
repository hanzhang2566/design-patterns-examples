package creational.prototype;

import lombok.Data;

/**
 * Usage: ConcretePrototype <br/>
 * Date: 2023/4/27 13:25 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@Data
public class Experience implements Cloneable {
    /**
     * 入职时间
     */
    private String hireDate;

    /**
     * 公司
     */
    private String company;

    /**
     * 拷贝 {@link Resume} 对象
     *
     * @return Resume {@link Resume}
     * @throws CloneNotSupportedException 实现 clone 方法但没有 implements {@link Cloneable}
     */
    @Override
    protected Experience clone() throws CloneNotSupportedException {
        return (Experience) super.clone();
    }
}
