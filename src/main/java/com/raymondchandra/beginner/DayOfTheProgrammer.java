/**
Marie invented a Time Machine and wants to test it by time-traveling 
to visit Russia on the Day of the Programmer (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; 
Since 1919 they used the Gregorian calendar system. 

The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. 
This means that in 1918, February 14th was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days;
It has 29 days during a leap year, and 28 days during all other years. 

In the Julian calendar, leap years are:
- Divisible by 4; 

In the Gregorian calendar, leap years are either of the following:
- Divisible by 400.
- Divisible by 4 and not divisible by 100.

Given a year, y, find the date of the 256th day of that year according to the official Russian calendar during that year. 
Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .

Example Input = 1984
Sample Output = 12.09.1984

Explanation
1984 is divisible by 4, so it is a leap year. 
The 256th day of a leap year after 1918 is September 12
 */

package com.raymondchandra.beginner;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		
		// Input
		int year = 1918;
		int date = 0;
		
		// -- Transition Year
		if(year == 1918) {
			// find 256th day
			date = 256-31-15-31-30-31-30-31-31;
		
		// -- Leap Year for Julian & Gregorian
		} else if (
			((year > 1699 && year < 1918) && year%4 == 0) ||
			(year > 1918 && (year%400 == 0 || (year%4 == 0 && year%100 != 0)))
		) {
			// find 256th day
			date = 256-31-29-31-30-31-30-31-31;
		
		
		// -- Non-Leap Year for Julian & Gregorian
		} else {
			// find 256th day
			date = 256-31-28-31-30-31-30-31-31;
			
		}
		
		// Print out
		System.out.println(date + ".09." + year);
	}

}
