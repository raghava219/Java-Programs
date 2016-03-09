/*48913-Using the Java Array Object*/

public class ArrayDemo{
	
	public static void main(String[] args){
	 
     float[] gpas;
     //float gpas[]; <-- Also correct but less common

      gpas = new float[5];
      
	  gpas[0] = 3.17f;
      gpas[1] = 2.221f;
      gpas[2] = 3.75f;
      gpas[3] = 2.99f;
      gpas[4] = 3.891f;

      System.out.println("The first gpa is: "+ gpas[0]);

      for(int i=0; i< gpas.length; i++){
		   System.out.println(gpas[i]);
	  }	  
		
	}
}