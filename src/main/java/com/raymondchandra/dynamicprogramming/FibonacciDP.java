/**
 * Fibonacci is a patter where the number is the result from 2 previous numbers
 * 
 * Example
 * Input = 5
 * Output = 5
 * Explanation = if it is 5, then the pattern will be 0 1 1 2 3 5
 */

package com.raymondchandra.dynamicprogramming;

import java.util.Arrays;

public class FibonacciDP {
	
	// Regular recursion
	static int calculateFibonacci(int num) {
		System.out.println("Recursion method is called");
		if(num <= 1) {
			return num;
		}
		
		return calculateFibonacci(num-1) + calculateFibonacci(num-2);
	}
	
	// Dynamic Programming
	static int calculateFibonacciDP(int num, int memo[]) {
		System.out.println("DP method is called");
		if(num <= 1) {
			return num;
		}
		
		if(memo[num] != -1) {
			return memo[num];
		}
		
		memo[num] = calculateFibonacciDP(num-1, memo) + calculateFibonacciDP(num-2, memo);
		return memo[num];
	}
	
	static int callDP(int num) {
		// Create an array as much as num+1 and fill with -1 as placeholder
		int[] memo = new int[num+1];
		Arrays.fill(memo, -1);
		
		return calculateFibonacciDP(num, memo);
	}
	
	public static void main(String[] args) {
		System.out.println(calculateFibonacci(6));
		
		System.out.println(callDP(6));
	}
}
