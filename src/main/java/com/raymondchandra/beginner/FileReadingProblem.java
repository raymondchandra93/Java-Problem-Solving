package com.raymondchandra.beginner;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReadingProblem {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream inputStream = FileReadingProblem.class.getClassLoader().getResourceAsStream("FullNamesDesktop.txt");
		Scanner scanner = new Scanner(new InputStreamReader(inputStream));

		// Make a longest String
		String longestName = "";

		while (scanner.hasNextLine()) {
			String[] fullName = scanner.nextLine().split(" ");

			System.out.println(fullName[0]);
			System.out.println(fullName[1]);

			// Find the Longest Name
			if ((fullName[0] + fullName[1]).length() > longestName.length()) {
				longestName = fullName[0] + " " + fullName[1];
			}

			// Open FileWriter in append mode
			FileWriter writer = new FileWriter("firstNames.txt", true);
			String newString = fullName[0].substring(0, 1).toUpperCase() + fullName[0].substring(1).toLowerCase();

			writer.write(newString + "\n");

			FileWriter writer2 = new FileWriter("lastNames.txt", true);
			String newString2 = fullName[1].substring(0, 1).toUpperCase() + fullName[1].substring(1).toLowerCase();

			writer2.write(newString2 + "\n");
			
			// Closing resources
			writer.close();
			writer2.close();
		}

		// Print longestName
		System.out.println("Longest Name: " + longestName);

		// Closing resources
		scanner.close();
	}
}
