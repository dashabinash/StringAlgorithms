package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

/*
 * How to replace each given character to other e.g. blank with %20?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V35Yx6tj
 */
public class CharacterReplacementInString {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		System.out.println("Enter the String you want to replace : ");
		String replacestring = sc.next();

		CharacterReplacementInString obj = new CharacterReplacementInString();
		obj.replaceCharInString(input, replacestring);
	}

	public void replaceCharInString(String input, String replacestring) {

		String[] inputarr = input.split("");
		String output = "";

		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i].equals(" ")) {
				String replaceelement = inputarr[i].replace(" ", replacestring);
				output = output + replaceelement;
			} else {
				output = output + inputarr[i];
			}

		}
		System.out.println(output);

	}
}
