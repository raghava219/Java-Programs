package niofilecopy;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOFileCopy {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Path from = Paths.get("/Raghava/Temp/From.sql");
		Path to = Paths.get("/Raghava/Temp/To.sql");
		//Overrite existing files, if exists
		CopyOption[] options = new CopyOption[]{
		  StandardCopyOption.REPLACE_EXISTING,		
		  StandardCopyOption.COPY_ATTRIBUTES		
		};
		Files.copy(from, to, options);

	}

}
