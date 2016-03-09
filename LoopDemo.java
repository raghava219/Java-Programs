/*48910-While and Do While Loops */

public class LoopDemo{
	
	public static void main(String[] args){
		
		System.out.println("While Loop");
		System.out.println();
		int i = 0;
		while(i < 101){
			System.out.print(i + " ");
			i += 5;
		}
		
		System.out.println();
		System.out.println("Do While Loop ");
		System.out.println();
		/* Do While Loop */
		
		int x = 200;
		
		do{
			System.out.print(x + " ");
			x -= 10;
		} while(x > 0);
	
		System.out.println();
		System.out.println("One more do While Loop ");
		System.out.println();	
		
		do{
		   System.out.println(x +" ");
		   x -= 5; 	
		} while(x > 0);
		
	}
}