package assinments2.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assinments2.mergearray;

public class mergearraytest {
    
	mergearray test = null;
	@Before
	public void setUp() throws Exception {
		
		test = new mergearray();
		
	}


	@Test
	public void testmergearray() {
		int[] output = mergearray.merge(new int[] {1, 2, 3},new int[] {4, 5, 6});
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, output);
		
	}
	@After
	public void tearDown() throws Exception {
		testmergearray();
	}


}
