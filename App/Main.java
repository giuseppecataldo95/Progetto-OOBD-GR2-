package App;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import ConnessioneDB.ConnessioneDB;
import Controller.ControllerCliente;
import Controller.ControllerMagazzino;
import DAO.ClienteDAO;
import DAO.MagazzinoDAO;
import Entità.Cliente;
import Entità.Frutta;
import GUI.FinestraPrincipaleJFrame;
import GUI.Cliente.ClientiJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;
import ImplementazioniDAO.MagazzinoDAOPostgres;

public class Main {



	public static void main(String[] args) {


		ConnessioneDB DBconn = null;
		Connection Conn = null;
		ClienteDAO cliente = null;
//		FinestraPrincipaleJFrame f = new FinestraPrincipaleJFrame();
//		f.setVisible(true);
//	


		try {
			DBconn = ConnessioneDB.getInstance();
			Conn = DBconn.getConnection();

			


//			ControllerMagazzino Magazzino = new ControllerMagazzino(Conn);
			ControllerCliente Cliente = new ControllerCliente(Conn);




		}catch(SQLException e) {
			System.out.println("Errore: "+e);
		}




	}











}
