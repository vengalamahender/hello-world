package main;


	import java.util.Arrays;

	public class SelectionSort {



	    public static void selectionSort(int[] arr) {
	        int size = arr.length;
	        for (int i = 0; i < size - 1; i++) {
	            int iMin = i;
	            for (int j = i + 1; j < size; j++) {
	                if (arr[j] < arr[iMin]) {
	                    swap(arr, j, iMin);
	                }
	            }
	        }
	    }

	    public static void swap(int[] arr, int j, int iMin) {
	        int temp = arr[j];
	        arr[j] = arr[iMin];
	        arr[iMin] = temp;
	    }
}
