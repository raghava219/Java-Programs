/*56642_Java Classes – The toString() Method*/

package dateclass;

class Date4{
	
	int month;
	int day;
	int year;
	
	public Date4(int month,int year){
		this.day = 0;
		this.month = month;
		this.year = year;
	}
	
	public Date4(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString(){
		return month + "/" + day + "/" + year;
	}
}

public class DateClass4 {


	public static void main(String[] args) {

		Date4 date = new Date4(6,15,2015);
		System.out.println(date);
	}

}
