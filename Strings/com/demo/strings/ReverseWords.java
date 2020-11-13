package com.demo.strings;

public class ReverseWords {

	public static void main(String args[]) {

		String input = "Success is not forever and Failure is not fatal";

		//Splitting the string based on white spaces
		String[] a = input.split(" ");

		//Creating a new string array with the same length as input array
		String[] b = new String[a.length];


		//Initializing the string as an empty string instead of null
		for(int k=0; k< b.length;k++) {

			b[k] = "";

		}

		//Converting each string array element to char array and storing in new array in reverse order
		for(int i=0;i<a.length;i++) {

			char[] c= a[i].toCharArray();

			for(int j = c.length-1; j>=0;j--) {

				b[i] = b[i] + c[j]; 

			}
		}

		//Printing the value of input array
		System.out.println(input);


		//Printing the values of output array
		for(int j=0; j<a.length;j++) {

			System.out.print(b[j] + " ");
		}
	}
}