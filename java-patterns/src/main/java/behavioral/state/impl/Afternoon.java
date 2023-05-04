package behavioral.state.impl;

import behavioral.state.Time;
import behavioral.state.Work;

/**
 * Usage: 中午 <br/>
 * Date: 2023/5/4 10:39 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Afternoon implements Time {
    @Override
    public void transfer(Work work) {
        System.out.println("transfer to evening");
        work.setTime(new Evening());
    }
}
