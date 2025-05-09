/**
 * 
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * 
 * Given a string sentence containing only lowercase English letters, 
 * return true if sentence is a pangram, or false otherwise.
 * 
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * 
 */

package com.raymondchandra.hashing.exercises;

import java.util.HashSet;

public class Pangram {
	public static boolean checkIfPangram(String sentence) {
        HashSet<Character> chars = new HashSet<>();

        for(char c : sentence.toCharArray()) {
        	chars.add(c);
        }
        
        if(chars.size() == 26) {
        	return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    	System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    	System.out.println(checkIfPangram("leetcode"));
    }
}
