package creational.builder;

import org.junit.Test;

/**
 * Usage: 建造者模式 <br/>
 * Date: 2023/5/1 15:20 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Person build = new Person.Builder()
                .setName("hanzhang")
                .setAddress("Shanghai")
                .build();
        System.out.println("build = " + build);
    }

    @Test
    public void test02() {
        Student build = Student.builder()
                .name("hanzhang")
                .address("Shanghai")
                .build();
        System.out.println("build = " + build);
    }
}
