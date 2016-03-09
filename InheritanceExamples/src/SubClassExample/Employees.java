/*56661-Inheritance – Defining a Sub Class*/

package SubClassExample;

class Employee{
	
	private String name;
	
	private double hourlySalary;
	
	public Employee(String name, double hourlySalary){
		this.name = name;
		this.hourlySalary = hourlySalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlySalary() {
		return hourlySalary;
	}
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	public double pay(int hours){
		return this.getHourlySalary() * hours;
	}
	
}

class Manager extends Employee{
	
	private boolean salaried;
	
	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}

	public Manager(String name, double hourlySalary,boolean salaried){
		super(name, hourlySalary);
		this.salaried = salaried;
	}
	
	
}

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
