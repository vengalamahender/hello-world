package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import assinments2.arrayduplicate;

public class arrayduplicatetest {

	arrayduplicate  test = null;
	@Before
	public void setUp() throws Exception {
		test = new arrayduplicate();
	}
	

	@Test
	public void testarrayduplicate() {

			int[] output = arrayduplicate.removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
			assertArrayEquals(new int[] {4, 3, 2, 9}, output);
			
		
	}
	@After
	public void tearDown() throws Exception {
		testarrayduplicate();
	}

}
