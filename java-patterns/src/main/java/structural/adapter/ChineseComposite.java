package structural.adapter;

/**
 * Usage: 中文类，使用组合实现 <br/>
 * Date: 2023/5/6 10:32 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ChineseComposite implements Target {
    private English english;

    public ChineseComposite() {
        this.english = new English();
    }

    /**
     * 不需要翻译
     */
    @Override
    public void greet() {
        english.greet();
    }

    /**
     * 需要翻译
     */
    @Override
    public void info() {
        System.out.println("我可以说英语");
    }
}
