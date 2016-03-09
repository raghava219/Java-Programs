package readfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFileJava {

	private static BufferedReader br = null;
	private static BufferedWriter bw = null;
	private static File outPutFile = null;
	private static File inPutFile = null;
	private static String str = null;
	
	public static void main(String[] args) throws Exception{

		outPutFile = new File("example.txt");
		inPutFile = new File("/Windows/WindowsUpdate.log");
		
		if(!outPutFile.exists()){
			outPutFile.createNewFile();
		}
		
		br = new BufferedReader(new FileReader(inPutFile));
		bw = new BufferedWriter(new FileWriter(outPutFile, true));
		
		while((str = br.readLine()) != null){
			bw.write(str);
		}

	}

}
