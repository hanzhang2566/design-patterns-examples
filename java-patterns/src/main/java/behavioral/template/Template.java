package behavioral.template;

/**
 * Usage: 考卷 <br/>
 * Date: 2023/4/28 11:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public abstract class Template {
    protected void template() {
        System.out.println("who are u?");
        System.out.println("I'm " + whoami());
    }

    /**
     * {@link Template#template()} 的答案
     *
     * @return 答案
     */
    protected abstract String whoami();
}
