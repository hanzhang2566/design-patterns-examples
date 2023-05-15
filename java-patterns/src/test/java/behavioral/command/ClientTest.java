package behavioral.command;

import behavioral.command.impl.BuyStock;
import behavioral.command.impl.SellStock;
import org.junit.Test;

/**
 * Usage: 命令模式 <br/>
 * Date: 2023/5/15 10:48 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Stock stock = new Stock();
        Broker broker = new Broker();

        broker.addOrder(new BuyStock(stock));
        broker.addOrder(new SellStock(stock));
        broker.execute();
    }
}
