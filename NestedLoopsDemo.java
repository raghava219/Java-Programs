/*48912-Nested Loops*/

public class NestedLoopsDemo{
	
	public static void main(String[] args){
		
		int rows = 1;
		while(rows < 16){
			
			for(int i=1; i < rows ; i++){
				System.out.print("*");
			}
			System.out.println();
			rows++;
		}
	}
}