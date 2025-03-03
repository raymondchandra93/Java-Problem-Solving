package com.raymondchandra.beginner;
import java.util.HashSet;

public class PairSumProblem {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 3, 9};
        int targetSum = 10;

        boolean hasPair = hasPairWithSum(array, targetSum);

        if (hasPair) {
            System.out.println("There exist two elements with the sum " + targetSum);
        } else {
            System.out.println("No pair found with the sum " + targetSum);
        }
    }

    public static boolean hasPairWithSum(int[] array, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            int complement = targetSum - num;

            // Check if the complement is already in the set
            if (set.contains(complement)) {
                return true; // Pair found
            }

            // Add the current number to the set
            set.add(num);
        }

        return false; // No pair found
    }
}