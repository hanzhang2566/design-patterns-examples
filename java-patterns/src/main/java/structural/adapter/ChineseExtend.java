package structural.adapter;

/**
 * Usage: 中文类，使用继承实现 <br/>
 * Date: 2023/5/6 10:27 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ChineseExtend extends English implements Target {
    /**
     * 需要翻译
     */
    @Override
    public void info() {
        System.out.println("我可以说英语");
    }
}
