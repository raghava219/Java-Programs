package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        BufferedWriter bw = null;
        String str = "Welcome to Java\n";
        
        try{
        	File output = new File("example.txt");
        	
        	if(!output.exists()){
        		output.createNewFile();
        	}
        	bw = new BufferedWriter(new FileWriter(output,true));
        	bw.write(str);
        	
        }catch(IOException ex){
        	ex.printStackTrace();
        }
         finally{
        	 if(bw != null){
        		 bw.close();
        	 }
         }
        
	}

}
