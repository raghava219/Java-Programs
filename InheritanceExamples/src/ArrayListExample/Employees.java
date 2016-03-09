/*56669-Inheritance – Storing Objects in ArrayList*/


package ArrayListExample;

import java.util.ArrayList;
import java.util.List;


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
	
}

class Manager extends Employee{

	private boolean salaried = false;
	
	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}

	public Manager(String name, double pay, boolean s){
		super(name,pay);
		salaried = s;
	}
	
	public double getPay(int hours){
		
		if(this.salaried){
			return getHourlyRate();
		} else {
			return getHourlyRate() * hours;
		}
	}
	
	@Override
	public String toString(){
		return "Name: " + super.getName() + "\n Pay: " + super.getHourlyRate() 
				 + "\n Salaried: " + this.isSalaried(); 
 	}
	
}

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Anuradha",5999);
		Employee emp2 = new Employee("Anvesh",3888);
		Manager mgr1 = new Manager("Raghava", 4000, true);
		Manager mgr2 = new Manager("Sridevi",9999,true);
	
		List<Employee> al = new ArrayList();
		
		al.add(emp1);
		al.add(emp2);
		al.add(mgr1);
		al.add(mgr2);
		
		for(Employee emp: al){
			System.out.println(emp);
			System.out.println();
		}
			
         		
		System.out.println(mgr1.getPay(0));

	}

}
