package creational.factory.abs;

import creational.factory.abs.entity.Department;
import creational.factory.abs.factory.MysqlRepositoryFactory;
import creational.factory.abs.factory.SqliteRepositoryFactory;
import creational.factory.abs.entity.User;
import org.junit.Test;

/**
 * Usage:  <br/>
 * Date: 2023/5/3 15:40 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        User user = new User();
        user.setId(1);
        user.setName("hanzhang");

        RepositoryFactory factory = new SqliteRepositoryFactory();
        UserRepository userRepository = factory.getUserRepository();
        userRepository.insert(user);

        System.out.println(factory.getDeptRepository().getById(-1));
    }

    @Test
    public void test02() {
        Department department = new Department();
        department.setId(-1);
        department.setName("hanzhang");

        RepositoryFactory factory = new MysqlRepositoryFactory();
        System.out.println(factory.getUserRepository().getById(1));

        factory.getDeptRepository().insert(department);
    }
}
