package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.MagazzinoDAO;
import DAO.VenditeDAO;
import Entit‡.Carrello;
import Entit‡.Confezionato;
import Entit‡.Farinaceo;
import Entit‡.Fattura;
import Entit‡.Frutta;
import Entit‡.Latticino;
import Entit‡.Prodotto_kg;
import Entit‡.Prodotto_unitario;
import Entit‡.Tessera;
import Entit‡.Uova;
import Entit‡.Verdura;

import GUI.Cliente.ErroreTesseraJDialog;
import GUI.Cliente.FormatoNTesseraErratoJDialog;
import GUI.Cliente.InserimentoClienteCompletatoJDialog;
import GUI.Cliente.TesseraEliminataJDialog;

import GUI.Vendite.CarrelloAttualeJFrame;

import GUI.Vendite.CreaCarrelloJFrame;
import GUI.Vendite.ErroreInserisciTesseraJDialog;
import GUI.Vendite.GenerazioneFatturaCompletataJDialog;
import GUI.Vendite.IDCarrelloRicercaCarrelloJDialog;
import GUI.Vendite.IDFatturaNonTrovatoJDialog;
import GUI.Vendite.InserisciNTesseraJDialog;
import GUI.Vendite.SalvataggioCarrelloJDialog;
import GUI.Vendite.VenditeJFrame;
import GUI.Vendite.VisualizzaCarrelloJFrame;
import GUI.Vendite.VisualizzaFattureJFrame;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import ImplementazioniDAO.VenditeDAOPostgres;
import Risorse.MieEccezioni.TesseraNonTrovataException;




public class ControllerVendite {


	
	 private ControllerPrincipale ControllerP;
	 private VenditeJFrame Vendite;
	 private VisualizzaCarrelloJFrame VisualizzaCarrello1;
	 private IDCarrelloRicercaCarrelloJDialog RicercaCarrelloDialog;
	 private VenditeDAO DAO;
	 private MagazzinoDAO DAOM;
	 private CreaCarrelloJFrame CreaCarrello;
	 private Carrello CarrelloDaCreare;
	 private SalvataggioCarrelloJDialog Salvataggio;
	 private CarrelloAttualeJFrame CarrelloAttuale = new CarrelloAttualeJFrame(this);
	 private VisualizzaFattureJFrame VisualizzaFatture = new VisualizzaFattureJFrame(this,ControllerP);
	 private InserisciNTesseraJDialog InserisciTessera;
	 private ErroreInserisciTesseraJDialog ErroreTessera;
	 private GenerazioneFatturaCompletataJDialog GenerazioneCompletata;
	 private IDFatturaNonTrovatoJDialog IDFatturaNonTrovato;


	 //COSTRUTTORE
	public ControllerVendite(Connection Conn, ControllerPrincipale P) throws SQLException {
		 ControllerP = P;
		 Vendite = new VenditeJFrame(this, ControllerP);
		 DAO = new VenditeDAOPostgres(Conn);
		 DAOM = new MagazzinoDAOPostgres(Conn);
	}
	
	//METODI 
	//FINESTRA VENDITA
	
	public void VenditeCreaCarrelloBottonePremuto() {
		Vendite.setVisible(false);
		CreaCarrello = new CreaCarrelloJFrame(this, ControllerP);
		CreaCarrello.setVisible(true);
		CreaCarrello.AbilitaBottoneVisualizzaCarrello();
		try {
			DAO.inserisciCarrello();
			CarrelloDaCreare = new Carrello(DAO.getUltimoIDCarrello());
		} catch (SQLException e) {
			
		}
	}
	
	public void VenditeCronologiaVenditeBottonePremuto() {

		Vendite.setVisible(false);
		VisualizzaFatture = new VisualizzaFattureJFrame (this, ControllerP);
		VisualizzaFatture.PulisciDatiTabella();
		CompletaTabellaFatture();
		VisualizzaFatture.setVisible(true);
	}

	//FINESTRA CREA CARRELLO
	
	public void CreaCarrello_VenditePercorsoBottonePremuto() {
		
		CreaCarrello.setEnabled(false);
    	CarrelloAttuale.setVisible(false);
    	Salvataggio = new SalvataggioCarrelloJDialog(this);
    	Salvataggio.setVisible(true);
	
	}
	
	public void CreaCarrello_CreaCarrelloPercorsoBottonePremuto() {
		CreaCarrello.setVisible(false);
		CreaCarrello.setVisible(true);
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
    		CreaCarrello.setRigheTabellaConfezionati(c.getID_Prodotto(), c.getNome(), c.getMarca(), c.getLotto_lavorazione(), c.getData_scadenza(), c.getModalit‡_conservazione(),c.getPeso(), c.getValore(), c.getScorte());
    }

