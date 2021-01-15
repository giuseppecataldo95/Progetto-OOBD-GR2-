package Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;

import App.ConvertiCBInData;
import DAO.MagazzinoDAO;

import GUI.Magazzino.AggiungiConfezionatiJFrame;
import GUI.Magazzino.AggiungiFarinaceiJFrame;
import GUI.Magazzino.AggiungiFruttaJFrame;
import GUI.Magazzino.AggiungiLatticiniJFrame;
import GUI.Magazzino.AggiungiProdottoJFrame;
import GUI.Magazzino.AggiungiUovaJFrame;
import GUI.Magazzino.AggiungiVerduraJFrame;
import GUI.Magazzino.ErroreAggiungiProdottoJDialog;
import GUI.Magazzino.InserimentoProdottoCompletatoJDialog;
import GUI.Magazzino.MagazzinoJFrame;
import GUI.Magazzino.VisualizzaConfezionatiJFrame;
import GUI.Magazzino.VisualizzaFarinaceiJFrame;
import GUI.Magazzino.VisualizzaFruttaJFrame;
import GUI.Magazzino.VisualizzaLatticiniJFrame;
import GUI.Magazzino.VisualizzaProdottiJFrame;
import GUI.Magazzino.VisualizzaUovaJFrame;
import GUI.Magazzino.VisualizzaVerduraJFrame;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import Entità.*
;
public class ControllerMagazzino {
	
	private MagazzinoJFrame Magazzino;
	private AggiungiConfezionatiJFrame Confezionati;
	private AggiungiFarinaceiJFrame Farinacei;
	private AggiungiFruttaJFrame Frutta;
	private AggiungiProdottoJFrame AggiungiPr = new AggiungiProdottoJFrame(this);
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
	private ErroreAggiungiProdottoJDialog ErroreAggiungi;
	private ControllerPrincipale ControllerP;
	private InserimentoProdottoCompletatoJDialog InserimentoCompletato;
	
	//COSTRUTTORE
	
	public ControllerMagazzino(Connection Conn, ControllerPrincipale P) throws SQLException {
		
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
		DAO = new MagazzinoDAOPostgres(Conn);
		ControllerP = P;
		
	}
	
	// METODI
	
	public void MostraFinestraVisualizzaProdotto() {
		Magazzino.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
		
	}
	
	public void VisualizzaProdotti_MagazzinoPercorsoBottonePremuto() {
		VisualizzaPr.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	}
	
	public void VisualizzaProdotti_VisualizzaProdottiPercorsoBottonePremuto() {
		VisualizzaPr.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	}
	
	// METODI PER LO SNODO 'VISUALIZZA PRODOTTO'
	
	public void MostraFinestraVisualizzaFrutta() {
		VisualizzaPr.setVisible(false);
		VisualizzaFrutta = new VisualizzaFruttaJFrame(this);
		VisualizzaFrutta.setVisible(true);
		
	}
	
	public void CompletaTabellaFrutta() {
    	ArrayList<Frutta> ProdottiFrutta = null;
		try {
			ProdottiFrutta = DAO.getFrutta();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Frutta f : ProdottiFrutta)
    		VisualizzaFrutta.setRigheTabella(f.getID_Prodotto(), f.getNome(), f.getProvenienza(), f.getLotto_lavorazione(), f.getData_raccolta(), f.getValore(), f.getScorte_kg());
    }
	
	public void VisualizzaFrutta_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaFrutta.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaFrutta_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaFrutta.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaFrutta_VisualizzaFruttaPercorsoBottonePremuto() {
		
    	VisualizzaFrutta.setVisible(false);
    	VisualizzaFrutta = new VisualizzaFruttaJFrame(this);
    	VisualizzaFrutta.setVisible(true);
	
	} 
	
