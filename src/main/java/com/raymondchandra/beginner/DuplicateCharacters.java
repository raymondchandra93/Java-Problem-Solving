package com.raymondchandra.beginner;

import java.util.ArrayList;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String name = "Hello there!";
		char[] letters = name.toLowerCase().toCharArray();
		String dupl = ""; 
		
		for(int i = 0 ; i < letters.length ; i++) {
			for(int j = i+1 ; j < letters.length ; j++) {				
				if(letters[i] == letters[j]) {
					dupl += letters[i];
					break;
				}
			}
		}
		
		System.out.println(dupl);
	}
}
