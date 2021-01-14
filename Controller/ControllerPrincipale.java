package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import ConnessioneDB.ConnessioneDB;
import DAO.ClienteDAO;
import DAO.MagazzinoDAO;
import GUI.FinestraPrincipaleJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.ClientiJFrame;
import GUI.Magazzino.MagazzinoJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;

public class ControllerPrincipale {
	
	private FinestraPrincipaleJFrame FinestraPrincipale;
	private ClientiJFrame Clienti;
	private CreaTesseraJFrame CreaTessera;
	
	private MagazzinoJFrame Magazzino;
	private ControllerCliente ControllerC;
	private ControllerMagazzino ControllerM;
	private Connection Connessione;
	
	public ControllerPrincipale(Connection Conn) {
		 Connessione= Conn;
		 FinestraPrincipale = new FinestraPrincipaleJFrame(this, ControllerC, ControllerM);
		 FinestraPrincipale.setVisible(true);
	}

	public void FinestraPrincipaleClientiButtonPressed(){
		try {
			ControllerC = new ControllerCliente(Connessione, this);
			FinestraPrincipale.setVisible(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void FinestraPrincipaleMagazzinoButtonPressed(){
		try {
			ControllerM = new ControllerMagazzino(Connessione, this);
			FinestraPrincipale.setVisible(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

 	public void CreaTesseraMenùLateraleClientiButtonPressed() {
		ControllerC.getCreaTessera().setVisible(false);
		Clienti = new ClientiJFrame(ControllerC, this);
		Clienti.setVisible(true);
 	}

	


 
 
}
