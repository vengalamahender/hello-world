package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.LinearSearch;

public class LinearSearchTest {

	@Before
	public void setUp() throws Exception {
	}

	

	@Test
	public void test() {
		int[]array  ={1,2,3,4,5,8,9,10,12};
		int key = 8;
		int result=LinearSearch.linearsearch(array, key);
	assertEquals(5,result);

	}
}
