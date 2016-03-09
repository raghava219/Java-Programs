package com.example.dell;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class MainTest {
	
	private static String[] s = new String[3];

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		/*System.out.println("Enter a Year: ");
		s[0] = in.nextLine();
		
		System.out.println("Enter a Month: ");
		s[1] = in.nextLine();
		
		System.out.println("Enter a Day: ");
		s[2] = in.nextLine();
		
		in.close();
		
		ArrayList<Double> airTemp = getData("Air_Temp",s);
		
		for(Double d1 : airTemp){
			System.out.println(d1);
		}
	*/
		System.setProperty("java.net.useSystemProxies", "true");
		
		//URL dataSource = new URL("http://lpo.dt.navy.mil/data/DM/Environmental_Data_Deep_Moor_2012.txt");
		//URLConnection urlCon = dataSource.openConnection();
		
		File envDetails = new File("Environmental_Data_Deep_Moor_2012.txt");
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
		
		BufferedReader br = new BufferedReader(new FileReader(envDetails));
		
		String inputLine = null;
		
		while((inputLine = br.readLine()) != null){
			//typeData.add(Double.parseDouble(inputLine.substring(20)));
			System.out.println(inputLine);
		}
		br.close();
	
		
		// http://lpo.dt.navy.mil/data/DM/Environmental_Data_Deep_Moor_2012.txt

	}
	
	private static ArrayList<Double> getData(String type, String[] s) throws NumberFormatException,IOException{
		
		URL dataSource = new URL("http://www.w3schools.com/angular/customers.php");
		
		ArrayList<Double> typeData = new ArrayList<Double>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(dataSource.openStream()));
		
		String inputLine = null;
		
		while((inputLine = br.readLine()) != null){
			//typeData.add(Double.parseDouble(inputLine.substring(20)));
			System.out.println(inputLine);
		}
		br.close();
		
		return typeData;
	}

}
