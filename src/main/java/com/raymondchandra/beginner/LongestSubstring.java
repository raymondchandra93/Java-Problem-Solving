package com.raymondchandra.beginner;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int first = 0;
		int maxLength = 0;
		boolean[] symbol = new boolean[256];

		for (int last = 0; last < s.length(); last++) {
			char currentChar = s.charAt(last);

			while (symbol[currentChar]) {
				symbol[s.charAt(first)] = false;
				first++;
			}
			symbol[currentChar] = true;
			maxLength = Math.max(maxLength, last - first + 1);
		}
		return maxLength;

	}

	public static void main(String[] args) {
		String input = "abcabcdbbe";
		int result = lengthOfLongestSubstring(input);
		System.out.println("Output is: " + result);
	}

}
