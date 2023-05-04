package behavioral.state.impl;

import behavioral.state.Time;
import behavioral.state.Work;

/**
 * Usage: 晚上 <br/>
 * Date: 2023/5/4 10:40 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Evening implements Time {
    @Override
    public void transfer(Work work) {
        System.out.println("transfer to morning");
        work.setTime(new Morning());
    }
}
