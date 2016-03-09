/*56640_Java Classes – Creating Methods*/

package dateclass;

class Date1{
	
	int month;
	int day;
	int year;
	
	public Date1(int m,int d,int y){
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public String toString(){
		return month + "/" + day + "/" + year;
	}
	
	public void increment(){
		++day;
		if(day > 30){
			++month;
			day = 1;
		}
	}
	
}

public class DateClass2 {
	
	public static void main(String[] args) {

		Date1 today = new Date1(7,17,2013);
		
		for(int i=1;i <= 20;i++){
			today.increment();
			System.out.println(today);			
		}


	}

}
