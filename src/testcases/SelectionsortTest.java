package testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.SelectionSort;


public class SelectionsortTest {
	
	private void sort(int[] arr) {
	    SelectionSort.selectionSort(arr);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMixedValues() {
	    int[] arr = {2, 5, 1, 8, 12, 3, 7};
	   sort(arr);
	    assertEquals("[1, 2, 3, 5, 7, 8, 12]", Arrays.toString(arr));
	}

	
	
	}

	




