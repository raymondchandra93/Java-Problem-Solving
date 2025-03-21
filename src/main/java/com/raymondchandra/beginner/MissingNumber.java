/**
  
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.

Input: nums = [3,0,1]
Output: 2

Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.
 
*/

package com.raymondchandra.beginner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 1 to n+1
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        System.out.println("Missing Number: " + findMissingNumber(arr)); // Output: 3
    }
}
