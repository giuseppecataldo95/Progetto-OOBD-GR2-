package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;



import DAO.VenditeDAO;
import Entità.Fattura;
import Entità.Tessera;
import GUI.Cliente.FormatoNTesseraErratoJDialog;
import GUI.Cliente.TesseraEliminataJDialog;
import GUI.Vendite.IDCarrelloRicercaCarrelloJDialog;
import GUI.Vendite.VenditeJFrame;
import GUI.Vendite.VisualizzaCarrelloJFrame;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import ImplementazioniDAO.VenditeDAOPostgres;




public class ControllerVendite {


	 private ControllerPrincipale ControllerP;
	 private VenditeJFrame Vendite;
	 private VisualizzaCarrelloJFrame VisualizzaCarrello;
	 private IDCarrelloRicercaCarrelloJDialog RicercaCarrelloDialog;
	 private VenditeDAO DAO;
	 




public VisualizzaCarrelloJFrame getVisualizzaCarrello() {
		return VisualizzaCarrello;
	}
	public void setVisualizzaCarrello(VisualizzaCarrelloJFrame visualizzaCarrello) {
		VisualizzaCarrello = visualizzaCarrello;
	}
public ControllerVendite(Connection Conn, ControllerPrincipale P) throws SQLException
	
	{
		 ControllerP = P;
		 Vendite = new VenditeJFrame(this, ControllerP);
		 DAO = new VenditeDAOPostgres(Conn);
		
	}
	public VenditeJFrame getVendite() {
	return Vendite;
}

	public void setVendite(VenditeJFrame vendite) {
	Vendite = vendite;
}

	public void CompletaTabellaFatture() 
	
	{
		
    	ArrayList<Fattura> Fattura=null;
    	
		try 
			{
				Fattura = DAO.getFattura();
			} 
		
		catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
    	for(Fattura f : Fattura) 
    	{
			VisualizzaCarrelloJFrame.setRigheTabella(f.getNTessera(), f.getIDFattura(), f.getIDCarrello(), f.getPrezzoTotale(), f.getPuntiTotali(), f.getDataEmissione());
    	}
    			
	
	}
	public void VenditeCronologiaVenditeBottonePremuto() {

		Vendite.setVisible(false);
		VisualizzaCarrello = new VisualizzaCarrelloJFrame(this, ControllerP);
		VisualizzaCarrello.setVisible(true);
		
		
	}
	public void VisualizzaCarrelloDettagliCarrelloBottonePremuto() {

		RicercaCarrelloDialog = new IDCarrelloRicercaCarrelloJDialog(this);
		RicercaCarrelloDialog.setVisible(true);
	}
//	public void RicercaCarrelloPerIDCarrelloAvantiBottonePremuto() {
//
//		String IDCarrello = RicercaCarrelloDialog.getIDCarrelloTB();
//		try 
//		{
//			
//			RicercaCarrelloDialog.setVisible(false);
//			DAO.getCarrelloByIDCarrello(IDCarrello);
//			
//			if(RigaEliminata == 1) 
//				{
//					TesseraEliminata = new TesseraEliminataJDialog(this);
//					TesseraEliminata.setVisible(true);
//				}
//			else
//			{
//				ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
//				ErroreNumeroTessera.setVisible(true);
//			}	
//				
//		} 
//	
//	catch (NumberFormatException e) 
//		{
//		
//		
//			ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
//			ErroreNumeroTessera.setVisible(true);
//
//		} 
//	
//	catch (SQLException e) 	
//		{
//			ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
//			ErroreNumeroTessera.setVisible(true);
//		}
//	
//
//		
//		
//	}
	public void VisualizzaCarrelloPercorsoVenditeBottonePremuto() {
		
		VisualizzaCarrello.setVisible(false);
		Vendite = new VenditeJFrame(this, ControllerP);
		Vendite.setVisible(true);
		
	}
	public void VisualizzaCarrelloPercorsoVisualizzaVenditeBottonePremuto() {
		
		VisualizzaCarrello.setVisible(false);
		VisualizzaCarrello = new VisualizzaCarrelloJFrame(this, ControllerP);
		VisualizzaCarrello.setVisible(true);
		
	}
}
