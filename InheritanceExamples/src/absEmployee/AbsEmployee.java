/*56658-Inheritance – Abstract Classes*/

package absEmployee;

abstract class Employee{
	
	private String name;
	private double payRate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public Employee(String n,double p){
		this.name = n;
		this.payRate = p;
	}
	
	public abstract double pay(int hours);
	
}

class HourlyEmployee extends Employee{
	
	public HourlyEmployee(String name, double pay){
		super(name,pay);
	}
	
	@Override
	public double pay(int hours){
		return  getPayRate() * hours;
	}
	
}

public class AbsEmployee {

	
	public static void main(String[] args) {
		
		HourlyEmployee emp1 = new HourlyEmployee("Raghava",25000);
		
		System.out.println(emp1.pay(40));

		//Employee is abstract class, it cannot be instantiated.
		
		//Employee emp2 = new Employee("xafd",1231);
	}

}
