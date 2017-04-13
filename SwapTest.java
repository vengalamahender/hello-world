package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.Swap;

public class SwapTest {

	Swap number = null;
	@Before
	public void setUp() throws Exception {
		number =new Swap();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSwap() {
		Swap test= new Swap();
		int[] output = test.Swapmethod(20,30);
		assertEquals(30,output[0]);
		assertEquals(20,output[1]);
	}

}
