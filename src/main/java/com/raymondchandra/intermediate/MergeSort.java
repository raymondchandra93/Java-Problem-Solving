package com.raymondchandra.intermediate;

import java.util.Arrays;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int left, int right) {
		while(right > left) {
			int middle = left + (right-left) / 2;
			
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			
			int[] newArr = organize(arr, left, middle+1, right);
		}
	}
	
	private static int[] organize(int[] arr, int left, int middle, int right) {
		
		int[] newArr = new int[right-left+1];
		int i = 0;
		
		int l = left;
		int r = middle;
		
		while(l < middle || r < right) {
			if(arr[left] > arr[middle]) {
				newArr[i] = arr[r];
				r++;
				
			} else {
				newArr[i] = arr[l];
				l++;
				
			}
		}
		
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 5, 4, 6};
		
		System.out.println("-- Before --");
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("-- After --");
		System.out.println(Arrays.toString(arr));
	}

}
