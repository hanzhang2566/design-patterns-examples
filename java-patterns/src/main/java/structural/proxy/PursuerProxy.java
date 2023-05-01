package structural.proxy;

/**
 * Usage: Proxy <br/>
 * Date: 2023/4/25 11:03 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class PursuerProxy implements Gift {
    /**
     * 追求者对象
     */
    public final Pursuer pursuer;

    public PursuerProxy(String name) {
        pursuer = new Pursuer(name);
    }

    /**
     * 送洋娃娃
     */
    @Override
    public void giveDoll() {
        pursuer.giveDoll();
    }

    /**
     * 送花
     */
    @Override
    public void giveFlower() {
        pursuer.giveFlower();
    }
}
