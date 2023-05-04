package behavioral.state;

import lombok.Setter;

/**
 * Usage:  <br/>
 * Date: 2023/5/4 10:09 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Work {
    @Setter
    private Time time;

    public Work(Time time) {
        this.time = time;
    }

    public void process() {
        time.transfer(this);
    }
}
