package Controller;
import GUI.Cliente.ClientiJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.DettagliClienteJDialog;
import GUI.Cliente.EliminaTesseraByNTesseraJDialog;
import GUI.Cliente.ErroreRicercaClienteByNTesseraJDialog;
import GUI.Cliente.ErroreTesseraJDialog;
import GUI.Cliente.FormatoNTesseraErratoJDialog;
import GUI.Cliente.InserimentoClienteCompletatoJDialog;
import GUI.Cliente.RiepilogoTesseraJFrame;
import GUI.Cliente.TesseraEliminataJDialog;
import GUI.Cliente.VisualizzaClientiJFrame;
import GUI.Cliente.VisualizzaDettagliClienteJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;

import App.CFGenerator;
import App.ConvertiCBInData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JFrame;
import DAO.ClienteDAO;
import Entità.Cliente;
import Entità.Tessera;


public class ControllerCliente 

{
	
	
	 private ClientiJFrame Clienti;
	 private CreaTesseraJFrame CreaTessera;
	 private RiepilogoTesseraJFrame RiepilogoTessera;
	 private VisualizzaClientiJFrame VisualizzaClienti;
	 private ErroreTesseraJDialog ErroreTessera;
	 private InserimentoClienteCompletatoJDialog ClienteInserito;
	 private ConvertiCBInData Convertitore;
	 private ClienteDAO DAO;
	 private ControllerPrincipale ControllerP;
	 private EliminaTesseraByNTesseraJDialog EliminaTessera;
	 private FormatoNTesseraErratoJDialog ErroreNumeroTessera;
	 private TesseraEliminataJDialog TesseraEliminata;
	 private DettagliClienteJDialog DettagliClienteDialog;
	 private VisualizzaDettagliClienteJFrame VisualizzaDettagli;
	 private ErroreRicercaClienteByNTesseraJDialog ErroreRicercaCliente;
	
//	|-----Costruttore Controller-----|
	public ControllerCliente(Connection Conn, ControllerPrincipale P) throws SQLException
	
	{
	
		
		 ControllerP = P;
		 Clienti = new ClientiJFrame(this, ControllerP);
		 DAO = new ClienteDAOPostgres(Conn);

	}

	
// 	|-----Metodi Controller-----|
	
	public void ClientiCreaNuovaTesseraButtonPressed()
	
	{	
		Clienti.setVisible(false);
		CreaTessera = new CreaTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(true);
	}

	public void CreaNuovaTesseraIndietroButtonPressed() 
	
	{
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}

	public void ClientiVisualizzaClientiButtonPressed() 
	
	
	{
		
		
		Clienti.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		VisualizzaClienti.setVisible(true);
		
	}

	public void CreaNuovaTesseraClientiPercorsoButtonPressed() 
	
	{
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}
	
	public void VisualizzaClientiClientiPercorsoButtonPressed() 
	
	{
		
		VisualizzaClienti.setVisible(false);
		Clienti.setVisible(true);
		
		
	}
	
	public void CreaNuovaTesseraAvantiButtonPressed() 
	
	{
		

		
		
		RiepilogoTessera = new RiepilogoTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(false);;
		
		
		String Nome = CreaTessera.getNomeTB();
		String Cognome = CreaTessera.getCognomeTB();
		String Luogo_Nascita = CreaTessera.getLuogoNTB();
		String Giorno = (CreaTessera.getGiornoCB());
		String Mese = CreaTessera.getMeseCB();
		int Anno = Integer.parseInt(CreaTessera.getAnnoCB());
		String Sesso = CreaTessera.getSessoCB();
		CFGenerator cf = new CFGenerator(Nome, Cognome, Luogo_Nascita, Mese, Anno, Giorno , Sesso);
		RiepilogoTessera.setRiepilogoNomeTB(Nome);
		RiepilogoTessera.setRiepilogoCognomeTB(Cognome);
		RiepilogoTessera.setRiepilogoCFTB(cf.getCodiceFiscale());
		RiepilogoTessera.setRiepilogoSessoTB(Sesso);
		RiepilogoTessera.setRiepilogoLuogoNTB(Luogo_Nascita);
		RiepilogoTessera.setRiepilogoGiornoNTB(String.valueOf(Giorno));
		RiepilogoTessera.setRiepilogoMeseNTB(String.valueOf(Mese));
		RiepilogoTessera.setRiepilogoAnnoNTB(String.valueOf(Anno));
		RiepilogoTessera.setVisible(true);

		
	}

	public void RiepilogoTesseraIndietroButtonPressed() 
	
	{
		
		RiepilogoTessera.setVisible(false);
		CreaTessera.setVisible(true);
		
		
	}


	public void RiepilogoTesseraNuovaTesseraPercorsoButtonPressed() 
	
	{

		RiepilogoTessera.setVisible(false);
		CreaTessera.setVisible(true);
		
	}


	public void RiepilogoTesseraAvantiButtonPressed() 
	
