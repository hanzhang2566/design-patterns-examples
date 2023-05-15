package behavioral.interpreter.impl;

import behavioral.interpreter.Expression;

/**
 * Usage: 与运算 <br/>
 * Date: 2023/5/15 11:12 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class AndExpression implements Expression {
    private final Expression expr01;
    private final Expression expr02;

    public AndExpression(Expression expr01, Expression expr02) {
        this.expr01 = expr01;
        this.expr02 = expr02;
    }

    @Override
    public boolean interpret(String context) {
        return expr01.interpret(context) && expr02.interpret(context);
    }
}
