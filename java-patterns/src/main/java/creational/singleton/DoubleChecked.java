package creational.singleton;

/**
 * Usage: 双重检测。支持延迟加载和并发 <br/>
 * Date: 2023/5/8 9:58 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class DoubleChecked {
    private static DoubleChecked INSTANCE;

    private DoubleChecked() {
    }

    public static DoubleChecked getInstance() {
        if (INSTANCE == null) {
            // 使用类级别的锁来进行双重检测
            synchronized (DoubleChecked.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleChecked();
                }
            }
        }

        return INSTANCE;
    }
}
