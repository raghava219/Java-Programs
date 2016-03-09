package TwoThreads;

class NewThread implements Runnable{
	
	Thread th = null;
	
	public NewThread(){
		th = new Thread(this,"Example Thread");
		System.out.println("Child Thread " +th);
		th.start();
	}
	
	public void run(){
		try{
			for(int i=5; i>0; --i){
				System.out.println("Child Thread "+th);
				Thread.sleep(500);
			}
		}catch(InterruptedException ex){
			System.out.println("Child Thread is interrupted");
		}
		System.out.println("Child Thread Exited");
	}
}

public class TwoThreads {

	
	public static void main(String[] args){
		
		new NewThread();
		
		try{
			for(int i=5; i>0; --i){
				System.out.println("Main Thread " +i);
				Thread.sleep(1000);
			}
			
		} catch(InterruptedException ex){
			System.out.println("Main thread is interrupted");
		}
        System.out.println("Main Thread Exited");		
	}
	
}
