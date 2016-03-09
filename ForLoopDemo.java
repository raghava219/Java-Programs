/*48911-For Loops*/

public class ForLoopDemo{
	
	public static void main(String[] args){
		
		for(int i = 500; i > 0; i--){
			if(500 % i == 0){
				System.out.print(i+ " ");
			}	
		}
		  System.out.println();
		for(int x=0; x < 101; x=x+5){
			System.out.print(x+ " ");
		}
	}
}