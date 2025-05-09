/*

You are given an integer array nums. 
This array contains n elements, where exactly n - 2 elements are special numbers. 
One of the remaining two elements is the sum of these special numbers, 
and the other is an outlier.
 
An outlier is defined as a number that is neither one of the original special numbers 
nor the element representing the sum of those numbers.
 
Note that special numbers, the sum element, 
and the outlier must have distinct indices, but may share the same value.
 
Return the largest potential outlier in nums.
 
Example 1:
Input: nums = [2,3,5,10]
Output: 10
Explanation:
The special numbers could be 2 and 3, thus making their sum 5 and the outlier 10.
 
Example 2:
Input: nums = [-2,-1,-3,-6,4]
Output: 4
Explanation:
The special numbers could be -2, -1, and -3, thus making their sum -6 and the outlier 4.
 
Example 3:
Input: nums = [1,1,1,1,1,5,5]
Output: 5
Explanation:
The special numbers could be 1, 1, 1, 1, and 1, thus making their sum 5 and the other 5 as the outlier.

*/
package com.raymondchandra.intermediate;

import java.util.HashMap;
import java.util.Map;

public class LargestOutlier {
	
	// - Time Complexity = 
	// - Space Complexity = O(n)
	
	public int getLargestOutlier(int[] nums) {
				
		// There are 3 category of numbers in here
		// 1 Outlier, 2 Sum of special nums, 3 Special num
		// All of Special num = Sum of special nums
		
		// Doing frequency map for each numbers
		Map<Integer, Integer> count = new HashMap<>();
		int total = 0, res = 0;
		
		for (int a : nums) {
            total += a;
            count.put(a, count.getOrDefault(a, 0)+1);
		}
		
		// Iterating thorough the nums, assuming a = sum of special numbers
		for (int a : nums) {
			// Outlier = total - sum special nums - special nums
			int outlier = total - a - a;
			
			// If this is the correct outlier, the frequency should be 1 or at least 1
			
			// (outlier == a ? 1 : 0) -> if let's say sum special nums = outlier
			// Then we check whether it is more than 1 
			if(count.getOrDefault(outlier, 0) > (outlier == a ? 1 : 0)) {
				
				// Result is Math.max from the current result and current outlier
				res = Math.max(res, outlier);
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
