/*56662-Inheritance – Final Classes*/
/*56668-Inheritance – Separate Class Files*/


package FinalClassExample;


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
