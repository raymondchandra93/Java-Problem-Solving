/**
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.


Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

*/

package com.raymondchandra.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		// To contain the answers
		List<List<String>> answers = new ArrayList<>();

		// To track locations of the string
		Map<String, Integer> tracks = new HashMap<>();

		// Make a copy of sorted array
		String[] sortedStrs = Arrays.copyOf(strs, strs.length);

		// Sort them one by one
		for (int i = 0; i < sortedStrs.length; i++) {
			// Sort the word
			char[] chars = sortedStrs[i].toCharArray();
			Arrays.sort(chars);
			sortedStrs[i] = new String(chars);

			// Get if this sorted word has been part of Hashmap or not
			int arrLIndex = tracks.getOrDefault(sortedStrs[i], -1);

			// If not,
			if (arrLIndex == -1) {
				// Add the index of the arrayList in HashMap
				tracks.put(sortedStrs[i], answers.size());

				// Add the answers a new ArrayList with unsorted String
				answers.add(new ArrayList<String>(Arrays.asList(strs[i])));
			
			// If yes, just add the unsorted string to the arrayList
			} else {
				answers.get(arrLIndex).add(strs[i]);
			}
		}

		return answers;
	}
}
