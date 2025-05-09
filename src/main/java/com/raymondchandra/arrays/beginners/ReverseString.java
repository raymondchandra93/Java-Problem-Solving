/**
 * 
 * Write a function that reverses a string. 
 * The input string is given as an array of characters s.
 * 
 * You must do this by modifying the input array 
 * in-place with O(1) extra memory.
 * 
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 */

package com.raymondchandra.arrays.beginners;

public class ReverseString {

	public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(java.util.Arrays.toString(s)); // Output: [o, l, l, e, h]
    }
}
