package behavioral.command;

/**
 * Usage: 股票类 <br/>
 * Date: 2023/5/15 10:37 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Stock {
    private final String name;

    private final int quantity;


    public Stock() {
        name = "ABC";
        quantity = 10;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}
