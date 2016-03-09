/*56666-Inheritance – Protected Fields*/

// Protected Access modifier violates Encapsulation or Data Hiding.

package ProtectedExample;

class Employee{
	
	protected String name;
	protected double hourlyRate;
	
	public Employee(String name, double hourlyRate){
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double pay(int hours){
		return getHourlyRate() * hours;
	}
	
	@Override
	public String toString(){
		return getName() + ", " + getHourlyRate();
	}
	
}

class Manager extends Employee{
	
	private boolean salaried;
	
	public Manager(String n, double hourlyRate, boolean salaried){
		super(n,hourlyRate);
		this.salaried = salaried;
	}

	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}

	@Override
	public String toString(){
		return "Name: " + name + "\n Pay: " + hourlyRate 
				 + "\n Salaried: " + this.isSalaried(); 
	}
	
	@Override
	public double pay(int hours){
		if(this.salaried){
			return getHourlyRate();
		} else {
			return getHourlyRate() * hours;
		}
	}
	
	
}

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("raghava", 4000);
		
		Manager mgr1 = new Manager("Vikram",2500,true);
		
		Employee emp2 = mgr1;
		
	    System.out.println(emp2);   
		
	}

}