	public void AggiungiAlCarrello() {
		int IDProdotto = CreaCarrello.getIDProdotto();
		String Categoria = CreaCarrello.getCategoria();
		try {
			if(Categoria == "Frutta"||Categoria == "Verdura"||Categoria == "Farinacei"||Categoria == "Latticini") {
				float Quantit‡KG = Float.parseFloat(CreaCarrello.getQuantit‡());
				DAO.inserisciCompCarelloKG(CarrelloDaCreare.getIDCarrello(), IDProdotto, Quantit‡KG);
				CreaCarrello.ProdottoAggiunto();
			} else {
				int Quantit‡N = Integer.parseInt(CreaCarrello.getQuantit‡());
				DAO.inserisciCompCarelloN(CarrelloDaCreare.getIDCarrello(), IDProdotto, Quantit‡N);
				CreaCarrello.ProdottoAggiunto();
				
				
			}
		} catch(SQLException e) {
			CreaCarrello.ErroreProdottoAggiunto("<html>"+e.getMessage()+"<html>");
		}
	}
	
	public void CreaCarrelloIndietroBottonePremuto() {
		
		CreaCarrello.setEnabled(false);
    	CarrelloAttuale.setVisible(false);
    	Salvataggio = new SalvataggioCarrelloJDialog(this);
    	Salvataggio.setVisible(true);
	
	}
	
	public void SalvataggioBottoneAvantiPremuto() {
		CreaCarrello.setEnabled(true);
		Salvataggio.setVisible(false);
		CreaCarrello.setVisible(false);
		Vendite.setVisible(true);
	}
	
	public void SalvataggioBottoneIndietroPremuto() {
		CreaCarrello.setEnabled(true);
		CreaCarrello.AbilitaBottoneVisualizzaCarrello();
		Salvataggio.setVisible(false);
		
	}

	public void CreaCarrelloVisualizzaCarrelloBottonePremuto() {
		CarrelloAttuale = new CarrelloAttualeJFrame(this);
		CompletaTabellaCarrelloKG();
		CompletaTabellaCarrelloN();
		setPuntiEPrezzo();
		CarrelloAttuale.setVisible(true);
		CreaCarrello.DisabilitaBottoneVisualizzaCarrello();
	}
	
	//FINESTRA CARRELLO ATTUALE
	
	public void CarrelloAttualeAggiornaBottonePremuto() {
		CarrelloAttuale.setVisible(false);
		CarrelloAttuale = new CarrelloAttualeJFrame(this);
		CarrelloAttuale.setVisible(true);
	}
	
	public void setPuntiEPrezzo() {
    	try {
    		CarrelloDaCreare = DAO.getPrezzoEPuntiByID(CarrelloDaCreare.getIDCarrello());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	CarrelloAttuale.setPrezzoParziale(CarrelloDaCreare.getPrezzoParziale());
    	CarrelloAttuale.setPuntiParziali(CarrelloDaCreare.CalcolaPuntiParziali());
	}
	
	public void CarrelloAttualeGeneraFatturaBottonePremuto() {
		CarrelloAttuale.setEnabled(false);
		CreaCarrello.setEnabled(false);
		InserisciTessera = new InserisciNTesseraJDialog(this);
		InserisciTessera.setVisible(true);
		ControllerP.VisualizzaClientiNTessera();
	}
	
	public void InserisciNTesseraGeneraBottonePremuto() {
		Tessera Compratore = new Tessera(Integer.parseInt(InserisciTessera.getNTessera()));
		
		try {
			DAO.getTesserabyNTessera(Compratore.getNTessera());
			Fattura FatturaDaGenerare = new Fattura(Compratore.getNTessera());
			FatturaDaGenerare.setIDCarrello(CarrelloDaCreare.getIDCarrello());
			FatturaDaGenerare.setPrezzoTotale(CarrelloDaCreare.getPrezzoParziale());
			FatturaDaGenerare.setPuntiTotali(CarrelloDaCreare.CalcolaPuntiParziali());
			DAO.inserisciFattura(FatturaDaGenerare);
			CarrelloAttuale.setEnabled(true);
			CarrelloAttuale.setVisible(false);
			GenerazioneCompletata = new GenerazioneFatturaCompletataJDialog(this);
			InserisciTessera.setVisible(false);
			ControllerP.NascondiVisualizzaClientiNTessera();
			GenerazioneCompletata.setVisible(true);
			
		} catch (NumberFormatException|TesseraNonTrovataException|SQLException e) {
			InserisciTessera.setEnabled(false);
			ControllerP.NascondiVisualizzaClientiNTessera();
			ErroreTessera = new ErroreInserisciTesseraJDialog(this);
			ErroreTessera.setError(e.getMessage());
			ErroreTessera.setVisible(true);
			
		} 
		
	}
	
	public void InserisciNTesseraIndietroBottonePremuto() {
		CarrelloAttuale.setEnabled(true);
		CreaCarrello.setEnabled(true);
		InserisciTessera.setVisible(false);
	}

	public void ErroreTesseraRiprovaBottonePremuto() {
		InserisciTessera.setEnabled(true);
		ErroreTessera.setVisible(false);
	}
	
	public void GenerazioneFatturaCompletataOkBottonePremuto(){
		GenerazioneCompletata.setVisible(false);
		CreaCarrello.setEnabled(true);
		CreaCarrello.setVisible(false);
		Vendite.setVisible(true);
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
			VisualizzaFatture.setRigheTabella(f.getNTessera(), f.getIDFattura(), f.getPrezzoTotale(), f.getPuntiTotali(), f.getDataEmissione());
    	}
    			
	
	}
	
