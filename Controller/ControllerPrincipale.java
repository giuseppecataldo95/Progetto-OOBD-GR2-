package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import GUI.FinestraPrincipaleJFrame;

public class ControllerPrincipale {
	
	private FinestraPrincipaleJFrame FinestraPrincipale;
	
	private ControllerCliente ControllerC;
	private ControllerMagazzino ControllerM;
	private ControllerVendite ControllerV;

	
	public ControllerPrincipale(Connection Conn) throws SQLException {
		 ControllerM = new ControllerMagazzino(Conn,this);
		 ControllerC = new ControllerCliente(Conn,this);
		 ControllerV= new ControllerVendite(Conn, this);
		 FinestraPrincipale = new FinestraPrincipaleJFrame(this);
		 FinestraPrincipale.setVisible(true);
	}


	
	//SNODO SE CLICCO CLIENTI

	public void FinestraPrincipaleClientiBottonePremuto(){
		ControllerC.getClienti().setVisible(true);
		FinestraPrincipale.setVisible(false);
	}
	
	//TOOLBAR CLIENTI
	
	public void ClientiMenuLateraleMagazzinoBottonePremuto() {

 		ControllerC.getClienti().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
	}
	
	public void ClientiMenuLateraleClientiBottonePremuto() {

 		ControllerC.getClienti().setVisible(false);
		ControllerC.getClienti().setVisible(true);
		
		
	}
	
