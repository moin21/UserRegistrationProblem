import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegexTest {
	UserDetails userDetails = new UserDetails();
@Test
public void testFistName() {
	boolean result = userDetails.firstName("Moin");
	assertTrue(result);
}
}
