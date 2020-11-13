package MethodOverload;

public class Area {

	//------------------- Number of parameters----------------------------
	//Area of a Square
	public static void area(int a) {
		System.out.println("Area of a Square is " + (a*a));
	}

	//Area of a Rectangle
	public static void area(int a,int b) {
		System.out.println("Area of a Rectangle is " + (a*b));
	}

	
	//-------------------- Data type of parameters-------------------------

	//Area of a Cuboid
	public static void area(int a,int b,int c) {
		System.out.println("Area of a Cuboid in int dataype is " + (a*b*c));
	}

	//Area of a Cuboid
	public static void area(double a,double b,double c) {
		System.out.println("Area of a Cuboid in double datatype is " + (a*b*c));
	}

	//--------------------- Sequence of parameters--------------------------

	//Area of a Rectangle
	public static void area(int a,double b) {
		System.out.println("Area of a Rectangle is " + (a*b));
	}

	//Area of a Rectangle
	public static void area(double a,int b) {
		System.out.println("Area of a Rectangle is " + (a*b));
	}

	public static void main(String args[]) {

		area(8);
		area(7,7);
		
		area(2,2,2);
		area(2.1,2.1,2.1);
		
		area(2,2.1);
		area(2.1,2);

	}	
}


