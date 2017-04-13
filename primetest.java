package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.prime;

public class primetest {

	prime factor = null;
	
	@Before
	public void setUp() throws Exception {
		factor = new prime();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] output = prime.primeFactors(30);
		
		assertArrayEquals(new int[] {2, 3, 5}, output);
	}

}
