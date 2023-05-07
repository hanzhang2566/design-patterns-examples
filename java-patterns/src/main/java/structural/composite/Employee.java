package structural.composite;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage: 员工类 <br/>
 * Date: 2023/5/7 13:30 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@ToString(exclude = "subordinates")
public class Employee {
    private final String name;
    private final String dept;
    @Getter
    private final List<Employee> subordinates;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        subordinates = new ArrayList<>();
    }

    public void append(Employee e) {
        subordinates.add(e);
    }
}
