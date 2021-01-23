package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.MagazzinoDAO;
import DAO.VenditeDAO;
import Entit�.Confezionato;
import Entit�.Farinaceo;
import Entit�.Fattura;
import Entit�.Frutta;
import Entit�.Latticino;
import Entit�.Tessera;
import Entit�.Uova;
import Entit�.Verdura;
import GUI.Cliente.FormatoNTesseraErratoJDialog;
import GUI.Cliente.TesseraEliminataJDialog;
import GUI.Vendite.CreaCarrelloJFrame;
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
	 private MagazzinoDAO DAOM;
	 private CreaCarrelloJFrame CreaCarrello;
	 private int IDCarrello;
	 



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
		 DAOM = new MagazzinoDAOPostgres(Conn);
		
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
	
	public void VenditeCreaCarrelloBottonePremuto() {
		Vendite.setVisible(false);
		CreaCarrello = new CreaCarrelloJFrame(this, ControllerP);
		CreaCarrello.setVisible(true);
		try {
			DAO.inserisciCarrello();
			IDCarrello = DAO.getUltimoIDCarrello();
		} catch (SQLException e) {
			
		}
	}
	
	public void CompletaTabellaFrutta() {
    	ArrayList<Frutta> ProdottiFrutta = null;
		try {
			ProdottiFrutta = DAOM.getFrutta();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Frutta f : ProdottiFrutta)
    		CreaCarrello.setRigheTabellaFrutta(f.getID_Prodotto(), f.getNome(), f.getProvenienza(), f.getLotto_lavorazione(), f.getData_raccolta(), f.getValore(), f.getScorte_kg());
    }
	
	public void CompletaTabellaUova() {
    	ArrayList<Uova> ProdottiUova = null;
		try {
			ProdottiUova = DAOM.getUova();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Uova u : ProdottiUova)
			CreaCarrello.setRigheTabellaUova(u.getID_Prodotto(), u.getN_perConfezione(), u.getProvenienza(), u.getLotto_lavorazione(), u.getData_scadenza(), u.getValore(), u.getScorte());
    }
	
	public void CompletaTabellaVerdura() {
    	ArrayList<Verdura> ProdottiVerdura = null;
		try {
			ProdottiVerdura = DAOM.getVerdura();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	for(Verdura v : ProdottiVerdura)
    		CreaCarrello.setRigheTabellaVerdura(v.getID_Prodotto(), v.getNome(), v.getProvenienza(), v.getLotto_lavorazione(), v.getData_raccolta(), v.getValore(), v.getScorte_kg());
    }
	
	public void CompletaTabellaFarinacei() {
    	ArrayList<Farinaceo> ProdottiFarinacei = null;
		try {
			ProdottiFarinacei = DAOM.getFarinacei();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Farinaceo f : ProdottiFarinacei)
    		CreaCarrello.setRigheTabellaFarinacei(f.getID_Prodotto(), f.getNome(),f.getLotto_lavorazione(),f.getData_scadenza(),f.getValore(),f.getScorte_kg());
	}
	
	public void CompletaTabellaLatticini() {
    	ArrayList<Latticino> ProdottiLatticini = null;
		try {
			ProdottiLatticini = DAOM.getLatticini();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(Latticino l : ProdottiLatticini)
    		CreaCarrello.setRigheTabellaLatticini(l.getID_Prodotto(), l.getNome(), l.getPaese_mungitura(), l.getPaese_lavorazione(), l.getData_mungitura(),l.getData_scadenza(), l.getValore(), l.getScorte_kg());
    }
	
	public void CompletaTabellaConfezionati() {
    	ArrayList<Confezionato> ProdottiConfezionati = null;
		try {
			ProdottiConfezionati = DAOM.getConfezionati();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(Confezionato c : ProdottiConfezionati)
    		CreaCarrello.setRigheTabellaConfezionati(c.getID_Prodotto(), c.getNome(), c.getMarca(), c.getLotto_lavorazione(), c.getData_scadenza(), c.getModalit�_conservazione(),c.getPeso(), c.getValore(), c.getScorte());
    }
	
	public void AggiungiAlCarrello() {
		int IDProdotto = CreaCarrello.getIDProdotto();
		String Categoria = CreaCarrello.getCategoria();
		try {
			if(Categoria == "Frutta"||Categoria == "Verdura"||Categoria == "Farinacei"||Categoria == "Latticini") {
				float Quantit�KG = Float.parseFloat(CreaCarrello.getQuantit�());
				DAO.inserisciCompCarelloKG(IDCarrello, IDProdotto, Quantit�KG);
				CreaCarrello.ProdottoAggiunto();
			} else {
				int Quantit�N = Integer.parseInt(CreaCarrello.getQuantit�());
				DAO.inserisciCompCarelloN(IDCarrello, IDProdotto, Quantit�N);
				CreaCarrello.ProdottoAggiunto();
			}
		} catch(SQLException e) {
			e.printStackTrace();
			CreaCarrello.ErroreProdottoAggiunto();
		}
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
