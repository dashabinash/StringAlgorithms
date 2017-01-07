package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

import java.util.*;
import java.util.Map.*;

/*
 * How to Print duplicate characters from String? (solution)
 Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V3FGhQpK
 */
public class DuplicateCharsOfString {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();

		DuplicateCharsOfString obj = new DuplicateCharsOfString();
		obj.findDuplicatesInString(input);
	}

	public void findDuplicatesInString(String input) throws Exception {

		char[] inputarr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		int sum = 0;
		int count1 = 0;

		if (input == null || input.equals(" ")) {
			throw new Exception("Invalid input.");
		} else {

			for (int index : inputarr) {
				System.out.println(Character.valueOf((char) index));
			}

			for (int i = 0; i < inputarr.length; i++) {
				Integer count = map.get(inputarr[i]);
				if (count == null) {
					if (inputarr[i] == ' ') {
						continue;
					}
					map.put(inputarr[i], 1);
				} else {
					map.put(inputarr[i], ++count);
				}
			}

			System.out.println("Key    value");
			for (Entry<Character, Integer> entry : entryset) {
				if (entry.getValue() > 0) {
					System.out.println(entry.getKey() + "-------->"
							+ entry.getValue());
					count1++;
					sum = sum + entry.getValue();
				}
			}

			if (sum == count1) {
				System.out.println("No duplicates elements .");
			} else {
				System.out.println("Duplicates elements are present .");
			}

		}
	}
}
