package Cliente;

import java.awt.event.WindowEvent;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControllerClienti {
	
	clientiJFrame clienti;
	creaTesseraJFrame nuovaTessera;
	erroreTesseraJDialog errore;
	riepilogoTesseraJFrame riepilogo;
	clienteCreatoJDialog clienteCreato;
	String nome, cognome, luogoN, giornoN, annoN, meseN, CF;
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ControllerClienti c = new ControllerClienti();
		
		
	}



	public  ControllerClienti(){
		
		clientiJFrame clienti = new clientiJFrame(this);
		clienti.setVisible(true);
		
		
	
		
		
		
	}
	
	public void pressNuovaTesseraButton() {
		
		creaTesseraJFrame nuovaTessera = new creaTesseraJFrame(this);
		nuovaTessera.setVisible(true);
		
		
		
	}
	
	public void pressIndietroCreaTesseraButton() {
		
		nuovaTessera.setVisible(false);
		
		clienti.setVisible(true);
		
		
	}


	public void salvaDatiCliente(String nome, String cognome, String luogoNascita, String giorno, int mese, int anno,
			String sesso) {

		
		
		Cliente a = new Cliente( nome, cognome, luogoNascita, giorno, mese, anno, sesso);
		
		String mese1= ("" +mese);
		String anno1= ("" +anno);
		riepilogoTesseraJFrame riepilogo = new riepilogoTesseraJFrame(this);
		riepilogo.riepilogoNomeTB.setText(nome);
		riepilogo.riepilogoCognomeTB.setText(cognome);
		riepilogo.riepilogoLuogoNTB.setText(luogoNascita);
		riepilogo.riepilogoGiornoNTB.setText(mese1);
		riepilogo.riepilogoMeseNTB.setText(giorno);
		riepilogo.riepilogoAnnoNTB.setText(anno1);
		riepilogo.riepilogoSessoTB.setText(sesso);
		CFGenerator cf = new CFGenerator(nome, cognome, luogoNascita, giorno, anno, mese, sesso);
		riepilogo.riepilogoCFTB.setText(cf.getCodiceFiscale());
		riepilogo.setVisible(true);
		

		
		
		
	}


	public void mostraErrore() {
		
		
		errore = new erroreTesseraJDialog(this);
		errore.setVisible(true);
		clienti.setVisible(false);
		
	}


	public void pressClientiPercorso() {
		
		clientiJFrame clienti = new clientiJFrame(this);
		clienti.setVisible(true);	
		
	}

	public void clienteInserito() {
		
		clienteCreatoJDialog clienteCreato = new clienteCreatoJDialog(this);
		clienteCreato.setVisible(true);
		
		
		
		
	}
	

	
	

	


	

}
