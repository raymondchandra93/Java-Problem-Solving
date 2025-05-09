/**

Find the maximum sum of any contiguous subarray of size k from an array of integers.

Input: int[] nums = {2, 1, 5, 1, 3, 2}; int k = 3;
Output: 9
Explanation

We need to find the maximum sum of any contiguous subarray of size k = 3.
Subarrays of size 3:
[2, 1, 5] → sum = 8
[1, 5, 1] → sum = 7
[5, 1, 3] → sum = 9
[1, 3, 2] → sum = 6
The maximum sum is 9, from the subarray [5, 1, 3].

 */

package com.raymondchandra.arrays.beginners;

public class MaximumSubArray {
	
	private static int findMaxSumSubArray(int[] nums, int k) {
		
		// Getting the sum for each index
		int[] sum = new int[nums.length];
		for(int i=0; i< nums.length; i++) {
			
			// If i is not 0, do the sum, else it is just nums[i]
			if(i != 0) {
				sum[i] = nums[i] + sum[i-1];
			} else {
				sum[i] = nums[i];
			}
		}
		
		int maxSum = 0, windowSum = 0;
		for (int i = k-1; i < nums.length; i++) {
			if(i != k-1) {
				windowSum = sum[i] - sum[i - k];
			} else {
				windowSum = sum[i];
			}
			
			System.out.println("Windows Sum: " + windowSum);
            maxSum = Math.max(maxSum, windowSum);
        }
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 1, 5, 1, 3, 2};
		
		System.out.println(findMaxSumSubArray(nums, 3));
	}
}
