package creational.factory.abs.dao.mysql;

import creational.factory.abs.DeptRepository;
import creational.factory.abs.entity.Department;

/**
 * Usage: mysql 实现 <br/>
 * Date: 2023/5/3 15:55 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class MysqlDeptRepository implements DeptRepository {
    @Override
    public void insert(Department department) {
        System.out.println("mysql insert department = " + department);
    }

    @Override
    public Department getById(int id) {
        Department department = new Department();
        department.setId(id);
        department.setName("mysql-hanzhang" + id);
        return department;
    }
}