	{

		
			
			try {
				String Giorno = RiepilogoTessera.getRiepilogoGiornoNTB();
				String Mese = RiepilogoTessera.getRiepilogoMeseNTB();
				String Anno = RiepilogoTessera.getRiepilogoAnnoNTB();
				String Nome = RiepilogoTessera.getRiepilogoNomeTB();
				String Cognome = RiepilogoTessera.getRiepilogoCognomeTB();
				String LuogoNascita = RiepilogoTessera.getRiepilogoLuogoNTB();
				String CF = RiepilogoTessera.getRiepilogoCFTB();
				String Sesso = RiepilogoTessera.getRiepilogoSessoTB();
				Convertitore = new ConvertiCBInData(Giorno,Mese,Anno);
				Date Data_N = Convertitore.Converti();
				DAO.insertCliente(Nome, Cognome, LuogoNascita, CF, Sesso,  Data_N);
				ClienteInserito = new InserimentoClienteCompletatoJDialog(this);
				ClienteInserito.setVisible(true);
				
				
			}
			
			catch (NumberFormatException NFE) {
				NFE.printStackTrace();
				ErroreTessera = new ErroreTesseraJDialog(this);
				ErroreTessera.setVisible(true);
				
			}
			
			
			
			
			catch (SQLException e) {
				e.printStackTrace();
				ErroreTessera = new ErroreTesseraJDialog(this);
				ErroreTessera.setVisible(true);
				
			}
			
			

	}
	
	

