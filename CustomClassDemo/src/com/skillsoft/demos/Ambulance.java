/*48917-Creating an Interface*/

package com.skillsoft.demos;

public class Ambulance implements emergencyVehicle {

	public static void main(String[] args){
		
	}
	
	@Override
	public void turnSirenOn() {
		System.out.println("Siren is ON! Wooooh!");
		
	}

	@Override
	public void turnSirenOff() {
		System.out.println("Siren is OFF");
		
	}

	@Override
	public void rushToScene() {
		System.out.println("Rushing to Sceen");
		
	}

}
