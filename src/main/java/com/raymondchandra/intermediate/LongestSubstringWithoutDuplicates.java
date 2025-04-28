/**
 * 
 
Given a string s, find the length of the longest substring 
that does not contain any repeating characters.

For example:
"aaaa" → The longest substring without repeating characters is "a", with length 1.
"abc" → The longest substring without repeating characters is "abc", with length 3.
"abacd" → The longest substring without repeating characters is "abacd", with length 4.
"abcdd" → The longest substring without repeating characters is "abcd", with length 4.

Write a function lengthOfLongestSubstring that returns an integer 
representing the length of the longest substring without repeating characters.
 * 
 */

package com.raymondchandra.intermediate;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {
	
	static int lengthOfLongestSubstring(String s) {
		// Set to store characters in the current window
        Set<Character> set = new LinkedHashSet<>();

        int maxLength = 0;
        int left = 0;  // Start of the sliding window

        // Loop through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {  	
        	
            // If the character already exists in the set, slide the window by removing characters from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            System.out.println("Left : " + left);
            System.out.println("Right : " + right);
            
            // Add the current character to the set
            set.add(s.charAt(right));
            System.out.println("Set : " + set);

            // Update maxLength if the current window is larger
            System.out.println("Range from right-to-left: " + (right - left + 1));
            
            maxLength = Math.max(maxLength, right - left + 1);
            System.out.println("Max : " + maxLength);
            System.out.println("");
        }

        return maxLength;
	}
	
	public static void main(String[] args) {
		
		// Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Find and print the length of the longest substring without repeating characters
        int length = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + length);
		
	}
}
