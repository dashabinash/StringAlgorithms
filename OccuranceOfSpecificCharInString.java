package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

/*
 * How to count occurrence of a given character in String?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V32vWWJz
 */
public class OccuranceOfSpecificCharInString {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		System.out.println("Enter the char for searching :");
		String specchar = sc.next();

		OccuranceOfSpecificCharInString obj = new OccuranceOfSpecificCharInString();
		obj.countSpecificCharOccurance(input, specchar);
	}

	public void countSpecificCharOccurance(String input, String specchar)
			throws Exception {

		char[] inputarr = input.toCharArray();
		int count = 0;

		if (!input.contains(specchar)) {
			throw new Exception("Character does not exist .");
		} else {
			for (char c : inputarr) {
				if (String.valueOf(c).equals(specchar)) {
					count++;
				}
			}
		}

		System.out.println("Occurance of " + " " + specchar + " : " + count);
	}
}
