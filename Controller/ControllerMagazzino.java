package Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

import App.ConvertiCBInData;
import DAO.MagazzinoDAO;
import GUI.AggiungiConfezionatiJFrame;
import GUI.AggiungiFarinaceiJFrame;
import GUI.AggiungiFruttaJFrame;
import GUI.AggiungiLatticiniJFrame;
import GUI.AggiungiProdottoJFrame;
import GUI.AggiungiUovaJFrame;
import GUI.AggiungiVerduraJFrame;
import GUI.ClientiJFrame;
import GUI.MagazzinoJFrame;
import GUI.VisualizzaConfezionatiJFrame;
import GUI.VisualizzaFarinaceiJFrame;
import GUI.VisualizzaFruttaJFrame;
import GUI.VisualizzaLatticiniJFrame;
import GUI.VisualizzaProdottiJFrame;
import GUI.VisualizzaUovaJFrame;
import GUI.VisualizzaVerduraJFrame;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import Entità.*
;
public class ControllerMagazzino {
	
	private MagazzinoJFrame Magazzino;
	private ClientiJFrame Clienti;
	private AggiungiConfezionatiJFrame Confezionati;
	private AggiungiFarinaceiJFrame Farinacei;
	private AggiungiFruttaJFrame Frutta;
	private AggiungiProdottoJFrame AggiungiPr;
	private AggiungiUovaJFrame Uova;
	private AggiungiVerduraJFrame Verdura;
	private VisualizzaProdottiJFrame VisualizzaPr;
	private AggiungiLatticiniJFrame Latticini;
	private VisualizzaFruttaJFrame VisualizzaFrutta;
	private VisualizzaVerduraJFrame VisualizzaVerdura;
	private VisualizzaFarinaceiJFrame VisualizzaFarinacei;
	private VisualizzaConfezionatiJFrame VisualizzaConfezionati;
	private VisualizzaUovaJFrame VisualizzaUova;
	private VisualizzaLatticiniJFrame VisualizzaLatticini;
	private MagazzinoDAO DAO;
	private ConvertiCBInData Convertitore;
	
	public ControllerMagazzino(Connection Conn) throws SQLException {
		
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
		DAO = new MagazzinoDAOPostgres(Conn);
		
	}
	
	public void MostraFinestraAggiungiProdotto() {
		Magazzino.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
		
	}
	
	public void MostraFinestraVisualizzaProdotto() {
		Magazzino.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
		
	}
	
	public void MostraFinestraVisualizzaFrutta() {
		VisualizzaPr.setVisible(false);
		VisualizzaFrutta = new VisualizzaFruttaJFrame(this);
		VisualizzaFrutta.setVisible(true);
		
	}
	
    public void MostraFinestraClientidaMagazzino() {
		
//		Magazzino.setVisible(false);
//		//Clienti = new ClientiJFrame(this);
//		Clienti.setVisible(true); DA AGGIUSTARE
	
	}
	
    public void MostraFinestraMagazzinoPercorso() {
		
		AggiungiPr.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} //DA MODIFICARE CON INSCURIMENTO DELLA FINESTRA IN CUI SONO
	
    public void MostraFinestraAggiungiProdPercorso() {
		
		AggiungiPr.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	}
    
    public void MostraFinestraFrutta() {
    	
    	AggiungiPr.setVisible(false);
    	Frutta = new AggiungiFruttaJFrame(this);
    	Frutta.setVisible(true);
    	
    }
    public void MostraFinestraVerdura() {
    	
    	AggiungiPr.setVisible(false);
    	Verdura = new AggiungiVerduraJFrame(this);
    	Verdura.setVisible(true);
    	
    }
    
    public void MostraFinestraFarinacei() {
    	
    	AggiungiPr.setVisible(false);
    	Farinacei = new AggiungiFarinaceiJFrame(this);
    	Farinacei.setVisible(true);
    	
    }
    
    public void MostraFinestraLatticini() {
    	
    	AggiungiPr.setVisible(false);
    	Latticini = new AggiungiLatticiniJFrame(this);
    	Latticini.setVisible(true);
    	
    }
    
    public void MostraFinestraConfezionati() {
    	
    	AggiungiPr.setVisible(false);
    	Confezionati = new AggiungiConfezionatiJFrame(this);
    	Confezionati.setVisible(true);
    	
    }
    
