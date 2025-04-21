package com.raymondchandra.arrays.concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysConcept {

	public static void main(String[] args) {
		// -- Create
		int[] nums1 = new int[3];
		int[] nums2 = {1, 2, 3};
		
		System.arraycopy(nums2, 0, nums1, 0, 2);
		
		// -- Add
		nums1[2] = 4;
		
		// -- Remove
		nums2[2] = 0;
		
		// -- Read
		System.out.println(nums1[0]);
		
		// -- Read all
		System.out.println(Arrays.toString(nums1));
		for(int i : nums2) {
			System.out.println(i);
		}
	}

}
