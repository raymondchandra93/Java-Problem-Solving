package com.raymondchandra.arrays.concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysConcept2 {

	public static void main(String[] args) {
		// -- Create
		String[] names1 = {"A", "C", "B", "D"};
		String[] names2 = new String[names1.length];
		String[] names3 = new String[names1.length];
		
		// -- Copy
		names3 = names1;								// doesn't copy, just refer to the same objects
		System.arraycopy(names1, 0, names2, 0, 4);		// copy the contents
		
		// -- Sort
		Arrays.sort(names1);
		
		// -- Read
		System.out.println(names1[0]);
		
		// -- Read all
		System.out.println(Arrays.toString(names1));
		
		for(String name : names2) {
			System.out.println(name);
		}
		
		System.out.println(Arrays.toString(names3));
	}

}
