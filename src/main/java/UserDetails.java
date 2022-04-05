import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Functional interface -  LambdaFunction
 * with method declaration - checkRegex
 */
@FunctionalInterface
interface LambdaFunction {
    boolean checkRegex(String regex, String UserInput);
}

/**
 * Class created field validations for user registration
 *
 * @author Moinuddin
 */
public class UserDetails {
    /**
     * nameRegex - First Name and Last Name should be at least of 3 characters starting with an uppercase letter.
     */
    public static final String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
    /**
     * emailRegex - allows alphanumerics with special characters in between before @ and 2-4 characters later: ex moin.asraf@mail.com
     */
    public static final String emailIdRegex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    /**
     * mobileNoRegex - 10 digit number followed by 2 digits country code and a space.
     */
    public static final String mobileNoRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
    /**
     * passwordRegex - Alphanumeric with at least 8 characters consisting of at least one uppercase, one number and onle one special character.
     */
    public static final String passwordRegex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[@$!%*#?&]{1}).{8,}$";
    /**
     * firstName, lastName, emailId, mobileNo and password variables for user input.
     * nameRegex, emailIdRegex, mobileRegex, passwordRegex are the regex patterns for above specified inputs.
     */
    public static String firstName, lastName, emailId, mobileNo, password;
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Instance for Functional Interface.
     * Body for checkRegex.
     * Creating pattern object using Pattern.compile with param named regex.
     * Creating matcher object using Pattern.matcher using param named input.
     * returning boolean value from matcher.matches
     */
    static LambdaFunction validation = (regex, userInput) -> {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    };

    /**
     * Main method taking user inputs and calling all the validataion methods.
     */
    public static void main(String[] args) {
        System.out.println("Enter First Name");
        firstName = scanner.next();
        firstNameValidation(firstName);
        System.out.println("Enter Last Name");
        lastName = scanner.next();
        lastNameValidation(lastName);
        System.out.println("Enter Email ID");
        emailId = scanner.next();
        emailValidation(emailId);
        System.out.println("Enter Mobile No.");
        mobileNo = scanner.next();
        mobileNoValidation(mobileNo);
        System.out.println("Enter Password");
        password = scanner.next();
        passwordValidation(password);
        scanner.close();
    }

    /**
     * Method to validate First Name.
     * Using try catch block to ensure NullPointerException.
     * If validation.checkRegex gives true: Valid
     * Else invalid.
     *
     * @param firstName - First name.
     * @return - boolean value if First Name is valid or not.
     */
    public static boolean firstNameValidation(String firstName) {
        try {
            if (validation.checkRegex(nameRegex, firstName)) {
                System.out.println("It's a valid first name");
                return true;
            } else System.out.println("It's an invalid first name.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid first name");
        }
        return false;
    }

    /**
     * Method to validate Last Name.
     * Using try catch block to ensure NullPointerException
     * If validation.checkRegex gives true: Valid
     * Else invalid.
     *
     * @param lastName - Last name.
     * @return - boolean value if Last Name is valid or not.
     */
    public static boolean lastNameValidation(String lastName) {
        try {
            if (validation.checkRegex(nameRegex, lastName)) {
                System.out.println("It's a valid last name");
                return true;
            } else System.out.println("It's an invalid last name.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid last name");
        }
        return false;
    }

    /**
     * Method to validate Email.
     * Using try catch block to ensure NullPointerException
     * If validation.checkRegex gives true: Valid
     * Else invalid.
     *
     * @param emailId - Email ID.
     * @return - boolean value if Email is valid or not.
     */
    public static boolean emailValidation(String emailId) {
        try {
            if (validation.checkRegex(emailIdRegex, emailId)) {
                System.out.println("It's a valid email id");
                return true;
            } else System.out.println("It's an invalid email id.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid email id");
        }
        return false;
    }

    /**
     * Method to validate Mobile Number.
     * Using try catch block to ensure NullPointerException
     * If validation.checkRegex gives true: Valid
     * Else invalid.
     *
     * @param mobileNo - Mobile Number.
     * @return - boolean value if Mobile Number is valid or not.
     */
    public static boolean mobileNoValidation(String mobileNo) {
        try {
            if (validation.checkRegex(mobileNoRegex, mobileNo)) {
                System.out.println("It's a valid phone no.");
                return true;
            } else System.out.println("It's an invalid phone no.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid phone no.");
        }
        return false;
    }

    /**
     * Method to validate Password.
     * Using try catch block to ensure NullPointerException
     * If validation.checkRegex gives true: Valid
     * Else invalid.
     *
     * @param password - Password.
     * @return - boolean value if Password is valid or not.
     */
    public static boolean passwordValidation(String password) {
        try {
            if (validation.checkRegex(passwordRegex, password)) {
                System.out.println("It's a valid password.");
                return true;
            } else System.out.println("It's an invalid password.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid password.");
        }
        return false;
    }
}
