package com.raymondchandra.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetBacktracking {

	public static void findSubsets(int[] nums, List<Integer> path, int index) {
		if (index >= nums.length) {
			System.out.println(path);
			return;
		}
		
		// Forward
		path.add(nums[index]);
		
		// Include nums[index]
		findSubsets(nums, path, index + 1);
		
		// Backtrack
		path.remove(path.size() - 1); 

		// Exclude nums[index]
		findSubsets(nums, path, index + 1);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		findSubsets(nums, new ArrayList<>(), 0);
	}
}
