package creational.factory.abs.dao.mysql;

import creational.factory.abs.UserRepository;
import creational.factory.abs.entity.User;

/**
 * Usage: 使用 MySQL 实现 {@link UserRepository} <br/>
 * Date: 2023/5/3 15:38 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class MysqlUserRepository implements UserRepository {
    @Override
    public void insert(User user) {
        System.out.println("mysql insert user = " + user);
    }

    @Override
    public User getById(int id) {
        User user = new User();
        user.setId(id);
        user.setName("mysql-hanzhang" + id);
        return user;
    }
}
