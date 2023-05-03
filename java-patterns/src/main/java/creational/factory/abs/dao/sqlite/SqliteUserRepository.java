package creational.factory.abs.dao.sqlite;

import creational.factory.abs.UserRepository;
import creational.factory.abs.entity.User;

/**
 * Usage: 使用 sqlLite 实现 {@link UserRepository} <br/>
 * Date: 2023/5/3 15:38 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SqliteUserRepository implements UserRepository {
    @Override
    public void insert(User user) {
        System.out.println("sqlLite insert user = " + user);
    }

    @Override
    public User getById(int id) {
        User user = new User();
        user.setId(id);
        user.setName("sqlLite-hanzhang" + id);
        return user;
    }
}
