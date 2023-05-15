package behavioral.visitor;

import behavioral.visitor.impl.Keyboard;
import behavioral.visitor.impl.Monitor;
import behavioral.visitor.impl.Mouse;

/**
 * Usage: 计算机部分访问者 <br/>
 * Date: 2023/5/15 12:42 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface ComputerPartVisitor {
    void visit(ComputerPart computerPart);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
