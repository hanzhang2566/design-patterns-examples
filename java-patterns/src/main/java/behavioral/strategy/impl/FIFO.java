package behavioral.strategy.impl;

import behavioral.strategy.Algorithm;

/**
 * Usage: ConcreteStrategy <br/>
 * Date: 2023/4/30 21:07 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class FIFO implements Algorithm {
    /**
     * 删除方法
     */
    @Override
    public void delete() {
        System.out.println("FIFO.delete");
    }
}
