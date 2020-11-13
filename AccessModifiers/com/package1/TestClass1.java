package com.package1;

//Created a Public class(full access)
public class TestClass1 {

	public static void main(String args[]) {

		//-----------------------------Print variables of Class 1---------------------------

		//Create an object for Class1
		Class1 obj= new Class1();

		//var1 is a public variable it can be accessed within any package
		System.out.println(obj.var1);

		//var2 is a default variable it can be accessed within the same package where it has been created
		System.out.println(obj.var2);

		//Since var3 is a private variable it's scope is within the class where it has been created,hence it cannot be used in another class.
		//System.out.println(obj.var3);



		//-----------------------------Print variables of Class 2---------------------------

		//Create an object for Class1
		Class2 obj2= new Class2();

		//a1 is a public variable it can be accessed within any package
		System.out.println(obj2.a1);

		//a2 is a default variable it can be accessed within the same package where it has been created
		System.out.println(obj2.a2);

		//Since a3 is a private variable it's scope is within the class it has been created,,hence it cannot be used in another class.
		//System.out.println(obj2.a3);

		//a4 is a protected variable it can be accessed within a package
		System.out.println(obj2.a4);		

	}

}
