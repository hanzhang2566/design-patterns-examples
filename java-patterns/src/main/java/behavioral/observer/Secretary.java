package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage: 秘书类 <br/>
 * Date: 2023/5/2 22:33 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Secretary implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Getter
    @Setter
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
