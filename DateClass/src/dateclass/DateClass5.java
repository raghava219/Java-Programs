/*56643_Java Field Access Control*/

//This code is modified for practice

package dateclass;

class Date5{
	
	private int month=0;
	private int day=0;
	private int year=0;
	private boolean incrementFlag = true;
	
	public Date5(){}
	
	public Date5(int month,int year){
		this.day = 0;
		this.month = month;
		this.year = year;
	}
	
	public Date5(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString(){
		return month + "/" + day + "/" + year;
	}
	

	public void setDay(int day){
		if(day > 30 || day >31){
			increment();
			incrementFlag = false;
		} else {
		    this.day = day;
		}
	}

	public int getDay(){
		return day;
	}
	
	
	public int getMonth(){
		return month;
	}
	
	public void setMonth(int month){
		if(incrementFlag){
		  this.month = month;
		}
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public void increment(){
		setMonth(++month);
		day = 1;
	}
	
	public boolean equals(Date5 dt){
		if(month == dt.month && day == dt.day && year == dt.year){
			return true;
		} else {
			return false;
		}
	}
	
}

public class DateClass5 {


	public static void main(String[] args) {

	     Date5 today = new Date5();

	     today.setMonth(6);
	     today.setDay(45);
	     today.setYear(2015);
	     
	     System.out.println(today);
		
	}

}
