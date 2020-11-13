package com.nonaccess.demo;

/*Assignment:

A military base has 5 fighter air planes. A war call was made and all airplanes took off and only two returned successfully. 

Output of the program should be:

Total airplanes took off --> 5
Total airplanes returned --> 2
Total planes in Air --> 3

Hints:
Create an “Airplane” object which contains two behaviors takeOff and touchDown.
Create another object “Airport” which has properties totalTakeOffs and totalTouchDowns.

Main class (Military Base), Create multiple airplanes to takeOff and touchDown.*/

public class MilitaryBase {

	public static void main(String args[]) {
		
		//Airplane a take off
		Airplane a=new Airplane();
		a.takeOff();
		
		//Airplane b take off
		Airplane b=new Airplane();
		b.takeOff();
		
		//Airplane c take off
		Airplane c=new Airplane();
		c.takeOff();
		
		//Airplane d take off
		Airplane d=new Airplane();
		d.takeOff();
		
		//Airplane e take off
		Airplane e=new Airplane();
		e.takeOff();
		
		//Airplane a returned
		a.touchDown();
		
		//Airplane b returned
		b.touchDown();
		
		System.out.println("Total airplanes took off --> " + Airport.totalTakeOffs);
		System.out.println("Total airplanes returned --> " + Airport.totalTouchDowns);
		System.out.println("Total planes in Air --> "+ (Airport.totalTakeOffs - Airport.totalTouchDowns ));

	}
}
