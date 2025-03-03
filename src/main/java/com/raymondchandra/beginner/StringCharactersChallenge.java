package com.raymondchandra.beginner;

import java.util.ArrayList;

public class StringCharactersChallenge {
	public static void main(String[] args) {
		String str = "aabbcccddeeff";
		String[] aStr = str.split("");

		ArrayList<String> aUni = new ArrayList<>();

		for (int i = 0; i < aStr.length - 1; i++) {

			String currentLetter = "";
			int counter = 0;

			for (int j = i + 1; j < aStr.length; j++) {
				if (aStr[i].equals(aStr[j]) && (i == 0 || !aStr[i].equals(aStr[i - 1]))) {
					counter++;
				}
			}

			for (int k = 0; k <= counter && counter > 0; k++) {
				currentLetter += aStr[i];
			}

			if (currentLetter != "") {
				aUni.add(currentLetter);
			}

		}
		
		System.out.println(aUni);
	}
}
