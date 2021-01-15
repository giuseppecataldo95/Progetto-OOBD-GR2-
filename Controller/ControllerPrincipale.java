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
	
	public FinestraPrincipaleJFrame getFinestraPrincipale() {
		return FinestraPrincipale;
	}

	

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

 	public void RicaricaClientiJFrame() {

 		ControllerC.getClienti().setVisible(false);
		Clienti = new ClientiJFrame(ControllerC, this);
		Clienti.setVisible(true);
		
		
	}
 	
 	public void CreaTesseraMenùLateraleMagazzinoButtonPressed() {

 		ControllerC.getCreaTessera().setVisible(false);
 		Magazzino = new MagazzinoJFrame(ControllerM, this);
 		Magazzino.setVisible(true);
 		
	}
 	
 	public void RiepilogoTesseraMenuLateraleClientiButtonPressed() {
		
 		ControllerC.getRiepilogoTessera().setVisible(false);	
 		Clienti = new ClientiJFrame(ControllerC, this);
 		Clienti.setVisible(true);
 	}
 	
 	public void RiepilogoTesseraMenuLateraleMagazzinoButtonPressed() {
		
 		ControllerC.getRiepilogoTessera().setVisible(false);
 		Magazzino = new MagazzinoJFrame(ControllerM, this);
 		Magazzino.setVisible(true);
 		
	}
 	
 	public void VisualizzaClientiMenuLateraleClientiButtonPressed() {
		
 		ControllerC.getVisualizzaClienti().setVisible(false);
 		Clienti = new ClientiJFrame(ControllerC, this);
 		Clienti.setVisible(true);
 		
	}
 	
 	public void VisualizzaClientiMenuLateraleMagazzinoButtonPressed() {
		
 		ControllerC.getVisualizzaClienti().setVisible(false);
 		Magazzino = new MagazzinoJFrame(ControllerM, this);
 		Magazzino.setVisible(true);
 		
	}
 	
 	public void ClientiMenuLateraleMagazzinoButtonPressed() {

 		ControllerC.getClienti().setVisible(false);
 		Magazzino = new MagazzinoJFrame(ControllerM, this);
 		Magazzino.setVisible(true);
	}
 	
 	public void MagazzinoMenuLateraleClientiButtonPressed() {

 		ControllerM.getMagazzino().setVisible(false);
 		Clienti = new ClientiJFrame(ControllerC, this);
 		Clienti.setVisible(true);
		
	}
 	
 	

 	public void setFinestraPrincipale(FinestraPrincipaleJFrame finestraPrincipale) {
		FinestraPrincipale = finestraPrincipale;
	}

	public ClientiJFrame getClienti() {
		return Clienti;
	}

	public void setClienti(ClientiJFrame clienti) {
		Clienti = clienti;
	}

	public CreaTesseraJFrame getCreaTessera() {
		return CreaTessera;
	}

	public void setCreaTessera(CreaTesseraJFrame creaTessera) {
		CreaTessera = creaTessera;
	}

	public MagazzinoJFrame getMagazzino() {
		return Magazzino;
	}

	public void setMagazzino(MagazzinoJFrame magazzino) {
		Magazzino = magazzino;
	}

	

	

	

	

	

	

	

 
 
}
