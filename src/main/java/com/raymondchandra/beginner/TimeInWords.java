/**
Given the time in numerals we may convert it into words, as shown below:

5:00		// five o'clock
5:01		// one minute past five
5:10		// ten minutes past five
5:15		// quarter past five
5:28		// twenty eight minutes past five
5:30		// half past five
5:40		// twenty minutes to six
5:45		// quarter to six
5:47		// thirteen minutes to six

Minutes ->
At minutes = 0, use o' clock. 
For 1 <= minutes <= 30, use past
For 30 < minutes use to. 
Note the space between the apostrophe and clock in o' clock. 

Constraints ->
1 <= h <= 12
0 <= m < 60
*/

package com.raymondchandra.beginner;

public class TimeInWords {
	
	public static String timeToWords(int hour, int min) {
		
		String[] words = {
                "o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", 
                "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", 
                "twenty nine", "half"
        };
		
		// Min is 0 min
		if(min == 0) {
			return words[hour] + " " + words[0];
		
		// Min is 15 mins or 30 mins
		} else if (min == 15 || min == 30) {
			return words[min] + " past " + words[hour];
			
		// Min between 1 - 30 mins
		} else if (min >= 1 && min <= 30) {
			return words[min] + (min == 1 ? " minute " : " minutes ") + "past " + words[hour];
		
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(timeToWords(5, 0));
		System.out.println(timeToWords(5, 1));
		System.out.println(timeToWords(5, 10));
		System.out.println(timeToWords(5, 15));
		System.out.println(timeToWords(5, 30));
	}

}
