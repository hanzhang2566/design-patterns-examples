package behavioral.mediator;

/**
 * Usage: 中介接口 <br/>
 * Date: 2023/5/13 16:34 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Mediator {
    void register(Colleague colleague);

    void relay(Colleague colleague);

}
