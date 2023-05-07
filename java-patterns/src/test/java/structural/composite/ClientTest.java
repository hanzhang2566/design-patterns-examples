package structural.composite;

import org.junit.Test;

/**
 * Usage: 组合模式测试 <br/>
 * Date: 2023/5/7 13:32 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Employee ceo = new Employee("John","CEO");

        Employee headSales = new Employee("Robert","Head Sales");
        Employee salesExecutive1 = new Employee("Richard","Sales");
        Employee salesExecutive2 = new Employee("Rob","Sales");
        headSales.append(salesExecutive1);
        headSales.append(salesExecutive2);
        ceo.append(headSales);

        Employee headMarketing = new Employee("Michel","Head Marketing");
        Employee clerk1 = new Employee("Laura","Marketing");
        Employee clerk2 = new Employee("Bob","Marketing");
        headMarketing.append(clerk1);
        headMarketing.append(clerk2);
        ceo.append(headMarketing);

        // TODO 使用递归来实现输出，而不是嵌套的 for-each
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
