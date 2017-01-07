package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

/*
 * How to check if a String contains only digits?  (solution)
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V3QAx7CX
 */
public class StringContainingDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();

		StringContainingDigits obj = new StringContainingDigits();
		obj.isOnlyDigits(input);
	}

	public void isOnlyDigits(String input) {

		char[] inputarr = input.toCharArray();
		String series = "0123456789";

		int count1 = 0;

		for (int i = 0; i < inputarr.length; i++) {
			if (!series.contains(String.valueOf(inputarr[i]))) {
				break;
			} else {
				count1++;
			}
		}

		if (count1 == inputarr.length) {
			System.out.println("It's a pure digit number .");
		} else {
			System.out.println("Not a pure digit number .");
		}

	}
}
