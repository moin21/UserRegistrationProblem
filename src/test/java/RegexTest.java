import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Junit Test class to verify UserDetail's Methods
 * 
 * @author Moinuddin
 *
 */
public class RegexTest {
	/**
	 * New instance userDetails created for UserDetails
	 */
	UserDetails userDetails = new UserDetails();

	/**
	 * Method to verify first name
	 */
	@Test
	public void testFistName() {
		boolean result = userDetails.firstName(null);
		assertTrue(result);
	}

	/**
	 * Method to verify last name
	 */
	@Test
	public void testLastName() {
		boolean result = userDetails.lastName("Asraf");
		assertTrue(result);
	}

	/**
	 * Method to verify email
	 */
	@Test
	public void testEmail() {
		boolean result = userDetails.email("moinudin.asraf@bl.co.in");
		assertTrue(result);
	}

	/**
	 * Method to test Mobile no.
	 */
	@Test
	public void testMobile() {
		boolean result = userDetails.mobile("91 9602721596");
		assertTrue(result);
	}

	/**
	 * Method to test password
	 */
	@Test
	public void testPassword() {
		boolean result = userDetails.password("moiN12345");
		assertTrue(result);
	}
}
