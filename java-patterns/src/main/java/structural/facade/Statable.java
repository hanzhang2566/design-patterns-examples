package structural.facade;

/**
 * Usage: 发言类 <br/>
 * Date: 2023/4/29 13:59 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Statable {
    /**
     * 对内发言
     */
    void domestic();

    /**
     * 对外发言
     */
    void foreign();
}
