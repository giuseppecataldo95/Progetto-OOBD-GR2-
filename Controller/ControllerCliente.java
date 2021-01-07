package Controller;
import GUI.*;
import ImplementazioniDAO.ClienteDAOPostgres;
import App.CFGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	 
	 
	

	
//	|-----Costruttore Controller-----|
	public ControllerCliente()
	{
		 Clienti = new ClientiJFrame(this);
		 Clienti.setVisible(true);
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
	
	public void CreaNuovaTesseraAvantiButtonPressed(String nome, String cognome, String luogoNascita, String meseNascita, int giorno1Nascita, int anno1Nascita, String sesso) {
		

		
		
		RiepilogoTesseraJFrame RiepilogoTessera = new RiepilogoTesseraJFrame(this);
		
		CreaTessera.setVisible(false);
		
		RiepilogoTessera.RiepilogoNomeTB.setText(nome);;
		RiepilogoTessera.RiepilogoCognomeTB.setText(cognome);
		RiepilogoTessera.RiepilogoLuogoNTB.setText(luogoNascita);
		RiepilogoTessera.RiepilogoGiornoNTB.setText(String.valueOf(giorno1Nascita));
		RiepilogoTessera.RiepilogoMeseNTB.setText(meseNascita);
		RiepilogoTessera.RiepilogoAnnoNTB.setText(String.valueOf(anno1Nascita));
		RiepilogoTessera.RiepilogoSessoTB.setText(sesso);
		CFGenerator cf = new CFGenerator(nome, cognome, luogoNascita, meseNascita, anno1Nascita, giorno1Nascita , sesso);
		RiepilogoTessera.RiepilogoCFTB.setText(cf.getCodiceFiscale());
		
		RiepilogoTessera.setVisible(true);

		
	}

	public void RiepilogoTesseraIndietroButtonPressed() {
		
		CreaTessera.setVisible(true);
		
	}


	public void RiepilogoTesseraNuovaTesseraPercorsoButtonPressed() {

		CreaTessera.setVisible(true);
		
	}


	public void RiepilogoTesseraAvantiButtonPressed(String mese_nascita, int giorno_nascita, int anno_nascita, String nome, String cognome, String luogoNascita, String cf, String sesso) {

		
		try 
	{
			ClienteDAOPostgres cliente = new ClienteDAOPostgres(ConnessioneDB.getInstance().getConnection());
			
			java.sql.Date data_nascita = ConvertiCBInDate(mese_nascita, giorno_nascita, anno_nascita);
			cliente.insertCliente(nome, cognome, luogoNascita, cf, sesso,  data_nascita);
			
			} 
		
		catch (SQLException e1)
		
		{e1.printStackTrace();
//			ErroreTesseraJDialog ErroreTessera = new ErroreTesseraJDialog(this);
//			RiepilogoTessera.setEnabled(false);
//			ErroreTessera.setVisible(true);
		}
	
	}

public java.sql.Date ConvertiCBInDate(String meseNascita, int giornoNascita, int annoNascita) {
		

		String separatore = "-";
		if(meseNascita.equals("GENNAIO"))
		meseNascita = "01";
		if(meseNascita.equals("FEBBRAIO"))
		meseNascita = "02";
		if(meseNascita.equals("MARZO"))
		meseNascita = "03";
		if(meseNascita.equals("APRILE"))
		meseNascita = "04";
		if(meseNascita.equals("MAGGIO"))
		meseNascita = "05";	
		if(meseNascita.equals("GIUGNO"))
		meseNascita = "06";	
		if(meseNascita.equals("LUGLIO"))
		meseNascita = "07";
		if(meseNascita.equals("AGOSTO"))
		meseNascita = "08";
		if(meseNascita.equals("SETTEMBRE"))
		meseNascita = "09";
		if(meseNascita.equals("OTTOBRE"))
		meseNascita = "10";
		if(meseNascita.equals("NOVEMBRE"))
		meseNascita = "11";
		if(meseNascita.equals("DICEMBRE"))
		meseNascita = "12";
	    String Data	= (String.valueOf(annoNascita).concat(separatore).concat(meseNascita).concat(separatore).concat(String.valueOf(giornoNascita)));
		
		Date dataNascita1 = Date.valueOf(Data);
	    
		return dataNascita1;
	}


		public void ErroreTesseraRiprovaButtonPressed() {
	
			CreaTessera.setVisible(true);

		}
	
		 
}
		
			
	