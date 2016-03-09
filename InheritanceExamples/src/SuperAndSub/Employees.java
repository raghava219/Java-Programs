/*56660-Inheritance – Creating Super and Sub Class Objects*/

package SuperAndSub;


class Employee{
	
	private String name;
	
	private double hourlyRate;
	
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
	
    public String intial(){
    	int pos = name.indexOf(" ");
    	return name.substring(0,1) + name.substring(pos+1,pos+2);
    }
    
    public String toString(){
    	return this.name + ", " + this.getHourlyRate();
    }
    
    public double pay(int hours){
    	return hourlyRate * hours;
    }
	
}

class Manager extends Employee{
	
	private boolean salaried = false;
	
	public Manager(String name,double pay,boolean s){
		super(name,pay);
		this.salaried = s;
	}

	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}
	
	@Override
	public String toString(){
		return "Name: " + this.getName() + "\n Pay" + this.getHourlyRate() 
				 + "\n Salaried" + this.isSalaried(); 
 	}
	
	public double pay(int hours){
		if(salaried){
			return getHourlyRate();
		} else {
			return getHourlyRate() * hours;
		}
	}
	
}

public class Employees {

	public static void main(String[] args){
	
		Employee emp1 = new Employee("Raghava", 10.00);
		
		Manager mgr1 = new Manager("Vikram", 2000, true);
		
		System.out.println(emp1);
		
		System.out.println(mgr1);	
		
		System.out.println("Viksa pay "+ emp1.pay(40));
		
		System.out.println("Raju Pay "+mgr1.pay(0));
		
	}
	
}
