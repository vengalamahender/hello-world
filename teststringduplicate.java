package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.stringduplicate;

public class teststringduplicate {

	stringduplicate number = null;
	@Before
	public void setUp() throws Exception {
		
		number = new stringduplicate();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 String output = stringduplicate.removedup("accdefff");
		assertEquals("acdef", output);

	}

}
