package behavioral.mediator;

/**
 * Usage: 同事接口 <br/>
 * Date: 2023/5/13 16:42 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Colleague {
    void receive();

    void send();

    void setMedium(Mediator mediator);
}
