package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.wordpolyndrome;

public class wordpolyndrometest<Palindromeword> {

	wordpolyndrome number = null;
	@Before
	public void setUp() throws Exception {
		number = new wordpolyndrome();
	}


	@Test
		public void wordpolyndromeTest() {
		wordpolyndrome pol=new wordpolyndrome();
			assertEquals(true,pol.isPolyndrom("katak"));
			assertEquals(false,pol.isPolyndrom("sacrifice"));
			assertFalse("not a polydrome",pol.isPolyndrom("sacrifice"));
			assertTrue(" polydrome",pol.isPolyndrom("katak"));
		
		    
		
	}

	@After
	public void tearDown() throws Exception {
		wordpolyndromeTest();
	}
}
