/**
 * Given an array of integers nums and an integer target, 
 * return the indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input -> nums = [2, 7, 11, 15], target = 9
 * Output -> [0, 1]
 * 
 * HashMap = [2, 7, 11, 15]
 *         = [0, 1, -3, -6]
 * 
 * Example 2:
 * Input -> nums = [3, 2, 4], target = 6
 * Output -> [1, 2]
 */

package com.raymondchandra.intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	static int[] findTwoSum(int[] nums, int target) {
		
		Map<Integer, Integer> pairs = new HashMap<>();
		int[] ans = new int[2];
		
		// Iterate through the list
		for (int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			if(pairs.containsKey(complement)) {
				return new int[] {pairs.get(complement), i};
			}
			
			pairs.put(nums[i], i);
		}
		
		return new int[] {};
	}
	
	public static void main(String[] args) {
		
		int[] input = {2, 7, 11, 15};
		System.out.println( Arrays.toString(findTwoSum(input, 9)) );
		
		input = new int[]{3, 2, 4};
		System.out.println( Arrays.toString(findTwoSum(input, 6)) );
	}
}
