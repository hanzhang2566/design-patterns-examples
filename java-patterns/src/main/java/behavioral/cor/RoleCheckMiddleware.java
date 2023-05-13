package behavioral.cor;

/**
 * Usage: 用户角色 <br/>
 * Date: 2023/5/13 15:40 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("admin role");
            return true;
        }
        System.out.println("user role");
        return false;
    }
}
