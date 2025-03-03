package com.raymondchandra.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongProblem {

    // Method to determine if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, digit = 0;

        originalNumber = number;
        
        // Find the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            digit++;
        }

        originalNumber = number;

        // 1st way - Calculate the sum of the nth powers of its digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digit);
            originalNumber /= 10;
        }

        // 2nd way - Calculate the sum of the nth powers of its digits
        
        
        // Check if the number is equal to the sum of the nth powers of its digits
        return result == number;
    }
    
    // Method to determine if a number is an Armstrong number
    public static boolean isArmstrong2(int number) {
        int originalNumber, remainder;

        String strNumber = Integer.toString(number);
        int digit = strNumber.length();
        System.out.println(digit);
        
        double result = 0;
        for(int i = 0 ; i < digit ; i++) {        	
        	int temp = Integer.parseInt( Character.toString(strNumber.charAt(i)) );
        	System.out.println(temp);
        	
        	result += Math.pow(temp, digit);
        	System.out.println(Math.pow(temp, digit));
        }
        
        return result == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong2(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
