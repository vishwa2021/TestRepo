package MethodOverload;

public class Student {

	int age;
	int grade;

	//-------------- Constructor without any parameters--------------
	Student() {
		System.out.println("This is Constructor with no parameters");
	}


	//-------------- Constructor with one parameter--------------------
	Student(int x) {
		age=x;
		System.out.println("\n"+"This is a Constructor with one parameters");
	}

	//-------------- Constructor with two parameters------------
	Student(int x,int y ) {
		age=x;
		grade=y;
		System.out.println("\n"+"This is a Constructor with two parameters");
	}


	public static void main(String args[]) {

		//-------- Creating an object without initializing any variables------
		Student Rahul= new Student();
		System.out.println(Rahul.age);
		System.out.println(Rahul.grade);

		//-------- Creating an object & initializing one variable------------

		Student Raj =new Student(5);
		System.out.println(Raj.age);
		System.out.println(Raj.grade);

		//-------- Creating an object & initializing two variables------------

		Student Ram =new Student(9,4);
		System.out.println(Ram.age);
		System.out.println(Ram.grade);
	}



}
