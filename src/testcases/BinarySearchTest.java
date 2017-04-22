package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.BinarySearch;
import main.LinearSearch;

public class BinarySearchTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[]array  ={1,2,3,4,5,8,9,10,12};
		int key = 10;
		int result=BinarySearch.binarysearch(array, key);
	assertEquals(7,result);
	

	}

	}


