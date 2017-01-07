package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

/*
 * How to reverse words in a sentence without using library method?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V35JlX7s
 */
public class ReverseWordsInString {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();

		ReverseWordsInString obj = new ReverseWordsInString();
		obj.reverseString(input);

	}

	public void reverseString(String input) {

		String[] inputarr = input.split(" ");
		String output = "";
		String whitespace = " ";

		for (int i = inputarr.length - 1; i >= 0; i--) {
			output = output + inputarr[i]+ whitespace;
		}

		System.out.println("Output :" + output);
	}

}
