/*56641_Java Classes – Implementing the equals() Method*/
package dateclass;

class Date3{
	
	int month;
	int day;
	int year;
	
	public Date3(int m,int d,int y)
	{
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public String toString()
	{
		return month + "/" + day + "/" + year;
	}
	
	public void increment()
	{
		++day;
		if(day > 30){
			++month;
			day = 1;
		}
	}
	
	public boolean equals(Date3 dt)
	{
		if(month == dt.month && day == dt.day && year == dt.year)
		{
			return true;
		} else
		{
			return false;
		}
	}
	
}

public class DateClass3 {
	
	public static void main(String[] args) 
	{
		Date3 today = new Date3(7,17,2013);
		Date3 tomorrow = new Date3(7,18,2013);
		
		if(today.equals(tomorrow))
		{
			System.out.println("Both are Same days");
		} 
		else 
		{
		    System.out.println("Both are not Same days");	
		}
	}

}
