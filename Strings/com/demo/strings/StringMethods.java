package com.demo.strings;
public class StringMethods {

	static String str = "What We think, We Become!";

	public static void main(String args[]) {

		//Converts the string to Lower case
		System.out.println(str.toLowerCase());

		//Converts the string to Upper case
		System.out.println(str.toUpperCase()); 

		//Converts the string to a character array
		System.out.println(str.toCharArray()); 

		//Gets the 13th character in the string when calculated including the white spaces.
		System.out.println(str.charAt(13)); 

		//Appends the string arguments with the calling string 
		System.out.println(str.concat(" - Buddha")); 
 
		//Verifies whether the string contains the character mentioned in the arguments
		System.out.println(str.contains(",")); 

		//Verifies whether the string ends with the character mentioned in the arguments
		System.out.println(str.endsWith("!")); 

		//Verifies whether the string starts with the word mentioned in the arguments
		System.out.println(str.startsWith("What")); 

		//Returns the index of the first letter of the word mentioned
		System.out.println(str.indexOf("We")); 

		//Returns the index of first occurrence of character in the given string after the specified index - fromIndex
		System.out.println(str.indexOf("We", 7));

		//Returns the position of the last occurrence of the character in string.
		System.out.println(str.lastIndexOf("We"));

		//Returns the length of the string
		System.out.println(str.length());

		//Replaces all the occurrences of word with the second argument
		System.out.println(str.replace("We", "I"));

		//Replaces the first occurrence of word with the second argument
		System.out.println(str.replaceFirst("We", "I"));

		//Creates the substring starting after the character from index-5
		System.out.println(str.substring(5));

		//Creates the substring starting after the character from index 5 to index 7
		System.out.println(str.substring(5, 7));

		//Divides the strings based on the character symbol substrings, puts these substrings into an array
		System.out.println(str.split(","));

		//Returns the index[0] element of the string which has been split
		System.out.println(str.split(",")[0]);

		//Returns the index[1] element of the string which has been split
		System.out.println(str.split(",")[1]);
	}
}
