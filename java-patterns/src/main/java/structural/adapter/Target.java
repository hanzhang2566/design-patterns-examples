package structural.adapter;

/**
 * Usage: 客户接口，将英语翻译为中文<br/>
 * Date: 2023/5/6 10:18 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Target {
    /**
     * 不需要翻译
     */
    void greet();

    /**
     * 需要翻译
     */
    void info();
}
