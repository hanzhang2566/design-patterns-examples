package behavioral.interpreter;

/**
 * Usage: 表达式 <br/>
 * Date: 2023/5/15 11:10 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface Expression {
    boolean interpret(String context);
}
