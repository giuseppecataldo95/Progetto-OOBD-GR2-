package Controller;
import GUI.*;
import GUI.Cliente.ClientiJFrame;
import GUI.Cliente.CreaTesseraJFrame;
import GUI.Cliente.ErroreTesseraJDialog;
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
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.sun.source.tree.CatchTree;

import ConnessioneDB.*;
import DAO.ClienteDAO;
import Entità.Cliente;


public class ControllerCliente {
	
	
	 public ClientiJFrame Clienti;
	 public CreaTesseraJFrame CreaTessera;
	 public RiepilogoTesseraJFrame RiepilogoTessera;
	 public VisualizzaClientiJFrame VisualizzaClienti;
	 public ErroreTesseraJDialog ErroreTessera;
	 private ConvertiCBInData Convertitore;
	 private ClienteDAO DAO;
	 
	

	
//	|-----Costruttore Controller-----|
	public ControllerCliente(Connection Conn) throws SQLException
	{
		 Clienti = new ClientiJFrame(this);
		 Clienti.setVisible(true);
		 DAO = new ClienteDAOPostgres(Conn);
	}

	
// 	|-----Metodi Controller-----|
	
	public void ClientiCreaNuovaTesseraButtonPressed()
	{	
		Clienti.setVisible(false);
		CreaTessera = new CreaTesseraJFrame(this);
		CreaTessera.setVisible(true);
	}

	public void CreaNuovaTesseraIndietroButtonPressed() {
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}

	public void ClientiVisualizzaClientiButtonPressed() {
		
	
		VisualizzaClienti = new VisualizzaClientiJFrame(this);
		VisualizzaClienti.setVisible(true);
		
	}

	public void CreaNuovaTesseraClientiPercorsoButtonPressed() {
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}
	
	public void VisualizzaClientiClientiPercorsoButtonPressed() {
		
		VisualizzaClienti.setVisible(false);
		Clienti.setVisible(true);
		
		
	}
	
	public void CreaNuovaTesseraAvantiButtonPressed() {
		

		
		
		RiepilogoTessera = new RiepilogoTesseraJFrame(this);
		
		CreaTessera.setVisible(false);
		
		String Nome = CreaTessera.getNomeTB();
		String Cognome = CreaTessera.getCognomeTB();
		String Luogo_Nascita = CreaTessera.getLuogoNTB();
		int Giorno = Integer.parseInt(CreaTessera.getGiornoCB());
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

	public void RiepilogoTesseraIndietroButtonPressed() {
		
		CreaTessera.setVisible(true);
		
	}


	public void RiepilogoTesseraNuovaTesseraPercorsoButtonPressed() {

		CreaTessera.setVisible(true);
		
	}


	public void RiepilogoTesseraAvantiButtonPressed() throws SQLException {

		
		
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
			
			
			
		

	}


		public void ErroreTesseraRiprovaButtonPressed() {
	
			CreaTessera.setVisible(true);

		}


		public void RiepilogoTesseraAvantiButtonPressedMostraFinestraClienti() {

			Clienti.setVisible(true);
			
		}
	
		 
}
		
			
	