/*48915-Creating a Custom Class*/

package com.skillsoft.demos;

public class Vehicle {
	
	//Fields or Properties
	int NumberOfWheels;
	int weightInPounds;
	int lengthInInches;
	String color;
	Boolean doesItFly;
	int topSpeed;
	int currentSpeed;
	int heading;
	
	//Methods -- What it does
	public void accelerate()
	{
		System.out.println("The Vehicle is Accelerating");
		currentSpeed++;
	}
	
	public void deccelerate()
	{
		System.out.println("The Vehicle is Decelerating");
		currentSpeed--;
	}
	public void turnRight()
	{
		if(heading > 360)
		{
			heading = 0;
		}
		else
		{
			heading++;
		}
	}
	public void turnLeft()
	{
		if(heading < 0)
		{
			heading = 360;
		}
		else
		{
			heading--;
		}
	}
	
}