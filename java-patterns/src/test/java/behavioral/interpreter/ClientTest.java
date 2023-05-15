package behavioral.interpreter;

import behavioral.interpreter.impl.AndExpression;
import behavioral.interpreter.impl.OrExpression;
import behavioral.interpreter.impl.TerminalExpression;
import org.junit.Test;

/**
 * Usage: 解释器模式测试 <br/>
 * Date: 2023/5/15 11:31 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Expression isMale = getMaleExpression();
        System.out.println("John is male? " + isMale.interpret("John"));
    }

    @Test
    public void test02() {
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
