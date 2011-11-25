import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator s = new StringCalculator();

	@Test
	public void testCalculator() throws Exception {
		assertEquals(17, s.add("17")); // should add single numbers
		assertEquals(2356, s.add("2341,15")); // should add comma separated
												// numbers
		assertEquals(35, s.add("34\n1")); // should treat new line as separator
		assertEquals(7, s.add("//;\n5;2")); // should support custom separators
	}

	@Test
	public void emptyStringAddsUpToZero() throws Exception {
		assertEquals(0, s.add(""));

	}
}
