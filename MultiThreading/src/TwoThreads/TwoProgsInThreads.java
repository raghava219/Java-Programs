package TwoThreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloOne implements Runnable {
	
	public void run(){	
		
		try{
			System.out.println("What is your name? ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
			System.out.println("Hello "+name);
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
}

class NumberCruncher implements Runnable{
	
	private static boolean stop = false;
	
	public void run(){
		try{
			int i = 1;
			double d = 0;
			while(!stop){
				d = Math.log(i++);
				Thread.currentThread().sleep(500);
			}
			System.out.println("The log of "+ i +" is "+d);
		}catch(InterruptedException ex){
			System.out.println(ex.getMessage());
		}
	}
	public void end(){
		stop = true;
	}
	
}


public class TwoProgsInThreads {

	public static void main(String[] args) throws InterruptedException{
		
		Thread one = new Thread(new HelloOne());
		one.start();
		
		NumberCruncher nc = new NumberCruncher();
		Thread two = new Thread(nc);
        two.start();
        
        one.join(); // we will call join() to stop it.
        
        nc.end();
		
	}

}
