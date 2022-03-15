
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Class with email regex pattern.
 * @author Moinuddin
 *
 */

public class EmailValidator {
	public boolean emailIdValidator(String emailIds) {
        String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailIds);
        return matcher.matches();
    }
}
