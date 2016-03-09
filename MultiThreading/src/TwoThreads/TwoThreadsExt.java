package TwoThreads;

class NewThread1 extends Thread{
	
	public NewThread1(){
		super("Second Thread");
		System.out.println("Child Thread "+this);
		start();
	}
	
	public void run(){
		try{
			for(int i=5; i>0; --i){
				System.out.println("Child Thread "+i);
				Thread.sleep(500);
			}
		} catch(InterruptedException ex){
			System.out.println("Child Thread Interrupted");
		}
	   System.out.println("Child Thread Exited");
	}
	
}

public class TwoThreadsExt {

	public static void main(String[] args) {
		
		new NewThread();
		
		try{
			for(int i=5; i>0; --i){
				System.out.println("Main Thread "+i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ex){
			System.out.println("Main Thread Interrupted");
		} 
		
		System.out.println("Main Thread Exited");
	}

}
