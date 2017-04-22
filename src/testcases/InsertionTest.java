package testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.InsertionSort;

public class InsertionTest {

	private void sort(int[] arr) {
	    InsertionSort.Sort(arr);
	}

	@Test
	public void testMixedValues() {
	    int[] arr = {2, 5, 1, 8, 12, 3, 7};
	    sort(arr);
	    assertEquals("[1, 2, 3, 5, 7, 8, 12]", Arrays.toString(arr));
	}

	@Test
	public void testDecreasingValues() {
	    int[] arr = {4, 3, 2, 1};
	    sort(arr);
	    assertEquals("[1, 2, 3, 4]", Arrays.toString(arr));
	}
}
