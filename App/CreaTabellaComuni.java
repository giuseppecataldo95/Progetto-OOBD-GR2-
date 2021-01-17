package App;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import DAO.ClienteDAO;
import Entità.Comune;

public class CreaTabellaComuni {

	
		
		
		
	 public   ArrayList PrendiComuni() {
		  String cc="";
		  ArrayList Codici = new ArrayList();
		    try {
		      Scanner scanner = new Scanner(new File("Comuni.txt"));
		      scanner.useDelimiter("\r\n");
		      
		      while(scanner.hasNext())
		      {
		        String s1 = scanner.nextLine();
		        String s2 = s1.substring(0,s1.indexOf('-')-1);
		        String s3 = s1.substring(s1.indexOf('-')+2);
		        Codici.add(s2);
		      }
		      
		      scanner.close();
		    } catch(Exception e) {e.printStackTrace();}
		    return Codici;
		  }
		
	 public   ArrayList PrendiCodici() {
		  String cc="";
		  ArrayList Comuni = new ArrayList();
		    try {
		      Scanner scanner = new Scanner(new File("Comuni.txt"));
		      scanner.useDelimiter("\r\n");
		      
		      while(scanner.hasNext())
		      {
		        String s1 = scanner.nextLine();
		        String s2 = s1.substring(0,s1.indexOf('-')-1);
		        String s3 = s1.substring(s1.indexOf('-')+2);
		        Comuni.add(s3);
		      }
		      
		      scanner.close();
		    } catch(Exception e) {e.printStackTrace();}
		    return Comuni;
		  }	
	

}
