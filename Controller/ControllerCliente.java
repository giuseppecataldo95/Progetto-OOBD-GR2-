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
import GUI.Cliente.VisualizzaPuntiJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;
import Risorse.App.CFGenerator;
import Risorse.App.ConvertiCBInData;
import Risorse.MieEccezioni.FormatoDataException;
import Risorse.MieEccezioni.TesseraNonTrovataException;

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
	 private CFGenerator CF;
	 private ControllerPrincipale ControllerP;
	 private EliminaTesseraByNTesseraJDialog EliminaTessera;
	 private FormatoNTesseraErratoJDialog ErroreNumeroTessera;
	 private TesseraEliminataJDialog TesseraEliminata;
	 private DettagliClienteJDialog DettagliCliente;
	 private VisualizzaDettagliClienteJFrame VisualizzaDettagli;
	 private ErroreRicercaClienteByNTesseraJDialog ErroreRicercaCliente;
	 private VisualizzaPuntiJFrame VisualizzaPunti;

	//	|-----Costruttore Controller-----|
	public ControllerCliente(Connection Conn, ControllerPrincipale P) throws SQLException
	
	{
		 ControllerP = P;
		 Clienti = new ClientiJFrame(this, ControllerP);
		 DAO = new ClienteDAOPostgres(Conn);
		 CF = new CFGenerator(Conn);
	}

	
	// 	|-----Metodi Controller-----|
	
	//SNODO CLIENTI
	
	public void ClientiCreaNuovaTesseraBottonePremuto() {	
		Clienti.setVisible(false);
		CreaTessera = new CreaTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(true);
	}
	
	public void ClientiVisualizzaClientiBottonePremuto() {
		
		Clienti.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		VisualizzaClienti.setVisible(true);
		
	}
	
	//FINESTRA CREA TESSERA
	
	public void CreaNuovaTesseraClientiPercorsoBottonePremuto() {
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}
	
	public void CreaNuovaTesseraCreaNuovaTesseraPercorsoBottonePremuto() {
		CreaTessera.setVisible(false);
		CreaTessera.setVisible(true);
	}
	
	public void CreaNuovaTesseraIndietroBottonePremuto() {
		
		CreaTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}
	
	public void CreaNuovaTesseraAvantiBottonePremuto() {
	
		RiepilogoTessera = new RiepilogoTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(false);
	
		String Nome = CreaTessera.getNomeTF();
		String Cognome = CreaTessera.getCognomeTF();
		String Luogo_Nascita = CreaTessera.getLuogoNTF();
		String Giorno = (CreaTessera.getGiornoCB());
		String Mese = CreaTessera.getMeseCB();
		ConvertiCBInData Controllore = new ConvertiCBInData(Giorno,Mese,CreaTessera.getAnnoCB());
		int Anno = Integer.parseInt(CreaTessera.getAnnoCB());
		String Sesso = CreaTessera.getSessoCB();								
		try {
			Controllore.ControllaData();
		}catch(FormatoDataException e){
			ErroreTessera = new ErroreTesseraJDialog(this);
			ErroreTessera.setVisible(true);
		}
		CF.setNome(Nome);
		CF.setCognome(Cognome);
		CF.setComune(Luogo_Nascita);
		CF.setSesso(Sesso);
		CF.setGiorno(Giorno);
		CF.setM(Mese);
		CF.setAnno(Anno);
		RiepilogoTessera.setRiepilogoNomeTB(Nome);
		RiepilogoTessera.setRiepilogoCognomeTB(Cognome);
		RiepilogoTessera.setRiepilogoCFTB(CF.getCodiceFiscale());
		RiepilogoTessera.setRiepilogoSessoTB(Sesso);
		RiepilogoTessera.setRiepilogoLuogoNTB(Luogo_Nascita);
		RiepilogoTessera.setRiepilogoGiornoNTB(String.valueOf(Giorno));
		RiepilogoTessera.setRiepilogoMeseNTB(String.valueOf(Mese));
		RiepilogoTessera.setRiepilogoAnnoNTB(String.valueOf(Anno));
		RiepilogoTessera.setVisible(true);						
				
		
	}
	
	//FINESTRA RIEPILOGO TESSERA
	
	public void RiepilogoTesseraClientiPercorsoBottonePremuto() {

		RiepilogoTessera.setVisible(false);
		Clienti.setVisible(true);
		
	}
	
	public void RiepilogoTesseraNuovaTesseraPercorsoBottonePremuto() {

		RiepilogoTessera.setVisible(false);
		CreaTessera.setVisible(true);
		
	}
	
	public void RiepilogoTesseraRiepilogoTesseraPercorsoBottonePremuto() {
		CreaTessera = new CreaTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(false);
		RiepilogoTessera.setVisible(false);
		RiepilogoTessera = new RiepilogoTesseraJFrame(this, ControllerP);
		CreaNuovaTesseraAvantiBottonePremuto();
		RiepilogoTessera.setVisible(true);
	}
	
	public void RiepilogoTesseraIndietroBottonePremuto() {
		
		RiepilogoTessera.setVisible(false);
		CreaTessera.setVisible(true);
		
	}

	public void RiepilogoTesseraAvantiBottonePremuto() {
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
		try {
			DAO.insertCliente(Nome, Cognome, LuogoNascita, CF, Sesso,  Data_N);
			ClienteInserito = new InserimentoClienteCompletatoJDialog(this);
			ClienteInserito.setVisible(true);
		}catch (NumberFormatException NFE) {
			RiepilogoTessera.setEnabled(false);
			ErroreTessera = new ErroreTesseraJDialog(this);
			ErroreTessera.setVisible(true);
		}catch (SQLException e) {
			RiepilogoTessera.setEnabled(false);
			ErroreTessera = new ErroreTesseraJDialog(this);
			ErroreTessera.setVisible(true);
		}
	}
	
	public void ErroreTesseraRiprovaBottonePremuto() {
		
		RiepilogoTessera.setEnabled(true);
		RiepilogoTessera.setVisible(false);
		ErroreTessera.setVisible(false);
		CreaTessera = new CreaTesseraJFrame(this, ControllerP);
		CreaTessera.setVisible(true);
	}

	public void MostraFinestraClientiDaInserimentoClienteCompletato() {
		ClienteInserito.setVisible(false);
		RiepilogoTessera.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		CompletaTabellaTessera();
		VisualizzaClienti.setVisible(true);
		
	}
	
	//FINESTRA VISUALIZZA CLIENTI
	
	public void VisualizzaClientiClientiPercorsoBottonePremuto() {
		
		VisualizzaClienti.setVisible(false);
		Clienti = new ClientiJFrame(this, ControllerP);
		Clienti.setVisible(true);
		
	}
	
	public void VisualizzaClientiVisualizzaPuntiBottonePremuto() {
		VisualizzaClienti.setVisible(false);
		VisualizzaPunti = new VisualizzaPuntiJFrame(this, ControllerP);
		VisualizzaPunti.setVisible(true);
	}
	
	public void VisualizzaClientiVisualizzaClientiPercorsoBottonePremuto() {
		VisualizzaClienti.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		VisualizzaClienti.setVisible(true);
	}
	
	public void CompletaTabellaTessera() {
	    ArrayList<Tessera> Tessera=null;
	    try {
			Tessera = DAO.getTessera();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    for(Tessera t : Tessera) {
			VisualizzaClienti.setRigheTabella(t.getNTessera(),t.getPossessore().getNome(),t.getPossessore().getCognome(), t.getPossessore().getCF(), t.getPuntiFedeltà() ,  t.getDataRilascio(), t.getDataScadenza());
		}
	}	
		
	public void CompletaTabellaPunti() {
		ArrayList<Tessera> Tessera=null;
		try {
			Tessera = DAO.getPuntiPerCategoria();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Tessera t : Tessera) {
			VisualizzaPunti.setRigheTabella(t.getNTessera(), t.getPossessore().getCF(), t.getPuntiFrutta(), t.getPuntiVerdura(), t.getPuntiConfezionati(), t.getPuntiUova(), t.getPuntiLatticini(), t.getPuntiConfezionati());
	    }
	}

		
		
	public void ApriEliminaTesseraByNTessera() {
		
			EliminaTessera = new EliminaTesseraByNTesseraJDialog(this);
			VisualizzaClienti.setEnabled(false);
			EliminaTessera.setVisible(true);
	}
	
	public void EliminaTesseraIndietroBottonePremuto() {

		EliminaTessera.setVisible(false);
		VisualizzaClienti.setEnabled(true);
		VisualizzaClienti.setVisible(true);
		
	}

	public void EliminaTesseraByNTessera() {
		String N_tessera = EliminaTessera.getNTesseraDaEliminareTB();
		try {
			int NTessera = Integer.parseInt(N_tessera);
			EliminaTessera.setVisible(false);
			DAO.deleteTessera(NTessera);
			EliminaTessera.setVisible(false);
			TesseraEliminata = new TesseraEliminataJDialog(this);
			TesseraEliminata.setVisible(true);
			
			
				
				
				
			
		
		}catch (TesseraNonTrovataException t)	{
			ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
			ErroreNumeroTessera.setVisible(true);
			EliminaTessera.setVisible(false);
			
			
		}catch (NumberFormatException e) {
				ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
				ErroreNumeroTessera.setVisible(true);
				EliminaTessera.setVisible(false);

		}catch (SQLException e) {
				ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
				ErroreNumeroTessera.setVisible(true);
				EliminaTessera.setVisible(false);

		}
	}
		
	public void NTesseraErratoRiprovaBottonePremuto() {
		ErroreNumeroTessera.setVisible(false);
		VisualizzaClienti.setEnabled(true);
		VisualizzaClienti.setVisible(true);
		
	}
		
	public void TesseraEliminataOKBottonePremuto() {
		VisualizzaClienti.setEnabled(true);		
		TesseraEliminata.setVisible(false);
		VisualizzaClienti.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		VisualizzaClienti.setVisible(true);
	}
	
	//FINESTRA VISUALIZZA DETTAGLI
	
	public void VisualizzaDettagliClienteClientiPercorsoBottonePremuto() {
		VisualizzaDettagli.setVisible(false);
		Clienti = new ClientiJFrame(this, ControllerP);
		Clienti.setVisible(true);
	}
	
	public void VisualizzaDettagliClienteVisualizzaClientiPercorsoBottonePremuto() {
		
		VisualizzaDettagli.setVisible(false);
		VisualizzaClienti.setVisible(true);
	}
	
	public void VisualizzaDettagliClienteVisualizzaDettagliClientePercorsoBottonePremuto() {
		VisualizzaDettagli.setVisible(false);
		VisualizzaDettagli.setVisible(true);
	}

	public void ErroreRicercaClienteRiprovaBottonePremuto() {
		
		ErroreRicercaCliente.setVisible(false);
		DettagliCliente = new DettagliClienteJDialog(this);
		DettagliCliente.setVisible(true);
	}	
		
	
		
	public void ApriDettagliClienteJDialog() {
		DettagliCliente = new DettagliClienteJDialog(this);
		DettagliCliente.setVisible(true);
	}
	
	public void VisualizzaDettagliJDialogAnnullaBottonePremuto() {

		DettagliCliente.setVisible(false);
	}
		
	public void CercaClienteByNTessera() 
	{  	
		try {	
			
			Cliente c = DAO.getClienteByNTessera(Integer.valueOf(DettagliCliente.getVisualizzaDettagliNTesseraTB()));
			VisualizzaClienti.setVisible(false);
			VisualizzaDettagli = new VisualizzaDettagliClienteJFrame(this, ControllerP);	
			VisualizzaDettagli.RiepilogoNomeTB.setText(c.getNome());
			VisualizzaDettagli.RiepilogoCognomeTB.setText(c.getCognome());
			VisualizzaDettagli.RiepilogoCFTB.setText(c.getCF());
			VisualizzaDettagli.RiepilogoLuogoNTB.setText(c.getLuogoNascita());
			VisualizzaDettagli.RiepilogoSessoTB.setText(c.getSesso());
			Date dataN = c.getDataNascita();
			VisualizzaDettagli.setRiepilogoDataNTB(dataN.toString());
			VisualizzaDettagli.setVisible(true);
			DettagliCliente.setVisible(false);
			
		}catch (NumberFormatException NFE) {
			
			DettagliCliente.setVisible(false);
		 	ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
		 	ErroreNumeroTessera.setVisible(true);
			
		}catch (TesseraNonTrovataException e) {
			
			DettagliCliente.setVisible(false);
		 	ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
		 	ErroreNumeroTessera.setVisible(true);			
		 	
		} catch (SQLException e) {
			 	
			DettagliCliente.setVisible(false);
		 	ErroreNumeroTessera = new FormatoNTesseraErratoJDialog(this);
		 	ErroreNumeroTessera.setVisible(true);
		} 
	}		

	public void VisualizzaDettagliClienteChiudiBottonePremuto() {
			VisualizzaDettagli.setVisible(false);
			VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
			VisualizzaClienti.setVisible(true);
		}

	
	//FINESTRA VISUALIZZA PUNTI
	
	public void VisualizzaPuntiVisualizzaClientiPercorsoBottonePremuto() {

		VisualizzaPunti.setVisible(false);
		VisualizzaClienti = new VisualizzaClientiJFrame(this, ControllerP);
		VisualizzaClienti.setVisible(true);
	}

	public void VisualizzaPuntiClientiPercorsoBottonePremuto() {

		VisualizzaPunti.setVisible(false);
		Clienti = new ClientiJFrame(this, ControllerP);
		Clienti.setVisible(true);
	}

	public void VisualizzaPuntiVisualizzaPuntiPercorsoBottonePremuto() {

		VisualizzaPunti.setVisible(false);
		VisualizzaPunti = new VisualizzaPuntiJFrame(this, ControllerP);
		VisualizzaPunti.setVisible(true);
	}	

	//GETTERS
	
	public VisualizzaDettagliClienteJFrame getVisualizzaDettagli() {
		return VisualizzaDettagli;
	}

	public VisualizzaPuntiJFrame getVisualizzaPunti() {
		return VisualizzaPunti;
	}
		
	public ClientiJFrame getClienti() {
		return Clienti;
	}

	public RiepilogoTesseraJFrame getRiepilogoTessera() {
		return RiepilogoTessera;
	}

	public VisualizzaClientiJFrame getVisualizzaClienti() {
		return VisualizzaClienti;
	}

	public JFrame getCreaTessera() {
		return CreaTessera;
	}


	


			
}	