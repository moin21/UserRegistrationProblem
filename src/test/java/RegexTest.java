import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Junit Test class to verify UserDetail's Methods
 *
 * @author Moinuddin
 */
public class RegexTest {


    /**
     * Method to test first name validation method when Proper first name is given.
     */

    @Test
    public void givenProperFirstName_returnTrue() {

        UserDetails userDetails = new UserDetails();
        assertTrue(userDetails.firstNameValidation("Alpha"));
    }

    /**
     * Method to test first name validation method when Improper first name is given.
     */
    @Test
    public void givenImproperFirstName_returnFalse() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.firstNameValidation("alpha"));
    }
    /**
     * Method to test first name validation method when first name is null.
     */
    @Test
    public void givenNullFirstName_returnFalseByNullPointerException() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.firstNameValidation(null));
    }
    /**
     * Method to test last name validation method when Proper last name is given.
     */
    @Test
    public void givenProperLastName_returnTrue() {

        UserDetails userDetails = new UserDetails();
        assertTrue(userDetails.lastNameValidation("Alpha"));
    }
    /**
     * Method to test last name validation method when Improper last name is given.
     */
    @Test
    public void givenImproperLastName_returnFalse() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.lastNameValidation("alpha"));
    }
    /**
     * Method to test last name validation method when last name is given null.
     */
    @Test
    public void givenNullLastName_returnFalseByNullPointerException() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.lastNameValidation(null));
    }
}
