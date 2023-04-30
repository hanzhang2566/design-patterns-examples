package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Usage: 原型模式测试 <br/>
 * Date: 2023/4/27 13:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    /**
     * 原型模式
     *
     * @throws CloneNotSupportedException CloneNotSupportedException
     */
    @Test
    public void test01() throws CloneNotSupportedException {
        Resume r1 = new Resume("r1");
        r1.setPersonalInfo("男", 28);
        r1.setExperience("1998/10", "xx公司");

        // 通过 r1 克隆 r2
        Resume r2 = r1.clone();
        r2.setAddress("Shanghai");
        r2.setExperience("2000/10", "yy公司");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        Assert.assertNotSame(r1, r2);
    }
}
