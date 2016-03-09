/*56644_Java Final Variables*/
/*56645_Java Getter Methods*/

package dateclass;


class Date6{
	
	private int month=0;
	private int day=0;
	private int year=0;
	private boolean incrementFlag = true;
	public final int Jan_Days = 31;
	public final int Feb_Days = 28;
	public final int Mar_Days;
	
	public Date6(){
		Mar_Days = 45; // This is work arround to set final variable.
	}
	
	public Date6(int month,int year){
		this.day = 0;
		this.month = month;
		this.year = year;
		Mar_Days = 45;
	}
	
	public Date6(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
		Mar_Days = 45;
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
	
	public boolean equals(Date6 dt){
		if(month == dt.month && day == dt.day && year == dt.year){
			return true;
		} else {
			return false;
		}
	}
	
}

public class DateClass6 {


	public static void main(String[] args) {

	     Date6 today = new Date6();

	     today.setMonth(6);
	     today.setDay(45);
	     today.setYear(2015);
	     
	     System.out.println(today);
		
	}

}
