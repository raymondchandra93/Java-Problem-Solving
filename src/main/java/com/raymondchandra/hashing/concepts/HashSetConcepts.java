package com.raymondchandra.hashing.concepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcepts {
	public static void main(String[] args) {
		
		// -- Create
		HashSet<String> names = new HashSet<>();
		
		// -- Add
		names.add("A");
		names.add("B");
		names.add("C");
		
		// -- Remove
		names.remove("A");
		
		// -- Update
		names.remove("B");
		names.add("D");
		
		// -- Read
		System.out.println(names.isEmpty());
		System.out.println(names.contains("D"));
		
		// -- Read all
		for(String name: names) {
			System.out.println(name);
		}
	}
}
