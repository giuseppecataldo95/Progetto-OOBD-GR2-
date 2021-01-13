package App;
import java.sql.*;
import ConnessioneDB.ConnessioneDB;
import Controller.ControllerPrincipale;


public class Main {

	public static void main(String[] args) {
		ConnessioneDB DBconn = null;
		Connection Conn = null;
		try {
			DBconn = ConnessioneDB.getInstance();
			Conn = DBconn.getConnection();
			ControllerPrincipale Main = new ControllerPrincipale(Conn);
		}catch(SQLException e) {
				System.out.println("Errore: "+e);
		}
		 
		 
	 
		
	
	}
	
		
		
		
		
		
		
		
	


}
