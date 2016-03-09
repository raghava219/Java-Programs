package serialobject;

import java.io.Serializable;

public class Name implements Serializable{
	
	private String fName = null;
	private String lName = null;
	
	public Name(String fName, String lName){
		this.fName = fName;
		this.lName = lName;
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}


}
