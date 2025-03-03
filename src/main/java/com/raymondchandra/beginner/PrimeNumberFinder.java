package com.raymondchandra.beginner;

import java.util.ArrayList;

public class PrimeNumberFinder {
	public static void main(String[] args) {
		int number = 50;
		ArrayList<Integer> primeNumbers = new ArrayList<>();

		for (int i = 2; i < number; i++) {

			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}