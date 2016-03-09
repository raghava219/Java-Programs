/*56662-Inheritance – Final Classes*/
/*56668-Inheritance – Separate Class Files*/

package FinalClassExample;

public class Employee {

	private String name;

	private double hourlyRate;
	
	public Employee(String name,double hourlyRate){
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
	public void setHourlySalary(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double pay(int hours){
		return getHourlyRate() * hours;
	}
	
	public String toString(){
		return this.getName() + ", " + this.getHourlyRate();
	}
}
