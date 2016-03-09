package buffermappedinput;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class BufferMappedInput {

	public static void main(String[] args) {
		
        String fileName = "/Windows/WindowsUpdate.log";

        try(FileChannel fChannel = (FileChannel)Files.newByteChannel(Paths.get(fileName))){
                 long fSize = fChannel.size();
                 MappedByteBuffer mapBuff = fChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
                 for(int i=0; i< fSize; ++i){
                    System.out.print((char)mapBuff.get()); 
                 }
                 System.out.println();
        }
        catch(InvalidPathException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }


	}

}
