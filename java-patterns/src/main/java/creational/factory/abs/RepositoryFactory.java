package creational.factory.abs;

/**
 * Usage: db 工厂 <br/>
 * Date: 2023/5/3 15:47 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface RepositoryFactory {
    UserRepository getUserRepository();

    DeptRepository getDeptRepository();
}
