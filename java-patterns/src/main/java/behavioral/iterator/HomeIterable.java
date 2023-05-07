package behavioral.iterator;

import java.util.Deque;

/**
 * Usage: {@link Home} 的 {@link Iterable} 实现 <br/>
 * Date: 2023/5/7 14:28 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class HomeIterable implements Iterable {

    private final Iterator<Home> homeIterator;

    public HomeIterable(Deque<Home> homes) {
        homeIterator = new HomeIterator(homes);
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Home> iterator() {
        return homeIterator;
    }
}
