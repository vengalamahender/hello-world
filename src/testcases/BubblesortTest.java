package testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Bubblesort;


public class BubblesortTest {
	private void bubble_srt(int[] arr) {
	    int[] array;
		Bubblesort.bubble_srt(arr);
	}
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_srt(arr);
		    assertEquals("[0, 1, 2, 4, 6, 9, 12, 23, 34]", Arrays.toString(arr));
	}

}
