package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import GUI.FinestraPrincipaleJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.ClientiJFrame;
import GUI.Magazzino.MagazzinoJFrame;


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
	
	public ControllerPrincipale(Connection Conn) throws SQLException {
		
		 Connessione= Conn;
		 ControllerM = new ControllerMagazzino(Conn,this);
		 ControllerC = new ControllerCliente(Conn,this);
		 FinestraPrincipale = new FinestraPrincipaleJFrame(this);
		 FinestraPrincipale.setVisible(true);
	}
	
	//SNODO SE CLICCO CLIENTI

	public void FinestraPrincipaleClientiButtonPressed(){
		ControllerC.getClienti().setVisible(true);
		FinestraPrincipale.setVisible(false);
	}
	
	public void ClientiMenuLateraleMagazzinoButtonPressed() {

 		ControllerC.getClienti().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
	}
	
	public void ClientiMenuLateraleClientiBottonePremuto() {

 		ControllerC.getClienti().setVisible(false);
		ControllerC.getClienti().setVisible(true);
		
		
	}
	
	public void CreaTesseraMenùLateraleClientiButtonPressed() {
		ControllerC.getCreaTessera().setVisible(false);
		ControllerC.getClienti().setVisible(true);
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
 		ControllerM.getMagazzino().setVisible(true);
 		
	}
 	
 	//SNODO PER MAGAZZINO
 	
 	public void FinestraPrincipaleMagazzinoBottonePremuto(){
		ControllerM.getMagazzino().setVisible(true);
		FinestraPrincipale.setVisible(false);
		
	}
 	
 	//TOOLBAR MAGAZZINO
 	
 	public void MagazzinoMenuLateraleClientiBottonePremuto() {
 		ControllerM.getMagazzino().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
		
	}
 	
 	public void MagazzinoMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getMagazzino().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI PRODOTTO
 	
 	public void AggiungiProdottoMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getAggiungiPr().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
 	}
 	
 	public void AggiungiProdottoMenuLateraleClientiBottonePremuto() {
 		ControllerM.getAggiungiPr().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI FRUTTA
 	
 	public void AggiungiFruttaMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getFrutta().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
 	}
 	
 	public void AggiungiFruttaMenuLateraleClientiBottonePremuto() {
 		ControllerM.getFrutta().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI VERDURA
 	
	public void AggiungiVerduraMenuLateraleMagazzinoBottonePremuto() {
		ControllerM.getVerdura().setVisible(false);
  		ControllerM.getMagazzino().setVisible(true); 
 	}
 	 	
 	public void AggiungiVerduraMenuLateraleClientiBottonePremuto() {
 		ControllerM.getVerdura().setVisible(false);
 	 	ControllerC.getClienti().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI UOVA
 	
 	public void AggiungiUovaMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getUova().setVisible(false);
 	  	ControllerM.getMagazzino().setVisible(true); 
 	}
 	 	 	
 	public void AggiungiUovaMenuLateraleClientiBottonePremuto() {
 	 	ControllerM.getUova().setVisible(false);
 	  	ControllerC.getClienti().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI FARINACEI
 	
 	public void AggiungiFarinaceiMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getFarinacei().setVisible(false);
 	  	ControllerM.getMagazzino().setVisible(true); 
 	}
 	 	 	
 	public void AggiungiFarinaceiMenuLateraleClientiBottonePremuto() {
 	 	ControllerM.getFarinacei().setVisible(false);
 	  	ControllerC.getClienti().setVisible(true);
 	}
 	
 	//TOOLBAR AGGIUNGI CONFEZIONATI
 	
 	 public void AggiungiConfezionatiMenuLateraleMagazzinoBottonePremuto() {
 	 	ControllerM.getConfezionati().setVisible(false);
 	 	 ControllerM.getMagazzino().setVisible(true); 
 	 }
 	 	 	 	
 	 public void AggiungiConfezionatiMenuLateraleClientiBottonePremuto() {
 	 	ControllerM.getConfezionati().setVisible(false);
 	 	ControllerC.getClienti().setVisible(true);
 	 }
 	 
 	//TOOLBAR AGGIUNGI LATTICINO
  	
 	 public void AggiungiLatticiniMenuLateraleMagazzinoBottonePremuto() {
 	 	ControllerM.getLatticini().setVisible(false);
 	 	ControllerM.getMagazzino().setVisible(true); 
 	 }
 	 	 	 	
 	 public void AggiungiLatticiniMenuLateraleClientiBottonePremuto() {
 	 	ControllerM.getLatticini().setVisible(false);
 	 	ControllerC.getClienti().setVisible(true);
 	 }
 	 
 	//TOOLBAR VISUALIZZA PRODOTTI
  	
  	public void VisualizzaProdottiMenuLateraleMagazzinoBottonePremuto() {
  		ControllerM.getVisualizzaPr().setVisible(false);
  		ControllerM.getMagazzino().setVisible(true);
  	}
  	
  	public void VisualizzaProdottiMenuLateraleClientiBottonePremuto() {
  		ControllerM.getVisualizzaPr().setVisible(false);
  		ControllerC.getClienti().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI FRUTTA
  	
  	public void VisualizzaFruttaMenuLateraleMagazzinoBottonePremuto() {
  		ControllerM.getVisualizzaFrutta().setVisible(false);
  		ControllerM.getMagazzino().setVisible(true);
  	}
  	
  	public void VisualizzaFruttaMenuLateraleClientiBottonePremuto() {
  		ControllerM.getVisualizzaFrutta().setVisible(false);
  		ControllerC.getClienti().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI VERDURA
  	
 	public void VisualizzaVerduraMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getVerdura().setVisible(false);
   		ControllerM.getMagazzino().setVisible(true); 
  	}
  	 	
  	public void VisualizzaVerduraMenuLateraleClientiBottonePremuto() {
  		ControllerM.getVisualizzaVerdura().setVisible(false);
  	 	ControllerC.getClienti().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI UOVA
  	
  	public void VisualizzaUovaMenuLateraleMagazzinoBottonePremuto() {
  		ControllerM.getVisualizzaUova().setVisible(false);
  	  	ControllerM.getMagazzino().setVisible(true); 
  	}
  	 	 	
  	public void VisualizzaUovaMenuLateraleClientiBottonePremuto() {
  	 	ControllerM.getVisualizzaUova().setVisible(false);
  	  	ControllerC.getClienti().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI FARINACEI
  	
  	public void VisualizzaFarinaceiMenuLateraleMagazzinoBottonePremuto() {
  		ControllerM.getVisualizzaFarinacei().setVisible(false);
  	  	ControllerM.getMagazzino().setVisible(true); 
  	}
  	 	 	
  	public void VisualizzaFarinaceiMenuLateraleClientiBottonePremuto() {
  	 	ControllerM.getVisualizzaFarinacei().setVisible(false);
  	  	ControllerC.getClienti().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI CONFEZIONATI
  	
  	 public void VisualizzaConfezionatiMenuLateraleMagazzinoBottonePremuto() {
  	 	ControllerM.getVisualizzaConfezionati().setVisible(false);
  	 	 ControllerM.getMagazzino().setVisible(true); 
  	 }
  	 	 	 	
  	 public void VisualizzaConfezionatiMenuLateraleClientiBottonePremuto() {
  	 	ControllerM.getVisualizzaConfezionati().setVisible(false);
  	 	ControllerC.getClienti().setVisible(true);
  	 }
  	 
  	//TOOLBAR AGGIUNGI LATTICINO
   	
  	 public void VisualizzaLatticiniMenuLateraleMagazzinoBottonePremuto() {
  	 	ControllerM.getVisualizzaLatticini().setVisible(false);
  	 	ControllerM.getMagazzino().setVisible(true); 
  	 }
  	 	 	 	
  	 public void VisualizzaLatticiniMenuLateraleClientiBottonePremuto() {
  	 	ControllerM.getVisualizzaLatticini().setVisible(false);
  	 	ControllerC.getClienti().setVisible(true);
  	 }

	public void VisualizzaPuntiMenuLateraleClientiBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
		ControllerC.getClienti().setVisible(true);
		
	}

	public void VisualizzaPuntiMenuLateraleMagazzinoBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
		
	}
 

}
