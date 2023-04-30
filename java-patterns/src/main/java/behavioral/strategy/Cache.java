package behavioral.strategy;

import lombok.Setter;

/**
 * Usage: Context <br/>
 * Date: 2023/4/30 21:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Cache {
    @Setter
    private Algorithm algorithm;

    public Cache(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void delete() {
        algorithm.delete();
    }
}