    public void MostraFinestraUova() {
    	
    	AggiungiPr.setVisible(false);
    	Uova = new AggiungiUovaJFrame(this);
    	Uova.setVisible(true);
    	
    }
    
    public void FruttaBottoneAvantiPremuto() throws SQLException {
    	String Nome = Frutta.getInserisciNomeTB();
    	String Lotto = Frutta.getInserisciLottoTB();
    	String Provenienza = Frutta.getInserisciProvenienzaTB();
    	float Scorte = Float.parseFloat(Frutta.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Frutta.getInserisciValorekgTB());
    	String Giorno = Frutta.getInserisciGiornoCB();
    	String Mese = Frutta.getInserisciMeseCB();
    	String Anno = Frutta.getInserisciAnnoCB();
    	Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
    	Date Data_Raccolta = Convertitore.Converti();
    	DAO.inserisciFrutta(Nome,Lotto,Provenienza,Data_Raccolta,Scorte,Valore);
    	
    	
    }
    
    public void VerduraBottoneAvantiPremuto() throws SQLException {
    	String Nome = Verdura.getInserisciNomeTB();
    	String Lotto = Verdura.getInserisciLottoTB();
    	String Provenienza = Verdura.getInserisciProvenienzaTB();
    	float Scorte = Float.parseFloat(Verdura.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Verdura.getInserisciValorekgTB());
    	String Giorno = Verdura.getInserisciGiornoCB();
    	String Mese = Verdura.getInserisciMeseCB();
    	String Anno = Verdura.getInserisciAnnoCB();
    	Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
    	Date Data_Raccolta = Convertitore.Converti();
    	DAO.inserisciVerdura(Nome,Lotto,Provenienza,Data_Raccolta,Scorte,Valore);
    	
    	
    }
    
    public void LatticiniBottoneAvantiPremuto() throws SQLException {
    	String Nome = Latticini.getInserisciNomeTB();
    	String Paese_Lavorazione = Latticini.getInserisciPaeseLavorazioneTB();
    	String Paese_Mungitura = Latticini.getInserisciPaeseMungituraTB();
    	float Scorte = Float.parseFloat(Latticini.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Latticini.getInserisciValorekgTB());
    	String GiornoM = Latticini.getInserisciGiornoMungituraCB();
    	String MeseM = Latticini.getInserisciMeseMungituraCB();
    	String AnnoM = Latticini.getInserisciAnnoMungituraCB();
    	String GiornoS = Latticini.getInserisciGiornoScadenzaCB();
    	String MeseS = Latticini.getInserisciMeseScadenzaCB();
    	String AnnoS = Latticini.getInserisciAnnoScadenzaCB();
    	Convertitore = new ConvertiCBInData(GiornoM,MeseM,AnnoM);
    	Date Data_Mungitura = Convertitore.Converti();
    	Convertitore = new ConvertiCBInData(GiornoS,MeseS,AnnoS);
    	Date Data_Scadenza = Convertitore.Converti();
    	DAO.inserisciLatticini(Nome,Paese_Mungitura,Paese_Lavorazione,Data_Mungitura,Data_Scadenza,Scorte,Valore);
    	
    	
    }
    
    
    public void FarinaceiBottoneAvantiPremuto() throws SQLException {
    	String Nome = Farinacei.getInserisciNomeTB();
    	String Lotto = Farinacei.getInserisciLottoTB();
    	float Scorte = Float.parseFloat(Farinacei.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Farinacei.getInserisciValorekgTB());
    	String Giorno = Farinacei.getInserisciGiornoCB();
    	String Mese = Farinacei.getInserisciMeseCB();
    	String Anno = Farinacei.getInserisciAnnoCB();
    	Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
    	Date Data_Scadenza = Convertitore.Converti();
    	DAO.inserisciFarinacei(Nome,Lotto,Data_Scadenza,Scorte,Valore);
    	
    	
    }
    
