package com.raymondchandra.comparator.concepts;

import java.util.Arrays;

public class ComparatorConcepts {

	public static void main(String[] args) {
		String[] arr = {
			"A hello",	
			"B wayne",	
			"D trello",	
			"C lala"	
		};
		
		// -- Regular sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// -- Comparator sort: sort based on 2nd word
		Arrays.sort(arr, (name1, name2) -> {
			
			String lastWord1 = name1.split(" ")[1];
			String lastWord2 = name2.split(" ")[1];
			
			return lastWord1.compareTo(lastWord2); 
		});
		System.out.println(Arrays.toString(arr));
	}

}
