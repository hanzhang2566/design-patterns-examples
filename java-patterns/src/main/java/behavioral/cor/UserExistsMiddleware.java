package behavioral.cor;

/**
 * Usage: 检查用户登录 <br/>
 * Date: 2023/5/13 15:24 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered ");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return super.checkNext(email, password);
    }
}
