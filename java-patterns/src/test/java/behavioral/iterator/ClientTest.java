package behavioral.iterator;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Usage: 迭代器模式测试 <br/>
 * Date: 2023/5/7 14:31 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Deque<Home> homes = new ArrayDeque<>();
        homes.offer(Home.builder().id(1).build());
        homes.offer(Home.builder().id(2).build());
        homes.offer(Home.builder().id(3).build());
        Iterable<Home> homeIterable = new HomeIterable(homes);
        Iterator<Home> iterator = homeIterable.iterator();
        while (iterator.hasNext()) {
            Home home = iterator.next();
            System.out.println("home = " + home);
        }
    }
}
