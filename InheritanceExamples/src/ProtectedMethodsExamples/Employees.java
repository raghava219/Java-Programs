/*56667-Inheritance – Protected Methods*/

package ProtectedMethodsExamples;

class Employee{
	
	private String name;
	private double hourlyRate;
	
	public Employee(String n, double rate){
		this.name = n;
		this.hourlyRate = rate;
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
	
	protected String initial(){
		int pos = name.indexOf(" ");
		return name.substring(0,1) + name.substring(pos+1,pos+2);
	}
	
	@Override
	public String toString(){
		return getName() + ", " + getHourlyRate();
	}
	
	public double pay(int hours){
		return getHourlyRate() * hours;
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
		return "Initils: " + initial() + "\n Pay: " + getHourlyRate() 
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

		Employee emp1 = new Manager("DV Raghava",1200,true);
		
		System.out.println(emp1);
		
	}

}