		public void CompletaTabellaTessera()  
		
		
		{
	    	ArrayList<Tessera> Tessera=null;
	    	ArrayList<Cliente> Cliente = null;
	    	
	    	
	   
			try {
				Tessera = DAO.getTessera();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	for(Tessera t : Tessera) {
	    		
	    	
					VisualizzaClienti.setRigheTabella(t.getNTessera(), t.getCF(),  t.getDataRilascio(), t.getDataScadenza());
		
	    
	    	}
	    		}	
			


		public void InserimentoNonAvvenuto()
		
		{
			
			ErroreTessera = new ErroreTesseraJDialog(this);
			ErroreTessera.setVisible(true);
			
		}


		public void ErroreTesseraRiprovaButtonPressed() 
		
		{
			RiepilogoTessera.setEnabled(true);
			RiepilogoTessera.setVisible(false);
			ErroreTessera.setVisible(false);
			CreaTessera = new CreaTesseraJFrame(this, ControllerP);
			CreaTessera.setVisible(true);
			
		}


		public void MostraFinestraClientiDaInserimentoClienteCompletato()

		{
			ClienteInserito.setVisible(false);
			
			VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
			CompletaTabellaTessera();
			VisualizzaClienti.setVisible(true);
			
			
		}
		
		
		
		
		public JFrame getCreaTessera() {
			return CreaTessera;
		}


		public void ApriEliminaTesseraByNTessera() {
			
			EliminaTessera = new EliminaTesseraByNTesseraJDialog(this);
			EliminaTessera.setVisible(true);
			
			
		}


		public void EliminaTesseraByNTessera() {

			
			
			
			
			String N_tessera = this.getEliminaTessera().getNTesseraDaEliminareTB().getText();
			int NTessera = Integer.parseInt(N_tessera);
			EliminaTessera.setVisible(false);
			
			
			
				try 
				{
			
					 DAO.deleteTessera(NTessera);
					 ClienteInserito = new InserimentoClienteCompletatoJDialog(this);
					 ClienteInserito.setVisible(true);
						 
					
					 
				} catch (NumberFormatException e) {
					
					
					ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
					ErroreNumeroTessera.setVisible(true);
					System.out.println("NFE");
					
				} catch (SQLException e) {
							
					
					ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
					ErroreNumeroTessera.setVisible(true);
					e.printStackTrace();

			
			}
					
			
	}
		
		public void NTesseraErratoRiprovaButtonPressed() {
			
			
			ErroreNumeroTessera.setVisible(false);
			EliminaTessera.setVisible(true);
			
		}
		
		public void TesseraEliminataOKButtonPressed() {
			
			
			TesseraEliminata.setVisible(false);
			
			
		}
		
		
		
		public void TesseraEliminataOKButtonPressedAggiornaVisualizzaClienti() {
			
			
			this.VisualizzaClienti.setVisible(false);
			VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
			VisualizzaClienti.setVisible(true);
			
			
		}
		
		
		public void VisualizzaClientiVisualizzaClientiPercorsoButtonPressed() {

			VisualizzaClienti.setVisible(false);
			VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
			VisualizzaClienti.setVisible(true);
			
		}
		

		public void ApriDettagliClienteJDialog() {
			
			DettagliClienteDialog = new DettagliClienteJDialog(this);
			DettagliClienteDialog.setVisible(true);
			
		}
		
		public void CercaClienteByCF(int n_tessera) {  
		
			
			
		try {
			
			Cliente c = DAO.getClienteByCF(n_tessera);
			 	
				if(c != null) {
					
				VisualizzaClienti.setVisible(false);
				VisualizzaDettagli = new VisualizzaDettagliClienteJFrame(this);	
				VisualizzaDettagli.RiepilogoNomeTB.setText(c.getNome());
				VisualizzaDettagli.RiepilogoCognomeTB.setText(c.getCognome());
				VisualizzaDettagli.RiepilogoCFTB.setText(c.getCF());
				VisualizzaDettagli.RiepilogoLuogoNTB.setText(c.getLuogo_nascita());
				VisualizzaDettagli.RiepilogoSessoTB.setText(c.getSesso());
				Date dataN = c.getData_nascita();
				VisualizzaDettagli.setRiepilogoDataNTB(dataN.toString());
				VisualizzaDettagli.setVisible(true);
				
				}	
		
		
			if(c == null) {
				
				
				ErroreRicercaCliente = new ErroreRicercaClienteByNTesseraJDialog(this);
				ErroreRicercaCliente.setVisible(true);
				
				
			}
		}
		
		
		 catch (SQLException e) {
			
			 
			ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
			ErroreNumeroTessera.setVisible(true);
			
		}
		
		
	    	
		}		
		

		
		
		


		public ClientiJFrame getClienti() {
			return Clienti;
		}


		public void setClienti(ClientiJFrame clienti) {
			Clienti = clienti;
		}


		public RiepilogoTesseraJFrame getRiepilogoTessera() {
			return RiepilogoTessera;
		}


		public void setRiepilogoTessera(RiepilogoTesseraJFrame riepilogoTessera) {
			RiepilogoTessera = riepilogoTessera;
		}


		public VisualizzaClientiJFrame getVisualizzaClienti() {
			return VisualizzaClienti;
		}


		public void setVisualizzaClienti(VisualizzaClientiJFrame visualizzaClienti) {
			VisualizzaClienti = visualizzaClienti;
		}


		public ErroreTesseraJDialog getErroreTessera() {
			return ErroreTessera;
		}


		public void setErroreTessera(ErroreTesseraJDialog erroreTessera) {
			ErroreTessera = erroreTessera;
		}


		public InserimentoClienteCompletatoJDialog getClienteInserito() {
			return ClienteInserito;
		}


		public void setClienteInserito(InserimentoClienteCompletatoJDialog clienteInserito) {
			ClienteInserito = clienteInserito;
		}


		public ConvertiCBInData getConvertitore() {
			return Convertitore;
		}


		public void setConvertitore(ConvertiCBInData convertitore) {
			Convertitore = convertitore;
		}


		public ClienteDAO getDAO() {
			return DAO;
		}


		public void setDAO(ClienteDAO dAO) {
			DAO = dAO;
		}


		public ControllerPrincipale getControllerP() {
			return ControllerP;
		}


		public void setControllerP(ControllerPrincipale controllerP) {
			ControllerP = controllerP;
		}


		public EliminaTesseraByNTesseraJDialog getEliminaTessera() {
			return EliminaTessera;
		}


		public void setEliminaTessera(EliminaTesseraByNTesseraJDialog eliminaTessera) {
			EliminaTessera = eliminaTessera;
		}


		public void setCreaTessera(CreaTesseraJFrame creaTessera) {
			CreaTessera = creaTessera;
		}


		public FormatoNTesseraErratoJDialog getErroreNumeroTessera() {
			return ErroreNumeroTessera;
		}


		public void setErroreNumeroTessera(FormatoNTesseraErratoJDialog erroreNumeroTessera) {
			ErroreNumeroTessera = erroreNumeroTessera;
		}


		public void VisualizzaDettagliClienteChiudiButtonPressed() {

			
			VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
			VisualizzaClienti.setVisible(false);
			
			
			
		}


		public void VisualizzaDettagliClienteClientiPercorsoButtonPressed() {

			VisualizzaDettagli.setVisible(false);
			Clienti = new ClientiJFrame(this, ControllerP);
			Clienti.setVisible(true);
			
			
		}


		public void ErroreRicercaClienteRiprovaButtonPressed() {

			DettagliClienteDialog = new DettagliClienteJDialog(this);
			DettagliClienteDialog.setVisible(true);
			
			
		}


		public void CreaNuovaTesseraCreaNuovaTesseraPercorsoButtonPressed() {

			CreaTessera = new CreaTesseraJFrame(this, ControllerP);
			CreaTessera.setVisible(true);
			
		}


		public void RiepilogoTesseraRiepilogoTesseraPercorsoButtonPressed() {
			

			CreaTessera = new CreaTesseraJFrame(this, ControllerP);
			CreaTessera.setVisible(false);
			RiepilogoTessera = new RiepilogoTesseraJFrame(this, ControllerP);
			CreaNuovaTesseraAvantiButtonPressed();
			RiepilogoTessera.setVisible(true);
			
			
		}


//		public void VisualizzaClientiVisualizzaPuntiBottonePremuto() 
//		{
//
//			try 
//				{
//				
//					int PuntiFrutta = DAO.getPuntiClienteFrutta();
//				
//				}
//			
//			
//			 catch (SQLException e) 
//				{
//				
//				 	e.printStackTrace(); 
//				
//				}
//			
//			
//		    	
//		}		
			
			
}


	


		

		




		


		


		


		

		
		


		



		
			
	