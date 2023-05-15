package behavioral.interpreter.impl;

import behavioral.interpreter.Expression;

/**
 * Usage: 终端 <br/>
 * Date: 2023/5/15 11:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
