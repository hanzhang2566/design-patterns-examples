package behavioral.command.impl;

import behavioral.command.Order;
import behavioral.command.Stock;

/**
 * Usage: 购买股票 <br/>
 * Date: 2023/5/15 10:39 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class BuyStock implements Order {
    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
