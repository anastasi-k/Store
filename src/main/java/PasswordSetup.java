import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSetup {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";
    private static final Pattern PATTERN = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValidPassword (String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        Matcher matcher = PATTERN.matcher(password);
        return matcher.matches();
    }
}
