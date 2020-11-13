package com.nonaccess.demo;

public class Airplane {

	public void takeOff() {

		Airport.totalTakeOffs = Airport.totalTakeOffs + 1;

	}

	public void touchDown() {

		Airport.totalTouchDowns = Airport.totalTouchDowns + 1;

	}

}
