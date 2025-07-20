public interface UserRepository {

    User registerUser(String login, String password);
    User findByLogin(String login);
}
