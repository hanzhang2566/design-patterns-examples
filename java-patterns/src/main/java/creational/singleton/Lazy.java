package creational.singleton;

/**
 * Usage: 懒汉式，实例化时才进行初始化 <br/>
 * 类似于延迟加载 <br/>
 * Date: 2023/5/8 9:54 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Lazy {
    private static Lazy INSTANCE;

    private Lazy() {
    }

    // 为了支持并发，需要给该方法加锁
    public static synchronized Lazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lazy();
        }
        return INSTANCE;
    }
}
