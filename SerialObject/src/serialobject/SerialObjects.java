/*56690-Classes – Write a Serialized Object to Disk*/
/*56689-Classes – Reading a Serialized Object*/

package serialobject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;

public class SerialObjects {

	public static void main(String[] args) throws IOException{

		ObjectOutputStream output;
		
		output = new ObjectOutputStream(new FileOutputStream("names.ser"));

		Name outName = new Name("Raghava","Dudi");
		
		try{
			output.writeObject(outName);
		}
		catch(NoSuchElementException ex){
			ex.printStackTrace();
		}
		try{
			output.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}

		ObjectInputStream input;
		
		input = new ObjectInputStream(new FileInputStream("names.ser"));
		
		Name inName;
		
		try{
		   inName = (Name)input.readObject();
		   System.out.println("First Name: "+inName.getfName());	
		   System.out.println("Second Name: "+inName.getlName());	
		}
		catch(EOFException eof){
			eof.printStackTrace();
		}
		catch(ClassNotFoundException ec){
			ec.printStackTrace();
		}
		catch(IOException io){
			io.printStackTrace();
		}
		
		try{
			input.close();
		}
		catch(IOException io){
			io.printStackTrace();
		}

	}

}
