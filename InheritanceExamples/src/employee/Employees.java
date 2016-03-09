/*56659-Composition Instead of Inheritance*/
// Lot of times Composition works better Inheritance.

package employee;

import java.util.Locale;


class Employee{

	protected String name;
	protected double hourlyRate;
	
	public Employee(String n,double r){
		this.name = n;
		this.hourlyRate = r;
	}
	
	protected String initials(){
		int pos = name.indexOf(" ");
		return name.substring(0,1) + name.substring(pos+1, pos+2);
	}
	
	@Override
	public String toString(){
		return this.name + ", " + this.hourlyRate;
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
		return hourlyRate * hours;
	}
	
}

class Manager{

	private Employee emp = null;
	private boolean salaried = false;
	
	public Manager(String name, double pay, boolean s){
		emp = new Employee(name,pay);
		salaried = s;
	}
	
	public double getPay(int hours){
		
		if(this.salaried){
			return emp.getHourlyRate();
		} else {
			return emp.getHourlyRate() * hours;
		}
	}
	
}

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Sridevi", 10.00);
		Manager mgr1 = new Manager("Raghava", 4000, true);
		System.out.println(emp1);
		System.out.println(mgr1);
		
		//System.out.println("Sridevi's Pay"+ emp1);
		
        for(Locale s: Locale.getAvailableLocales())
            System.out.println(s.getCountry() + " -- " + s.getLanguage());
        
		System.out.println(mgr1.getPay(0));

	}

}
