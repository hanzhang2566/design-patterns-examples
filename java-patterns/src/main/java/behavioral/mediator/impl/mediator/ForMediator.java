package behavioral.mediator.impl.mediator;

import behavioral.mediator.Colleague;
import behavioral.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage:  <br/>
 * Date: 2023/5/13 16:45 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ForMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(colleague)) {
                ob.receive();
            }
        }
    }
}
