package behavioral.visitor;

import behavioral.visitor.impl.Keyboard;
import behavioral.visitor.impl.Monitor;
import behavioral.visitor.impl.Mouse;

/**
 * Usage:  <br/>
 * Date: 2023/5/15 12:48 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ComputerDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(ComputerPart computerPart) {
        System.out.println("ComputerDisplayVisitor.visit");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse.visit");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard.visit");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor.visit");
    }
}
