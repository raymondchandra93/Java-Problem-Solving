/*
Given the time in numerals we may convert it into words, as shown below:
 
5:00		// five o'clock
5:01		// one minute past five
5:10		// ten minutes past five
5:15		// quarter past five
5:28		// twenty eight minutes past five
5:30		// half past five
5:31		// twenty nine minutes to six
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

public class TimeInWords2 {
	
	public static String convertTime(String time) {
		
		String[] strTime = time.split(":");
		int hour = Integer.parseInt(strTime[0]);
		int minute = Integer.parseInt(strTime[1]);
		
		String[] words = {"o' clock", "one", "two"};
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(convertTime("5:00"));
	}

}
