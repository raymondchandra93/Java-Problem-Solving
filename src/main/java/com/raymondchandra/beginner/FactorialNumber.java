package com.raymondchandra.beginner;

import java.util.Scanner;

public class FactorialNumber {
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: factorial of n is n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }
    
    public static int factorialWithout(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int number = scanner.nextInt();

        int fact = factorial(number);

        System.out.println("Factorial of " + number + " is: " + fact);

        scanner.close();
    }
}
