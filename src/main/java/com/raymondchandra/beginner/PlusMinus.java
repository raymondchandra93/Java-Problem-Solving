/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
 * Print the decimal value of each fraction on a new line with places after the decimal.
 * 
 * Note: This challenge introduces precision problems. 
 * The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 * 
 * Example Input: [1, 1, 0, -1, -1]
 * Example Output:
 * 
 * Length = 5
 * There are 2 positives
 * There are 2 negatives
 * There are 1 zeroes
 * 
 * Positive = 0.400000
 * Negative = 0.400000
 * Zero = 0.200000
 * 
 */

package com.raymondchandra.beginner;

import java.util.Iterator;

public class PlusMinus {
	public static void main(String[] args) {
		
		// Create an array of int
		int[] arr = {1, 1, 0, -1, -1};
		
		// Numbers of elements in the array
		int len = arr.length;
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int i = 0; i < len; i++) {
			
			// Use conditional to classify
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		
		System.out.println("Length: " + len);
		System.out.println("Positive: " + positive);
		System.out.println("Negative: " + negative);
		System.out.println("Zero: " + zero);
		
		double positiveRatio = (double) positive/len;
		double negativeRatio = (double) negative/len;
		double zeroRatio = (double) zero/len;
		
		// % = float, .6f = digits of the decimal, \n = new line
		System.out.printf("%.6f\n", positiveRatio);
		System.out.printf("%.6f\n", negativeRatio);
		System.out.printf("%.6f\n", zeroRatio);
	}
}
