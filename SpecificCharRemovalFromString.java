package com.dash.abinash.TwentyAlgorithimQuestionsOfString;
/*
 * Write a program to remove a given characters from String?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V35Caw3u
 */
public class SpecificCharRemovalFromString {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		System.out.println("Enter the character to remove :");
		String c = sc.next();
		SpecificCharRemovalFromString obj = new SpecificCharRemovalFromString();
		obj.removeSpeccificChar(input, c);
	}

	public void removeSpeccificChar(String input, String character)
			throws Exception {

		String output = "";
		char inputarr[] = input.toCharArray();

		if (input == null || input.equals(" ")) {
			throw new Exception("Invaid input.");
		} else if (!input.contains(character)) {
			System.out.println("Character does not exist .");
		} else {
			for (char s : inputarr) {
				if (String.valueOf(s).equalsIgnoreCase(character)) {
					continue;
				}
				output = output + s;
			}
			System.out.println(output);

		}

	}

}
