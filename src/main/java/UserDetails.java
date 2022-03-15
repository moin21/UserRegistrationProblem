
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class created for methods required for user registration
 * 
 * @author Moinuddin
 *
 */
public class UserDetails {
	/**
	 * regex - regex pattern to be matched with user input
	 */
	public String regex;

	/**
	 * Method to match first name with regex
	 * 
	 * @param firstName - User's First Name
	 * @return
	 */
	public boolean firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
	/**
	 *  In this method we will check for exception for the first name.
	 *  If the first name is valid then it will print valid.
	 *  If the first name is Invalid then it will throw the exception and print the message.
	 * @param firstName - Passed first name to this method.
	 * @return - Returns a boolean value true if correct pattern.
	 * @throws InputInvalidException - Throws the custom exception.  
	 */
	public boolean testFirstName(String firstName) throws InvalidInputException {
        try {
            if (!firstName(firstName)) {
                throw new InvalidInputException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (InvalidInputException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return firstName(firstName);
    }

	/**
	 * Method to match last name with regex
	 * 
	 * @param lastName - User's Last Name
	 * @return
	 */
	public boolean lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
	/**
	 *  In this method we will check for exception for the last name.
	 *  If the last name is valid then it will print valid.
	 *  If the last name is Invalid then it will throw the exception and print the message.
	 * @param lastName - Passed last name to this method.
	 * @return - Returns a boolean value true if correct pattern.
	 * @throws InputInvalidException - Throws the custom exception.  
	 */
	public boolean testLastName(String lastName) throws InvalidInputException {
        try {
            if (!lastName(lastName)) {
                throw new InvalidInputException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InvalidInputException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return lastName(lastName);
    }
	/**
	 * Method to match email with regex
	 * 
	 * @param email - User's email
	 * @return
	 */
	public boolean email(String email) {
		regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	/**
	 * Method to match phone with regex
	 * 
	 * @param mobile - User's mobile
	 * @return
	 */
	public boolean mobile(String mobile) {
		regex = "^[0-9]{2}(\\s){1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		return matcher.matches();
	}

	/***
	 * Method to match password with regex
	 * 
	 * @param password - User's password
	 * @return
	 */
	public boolean password(String password) {
		regex = "^[a-zA-Z0-9]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public boolean upperCase(String upperCase) {
		regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&]{1})[A-Za-z\\d@$!%*?&]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(upperCase);
		return matcher.matches();
	}
}