package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import GUI.FinestraPrincipaleJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.ClientiJFrame;
import GUI.Magazzino.MagazzinoJFrame;
import GUI.Vendite.VenditeJFrame;


public class ControllerPrincipale {
	
	public FinestraPrincipaleJFrame getFinestraPrincipale() {
		return FinestraPrincipale;
	}

	

	private FinestraPrincipaleJFrame FinestraPrincipale;
	private ClientiJFrame Clienti;
	private VenditeJFrame Vendite;
	private CreaTesseraJFrame CreaTessera;
	private MagazzinoJFrame Magazzino;
	private ControllerCliente ControllerC;
	private ControllerMagazzino ControllerM;
	private ControllerVendite ControllerV;
	private Connection Connessione;
	
	public ControllerPrincipale(Connection Conn) throws SQLException {
		
		 Connessione= Conn;
		 ControllerM = new ControllerMagazzino(Conn,this);
		 ControllerC = new ControllerCliente(Conn,this);
		 ControllerV= new ControllerVendite(Conn, this);
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
 	
 	public void MagazzinoMenùLateraleVenditeBottonePremuto() {

		ControllerM.getMagazzino().setVisible(false);
		ControllerV.getVendite().setVisible(true);
		
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
	
	
	//SNODO SE CLICCO VENDITE

	public void FinestraPrincipaleVenduteBottonePremuto() {

		ControllerV.getVendite().setVisible(true);
		FinestraPrincipale.setVisible(false);
		
	}

	public void ClientiMenuLateraleVenditeBottonoPremuto() {
		
		ControllerC.getClienti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);

	}


	public void CreaTesseraMenùLateraleVenditeBottonePremuto() {
		
		ControllerC.getCreaTessera().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}

	public void RiepilogoTesseraMenùLateraleVenditeBottonePremuto() {
		
		ControllerC.getRiepilogoTessera().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}



	public void VisualizzaClientiMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaClienti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}



	public void VisualizzaDettagliClienteMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaDettagli().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}



	public void VisualizzaPuntiMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}



	public void VenditeMenùLateraleClientiBottonePremuto() {
	
 		ControllerV.getVendite().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
		
	}



	public void VenditeMenùLateraleVenditeBottonePremuto() {
			
		ControllerV.getVendite().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}



	public void VenditeMenùLateraleMagazzinoBottonePremuto() {
		
		ControllerV.getVendite().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
		
	}



	public void VisualizzaCarrelloMenùLateraleClientiBottonePremuto() {

		ControllerV.getVisualizzaCarrello().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
		
	}



	public void VisualizzaCarrelloMenùLateraleMagazzinoBottonePremuto() {

		ControllerV.getVisualizzaCarrello().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
	}



	public void VisualizzaCarrelloMenùLateraleVenditeBottonePremuto() {

		ControllerV.getVisualizzaCarrello().setVisible(false);
		ControllerV.getVendite().setVisible(true);
		
	}



	public void VisualizzaCarrello1MenùLateraleClientiBottonePremuto() {

		ControllerV.getVisualizzaCarrello1().setVisible(false);
		ControllerC.getClienti().setVisible(true);
	}



	public void VisualizzaCarrello1MenùLateraleVenditeBottonePremuto() {
		
		ControllerV.getVisualizzaCarrello1().setVisible(false);
		ControllerV.getVendite().setVisible(true);
		
	}



	public void VisualizzaCarrello1MenùLateraleMagazzinoBottonePremuto() {

		ControllerV.getVisualizzaCarrello1().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
	}



	
 

}
