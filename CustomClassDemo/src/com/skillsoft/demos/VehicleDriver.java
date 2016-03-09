
package com.skillsoft.demos;

public class VehicleDriver {

	public static void main(String[] args) {
		
     Vehicle myCar = new Vehicle();
     myCar.NumberOfWheels = 4;
     myCar.color = "Maroon";
     myCar.currentSpeed = 0;
     myCar.doesItFly = false;
     myCar.weightInPounds = 3500;
     myCar.lengthInInches = 101;

     myCar.accelerate();
     myCar.accelerate();
     myCar.accelerate();
     myCar.accelerate();
     myCar.accelerate();
     
     System.out.println("My car is moving at "+ myCar.currentSpeed + " mph.");

     myCar.deccelerate();
     System.out.println("My car is moving at " + myCar.currentSpeed + " mph.");
     
     Car raceCar = new Car();
     raceCar.NumberOfWheels = 4;
     raceCar.numberOfDoors = 2;
     raceCar.blowHorn();     
	}

}
