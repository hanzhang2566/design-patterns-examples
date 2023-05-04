package behavioral.state.impl;

import behavioral.state.Time;
import behavioral.state.Work;

/**
 * Usage: 早晨 <br/>
 * Date: 2023/5/4 10:36 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Morning implements Time {
    @Override
    public void transfer(Work work) {
        System.out.println("transfer to afternoon");
        work.setTime(new Afternoon());
    }
}
