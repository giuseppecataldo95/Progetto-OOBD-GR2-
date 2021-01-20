package Risorse.App;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import DAO.ComuniDAO;
import Entità.Comune;
import ImplementazioniDAO.ComuniDAOPostgres;

public class CreaTabellaComuni {
	
	private ComuniDAO DAO;
	

	
		
		
		
	 public CreaTabellaComuni(Connection conn) throws SQLException {
		DAO = new ComuniDAOPostgres(conn);
	}

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
		        String s3 = s1.substring(s1.indexOf('-')+3);
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
		        String s3 = s1.substring(s1.indexOf('-')+3);
		        Comuni.add(s3);
		      }
		      
		      scanner.close();
		    } catch(Exception e) {e.printStackTrace();}
		    return Comuni;
		  }	
	 
	 public void PopolaComuni()
		
		{
			ArrayList<String> Comuni = new ArrayList<String>();
			ArrayList<String> Codici = new ArrayList<String>();
			Comuni = PrendiComuni();
			Codici = PrendiCodici();
			
			for(int i = 0 ; i < Comuni.size(); i++ ) {
				String Nome = Comuni.get(i);
				String Codice= Codici.get(i);
				Comune c = new Comune(Nome, Codice);
				try {
					DAO.insertComuni(c);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
	

		}
}