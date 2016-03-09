/*56662-Inheritance – Final Classes*/
/*56668-Inheritance – Separate Class Files*/


package FinalClassExample;

public final class Manager extends Employee{
	
	private boolean salaried;
	
	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}

	public Manager(String name,double hourlySalary, boolean salaried){
		super(name,hourlySalary);
		this.salaried = salaried;
	}
	
	@Override
	public String toString(){
		return "Name: " + super.getName() + "\n Pay" + super.getHourlyRate() 
				 + "\n Salaried" + this.isSalaried(); 
 	}
	
	public double pay(int hours){
		if(salaried){
			return super.getHourlyRate();
		} else {
			return super.getHourlyRate() * hours;
		}
	}
	

}
