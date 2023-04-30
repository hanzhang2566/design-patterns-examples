package structural.decorator;

import java.util.Objects;

/**
 * Usage: {@link Finery} Decorator <br/>
 * Date: 2023/4/24 14:08 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public abstract class FineryDecorator implements Finery {
    /**
     * 穿衣接口
     */
    private Finery finery;
    

    /**
     * 聚合穿衣接口的方法
     *
     * @param finery 穿衣功能
     */
    public void decorate(Finery finery) {
        this.finery = finery;
    }

    /**
     * 调用穿衣方法
     */
    @Override
    public void wear() {
        if (Objects.isNull(finery)) {
            return;
        }
        finery.wear();
    }
}
