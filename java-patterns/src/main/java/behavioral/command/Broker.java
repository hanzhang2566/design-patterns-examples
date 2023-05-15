package behavioral.command;


import java.util.ArrayList;
import java.util.List;

/**
 * Usage: 交易所 <br/>
 * Date: 2023/5/15 10:44 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Broker {
    private final List<Order> orders;

    public Broker() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void execute() {
        for (Order order : orders) {
            order.execute();
        }

        orders.clear();
    }
}
