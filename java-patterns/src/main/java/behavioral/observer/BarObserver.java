package behavioral.observer;

/**
 * Usage: Bar 同事 <br/>
 * Date: 2023/5/2 22:53 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class BarObserver implements Observer {
    private final String name;
    private final Subject subject;

    public BarObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        System.out.printf("[%s]:%s 继续开会！\n", subject.getAction(), name);
    }
}
