package creational.factory.abs;

import creational.factory.abs.entity.User;

/**
 * Usage: 用户 db 访问接口 <br/>
 * Date: 2023/5/3 15:41 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface UserRepository {

    void insert(User user);

    User getById(int id);
}
