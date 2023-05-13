package behavioral.cor;

import org.junit.Test;

/**
 * Usage: 责任链模式测试 <br/>
 * Date: 2023/5/13 15:32 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class ClientTest {
    @Test
    public void test01() {
        Server server = new Server();
        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server)
        );
        server.setMiddleware(middleware);
        server.register("admin@example.com", "admin");

        server.login("admin", "admin");
    }

    @Test
    public void test02() {
        Server server = new Server();
        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server)
        );
        server.setMiddleware(middleware);
        server.register("admin@example.com", "admin");

        server.login("admin@example.com", "admin1");
    }

    @Test
    public void test03() {
        Server server = new Server();
        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server)
        );
        server.setMiddleware(middleware);
        server.register("admin@example.com", "admin");

        server.login("admin@example.com", "admin");
    }

    @Test
    public void test04() {
        Server server = new Server();
        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
        server.register("admin@example.com", "admin");

        server.login("admin@example.com", "admin");
    }
}
