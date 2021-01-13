package Controller;
import GUI.*;
import GUI.Cliente.ClientiJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.ErroreTesseraJDialog;
import GUI.Cliente.InserimentoClienteCompletatoJDialog;
import GUI.Cliente.RiepilogoTesseraJFrame;
import GUI.Cliente.VisualizzaClientiJFrame;
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
		
		CreaTessera.setVisible(false);;
		
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
				RiepilogoTessera.setEnabled(false);
				ClienteInserito.setVisible(true);
				
				
			}
			
			catch (NumberFormatException NFE) {
				NFE.printStackTrace();
				RiepilogoTessera.setEnabled(false);;
				ErroreTessera = new ErroreTesseraJDialog(this);
				ErroreTessera.setVisible(true);
				
			}
			
			
			
			
			catch (SQLException e) {
				e.printStackTrace();
				RiepilogoTessera.setEnabled(false);
				ErroreTessera = new ErroreTesseraJDialog(this);
				ErroreTessera.setVisible(true);
				
			}
			
			

	}
	
	

		public void CompletaTabellaCliente()  
		
		
		{
	    	ArrayList<Cliente> Cliente=null;
	   
			try {
				Cliente = DAO.getCliente();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	for(Cliente c : Cliente)
				
					VisualizzaClienti.setRigheTabella(c.getNome(), c.getCognome(), c.getCF(), c.getLuogo_nascita(), c.getData_nascita(), c.getSesso());
				
	    }


		public void InserimentoNonAvvenuto()
		
		{
			
			ErroreTesseraJDialog ErroreTessera = new ErroreTesseraJDialog(this);
			ErroreTessera.setVisible(true);
			
		}


		public void ErroreTesseraRiprovaButtonPressed() 
		
		{
			RiepilogoTessera.setEnabled(true);
			RiepilogoTessera.dispose();
			ErroreTessera.setVisible(false);
			CreaTessera = new CreaTesseraJFrame(this, ControllerP);
			CreaTessera.setVisible(true);
			
		}


		public void MostraFinestraClientiDaInserimentoClienteCompletato()

		{
			Clienti = new ClientiJFrame(this, ControllerP);
			ClienteInserito.setVisible(false);
			Clienti.setVisible(true);
			RiepilogoTessera.setVisible(false);
			
			
		}
		
		public JFrame getCreaTessera() {
			return CreaTessera;
		}


		


}
		
			
	