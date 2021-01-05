import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import ConnessioneDB.ConnessioneDB;
import DAO.MagazzinoDAO;
import Entità.Frutta;
import ImplementazioniDAO.MagazzinoDAOPostgres;

public class Main {

	public static void main(String[] args) {
		
		ConnessioneDB DBconn = null;
		Connection Conn = null;
		MagazzinoDAO MagDAO = null;
		try {
			DBconn = ConnessioneDB.getInstance();
			Conn = DBconn.getConnection();
			MagDAO = new MagazzinoDAOPostgres(Conn);
			ArrayList<Frutta> f = MagDAO.getFrutta();
			Iterator<Frutta> i = f.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			
		}catch(SQLException e) {
			System.out.println("Errore: "+e);
		}
	}

}
