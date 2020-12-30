import java.sql.*; //importare i dao senza java.sql


public class Main {

	public static void main(String[] args) {
		
		ConnessioneDB DBconn = null;
		Connection Conn = null;
		
		try {
			DBconn = ConnessioneDB.getInstance();
			Conn = DBconn.getConnection();
		}catch(SQLException e) {
			System.out.println("Errore: "+e);
		}
	}

}
