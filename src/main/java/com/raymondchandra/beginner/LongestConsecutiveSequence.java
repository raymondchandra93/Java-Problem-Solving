/**
 * Given an array of integers, find the length of the longest
 * consecutive sequence of the elements.
 * The sequence should consist of consecutive integers, but the
 * elements can appear in any order in the array
 * 
 * Input: arr = {3, 1, 2, 4, 100, 200}
 * Output: 4
 * Explanation: The longest consecutive sequence is {1, 2, 3, 4}, so the length is 4.
 * 
 * Input: arr = {10, 5, 12, 3, 55, 30, 4, 11, 2}
 * Output: 4
 * Explanation: The longest consecutive sequence is {2, 3, 4, 5}, so the length is 4.
 */

package com.raymondchandra.beginner;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	// -- More optimized O(n log n) --
	// Space Complexity: O(1) (since sorting is in-place, and no extra data structures are used).
//	public static void main(String[] args) {
//		int[] nums = {100, 4, 200, 1, 3, 2};
//		Arrays.sort(nums);
//		
//		System.out.println(Arrays.toString(nums));
//		
//		int length = 0;
//		int tempLength = 0;
//		
//		for(int i = 0; i < nums.length ; i++) {
//			tempLength = 1;
//			for(int j = i+1 ; j < nums.length ; j++) {
//				if(nums[j]-nums[j-1] == 1) {
//					tempLength++;
//				} else {
//					break;
//				}
//			}
//			
//			if(tempLength > length) {
//				length = tempLength;
//			}
//		}
//		
//		System.out.println(length);
//	}
	
	// -- More optimized O(n) --
	// The HashMap approach is faster (O(n)) but uses extra space (O(n)
	public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                // Check if left and right consecutive numbers exist
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int currentLength = left + right + 1;

                System.out.println(left);
                System.out.println(right);
                System.out.println(currentLength);
                
                // Store the sequence length for the current number
                map.put(num, currentLength);

                // Extend the sequence by updating the boundaries
                if (left > 0) map.put(num - left, currentLength);
                if (right > 0) map.put(num + right, currentLength);

                // Update maxLength if necessary
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums)); // Output: 4
    }

}