	public void VisualizzaFruttaBottoneIndietroPremuto() {
    	VisualizzaFrutta.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	public void MostraFinestraVisualizzaVerdura() {
		VisualizzaPr.setVisible(false);
		VisualizzaVerdura = new VisualizzaVerduraJFrame(this);
		VisualizzaVerdura.setVisible(true);
		
	}
	
	public void CompletaTabellaVerdura() {
    	ArrayList<Verdura> ProdottiVerdura = null;
		try {
			ProdottiVerdura = DAO.getVerdura();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	for(Verdura v : ProdottiVerdura)
    		VisualizzaVerdura.setRigheTabella(v.getID_Prodotto(), v.getNome(), v.getProvenienza(), v.getLotto_lavorazione(), v.getData_raccolta(), v.getValore(), v.getScorte_kg());
    }
	
	public void VisualizzaVerdura_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaVerdura.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaVerdura_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaVerdura.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaVerdura_VisualizzaVerduraPercorsoBottonePremuto() {
		
    	VisualizzaVerdura.setVisible(false);
    	VisualizzaVerdura = new VisualizzaVerduraJFrame(this);
    	VisualizzaVerdura.setVisible(true);
	
	} 
	
	public void VisualizzaVerduraBottoneIndietroPremuto() {
    	VisualizzaVerdura.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	public void MostraFinestraVisualizzaFarinacei() {
		VisualizzaPr.setVisible(false);
		VisualizzaFarinacei = new VisualizzaFarinaceiJFrame(this);
		VisualizzaFarinacei.setVisible(true);
		
	}
	
	public void CompletaTabellaFarinacei() {
    	ArrayList<Farinaceo> ProdottiFarinacei = null;
		try {
			ProdottiFarinacei = DAO.getFarinacei();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	for(Farinaceo f : ProdottiFarinacei)
	    	VisualizzaFarinacei.setRigheTabella(f.getID_Prodotto(), f.getNome(),f.getLotto_lavorazione(),f.getData_scadenza(),f.getValore(),f.getScorte_kg());
	}
	
	public void VisualizzaFarinacei_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaFarinacei.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaFarinacei_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaFarinacei.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaFarinacei_VisualizzaFarinaceiPercorsoBottonePremuto() {
		
    	VisualizzaFarinacei.setVisible(false);
    	VisualizzaFarinacei = new VisualizzaFarinaceiJFrame(this);
    	VisualizzaFarinacei.setVisible(true);
	
	} 
	
	public void VisualizzaFarinaceiBottoneIndietroPremuto() {
    	VisualizzaFarinacei.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	public void MostraFinestraVisualizzaLatticini() {
		VisualizzaPr.setVisible(false);
		VisualizzaLatticini = new VisualizzaLatticiniJFrame(this);
		VisualizzaLatticini.setVisible(true);
		
	}
	
	public void CompletaTabellaLatticini() {
    	ArrayList<Latticino> ProdottiLatticini = null;
		try {
			ProdottiLatticini = DAO.getLatticini();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(Latticino l : ProdottiLatticini)
    		VisualizzaLatticini.setRigheTabella(l.getID_Prodotto(), l.getNome(), l.getPaese_mungitura(), l.getPaese_lavorazione(), l.getData_mungitura(),l.getData_scadenza(), l.getValore(), l.getScorte_kg());
    }
	
	public void VisualizzaLatticini_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaLatticini.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaLatticini_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaLatticini.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaLatticini_VisualizzaLatticiniPercorsoBottonePremuto() {
		
    	VisualizzaLatticini.setVisible(false);
    	VisualizzaLatticini = new VisualizzaLatticiniJFrame(this);
    	VisualizzaLatticini.setVisible(true);
	
	}
	
	public void VisualizzaLatticiniBottoneIndietroPremuto() {
    	VisualizzaLatticini.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	public void MostraFinestraVisualizzaConfezionati() {
		VisualizzaPr.setVisible(false);
		VisualizzaConfezionati = new VisualizzaConfezionatiJFrame(this);
		VisualizzaConfezionati.setVisible(true);
		
	}
	
	public void CompletaTabellaConfezionati() {
    	ArrayList<Confezionato> ProdottiConfezionati = null;
		try {
			ProdottiConfezionati = DAO.getConfezionati();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(Confezionato c : ProdottiConfezionati)
    	VisualizzaConfezionati.setRigheTabella(c.getID_Prodotto(), c.getNome(), c.getMarca(), c.getLotto_lavorazione(), c.getData_scadenza(), c.getModalità_conservazione(),c.getPeso(), c.getValore(), c.getScorte());
    }
	
	public void VisualizzaConfezionati_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaConfezionati.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaConfezionati_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaConfezionati.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaConfezionati_VisualizzaConfezionatiPercorsoBottonePremuto() {
		
    	VisualizzaConfezionati.setVisible(false);
    	VisualizzaConfezionati = new VisualizzaConfezionatiJFrame(this);
    	VisualizzaConfezionati.setVisible(true);
	
	}

	public void VisualizzaConfezionatiBottoneIndietroPremuto() {
    	VisualizzaConfezionati.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	public void MostraFinestraVisualizzaUova() {
		VisualizzaPr.setVisible(false);
		VisualizzaUova = new VisualizzaUovaJFrame(this);
		VisualizzaUova.setVisible(true);
		
	}
	
	public void CompletaTabellaUova() {
    	ArrayList<Uova> ProdottiUova = null;
		try {
			ProdottiUova = DAO.getUova();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Uova u : ProdottiUova)
			VisualizzaUova.setRigheTabella(u.getID_Prodotto(), u.getN_perConfezione(), u.getProvenienza(), u.getLotto_lavorazione(), u.getData_scadenza(), u.getValore(), u.getScorte());
    }
	
	public void VisualizzaUova_MagazzinoPercorsoBottonePremuto() {
		
		VisualizzaUova.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void VisualizzaUova_VisualizzaProdottoPercorsoBottonePremuto() {
		
    	VisualizzaUova.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame(this);
		VisualizzaPr.setVisible(true);
	
	} 
    
    public void VisualizzaUova_VisualizzaUovaPercorsoBottonePremuto() {
		
    	VisualizzaUova.setVisible(false);
    	VisualizzaUova = new VisualizzaUovaJFrame(this);
    	VisualizzaUova.setVisible(true);
	
	}
	
	public void VisualizzaUovaBottoneIndietroPremuto() {
    	VisualizzaUova.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
	
	// METODI PER LO SNODO 'AGGIUNGI PRODOTTO'
	
	public void MostraFinestraAggiungiProdotto() {
		Magazzino.setVisible(false);
		AggiungiPr.setVisible(true);
		
	}
	
    public void AggiungiProdotto_MagazzinoPercorsoBottonePremuto() {
		
		AggiungiPr.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
	
    public void AggiungiProdotto_AggiungiProdottoPercorsoBottonePremuto() {
		
		AggiungiPr.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	}
    
    public void MostraFinestraFrutta() {
    	
    	AggiungiPr.setVisible(false);
    	Frutta = new AggiungiFruttaJFrame(this);
    	Frutta.setVisible(true);
    	
    }
    
    public void Frutta_MagazzinoPercorsoBottonePremuto() {
		
		Frutta.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Frutta_AggiungiProdottoPercorsoBottonePremuto() {
		
		Frutta.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Frutta_FruttaPercorsoBottonePremuto() {
		
		Frutta.setVisible(false);
		Frutta = new AggiungiFruttaJFrame(this);
		Frutta.setVisible(true);
	
	} 
    
    public void FruttaBottoneAvantiPremuto() {
    	try {
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
    		Frutta.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Frutta);
    		InserimentoCompletato.setVisible(true);
		} catch (NumberFormatException e) {
			Frutta.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Frutta);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);
		
		} catch (SQLException e) {
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Frutta);
			ErroreAggiungi.setError(e.getMessage());
			ErroreAggiungi.setVisible(true);
		}
    }
    
    public void FruttaBottoneIndietroPremuto() {
    	Frutta.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
   
    public void MostraFinestraVerdura() {
    	
    	AggiungiPr.setVisible(false);
    	Verdura = new AggiungiVerduraJFrame(this);
    	Verdura.setVisible(true);
    	
    }
    
    public void Verdura_MagazzinoPercorsoBottonePremuto() {
		
    	Verdura.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Verdura_AggiungiProdottoPercorsoBottonePremuto() {
		
    	Verdura.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Verdura_VerduraPercorsoBottonePremuto() {
		
    	Verdura.setVisible(false);
    	Verdura = new AggiungiVerduraJFrame(this);
    	Verdura.setVisible(true);
	
	} 
    
    public void VerduraBottoneAvantiPremuto() {
    	try {
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
    		Verdura.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Verdura);
    		InserimentoCompletato.setVisible(true);
    	} catch (NumberFormatException e) {
			Verdura.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Verdura);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);
	
    	} catch (SQLException e) {
    		ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Verdura);
    		ErroreAggiungi.setError(e.getMessage());
    		ErroreAggiungi.setVisible(true);
    	}
    }
    
    public void VerduraBottoneIndietroPremuto() {
    	Verdura.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
    
   
    
    public void MostraFinestraFarinacei() {
    	
    	AggiungiPr.setVisible(false);
    	Farinacei = new AggiungiFarinaceiJFrame(this);
    	Farinacei.setVisible(true);
    	
    }
    
    public void Farinacei_MagazzinoPercorsoBottonePremuto() {
		
    	Farinacei.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Farinacei_AggiungiProdottoPercorsoBottonePremuto() {
		
    	Farinacei.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Farinacei_FarinaceiPercorsoBottonePremuto() {
		
    	Farinacei.setVisible(false);
    	Farinacei = new AggiungiFarinaceiJFrame(this);
    	Farinacei.setVisible(true);
	
	} 
    
    public void FarinaceiBottoneAvantiPremuto() {
	    try {	
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
	    	Farinacei.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Farinacei);
    		InserimentoCompletato.setVisible(true);
	    } catch (NumberFormatException e) {
			Farinacei.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Farinacei);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);
	
		} catch (SQLException e) {
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Farinacei);
			ErroreAggiungi.setError(e.getMessage());
			ErroreAggiungi.setVisible(true);
		}
		
	}
    
    public void FarinaceiBottoneIndietroPremuto() {
    	Farinacei.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
    
    
    
    public void MostraFinestraLatticini() {
    	
    	AggiungiPr.setVisible(false);
    	Latticini = new AggiungiLatticiniJFrame(this);
    	Latticini.setVisible(true);
    	
    }
    
    public void Latticini_MagazzinoPercorsoBottonePremuto() {
		
    	Latticini.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Latticini_AggiungiProdottoPercorsoBottonePremuto() {
		
    	Latticini.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Latticini_LatticiniPercorsoBottonePremuto() {
		
    	Latticini.setVisible(false);
    	Latticini = new AggiungiLatticiniJFrame(this);
    	Latticini.setVisible(true);
	
	} 
    
    public void LatticiniBottoneAvantiPremuto() {
    	try {	
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
	    	Latticini.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Latticini);
    		InserimentoCompletato.setVisible(true);
	    } catch (NumberFormatException e) {
			Latticini.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Latticini);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);
	
		} catch (SQLException e) {
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Latticini);
			ErroreAggiungi.setError(e.getMessage());
			ErroreAggiungi.setVisible(true);
		}
    	
    }
    
    public void LatticiniBottoneIndietroPremuto() {
    	Latticini.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
    
  
    
    public void MostraFinestraConfezionati() {
    	
    	AggiungiPr.setVisible(false);
    	Confezionati = new AggiungiConfezionatiJFrame(this);
    	Confezionati.setVisible(true);
    	
    }
    
    public void Confezionati_MagazzinoPercorsoBottonePremuto() {
		
    	Confezionati.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Confezionati_AggiungiProdottoPercorsoBottonePremuto() {
		
    	Confezionati.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Confezionati_ConfezionatiPercorsoBottonePremuto() {
		
    	Confezionati.setVisible(false);
    	Confezionati = new AggiungiConfezionatiJFrame(this);
    	Confezionati.setVisible(true);
	
	} 
    
    public void ConfezionatiBottoneAvantiPremuto() {
    	try {
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
	    	Confezionati.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Confezionati);
    		InserimentoCompletato.setVisible(true);
    	} catch (NumberFormatException e) {
			Uova.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Uova);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);

    	} catch (SQLException e) {
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Uova);
			ErroreAggiungi.setError(e.getMessage());
			ErroreAggiungi.setVisible(true);
    	}
    	
    }
    
    public void ConfezionatiBottoneIndietroPremuto() {
    	Latticini.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
    
   
    
    public void MostraFinestraUova() {
    	
    	AggiungiPr.setVisible(false);
    	Uova = new AggiungiUovaJFrame(this);
    	Uova.setVisible(true);
    	
    }
    
    public void Uova_MagazzinoPercorsoBottonePremuto() {
		
    	Uova.setVisible(false);
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
	
	} 
    
    public void Uova_AggiungiProdottoPercorsoBottonePremuto() {
		
    	Uova.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
	
	} 
    
    public void Uova_UovaPercorsoBottonePremuto() {
		
    	Uova.setVisible(false);
    	Uova = new AggiungiUovaJFrame(this);
    	Uova.setVisible(true);
	
	} 
    
    public void UovaBottoneAvantiPremuto() {
	    try {
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
	    	Uova.setEnabled(false);
    		InserimentoCompletato = new InserimentoProdottoCompletatoJDialog(this, Uova);
    		InserimentoCompletato.setVisible(true);
	    } catch (NumberFormatException e) {
			Uova.setEnabled(false);
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Uova);
			ErroreAggiungi.setError("ERRORE: "+e.getMessage());
			ErroreAggiungi.setVisible(true);
	
		} catch (SQLException e) {
			ErroreAggiungi = new ErroreAggiungiProdottoJDialog(this, Uova);
			ErroreAggiungi.setError(e.getMessage());
			ErroreAggiungi.setVisible(true);
		}
    	
    }
    
    public void UovaBottoneIndietroPremuto() {
    	Uova.setVisible(false);
    	AggiungiPr = new AggiungiProdottoJFrame(this);
    	AggiungiPr.setVisible(true);
    }
    
    public void RiprovaBottonePremuto(JFrame FinestraDaCuiApro) {
    	FinestraDaCuiApro.setEnabled(true);
    	ErroreAggiungi.setVisible(false);
		
	}
    
    public void InserimentoCompletatoOkBottonePremuto(JFrame FinestraDaCuiApro) {
    	FinestraDaCuiApro.setEnabled(true);
    	FinestraDaCuiApro.setVisible(false);
    	InserimentoCompletato.setVisible(false);
    	VisualizzaPr = new VisualizzaProdottiJFrame(this);
    	VisualizzaPr.setVisible(true);
    }
    
    public void ErroreTabellaVuotaOkBottonePremuto(JFrame FinestraDaCuiApro) {
    	
    }
   
    
    
}
