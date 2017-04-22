
package main;

import java.awt.print.Printable;
import java.util.ArrayList;

public class InsertionSort {
	
	public static int[] Sort(int[] arr) {

	    int value, hole;

	    for (int i = 1; i < arr.length; i++) {
	        value = arr[i];
	        hole = i;

	        while (hole > 0 && arr[hole - 1] > value) {
	            arr[hole] = arr[hole - 1];
	            hole--;
	        }

	        arr[hole] = value;
	    }
	    return arr;
	   }

	

	 }