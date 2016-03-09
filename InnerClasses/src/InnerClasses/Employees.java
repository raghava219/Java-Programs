package InnerClasses;


class Employee{
	
	private Name empName = null;
	private double pay = 0;
	
	public Employee(){
		
	}
	
	public Employee(String fname, String lname, int pay){
		this.empName = new Name(fname, lname);
		this.pay = pay;
	}
	
	@Override
	public String toString(){
		return empName.getName() + ", "+  this.pay;
	}
	
	
	class Name{
		
		private String fname = null;
		private String lname = null;
		
		public Name(String f, String l){
			this.fname = f;
			this.lname = l;
		}
		
		public String getName(){
			return fname +" "+ lname;
		}
		
		public String toString(){
			return fname +" "+ lname;
		}
		
	}
	
}


public class Employees {

	public static void main(String[] args){
	   
		Employee emp1 = new Employee("Dudi", "Raghava",35);
		
		System.out.println(emp1);
		
		Employee.Name name = new Employee().new Name("Dudi","Aishwarya");
		
		System.out.println(name);
	}
	
}