    public void UovaBottoneAvantiPremuto() throws SQLException {
    	String Nome = Uova.getInserisciNomeTB();
    	String Lotto = Uova.getInserisciLottoTB();
    	String Provenienza = Uova.getInserisciProvenienzaTB();
    	int Scorte = Integer.parseInt(Uova.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Uova.getInserisciValoreTB());
    	String Giorno = Uova.getInserisciGiornoScadenzaCB();
    	String Mese = Uova.getInserisciMeseScadenzaCB();
    	String Anno = Uova.getInserisciAnnoScadenzaCB();
    	int NPerConfezione = Integer.parseInt(Uova.getInserisciNPerConfezione());
    	Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
    	Date Data_Scadenza = Convertitore.Converti();
    	DAO.inserisciUova(Lotto,Data_Scadenza,Provenienza,Scorte,Valore,NPerConfezione);
    	
    	
    }
    
    public void ConfezionatiBottoneAvantiPremuto() throws SQLException {
    	String Nome = Confezionati.getInserisciNomeTB();
    	String Lotto = Confezionati.getInserisciLottoTB();
    	String Mod_Conservazione = Confezionati.getInserisciModConservazioneTB();
    	String Marca = Confezionati.getInserisciMarcaTB();
    	int Scorte = Integer.parseInt(Confezionati.getInserisciScorteTB());
    	float Valore = Float.parseFloat(Confezionati.getInserisciValorekgTB());
    	float Peso_Confezione = Float.parseFloat(Confezionati.getInserisciPesoConfezioneTB());
    	String Giorno = Confezionati.getInserisciGiornoCB();
    	String Mese = Confezionati.getInserisciMeseCB();
    	String Anno = Confezionati.getInserisciAnnoCB();
    	Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
    	Date Data_Scadenza = Convertitore.Converti();
    	DAO.inserisciConfezionati(Nome, Marca, Lotto, Mod_Conservazione, Data_Scadenza, Scorte, Peso_Confezione, Valore);
    	
    	
    }
    
    public void CompletaTabellaFrutta() throws SQLException {
    	ArrayList<Frutta> ProdottiFrutta = DAO.getFrutta();
    	for(Frutta f : ProdottiFrutta)
    	VisualizzaFrutta.setRigheTabella(f.getID_Prodotto(), f.getNome(), f.getProvenienza(), f.getLotto_lavorazione(), f.getData_raccolta(), f.getValore(), f.getScorte_kg());
    }
    
    public void CompletaTabellaVerdura() throws SQLException {
    	ArrayList<Verdura> ProdottiVerdura = DAO.getVerdura();
    	for(Verdura v : ProdottiVerdura)
    	VisualizzaVerdura.setRigheTabella(v.getID_Prodotto(), v.getNome(), v.getProvenienza(), v.getLotto_lavorazione(), v.getData_raccolta(), v.getValore(), v.getScorte_kg());
    }
    
    public void CompletaTabellaFarinacei() throws SQLException {
    	ArrayList<Farinaceo> ProdottiFarinacei = DAO.getFarinacei();
    	for(Farinaceo f : ProdottiFarinacei)
    	VisualizzaFarinacei.setRigheTabella(f.getID_Prodotto(), f.getNome(),f.getLotto_lavorazione(),f.getData_scadenza(),f.getValore(),f.getScorte_kg());
    }
    
    public void CompletaTabellaLatticini() throws SQLException {
    	ArrayList<Latticino> ProdottiLatticini = DAO.getLatticini();
    	for(Latticino l : ProdottiLatticini)
    	VisualizzaLatticini.setRigheTabella(l.getID_Prodotto(), l.getNome(), l.getPaese_mungitura(), l.getPaese_lavorazione(), l.getData_mungitura(),l.getData_scadenza(), l.getValore(), l.getScorte_kg());
    }
    
    public void CompletaTabellaUova() throws SQLException {
    	ArrayList<Uova> ProdottiUova = DAO.getUova();
    	for(Uova u : ProdottiUova)
    	VisualizzaUova.setRigheTabella(u.getID_Prodotto(), u.getN_perConfezione(), u.getProvenienza(), u.getLotto_lavorazione(), u.getData_scadenza(), u.getValore(), u.getScorte());
    }
    
    public void CompletaTabellaConfezionati() throws SQLException {
    	ArrayList<Confezionato> ProdottiConfezionati = DAO.getConfezionati();
    	for(Confezionato c : ProdottiConfezionati)
    	VisualizzaConfezionati.setRigheTabella(c.getID_Prodotto(), c.getNome(), c.getMarca(), c.getLotto_lavorazione(), c.getData_scadenza(), c.getModalità_conservazione(),c.getPeso(), c.getValore(), c.getScorte());
    }



}
