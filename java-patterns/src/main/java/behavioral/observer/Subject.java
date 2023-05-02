package behavioral.observer;

/**
 * Usage: 通知接口 <br/>
 * Date: 2023/5/2 22:54 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void publish();

    String getAction();

    void setAction(String action);
}