	public void ClientiMenuLateraleVenditeBottonoPremuto() {
		
		ControllerC.getClienti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);

	}
	
	//TOOLBAR CREA TESSERA
	
	public void CreaTesseraMenùLateraleClientiBottonePremuto() {
		ControllerC.getCreaTessera().setVisible(false);
		ControllerC.getClienti().setVisible(true);
 	}

 	public void CreaTesseraMenùLateraleMagazzinoBottonePremuto() {

 		ControllerC.getCreaTessera().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true); 	
 	}
 	
 	public void CreaTesseraMenùLateraleVenditeBottonePremuto() {
		
		ControllerC.getCreaTessera().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
	}
 	
 	//TOOLBAR VISUALIZZA CLIENTI
 	
 	public void VisualizzaClientiMenuLateraleClientiBottonePremuto() {
		
 		ControllerC.getVisualizzaClienti().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
 		
	}
 	
 	public void VisualizzaClientiMenuLateraleMagazzinoBottonePremuto() {
		
 		ControllerC.getVisualizzaClienti().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
 		
	}
 	
 	public void VisualizzaClientiMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaClienti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}

 	//TOOLBAR VISUALIZZA PUNTI
 	
 	public void VisualizzaPuntiMenuLateraleClientiBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
		ControllerC.getClienti().setVisible(true);
		
	}

	public void VisualizzaPuntiMenuLateraleMagazzinoBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
		
	}

	public void VisualizzaPuntiMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaPunti().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}
	
	//TOOLBAR RIEPILOGO TESSERA
	
	public void RiepilogoTesseraMenuLateraleClientiBottonePremuto() {
		
 		ControllerC.getRiepilogoTessera().setVisible(false);	
 		ControllerC.getClienti().setVisible(true);
 	}
 	
 	public void RiepilogoTesseraMenuLateraleMagazzinoBottonePremuto() {
		
 		ControllerC.getRiepilogoTessera().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
 		
	}
 	
 	public void RiepilogoTesseraMenùLateraleVenditeBottonePremuto() {
		
		ControllerC.getRiepilogoTessera().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}

 	//TOOLBAR VISUALIZZA DETTAGLI

 	public void VisualizzaDettagliClienteMenùLateraleVenditeBottonePremuto() {

		ControllerC.getVisualizzaDettagli().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
		
	}
 	
 	public void VisualizzaDettagliClienteMenùLateraleMagazzinoBottonePremuto() {

		ControllerC.getVisualizzaDettagli().setVisible(false);
 		ControllerM.getMagazzino().setVisible(true);
		
	}

 	public void VisualizzaDettagliClienteMenùLateraleClientiBottonePremuto() {

		ControllerC.getVisualizzaDettagli().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
		
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
 	
 	public void AggiungiProdottoMenuLateraleVenditeBottonePremuto() {
 		ControllerM.getAggiungiPr().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
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
 	
 	public void AggiungiFruttaMenuLateraleVenditeBottonePremuto() {
 		ControllerM.getFrutta().setVisible(false);
 		ControllerV.getVendite().setVisible(true);
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
 	
 	public void AggiungiVerduraMenuLateraleVenditeBottonePremuto() {
 		ControllerM.getVerdura().setVisible(false);
 	 	ControllerV.getVendite().setVisible(true);
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
 	
 	public void AggiungiUovaMenuLateraleVenditeBottonePremuto() {
 	 	ControllerM.getUova().setVisible(false);
 	  	ControllerV.getVendite().setVisible(true);
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
 	
 	public void AggiungiFarinaceiMenuLateraleVenditeBottonePremuto() {
 	 	ControllerM.getFarinacei().setVisible(false);
 	  	ControllerV.getVendite().setVisible(true);
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
 	 
 	public void AggiungiConfezionatiMenuLateraleVenditeBottonePremuto() {
 	 	ControllerM.getConfezionati().setVisible(false);
 	 	ControllerV.getVendite().setVisible(true);
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
 	 
 	public void AggiungiLatticiniMenuLateraleVenditeBottonePremuto() {
 	 	ControllerM.getLatticini().setVisible(false);
 	 	ControllerV.getVendite().setVisible(true);
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
  	
  	public void VisualizzaProdottiMenuLateraleVenditeBottonePremuto() {
  		ControllerM.getVisualizzaPr().setVisible(false);
  		ControllerV.getVendite().setVisible(true);
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
  	
  	public void VisualizzaFruttaMenuLateraleVenditeBottonePremuto() {
  		ControllerM.getVisualizzaFrutta().setVisible(false);
  		ControllerV.getVendite().setVisible(true);
  	}
  	
  	//TOOLBAR AGGIUNGI VERDURA
  	
 	public void VisualizzaVerduraMenuLateraleMagazzinoBottonePremuto() {
 		ControllerM.getVisualizzaVerdura().setVisible(false);
   		ControllerM.getMagazzino().setVisible(true); 
  	}
  	 	
  	public void VisualizzaVerduraMenuLateraleClientiBottonePremuto() {
  		ControllerM.getVisualizzaVerdura().setVisible(false);
  	 	ControllerC.getClienti().setVisible(true);
  	}
  	
  	public void VisualizzaVerduraMenuLateraleVenditeBottonePremuto() {
  		ControllerM.getVisualizzaVerdura().setVisible(false);
  	 	ControllerV.getVendite().setVisible(true);
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
  	
  	public void VisualizzaUovaMenuLateraleVenditeBottonePremuto() {
  	 	ControllerM.getVisualizzaUova().setVisible(false);
  	  	ControllerV.getVendite().setVisible(true);
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
  	
  	public void VisualizzaFarinaceiMenuLateraleVenditeBottonePremuto() {
  	 	ControllerM.getVisualizzaFarinacei().setVisible(false);
  	  	ControllerV.getVendite().setVisible(true);
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
  	 
  	 public void VisualizzaConfezionatiMenuLateraleVenditeBottonePremuto() {
  	 	ControllerM.getVisualizzaConfezionati().setVisible(false);
  	 	ControllerV.getVendite().setVisible(true);
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
  	 
  	 public void VisualizzaLatticiniMenuLateraleVenditeBottonePremuto() {
  	 	ControllerM.getVisualizzaLatticini().setVisible(false);
  	 	ControllerV.getVendite().setVisible(true);
  	 }
	
  	//SNODO VENDITE

	public void FinestraPrincipaleVenduteBottonePremuto() {

		ControllerV.getVendite().setVisible(true);
		FinestraPrincipale.setVisible(false);
		
	}
	
	//TOOLBAR VENDITE
	
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

	//TOOLBAR CREA CARRELLO
	
	public void CreaCarrelloMenùLateraleClientiBottonePremuto() {
		ControllerV.getCreaCarrello().setVisible(false);
		ControllerC.getClienti().setVisible(true);
	}
	
	public void CreaCarrelloMenùLateraleVenditeBottonePremuto() {
		ControllerV.getCreaCarrello().setVisible(false);
		ControllerV.getVendite().setVisible(true);
	}
	
	public void CreaCarrelloMenùLateraleMagazzinoBottonePremuto() {
		ControllerV.getCreaCarrello().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
	}
	
	//COLLEGAMENTO CARRELLO E TESSERE
	
	public void VisualizzaClientiNTessera() {
		ControllerC.ClientiVisualizzaClientiBottonePremuto();
		ControllerC.CompletaTabellaTessera();
	}
	
	public void NascondiVisualizzaClientiNTessera() {
		ControllerC.getVisualizzaClienti().setVisible(false);
	}
	
	//TOOLBAR VISUALIZZA FATTURE

	public void VisualizzaFattureMenùLateraleClientiBottonePremuto() {

		ControllerV.getVisualizzaFatture().setVisible(false);
 		ControllerC.getClienti().setVisible(true);
		
	}

	public void VisualizzaFattureMenùLateraleMagazzinoBottonePremuto() {

		ControllerV.getVisualizzaFatture().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
	}

	public void VisualizzaFattureMenùLateraleVenditeBottonePremuto() {

		ControllerV.getVisualizzaFatture().setVisible(false);
		ControllerV.getVendite().setVisible(true);
	}

	//TOOLBAR VISUALIZZA DETTAGLI FATTURA

	public void VisualizzaDettagliFatturaMenùLateraleClientiBottonePremuto() {

		ControllerV.getVisualizzaDettagliFattura().setVisible(false);
		ControllerC.getClienti().setVisible(true);
	}

	public void VisualizzaDettagliFatturaMenùLateraleVenditeBottonePremuto() {
		
		ControllerV.getVisualizzaDettagliFattura().setVisible(false);
		ControllerV.getVendite().setVisible(true);
		
	}

	public void VisualizzaDettagliFatturaMenùLateraleMagazzinoBottonePremuto() {

		ControllerV.getVisualizzaDettagliFattura().setVisible(false);
		ControllerM.getMagazzino().setVisible(true);
		
	}
}
