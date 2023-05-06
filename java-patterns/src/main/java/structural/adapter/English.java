package structural.adapter;

/**
 * Usage: 英语类 <br/>
 * Date: 2023/5/6 10:25 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class English {
    /**
     * 不需要翻译
     */
    public void greet() {
        System.out.println("How are you?");
    }

    /**
     * 需要翻译
     */
    public void info() {
        System.out.println("I can speak English");
    }


}
