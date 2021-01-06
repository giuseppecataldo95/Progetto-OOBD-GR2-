package App;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import ConnessioneDB.ConnessioneDB;
import DAO.ClienteDAO;
import DAO.MagazzinoDAO;
import Entità.Cliente;
import Entità.Frutta;
import ImplementazioniDAO.ClienteDAOPostgres;
import ImplementazioniDAO.MagazzinoDAOPostgres;

public class Main {

	public static void main(String[] args) {
		
		ConnessioneDB DBconn = null;
		Connection Conn = null;
//    	MagazzinoDAO MagDAO = null;
		ClienteDAO cliente = null;
		
		try {
			DBconn = ConnessioneDB.getInstance();
			Conn = DBconn.getConnection();
			cliente = new ClienteDAOPostgres(Conn);
			
			ArrayList<Cliente> clienti = cliente.getCliente();
			for(Cliente o:clienti)
			{
				System.out.println(o);
			}
			
	
		}catch(SQLException e) {
			System.out.println("Errore: "+e);
		}
	}

}
