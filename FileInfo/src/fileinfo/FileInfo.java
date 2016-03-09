package fileinfo;

import java.io.File;

public class FileInfo {
	
	static void display(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
         File fileObj = new File("/Windows/ngwinx.dll");
         display("File Name: "+fileObj.getName());
         display("Path : "+fileObj.getPath());
         display(fileObj.exists() ? "Exists": "Doesn't exists");
         display(fileObj.canWrite() ? "Writable": "Non Writable");
         display("Size :"+ fileObj.length()+" bytes.");
	}

}
