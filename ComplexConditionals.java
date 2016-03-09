/*48908-Using Complex Conditionals*/

public class ComplexConditionals{

   public static void main(String[] args){
      
	  int age = 32;
	  
	  if(age < 18){
	      System.out.println("You are an Youngster");		  
	  } else if(age < 30){
	     System.out.println("You just started getting adult");
	  } else if(age < 40){
		  System.out.println("Focus on your career");
	  } else if(age < 50){
		  System.out.println("Start thinking about your retirement");
	  } else {
		  System.out.println("You are old");
	  }
   
   }

}