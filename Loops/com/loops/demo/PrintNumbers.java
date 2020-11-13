package com.loops.demo;

public class PrintNumbers {


	public static void main(String args[]) {

		//For loop for iterating from numbers 1 to 100
		for(int i=1;i<=100;i++) {

			//If the number is a multiple of 3 prints "Rama"
			if(i%3==0 && i%5==0) {
				System.out.println("HareHare");
			}

			//If the number is a multiple of 5 prints "Krishna"
			else if(i%3==0) {
				System.out.println("Rama");
			}

			//If the number is a multiple of both 3 and 5 prints "HareHare"
			else if(i%5==0) {
				System.out.println("Krishna");
			}

			//If the number is not a multiple of 3 or 5 ,then prints the number itself
			else {
				System.out.println(i);
			}

		}

	}

}
