package structural.proxy;

/**
 * Usage: RealSubject <br/>
 * Date: 2023/4/25 10:54 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Pursuer implements Gift {
    /**
     * 被追求者
     */
    private final String name;

    public Pursuer(String name) {
        this.name = name;
    }

    /**
     * 送洋娃娃
     */
    @Override
    public void giveDoll() {
        System.out.println(name + ", 送你洋娃娃");
    }

    /**
     * 送花
     */
    @Override
    public void giveFlower() {
        System.out.println(name + ", 送你鲜花");
    }
}
