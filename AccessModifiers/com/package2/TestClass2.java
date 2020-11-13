package com.package2;

import com.package1.Class2;

//TestClass2 inheriting Class2
public class TestClass2 extends Class2 {

	public static void main(String args[]) {
		
 
	//-----------------------------Print variables of Class 1---------------------------

		//Create an object for Class1,we cannot achieve this since it is a default class and it's scope is within a package
		//Class1 obj3= new Class1();

//		System.out.println(obj3.var1);
//		System.out.println(obj3.var2);
//		System.out.println(obj3.var3);

	//-----------------------------Print variables of Class 2---------------------------
	
		//Create an object for Class2
		TestClass2 obj4= new TestClass2();

		//Public variable can be accessed in other packages
		System.out.println(obj4.a1);
		
		//Default variables cannot be accessed outside the package
		//System.out.println(obj4.a2);
		
		//Private variables cannot be accessed outside the class and in other packages.
		//System.out.println(obj4.a3);
		
		//Protected variables can be accessed in other packages only through inheritance
		System.out.println(obj4.a4);		


	}

}
