package behavioral.visitor;

import behavioral.visitor.impl.Keyboard;
import behavioral.visitor.impl.Monitor;
import behavioral.visitor.impl.Mouse;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage: 计算机 <br/>
 * Date: 2023/5/15 12:44 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Computer implements ComputerPart {
    private final List<ComputerPart> parts = new ArrayList<>(3);

    public Computer() {
        parts.add(new Keyboard());
        parts.add(new Mouse());
        parts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
