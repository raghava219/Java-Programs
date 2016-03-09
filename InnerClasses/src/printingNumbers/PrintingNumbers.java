package printingNumbers;

class Numbers{
	
	private int[] data;
	private final static int size = 20;
	
	public Numbers(){
		data = new int[size];
		for(int i=0; i < size; i++){
           data[i] = 0 + (int) (Math.random() * (100+1));		
		}
	}
	
	public void printEveryOther(){
		EveryOther iterator = this.new EveryOther();
		while(iterator.hasNext()){
			System.out.println(iterator.getNext());
		}
	}
	
	private class EveryOther{
		
		private int next = 0;
		
		public boolean hasNext(){
			return (next <= size-1);
		}
		
		public int getNext(){
			int val = data[next];
			next += 2;
			return val;
		}
	}
}

public class PrintingNumbers{
	
	public static void main(String[] args){
		
		Numbers nums = new Numbers();
		nums.printEveryOther();
		
	}
	
}