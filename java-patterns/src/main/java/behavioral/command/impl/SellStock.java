package behavioral.command.impl;

import behavioral.command.Order;
import behavioral.command.Stock;

/**
 * Usage: 出售股票 <br/>
 * Date: 2023/5/15 10:43 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
