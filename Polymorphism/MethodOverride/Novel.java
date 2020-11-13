package MethodOverride;

public class Novel extends Book {

	
	//Method to print a text in Child class
	void display() {
		System.out.println("This is a novel");
	}

	public static void main(String args[]) {
		
		//Create an object for derived class
		Novel n= new Novel();
		
		//Calling the method in derived class
		n.display();

	}
}