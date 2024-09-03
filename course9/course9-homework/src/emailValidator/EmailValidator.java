package emailValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(
            "^[A-Z0-9]+[A-Z0-9._]+@[A-Z0-9]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate() throws InvalidEmailException {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Invalid email!");
        }
        return matcher.matches();
    }
}
