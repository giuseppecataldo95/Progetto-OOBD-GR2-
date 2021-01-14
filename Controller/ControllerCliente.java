package Controller;
import GUI.*;
import GUI.Cliente.ClientiJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.DettagliClienteJDialog;
import GUI.Cliente.EliminaTesseraByNTesseraJDialog;
import GUI.Cliente.ErroreTesseraJDialog;
import GUI.Cliente.FormatoNTesseraErratoJDialog;
import GUI.Cliente.InserimentoClienteCompletatoJDialog;
import GUI.Cliente.RiepilogoTesseraJFrame;
import GUI.Cliente.TesseraEliminataJDialog;
import GUI.Cliente.VisualizzaClientiJFrame;
import GUI.Cliente.VisualizzaDettagliClienteJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;
import ImplementazioniDAO.MagazzinoDAOPostgres;
import App.CFGenerator;
import App.ConvertiCBInData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.source.tree.CatchTree;

import ConnessioneDB.*;
import DAO.ClienteDAO;
import Entità.Cliente;
import Entità.Frutta;
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
	
//	|-----Costruttore Controller-----|
	public ControllerCliente(Connection Conn, ControllerPrincipale P) throws SQLException
	
	{
	
		
		 Clienti = new ClientiJFrame(this,ControllerP);
		 Clienti.setVisible(true);
		 DAO = new ClienteDAOPostgres(Conn);
		 ControllerP = P;
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
		VisualizzaClienti = new VisualizzaClientiJFrame(this);
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
		

		
		
		RiepilogoTessera = new RiepilogoTesseraJFrame(this);
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
		CreaTessera = new CreaTesseraJFrame(this,ControllerP);
		CreaTessera.setVisible(true);
		RiepilogoTessera.setVisible(false);
		
	}


	public void RiepilogoTesseraNuovaTesseraPercorsoButtonPressed() 
	
	{

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
	   
			try {
				Tessera = DAO.getTessera();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	for(Tessera t : Tessera)
				
					VisualizzaClienti.setRigheTabella(t.getNTessera(), t.getPuntiFedeltà(), t.getCF(), t.getDataRilascio(), t.getDataScadenza());
				
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
			
			VisualizzaClienti = new VisualizzaClientiJFrame(this);
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

			
			
			EliminaTessera.setVisible(false);
			String N_tessera = EliminaTessera.getNTesseraDaEliminareTB().getText();
			int NTessera = Integer.parseInt(N_tessera);
			
			
				try 
				{
			
					int row = DAO.deleteTessera(NTessera);
					 if(row == 0)
					 {
						 
							ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
							ErroreNumeroTessera.setVisible(true);
						 
					 }
					 else
					 {
						 
						 TesseraEliminata = new TesseraEliminataJDialog(this);
						 TesseraEliminata.setVisible(true);
						 
					 }
					 
				} catch (NumberFormatException e) {
					
					
					ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
					ErroreNumeroTessera.setVisible(true);
					
				} catch (SQLException e) {
							
					
					ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
					ErroreNumeroTessera.setVisible(true);
					
			
			}
					
			
		}
		
		public void NTesseraErratoRiprovaButtonPressed() {
			
			
			ErroreNumeroTessera.setVisible(false);
			EliminaTessera.setVisible(true);
			
		}
		
		public void TesseraEliminataOKButtonPressed() {
			
			
			TesseraEliminata.setVisible(false);
			VisualizzaClienti.setVisible(false);
			VisualizzaClienti = new VisualizzaClientiJFrame(this);
			VisualizzaClienti.setVisible(true);
			
		}
		
		
		public void VisualizzaClientiVisualizzaClientiPercorsoButtonPressed() {

			VisualizzaClienti.setVisible(false);
			VisualizzaClienti = new VisualizzaClientiJFrame(this);
			VisualizzaClienti.setVisible(true);
			
		}
		

		public void ApriDettagliClienteJDialog() {
			
			DettagliClienteDialog = new DettagliClienteJDialog(this);
			DettagliClienteDialog.setVisible(true);
			
		}
		
		public void CercaClienteByCF(String cf) {  
		
			ArrayList<Cliente> Cliente= null;
			
		try {
			 Cliente = DAO.getClienteByCF(cf);
			 
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		for(Cliente c : Cliente) {
			
			System.out.println(c.getNome());
			System.out.println("d");
			
		VisualizzaDettagli = new VisualizzaDettagliClienteJFrame(this);
		
		VisualizzaDettagli.RiepilogoNomeTB.setText(c.getNome());		
		
	    	
		}		
		}

		public void ApriVisualizzaDettagli() {
			
			VisualizzaDettagli = new VisualizzaDettagliClienteJFrame(this);
			VisualizzaDettagli.setVisible(true);
			
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


		




		


		


		


		

		
		


		


}
		
			
	