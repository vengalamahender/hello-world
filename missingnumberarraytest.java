package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.Missingnumberarray;

public class missingnumberarraytest {
 Missingnumberarray test = null;
	@Before
	public void setUp() throws Exception {
		
		test = new Missingnumberarray();
	}
	


	@Test
	public void test() {
		int[] output = Missingnumberarray.Findnumber(new int []{1,3,5});
		assertArrayEquals(new int[] {2,4,0,0,0}, output);
		
	}
	@After
	public void tearDown() throws Exception {
		
		
	}

}
