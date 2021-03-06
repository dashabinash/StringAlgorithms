package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * How to program to print first non repeated character from String?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V35li3iG
 */
public class FirstNonrepeatedCharInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();

		FirstNonrepeatedCharInString obj = new FirstNonrepeatedCharInString();
		obj.findFirstNonRepetedChar(input);
	}

	public void findFirstNonRepetedChar(String input) {

		
		List<Integer> list = new ArrayList<Integer>();
		char[] inputarr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Entry<Character, Integer>> entryset = map.entrySet();

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
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + "-------->"
						+ entry.getValue());
				list.add(input.indexOf(entry.getKey()));
			}

		}

		char firstoccur = input.charAt(Collections.min(list));
		System.out.println(firstoccur);
	}
}
