/**
The Tower of Hanoi is a classic mathematical puzzle consisting of
three rods and n disks of different sizes. 

The disks are initially stacked on one rod in decreasing size from bottom to top. 
The objective is to move all the disks to another rod, following these rules:

1. Only one disk can be moved at a time.
2. A disk can only be placed on top of a larger disk or an empty rod.
3. No disk may be placed on a smaller disk.

Problem Statement:
You are given a Tower of Hanoi setup with 4 disks.
1. What is the minimum number of moves required to solve the problem?
2. Describe the recursive process to solve the Tower of Hanoi with 4 disks.
3. Generalize the formula to find the minimum number of moves required for n disks.
 */

package com.raymondchandra.intermediate;

public class TowerOfHanoi {
	 // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary using destination
        solveHanoi(n - 1, source, destination, auxiliary);
        
        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move n-1 disks from auxiliary to destination using source
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    // Function to calculate minimum number of moves required
    public static int getMinMoves(int n) {
        return (int) Math.pow(2, n) - 1;
    }

    public static void main(String[] args) {
        int n = 3; // Change this value to test with different numbers of disks
        
        System.out.println("Minimum number of moves required: " + getMinMoves(n));
        System.out.println("Steps to solve the Tower of Hanoi with " + n + " disks:");
        
        solveHanoi(n, 'A', 'B', 'C'); // A is source, B is auxiliary, C is destination
    }
}
