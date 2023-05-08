package creational.singleton;

/**
 * Usage: 静态内部类 <br/>
 * 通过 jvm 来保证线程安全，又能做到延迟加载 <br/>
 * Date: 2023/5/8 10:02 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class StaticInner {
    private StaticInner() {
    }

    // 只有调用到 StaticInner#getINSTANCE 方法时，才会进行初始化
    public static StaticInner getInstance() {
        return StaticInnerHolder.INSTANCE;
    }

    private static class StaticInnerHolder {
        private static final StaticInner INSTANCE = new StaticInner();
    }
}
