package creational.factory.abs.factory;

import creational.factory.abs.DeptRepository;
import creational.factory.abs.RepositoryFactory;
import creational.factory.abs.UserRepository;
import creational.factory.abs.dao.sqlite.SqliteDeptRepository;
import creational.factory.abs.dao.sqlite.SqliteUserRepository;

/**
 * Usage: sql lite db 工厂 <br/>
 * Date: 2023/5/3 15:48 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SqliteRepositoryFactory implements RepositoryFactory {
    @Override
    public UserRepository getUserRepository() {
        return new SqliteUserRepository();
    }

    @Override
    public DeptRepository getDeptRepository() {
        return new SqliteDeptRepository();
    }
}
