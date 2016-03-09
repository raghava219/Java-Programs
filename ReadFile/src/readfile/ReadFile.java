package readfile;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		String fileName = "/Windows/WindowsUpdate.log";
		
		try{
			String line = null;
			br = new BufferedReader(new FileReader(fileName));
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		

	}

}
