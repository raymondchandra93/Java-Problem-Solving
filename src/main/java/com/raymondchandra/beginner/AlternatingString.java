/**
 * 
 * Given a string, remove characters until the string is made up of any two alternating characters. 
 * When you choose a character to remove, all instances of that character must be removed. 
 * 
 * Determine the longest string possible that contains just two alternating letters.
 * 
 * Example
 * s = "abaacdabd"
 * 
 * Delete a, to leave bcdbd. 
 * 
 * Now, remove the character c to leave the valid string bdbd with a length of 4. 
 * Removing either b or d at any point would not result in a valid string. 
 * 
 * Return 4.
 * 
 * 1 Get all possible unique letters
 * 2 List possible 2 letters
 * 3 Remove all the letters that are not part of those 2 letters
 * 4 Check whether we have alternating substring or not
 * 5 Count the maximum substring's letter that we can possibly have
 * 
 */

package com.raymondchandra.beginner;

import java.util.HashSet;
import java.util.Set;

public class AlternatingString {
	private static int alternate(String s) {
		
		// 1 Get all possible unique letters
		Set<Character> uniqueC = new HashSet<>();
		for(char c : s.toCharArray()) {
			uniqueC.add(c);
		}
		System.out.println(uniqueC);
		
		// 2 List possible 2 letters
		String filteredString;
		for(char c1 : uniqueC) {
			for(char c2 : uniqueC) {
				if(c1 != c2) {
					System.out.println(Character.toString(c1) + Character.toString(c2));
					
					// 3 Remove all the letters that are not part of those 2 letters
					StringBuilder sb = new StringBuilder();
					for(char c : s.toCharArray()) {
						if(c == c1 || c == c2) {
							sb.append(c);
						}
					}
					
					filteredString = sb.toString();
					System.out.println(filteredString);
				}
			}
		}
		
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "abaacdabd";
		System.out.println(alternate(s));
	}


}
