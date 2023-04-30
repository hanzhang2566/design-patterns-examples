package behavioral.strategy;

import behavioral.strategy.impl.FIFO;
import behavioral.strategy.impl.LFU;
import behavioral.strategy.impl.LRU;
import org.junit.Test;

/**
 * Usage: Client <br/>
 * Date: 2023/4/30 21:18 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Cache cache = new Cache(new FIFO());
        cache.delete();

        cache.setAlgorithm(new LFU());
        cache.delete();

        cache.setAlgorithm(new LRU());
        cache.delete();
    }
}
