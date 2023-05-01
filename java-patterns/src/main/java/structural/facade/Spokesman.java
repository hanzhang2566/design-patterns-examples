package structural.facade;

/**
 * Usage: 发言人 <br/>
 * Date: 2023/4/29 14:02 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Spokesman implements Statable {
    private final Commerce commerce;
    private final Defense defense;
    private final Education education;
    private final Foreign foreign;

    public Spokesman() {
        this.commerce = new Commerce();
        this.defense = new Defense();
        this.education = new Education();
        this.foreign = new Foreign();
    }

    /**
     * 对内发言
     */
    @Override
    public void domestic() {
        commerce.state();
        education.state();
    }

    /**
     * 对外发言
     */
    @Override
    public void foreign() {
        defense.state();
        foreign.state();
    }
}
