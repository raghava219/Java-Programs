package directoryinfo;

import java.io.File;

public class DirectoryInfo {
	
	static void display(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = "/Raghava/KnowledgeBase/Vedios/Java";
        
        File dir = new File(name);
        if(dir.isDirectory()){
        	String names[] = dir.list();
        	display("Directory List " +dir);
        	for(int i=0; i<names.length; i++){
                File d = new File(dir + "/"+ names[i]);        		
        		if(d.isDirectory()){
        			display(names[i] +" is Directory");
        		} else {
        			display(names[i] +" is File");
        		}
        	}
        } else {
        	display(dir + " is not a directory");
        }
        
	} // End of Main

}// End of Class
