import java.util.List;

public class User {
    private final String login;
    private final String password;
    private List<Order> orderHistory;

    public User (String login, String password) {
        this.login = login;
        this.password = password;
    }
}
