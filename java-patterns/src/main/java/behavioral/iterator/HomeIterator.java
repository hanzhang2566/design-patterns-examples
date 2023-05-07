package behavioral.iterator;

import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * Usage: {@link Home} 的 {@link Iterator} 实现 <br/>
 * Date: 2023/5/7 14:24 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class HomeIterator implements Iterator<Home> {

    private final Deque<Home> homes;

    public HomeIterator(Deque<Home> homes) {
        this.homes = homes;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return !homes.isEmpty();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Home next() throws NoSuchElementException {
        return homes.poll();
    }
}
