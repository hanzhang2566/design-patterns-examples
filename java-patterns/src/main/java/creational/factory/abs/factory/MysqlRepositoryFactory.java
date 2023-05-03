package creational.factory.abs.factory;

import creational.factory.abs.DeptRepository;
import creational.factory.abs.RepositoryFactory;
import creational.factory.abs.UserRepository;
import creational.factory.abs.dao.mysql.MysqlDeptRepository;
import creational.factory.abs.dao.mysql.MysqlUserRepository;

/**
 * Usage: mysql db 工厂 <br/>
 * Date: 2023/5/3 15:48 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class MysqlRepositoryFactory implements RepositoryFactory {
    @Override
    public UserRepository getUserRepository() {
        return new MysqlUserRepository();
    }

    @Override
    public DeptRepository getDeptRepository() {
        return new MysqlDeptRepository();
    }
}
