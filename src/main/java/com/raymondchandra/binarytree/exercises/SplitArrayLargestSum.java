/**
 * Given an array 'nums' which consists of non-negative integers
 * and an integer 'm', you can split the array into 'm'
 * non-empty continuous subarrays
 * 
 * Write the algorithm to minimize the largest sum
 * among these m subarrays
 * 
 * Inputs = [7, 2, 5, 10, 8], m = 2
 * Output = 18
 * 
 * Explanation
 * The best way is split into [7, 2, 5] and [10, 8]
 * Where the largest sum among these 2 subarrays is only 18
 */

package com.raymondchandra.binarytree.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitArrayLargestSum {
	
	private static boolean canSplit(List<Integer> nums, int m, int largest) {
		int numOfSubArr = 0;
		int currSum = 0;
		
		for (Integer integer : nums) {
			// Summing up number
			currSum += integer;
			
			// if the sum up number more than the largest/mid point
			// that means we can split them up
			if(currSum > largest) {
				// Increase the num of subArr
				numOfSubArr += 1;
				
				// Assigning currSum = integer because this is the beginning number
				// of the next subarray
				currSum = integer;
			}
		}
		
		System.out.println("Can Split: " + (numOfSubArr+1 <= m));
		return numOfSubArr+1 <= m;
	}
	
	private static void splitArray(List<Integer> nums, int m) {
		// Get the minimum and maximum possible outcomes
		// minimum = biggest number in that array
		// maximum = sum numbers in the array
		int l = Collections.max(nums);
		int r = 0;
		
		for (Integer integer : nums) {
			r += integer;
		}
		
		
		// Get the result. Assume result = r which is the sum numbers in the array
		int result = r;
		
		// Binary search
		while(l <= r) {
		
			// Get the middle value
			int mid = l + ((r-l) / 2);
			
			System.out.println("Right:" + r);
			System.out.println("Left:" + l);
			System.out.println("Middle:" + mid);
			
			// Call the canSplit method to check can we split them into 2 subarrays
			if(canSplit(nums, m, mid)) {
				result = mid;
				r = mid-1; 
			} else {
				l = mid+1;
			}
			
			System.out.println("Result:" + result);
		}
		
		// Print the result
		System.out.println("End Result: " + result);
	}
	
	public static void main(String[] args) {
		// splitArray(Arrays.asList(1, 2, 3, 4, 5), 2);
		splitArray(Arrays.asList(7, 2, 5, 10, 18), 3);
	}
	
}
