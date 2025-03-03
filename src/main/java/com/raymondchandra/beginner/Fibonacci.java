package com.raymondchandra.beginner;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void fibonacciWithout(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series using iteration:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int count = scanner.nextInt();

        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
