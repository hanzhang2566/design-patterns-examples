package behavioral.cor;

import java.util.HashMap;
import java.util.Map;

/**
 * Usage: 服务类 <br/>
 * Date: 2023/5/13 15:25 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Server {
    private Map<String, String> users = new HashMap<>();

    private Middleware middleware;


    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String username, String password) {
        if (middleware.check(username, password)) {
            System.out.println("authentication ok");
            return true;
        }
        return false;
    }


    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }

    public void register(String email, String password) {
        users.put(email, password);
    }
}
