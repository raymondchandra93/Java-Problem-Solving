/**
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * 
 * Input: nums = [3,0,1]
 * Output: 2
 * 
 * Explanation:
 * n = 3 since there are 3 numbers, 
 * so all numbers are in the range [0,3]. 
 * 2 is the missing number in the range since it does not appear in nums.
 * 
 */

package com.raymondchandra.hashing.exercises;

import java.util.HashSet;

public class MissingNumber {
	
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n+1) / 2;
        
        int total = 0;
        for (int i = 0; i < n; i++) {
			total += nums[i];
		}
        
        return sum-total;
    }
	
    public static void main(String[] args) {
    	int[] input = {3, 2, 1}; 
    	
    	System.out.println(missingNumber(input));
	}
}
