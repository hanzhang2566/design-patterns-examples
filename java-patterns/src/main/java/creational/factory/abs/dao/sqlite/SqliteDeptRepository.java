package creational.factory.abs.dao.sqlite;

import creational.factory.abs.DeptRepository;
import creational.factory.abs.entity.Department;

/**
 * Usage: sqlLite 实现 <br/>
 * Date: 2023/5/3 15:55 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SqliteDeptRepository implements DeptRepository {
    @Override
    public void insert(Department department) {
        System.out.println("sqlite insert department = " + department);
    }

    @Override
    public Department getById(int id) {
        Department department = new Department();
        department.setId(id);
        department.setName("sqlite-hanzhang" + id);
        return department;
    }
}
