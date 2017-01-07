package com.dash.abinash.TwentyAlgorithimQuestionsOfString;

/*
 * How to count number of vowels and consonants in a String?
   Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4V304TWag
 */
public class VowelAndConsonantsCountInString {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();

		VowelAndConsonantsCountInString obj = new VowelAndConsonantsCountInString();
		obj.countVowelAndconsonants(input);
	}

	public void countVowelAndconsonants(String input) throws Exception {

		int vowelcount = 0;
		int consonantcount = 0;
		String allvowels = "aeiouAEIOU";
		String[] inputarr = input.split(" ");
		char[] wordarr;

		if(input == null || input.equals(" ")){
			throw new Exception("String is an null or empty string .");
		}
		else{
			for (int i = 0; i < inputarr.length; i++) {
				if (inputarr[i] == null || inputarr[i].equals(" ")) {
					continue;
				} else {
					System.out.println("-----------------------------");
					wordarr = inputarr[i].toCharArray();
					System.out.println("For word :" + " " + inputarr[i]);
					for (int j = 0; j < wordarr.length; j++) {
						if (allvowels.contains(String.valueOf(wordarr[j]))) {
							System.out.println("Vowel alphabet :" + " "
									+ wordarr[j]);
							vowelcount++;
						} else if (Character.isAlphabetic(wordarr[j])
								&& !allvowels.contains(String.valueOf(wordarr[j]))) {
							System.out.println("consonant alphabet :" + " "
									+ wordarr[j]);
							consonantcount++;
						}
						System.out.println("Vowel count :"+vowelcount);
						System.out.println("Consonant count :"+consonantcount);
					}
				}
				
			}
		}
	
		System.out.println("Vowel :" + vowelcount);
		System.out.println("Consonats :" + consonantcount);
	}

}
