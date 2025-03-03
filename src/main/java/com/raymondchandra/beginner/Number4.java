package com.raymondchandra.beginner;


public class Number4 {

	public static void main(String[] args) {
		int number = 5;
		
		for(int i = 0 ; i < number ; i++) {
			// ---
			for(int j = i+1 ; j < number ; j++) {
				System.out.print("- ");
			}
			
			// Number
			for(int j = 0 ; j <= i ; j++) {
				if(j == i) {
					System.out.print(i+1 + " ");
				} else {
					System.out.print(i+1 + " - ");					
				}
			}
			
			// ----
			for(int j = i+1 ; j < number ; j++) {
				System.out.print("- ");
			}
			
			System.out.println();
		}
	}

}
