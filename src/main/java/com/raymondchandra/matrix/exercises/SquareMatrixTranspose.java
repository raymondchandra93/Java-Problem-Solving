/**
 * 
Transpose a Square Matrix:
Write a Java program to find the transpose of a given N × N matrix.

Original Matrix:
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Transposed Matrix:
[1, 4, 7]
[2, 5, 8]
[3, 6, 9]
 * 
 */

package com.raymondchandra.matrix.exercises;

import java.util.Arrays;
import java.util.Iterator;

public class SquareMatrixTranspose {
	
	private static void transposeMatrix(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix[i].length; j++) {
				if(i == j) {
					continue;
				} else {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		printMatrix(matrix);
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}				
		};
		
		// Before
		System.out.println("Before --");
		printMatrix(matrix);
		
		// After
		System.out.println("After --");
		transposeMatrix(matrix);
	}
}
