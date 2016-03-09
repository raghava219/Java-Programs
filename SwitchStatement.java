/*48909-Using Java’s Switch Statement*/

public class SwitchStatement{
 
     public static void main(String[] args){
	  
	     char taxClass = 'c';
		 float taxRate;
		 float salary = 44000.00f;
		 float taxDue;
		 
		 switch(taxClass){
		    case 'a':
			   taxRate = .10f;
			   break;
			case 'b':
			   taxRate = .075f;
			   break;
			case 'c':
			   taxRate = .055f;
			   break;
			case 'd':
			   taxRate = .0375f;
			   break;
			default:
			   taxRate = .015f;
		 }	   
			taxDue = salary * taxRate;
            System.out.println("You owe "+taxDue+" in taxes");			 	  
	 }

}