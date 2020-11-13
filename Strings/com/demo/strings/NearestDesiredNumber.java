package com.demo.strings;

public class NearestDesiredNumber {

	//Creating a method to check the nearest desired number which does not contain the digit mentioned
	public static void nearestDesiredNumber( int N, int D) {

		for(int i=1;i<N;i++) {

			//Decrementing the value of given number to check for the nearest desired number in each iteration
			int L= N-i;

			//Converting the desired number and mentioned digit to string
			String l = Integer.toString(L);
			String d = Integer.toString(D);

			//Validating if the desired number contains the mentioned digit
			if((!l.contains(d))) {
				System.out.println(l);
				break;

			}
		}
	}

	public static void main(String args[]) {

		nearestDesiredNumber(123, 2);
		nearestDesiredNumber(4582, 5); 
		nearestDesiredNumber(98512, 5); 
		nearestDesiredNumber(548624, 8);
	}

}
