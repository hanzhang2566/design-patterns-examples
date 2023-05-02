package behavioral.observer;

/**
 * Usage: Foo 同事 <br/>
 * Date: 2023/5/2 22:37 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class FooObserver implements Observer {
    private final String name;
    private final Subject subject;

    public FooObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        System.out.printf("[%s]:%s 继续工作！\n", subject.getAction(), name);
    }
}
