package com.raymondchandra.beginner;

public class HariharanChallenge {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print(" ");

			}

			for (int j = i; j <= n; j++) {

				System.out.print("-");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(i + "- ");

			}

			for (int j = i; j <= n; j++) {

				System.out.print("-");

			}

			System.out.println();

		}
	}
}
