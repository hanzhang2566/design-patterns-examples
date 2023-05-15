package behavioral.visitor.impl;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

/**
 * Usage: 鼠标  <br/>
 * Date: 2023/5/15 12:40 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
