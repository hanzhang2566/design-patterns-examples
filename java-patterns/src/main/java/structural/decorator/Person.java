package structural.decorator;

/**
 * Usage: ConcreteComponent  <br/>
 * Date: 2023/4/24 14:00 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Person implements Finery {
    /**
     * 姓名
     */
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * 穿衣服
     */
    @Override
    public void wear() {
        System.out.println("装扮的" + name);
    }
}
