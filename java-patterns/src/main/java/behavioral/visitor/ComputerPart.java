package behavioral.visitor;

/**
 * Usage: 计算机部分 <br/>
 * Date: 2023/5/15 12:40 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
