package buffermappingoutput;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferMappingOutput {

	public static void main(String[] args){
		
		String fileName = "myFile.txt";
		
		Byte[] letters = new Byte[]{'p','r','o','g','r','a','m'};
		
		try(FileChannel fileChannel = (FileChannel)
				Files.newByteChannel(Paths.get(fileName), 
						StandardOpenOption.WRITE,
						StandardOpenOption.READ,
						StandardOpenOption.CREATE)){
			
			MappedByteBuffer mapBuff = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, letters.length);
			
			for(int i=0; i<letters.length; i++){
				mapBuff.put((byte)letters[i]);
			}
			System.out.println("Success");
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
