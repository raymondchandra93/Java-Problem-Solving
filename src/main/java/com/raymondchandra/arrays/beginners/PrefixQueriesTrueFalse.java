/**
 * 
 * Given an integer array nums, an array queries where queries[i] = [x, y] 
 * and an integer limit, return a boolean array that represents the answer to each query. 
 * 
 * A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.
 * 
 * For example, given nums = [1, 6, 3, 2, 7, 2], 
 * queries = [[0, 3], [2, 5], [2, 4]], 
 * and limit = 13, the answer is [true, false, true]. 
 * 
 * For each query, the subarray sums are [12, 14, 12].
 * 
 */

package com.raymondchandra.arrays.beginners;

public class PrefixQueriesTrueFalse {
	public boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
	    int[] prefix = new int[nums.length];
	    prefix[0] = nums[0];

	    for (int i = 1; i < nums.length; i++) {
	        prefix[i] = prefix[i - 1] + nums[i];
	    }

	    boolean[] ans = new boolean[queries.length];
	    for (int i = 0; i < queries.length; i++) {
	        int x = queries[i][0], y = queries[i][1];
	        int curr = prefix[y] - prefix[x] + nums[x];
	        ans[i] = curr < limit;
	    }
	    
	    return ans;
	}
}
