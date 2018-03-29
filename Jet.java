/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program is a blueprint for a Jet. It was copied from "Lesson 3"
 *     of the class website.
 *     https://sites.google.com/a/ocsb.ca/teh-2017-ics4ur-1/unit-2/unit-2-06
 *
 ****************************************************************************/

public class Jet extends Airplane {
	
	public static final int MULTIPLIER = 2;
	
	public Jet() {
		super();
	}
	
	public void setSpeed(int speed) {
		super.setSpeed(speed * MULTIPLIER);
	}
	
	public void accelerate() {
		super.setSpeed(getSpeed() * 2);
	}
}