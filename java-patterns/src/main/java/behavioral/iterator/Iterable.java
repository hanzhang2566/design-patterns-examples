package behavioral.iterator;

/**
 * Usage: 可迭代接口 <br/>
 * Date: 2023/5/7 14:18 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Iterable {
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    Iterator iterator();
}
