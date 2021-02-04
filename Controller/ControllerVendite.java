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
import Entit‡.ProdottoUnitario;
import Entit‡.Tessera;
import Entit‡.Uova;
import Entit‡.Verdura;

import GUI.Vendite.CarrelloAttualeJFrame;

import GUI.Vendite.CreaCarrelloJFrame;
import GUI.Vendite.ErroreInserisciTesseraJDialog;
import GUI.Vendite.GenerazioneFatturaCompletataJDialog;
import GUI.Vendite.RicercaFatturaJDialog;
import GUI.Vendite.IDFatturaNonTrovatoJDialog;
import GUI.Vendite.InserisciNTesseraJDialog;
import GUI.Vendite.SalvataggioCarrelloJDialog;
import GUI.Vendite.VenditeJFrame;
import GUI.Vendite.VisualizzaDettagliFatturaJFrame;
import GUI.Vendite.VisualizzaFattureJFrame;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import ImplementazioniDAO.VenditeDAOPostgres;
import Risorse.MieEccezioni.CarrelloNonTrovatoException;
import Risorse.MieEccezioni.CarrelloVuotoException;
import Risorse.MieEccezioni.TesseraNonTrovataException;




public class ControllerVendite {


	
	 private ControllerPrincipale ControllerP;
	 private VenditeJFrame Vendite;
	 private VisualizzaDettagliFatturaJFrame VisualizzaDettagliFattura;
	 private RicercaFatturaJDialog RicercaFattura;
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
    		CreaCarrello.setRigheTabellaFrutta(f.getIDProdotto(), f.getNome(), f.getProvenienza(), f.getLottoLavorazione(), f.getDataRaccolta(), f.getValore(), f.getScorte_kg());
    }
	
	public void CompletaTabellaUova() {
    	ArrayList<Uova> ProdottiUova = null;
		try {
			ProdottiUova = DAOM.getUova();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Uova u : ProdottiUova)
			CreaCarrello.setRigheTabellaUova(u.getIDProdotto(), u.getNPerConfezione(), u.getProvenienza(), u.getLottoLavorazione(), u.getData_scadenza(), u.getValore(), u.getScorte());
    }
	
	public void CompletaTabellaVerdura() {
    	ArrayList<Verdura> ProdottiVerdura = null;
		try {
			ProdottiVerdura = DAOM.getVerdura();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	for(Verdura v : ProdottiVerdura)
    		CreaCarrello.setRigheTabellaVerdura(v.getIDProdotto(), v.getNome(), v.getProvenienza(), v.getLottoLavorazione(), v.getDataRaccolta(), v.getValore(), v.getScorte_kg());
    }
	
	public void CompletaTabellaFarinacei() {
    	ArrayList<Farinaceo> ProdottiFarinacei = null;
		try {
			ProdottiFarinacei = DAOM.getFarinacei();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Farinaceo f : ProdottiFarinacei)
    		CreaCarrello.setRigheTabellaFarinacei(f.getIDProdotto(), f.getNome(),f.getLottoLavorazione(),f.getDataScadenza(),f.getValore(),f.getScorte_kg());
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
    		CreaCarrello.setRigheTabellaLatticini(l.getIDProdotto(), l.getNome(), l.getPaeseMungitura(), l.getPaeseLavorazione(), l.getDataMungitura(),l.getDataScadenza(), l.getValore(), l.getScorte_kg());
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
    		CreaCarrello.setRigheTabellaConfezionati(c.getIDProdotto(), c.getNome(), c.getMarca(), c.getLottoLavorazione(), c.getDataScadenza(), c.getModalit‡Conservazione(),c.getPeso(), c.getValore(), c.getScorte());
    }

	public void AggiungiAlCarrello() {
		
		
		try {
			int IDProdotto = Integer.parseInt(CreaCarrello.getIDProdotto());
			String Categoria = CreaCarrello.getCategoria();
			if(Categoria == "Frutta"||Categoria == "Verdura"||Categoria == "Farinacei"||Categoria == "Latticini") {
				float Quantit‡KG = Float.parseFloat(CreaCarrello.getQuantit‡());
				DAO.inserisciCompCarelloKG(CarrelloDaCreare.getIDCarrello(), IDProdotto, Quantit‡KG);
				CreaCarrello.ProdottoAggiunto();
			} else {
				int Quantit‡N = Integer.parseInt(CreaCarrello.getQuantit‡());
				DAO.inserisciCompCarelloN(CarrelloDaCreare.getIDCarrello(), IDProdotto, Quantit‡N);
				CreaCarrello.ProdottoAggiunto();
				
				
			}
		
		}
		
		catch(SQLException|NumberFormatException e) {
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
	
	public void CompletaTabellaCarrelloKG() {
		ArrayList<Prodotto_kg> CarrelloKG = null;
		try {
			CarrelloKG = DAO.getCarrelloKGByID(CarrelloDaCreare.getIDCarrello());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Prodotto_kg p : CarrelloKG)
    		CarrelloAttuale.setRigheTabellaKG(p.getIDProdotto(),p.getScorte_kg());
    }
	
	public void CompletaTabellaCarrelloN() {
    	ArrayList<ProdottoUnitario> CarrelloN = null;
    	try {
			CarrelloN = DAO.getCarrelloNByID(CarrelloDaCreare.getIDCarrello());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(ProdottoUnitario p : CarrelloN)
    		CarrelloAttuale.setRigheTabellaN(p.getIDProdotto(),p.getScorte());
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
		
		
		try {
			Tessera Compratore = new Tessera(Integer.parseInt(InserisciTessera.getNTesseraTF()));
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
			
		} catch (NumberFormatException|TesseraNonTrovataException|SQLException|CarrelloVuotoException e) {
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
		ControllerP.NascondiVisualizzaClientiNTessera();
		InserisciTessera.setVisible(false);
	}

	public void ErroreTesseraRiprovaBottonePremuto() {
		InserisciTessera.setEnabled(true);
		ControllerP.VisualizzaClientiNTessera();
		ErroreTessera.setVisible(false);
	}
	
	public void GenerazioneFatturaCompletataOkBottonePremuto(){
		GenerazioneCompletata.setVisible(false);
		CreaCarrello.setEnabled(true);
		CreaCarrello.setVisible(false);
		Vendite.setVisible(true);
	}

	//FINESTRA VISUALIZZA FATTURE
	
	public void VisualizzaFatturePercorsoVenditeBottonePremuto() {
		
		VisualizzaFatture.setVisible(false);
		Vendite.setVisible(true);
		
	}
	
	public void VisualizzaFatturePercorsoVisualizzaVenditeBottonePremuto() {
		
		VisualizzaFatture.setVisible(false);
		VisualizzaFatture = new VisualizzaFattureJFrame(this, ControllerP);
		VisualizzaFatture.setVisible(true);
		
	}
	
	public void CompletaTabellaFatture() {
		
    	ArrayList<Fattura> Fattura=null;
    	try {
			Fattura = DAO.getFattura();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
    	for(Fattura f : Fattura) {
			VisualizzaFatture.setRigheTabella(f.getNTessera(), f.getIDFattura(), f.getPrezzoTotale(), f.getPuntiTotali(), f.getDataEmissione());
    	}
    }
	
	public void VisualizzaFattureDettagliCarrelloBottonePremuto() {

		VisualizzaFatture.setEnabled(false);
		RicercaFattura = new RicercaFatturaJDialog(this);
		RicercaFattura.setVisible(true);
	}
	
	//FINESTRA VISUALIZZA DETTAGLI FATTURA
	
	
	
	public void VisualizzaDettagliFatturaVisualizzaFatturePercorsoBottonePremuto() {

		VisualizzaDettagliFattura.setVisible(false);
		VisualizzaFatture.setEnabled(true);
		VisualizzaFatture.setVisible(true);
		
	}
	
	public void VisualizzaDettagliFatturaVisualizzaDettagliPercorsoBottonePremuto() {

		VisualizzaDettagliFattura.setVisible(false);
		VisualizzaDettagliFattura.setVisible(true);
		
	}
	
	public void VisualizzaDettagliFatturaVenditePercorsoBottonePremuto() {

		VisualizzaDettagliFattura.setVisible(false);
		Vendite = new VenditeJFrame(this, ControllerP);
		Vendite.setVisible(true);
		
	}
	
	public void CompletaTabellaDettagliFattura() {
		
		Carrello Carrello = null;
		try {
			 Carrello = DAO.getIDCarrelloByIDFattura(RicercaFattura.getIDFatturaTF());
			 Carrello = DAO.getCarrello(Carrello.getIDCarrello());
			 RicercaFattura.setVisible(false);
			 VisualizzaFatture.setVisible(false);
			 VisualizzaDettagliFattura = new VisualizzaDettagliFatturaJFrame(this, ControllerP);
			 VisualizzaDettagliFattura.setRigheTabella(Carrello.getPuntiFrutta(), Carrello.getPuntiVerdura(), Carrello.getPuntiConfezionati(), Carrello.getPuntiFarinacei(), Carrello.getPuntiUova(), Carrello.getPuntiLatticini());
			 VisualizzaDettagliFattura.setVisible(true);
			 
		}  
		
		catch (SQLException|CarrelloNonTrovatoException|NumberFormatException e) {
			
			RicercaFattura.setVisible(false);
			IDFatturaNonTrovato = new IDFatturaNonTrovatoJDialog(this);
			IDFatturaNonTrovato.setVisible(true);
			
		} 
			
		

	}
	public void RicercaFatturaAvantiBottonePremuto() {

		VisualizzaFatture.setEnabled(true);
		VisualizzaFatture.setVisible(false);
		RicercaFattura.setVisible(false);
		VisualizzaDettagliFattura = new VisualizzaDettagliFatturaJFrame(this, ControllerP);
		VisualizzaDettagliFattura.setVisible(true);

		
	}
	
	
	
	public void RicercaFatturaIndietroBottonePremuto() {

		RicercaFattura.setVisible(false);
		VisualizzaFatture.setEnabled(true);
		VisualizzaFatture.setVisible(true);
	}
	
	public void IDFatturaNonTrovatoRiprovaBottonePremuto() {

		IDFatturaNonTrovato.setVisible(false);
		VisualizzaFatture.setEnabled(true);
		VisualizzaFatture.setVisible(true);
		
	}
	
	//GETTERS
	
	public VisualizzaDettagliFatturaJFrame getVisualizzaDettagliFattura() {
		return VisualizzaDettagliFattura;
	}
	
	public VenditeJFrame getVendite() {
		return Vendite;
	}
	
	public CreaCarrelloJFrame getCreaCarrello() {
		return CreaCarrello;
	}
	
	public VisualizzaFattureJFrame getVisualizzaFatture() {
		return VisualizzaFatture;
	}

	

	

	

	
	
	

}
