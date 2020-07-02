package com.week1.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RepetitionOfCharacters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Type the input");
		String input = scn.nextLine();
		input = input.toLowerCase();
		Set<Character> inputCharacter = new LinkedHashSet<Character>();

		for (int i = 0; i < input.length(); i++) {
			inputCharacter.add(input.charAt(i));
		}
		List<Character> inputList = new ArrayList<Character>(inputCharacter);
		
		for (int j = 0; j < inputList.size(); j++) {
			int count = 0;
			for (int k = 0; k < input.length(); k++) {
				if (inputList.get(j) == input.charAt(k)) {
					count++;
				}
			}
			System.out.println("Occurence of letter " + inputList.get(j) + " is " + count);
		}
		scn.close();
	}
}
