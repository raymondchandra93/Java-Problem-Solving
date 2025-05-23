/**
 * 
 * 	A teacher asks the class to open their books to a page number. 
 * 	A student can either start turning pages from the front of the book or from the back of the book. 
 * 
 * 	They always turn pages one at a time. 
 * 	When they open the book, page 1 is always on the right side:
 
	When they flip page 1, they see pages 2 and 3. 
	Each page except the last page will always be printed on both sides. 
	
	The last page may only be printed on the front, given the length of the book. 
	If the book is n pages long, and a student wants to turn to page , 
	
	what is the minimum number of pages to turn? 
	They can start at the beginning or the end of the book. 
	 
	Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.
	 
	int n: the number of pages in the book
	int p: the page number to turn to
	 
	Example
	Input = n = 5, p = 3
	 
	Output = 1
 
 */

package com.raymondchandra.beginner;

public class FlippingPage {
	
	public static int calculatePagesFlip(int numberOfPages, int pageNumber) {
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculatePagesFlip(5, 3));
	}

}
