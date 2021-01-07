package Controller;

import javax.swing.JFrame;

import GUI.AggiungiConfezionatiJFrame;
import GUI.AggiungiFarinaceiJFrame;
import GUI.AggiungiFruttaJFrame;
import GUI.AggiungiLatticiniJFrame;
import GUI.AggiungiProdottoJFrame;
import GUI.AggiungiUovaJFrame;
import GUI.AggiungiVerduraJFrame;
import GUI.ClientiJFrame;
import GUI.MagazzinoJFrame;
import GUI.VisualizzaProdottiJFrame;

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
	
	public ControllerMagazzino() {
		
		Magazzino = new MagazzinoJFrame(this);
		Magazzino.setVisible(true);
		
	}
	
	public void MostraFinestraAggiungiProdotto() {
		Magazzino.setVisible(false);
		AggiungiPr = new AggiungiProdottoJFrame(this);
		AggiungiPr.setVisible(true);
		
	}
	
	public void MostraFinestraVisualizzaProdotto() {
		Magazzino.setVisible(false);
		VisualizzaPr = new VisualizzaProdottiJFrame();
		VisualizzaPr.setVisible(true);
		
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



}
