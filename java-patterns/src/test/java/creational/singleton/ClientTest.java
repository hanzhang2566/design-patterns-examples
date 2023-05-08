package creational.singleton;

import org.junit.Test;

/**
 * Usage: 单例模式测试 <br/>
 * Date: 2023/5/8 9:52 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void testEager() {
        Eager e1 = Eager.getInstance();
        System.out.println("e1 = " + e1);
        Eager e2 = Eager.getInstance();
        System.out.println("e2 = " + e2);
        System.out.println(e1 == e2);
    }

    @Test
    public void testLazy() {
        Lazy l1 = Lazy.getInstance();
        System.out.println("l1 = " + l1);
        Lazy l2 = Lazy.getInstance();
        System.out.println("l2 = " + l2);
        System.out.println(l1 == l2);
    }

    @Test
    public void testDoubleChecked() {
        DoubleChecked dc1 = DoubleChecked.getInstance();
        System.out.println("dc1 = " + dc1);
        DoubleChecked dc2 = DoubleChecked.getInstance();
        System.out.println("dc2 = " + dc2);
        System.out.println(dc1 == dc2);
    }

    @Test
    public void testStaticInner() {
        StaticInner si1 = StaticInner.getInstance();
        System.out.println("si1 = " + si1);
        StaticInner si2 = StaticInner.getInstance();
        System.out.println("si2 = " + si2);
        System.out.println(si1 == si2);
    }

    @Test
    public void testEnumSingleton() {
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        System.out.println("es1 = " + es1);
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        System.out.println("es2 = " + es2);
        System.out.println(es1 == es2);
    }
}
