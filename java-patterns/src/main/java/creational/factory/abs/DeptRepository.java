package creational.factory.abs;

import creational.factory.abs.entity.Department;

/**
 * Usage:  <br/>
 * Date: 2023/5/3 15:53 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface DeptRepository {
    void insert(Department department);

    Department getById(int id);
}
