package com.raymondchandra.beginner;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = reverseNumber(number);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}