import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator s = new StringCalculator();

	@Test
	public void emptyStringAddsUpToZero() throws Exception {
		assertEquals(0, s.add(""));
	}

	@Test
	public void addUpSingleNumber() throws Exception {
		assertEquals(17, s.add("17"));
	}

	@Test
	public void addUpTwoNumbersSeparatedWithComma() throws Exception {
		assertEquals(2356, s.add("2341,15"));
	}
	
	@Test
	public void addUpTwoNumbersSeparatedWithNewLine() throws Exception {
		assertEquals(35, s.add("34\n1"));
	}
	
	@Test
	public void addUpTwoNumbersSeparatedWithCustimSeparator() throws Exception {
		assertEquals(7, s.add("//;\n5;2"));
	}
}
