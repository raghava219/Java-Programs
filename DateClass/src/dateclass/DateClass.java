/*56639-Java Classes – Creating Fields*/

package dateclass;

class Date{
	
	int month;
	int day;
	int year;
}


public class DateClass {

	public static void main(String[] args) {

		Date obj = new Date();
		
		obj.month = 6;
		obj.day = 14;
		obj.year = 2015;
		
		System.out.println("Today the date is "+ obj.month +"/"+ obj.day +
				"/"+ obj.year);
		
	}

}
