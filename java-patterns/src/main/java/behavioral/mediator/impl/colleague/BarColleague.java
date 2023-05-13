package behavioral.mediator.impl.colleague;

import behavioral.mediator.Colleague;
import behavioral.mediator.Mediator;

/**
 * Usage:  <br/>
 * Date: 2023/5/13 16:45 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class BarColleague implements Colleague {
    private Mediator mediator;

    @Override
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive() {
        System.out.println("BarColleague.receive");
    }

    @Override
    public void send() {
        System.out.println("BarColleague.send");
        mediator.relay(this);
    }
}
