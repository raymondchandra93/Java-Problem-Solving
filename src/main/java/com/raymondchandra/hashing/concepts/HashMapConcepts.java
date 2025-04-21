package com.raymondchandra.hashing.concepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {
	public static void main(String[] args) {
		
		// -- Create
		HashMap<Integer, String> employees = new HashMap<>();
		
		// -- Add
		employees.put(1, "A");
		employees.put(2, "B");
		employees.put(3, "C");
		
		// -- Delete
		employees.remove(1);
		
		// -- Update
		employees.put(2, "D");
		employees.put(1, employees.getOrDefault(1, "AA"));
		
		// -- Read one
		System.out.println(employees.get(1));
		
		// -- Read all
		for(Map.Entry<Integer, String> emp : employees.entrySet()) {
			System.out.println(emp.getKey());
			System.out.println(emp.getValue());
		}
	}
}
