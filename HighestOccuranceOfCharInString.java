package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/*
 * How  to return highest occurred character in a String?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V350f2Ei
 */
public class HighestOccuranceOfCharInString {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.next();
		HighestOccuranceOfCharInString obj = new HighestOccuranceOfCharInString();
		obj.getHighestOccurance(input);
	}

	public void getHighestOccurance(String input) {

		int temp = 0;
		char c = ' ';
		char[] inputarr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Entry<Character, Integer>> entryset = map.entrySet();
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
				if (temp < entry.getValue()) {
					temp = entry.getValue();
				}
			}
			entry.setValue(temp);
			c = entry.getKey();
		}
		System.out.println("Highest occurance character :" + " " + c);

	}
}
