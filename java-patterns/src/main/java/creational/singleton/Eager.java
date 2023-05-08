package creational.singleton;

/**
 * Usage: 饿汉式，加载类时实例已经创建完成 <br/>
 * Date: 2023/5/8 9:48 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Eager {
    private static final Eager INSTANCE = new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
        return INSTANCE;
    }
}