	public void VisualizzaFattureDettagliCarrelloBottonePremuto() {

		RicercaCarrelloDialog = new IDCarrelloRicercaCarrelloJDialog(this);
		RicercaCarrelloDialog.setVisible(true);
	}
	
	public void VisualizzaCarrelloPercorsoVenditeBottonePremuto() {
		
		VisualizzaFatture.setVisible(false);
		Vendite.setVisible(true);
		
	}
	public void VisualizzaCarrelloPercorsoVisualizzaVenditeBottonePremuto() {
		
		VisualizzaFatture.setVisible(false);
		VisualizzaFatture = new VisualizzaFattureJFrame(this, ControllerP);
		VisualizzaFatture.setVisible(true);
		
	}

	
	public void CompletaTabellaCarrelloKG() {
		ArrayList<Prodotto_kg> CarrelloKG = null;
		try {
			CarrelloKG = DAO.getCarrelloKGByID(CarrelloDaCreare.getIDCarrello());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Prodotto_kg p : CarrelloKG)
    		CarrelloAttuale.setRigheTabellaKG(p.getID_Prodotto(),p.getScorte_kg());
    }
	
	public void CompletaTabellaCarrelloN() {
    	ArrayList<Prodotto_unitario> CarrelloN = null;
    	try {
			CarrelloN = DAO.getCarrelloNByID(CarrelloDaCreare.getIDCarrello());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Prodotto_unitario p : CarrelloN)
    		CarrelloAttuale.setRigheTabellaN(p.getID_Prodotto(),p.getScorte());
    }
	
	public void CreaCarrello() {
		
	}
	public void CompletaTabellaFattura() {
		
		Carrello Carrello = null;
		try {
			
			 Carrello = DAO.getCarrello(DAO.getIDCarrelloByIDFattura(RicercaCarrelloDialog.getIDFatturaTB()));
		
		} catch (SQLException e) {
			
			
		}
		if(Carrello == null) {
		IDFatturaNonTrovato = new IDFatturaNonTrovatoJDialog(this);
		IDFatturaNonTrovato.setVisible(true);
		}
		else
		{
		RicercaCarrelloDialog.setVisible(false);
		VisualizzaFatture.setVisible(false);
		VisualizzaCarrello1 = new VisualizzaCarrelloJFrame(this, ControllerP);
		VisualizzaCarrello1.setRigheTabella(Carrello.getPuntiFrutta(), Carrello.getPuntiVerdura(), Carrello.getPuntiConfezionati(), Carrello.getPuntiFarinacei(), Carrello.getPuntiUova(), Carrello.getPuntiLatticini());
		VisualizzaCarrello1.setVisible(true);
		}
	}
	public void IDCarrelloRicercaFatturaAvantiBottonePremuto() {

		VisualizzaFatture.setVisible(false);
		RicercaCarrelloDialog.setVisible(false);
		VisualizzaCarrello1 = new VisualizzaCarrelloJFrame(this, ControllerP);
		VisualizzaCarrello1.setVisible(true);
		
	}
	public void VisualizzaCarrello1VenditePercorsoBottonePremuto() {

		VisualizzaCarrello1.setVisible(false);
		Vendite = new VenditeJFrame(this, ControllerP);
		Vendite.setVisible(true);
		
	}
	public void VisualizzaCarrelloVisualizzaCarrelloPercorsoBottonePremuto() {

		VisualizzaCarrello1.setVisible(false);
		VisualizzaFatture.setVisible(true);
		
	}
	
	//GETTERS
	
	public VisualizzaCarrelloJFrame getVisualizzaCarrello1() {
		return VisualizzaCarrello1;
	}
	
	public VenditeJFrame getVendite() {
		return Vendite;
	}
	
	public CreaCarrelloJFrame getCreaCarrello() {
		return CreaCarrello;
	}
	
	public VisualizzaFattureJFrame getVisualizzaCarrello() {
		return VisualizzaFatture;
	}

	public void VisualizzaCarrello1VisualizzaDettagliPercorsoBottonePremuto() {

		VisualizzaCarrello1.setVisible(false);
		VisualizzaCarrello1.setVisible(true);
		
	}

	
	
	

}
