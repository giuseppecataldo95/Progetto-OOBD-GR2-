package Risorse.App;

import java.util.Arrays;
import DAO.ComuniDAO;
import ImplementazioniDAO.ComuniDAOPostgres;
import java.sql.Connection;
import java.sql.SQLException;

public class CFGenerator {

  private String nome, cognome, comune, meseNascita, sesso, giorno;
  private int anno;
  private ComuniDAO DAO;
  
  // Array statici
  private final char[] elencoPari = {'0','1','2','3','4','5','6','7','8','9','A','B',
                                    'C','D','E','F','G','H','I','J','K','L','M','N',
                                    'O','P','Q','R','S','T','U','V','W','X','Y','Z'
                                };
                                   
  private final int[] elencoDispari= {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13,
                                15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16,
                                10, 22, 25, 24, 23
                               };
  
  private final String[][] mese = { {"Gennaio","A"},
                                    {"Febbraio","B"},
                                    {"Marzo","C"},
                                    {"Aprile","D"},
                                    {"Maggio","E"},
                                    {"Giugno","H"},
                                    {"Luglio","L"},
                                    {"Agosto","M"},
                                    {"Settembre","P"},
                                    {"Ottobre","R"},
                                    {"Novembre","S"},
                                    {"Dicembre","T"}
                                  };
 
  public CFGenerator(Connection c) throws SQLException {
	  DAO = new ComuniDAOPostgres(c);
  }
  
  public CFGenerator(String nome, String cognome, String comune, String m, int anno, String giorno,String sesso) {
    this.nome = nome;
    this.cognome = cognome;
    this.comune = comune;
    this.meseNascita = m;
    this.anno = anno;
    this.giorno = giorno;
    this.sesso = sesso;
    
  } 
  public String getNome() {
    return modificaNomeCognome(nome,true);
  }
  public String getCognome() {
    return modificaNomeCognome(cognome,false);
  }
  
  public String getNomeInserito() {
    return nome;
  }
  public String getCognomeInserito() {
    return cognome;
  }
  public String getMese() {
    return modificaMese();
  }
  public String getMeseInserito() {
    return meseNascita;
  }
  public String getAnno() {
    String Anno = String.valueOf(anno);
    String anno = Anno.substring(2, 4);
	  return anno;
  }
  public int getAnnoInserito() {
    return anno;
  }
  public String getGiorno() {
	  
	  int Giorno = 0; 
	  
	  if(sesso.equals("M")) {
		  
		  return giorno;
		  
	  }
	  else
	  {
		  
		   Giorno = Integer.parseInt(giorno);
		   Giorno += 40; 
		  
	  
    return (String.valueOf(Giorno));
  }
  }

  
  public String getComune() throws SQLException {
    return elaboraCodiceComune();
  }
  public String getCodice() throws SQLException, NullPointerException {
    return calcolaCodice();
  }
  
  public void setNome(String nome) {
	this.nome = nome;
  }

  public void setCognome(String cognome) {
	this.cognome = cognome;
  }

  public void setComune(String comune) {
	this.comune = comune;
  }

  public void setM(String m) {
	this.meseNascita = m;
  }

  public void setSesso(String sesso) {
	this.sesso = sesso;
  }

  public void setGiorno(String giorno) {
	this.giorno = giorno;
  }

  public void setAnno(int anno) {
	this.anno = anno;
  }

  public String getCodiceFiscale() {
    return toString();
  }
  
  
  //      @param cod                       Se cod e' true, indica il nome; altrimenti il cognome
        
  private String modificaNomeCognome(String NomeCognome, boolean cod) {
    String NomeCognomeModificati = "";
    NomeCognome = NomeCognome.replaceAll(" ", "");           // Rimuovo eventuali spazi
    NomeCognome = NomeCognome.toLowerCase();
    
    String consonanti = getConsonanti(NomeCognome);      // Ottengo tutte le consonanti e tutte le vocali della stringa
    String vocali = getVocali(NomeCognome);
    
    // Controlla i possibili casi
    if(consonanti.length() == 3) {                   // La stringa contiene solo 3 consonanti, quindi ho gia' la modifica
      NomeCognomeModificati = consonanti;
    }
                                                     // Le consonanti non sono sufficienti, e la stinga e' più lunga o
                                                     // uguale a 3 caratteri [aggiungo le vocali mancanti]
    else if((consonanti.length() < 3) && (NomeCognome.length() >= 3)) {
      NomeCognomeModificati = consonanti;
      NomeCognomeModificati = aggiungiVocali(NomeCognomeModificati, vocali);
    } 
                                                     // Le consonanti non sono sufficienti, e la stringa 
                                                     //contiene meno di 3 caratteri [aggiungo consonanti e vocali, e le x]
    else if((consonanti.length() < 3) && (NomeCognome.length() < 3)) {
      NomeCognomeModificati = consonanti;
      NomeCognomeModificati += vocali;
      NomeCognomeModificati = aggiungiX(NomeCognomeModificati);
    } 
                                                     // Le consonanti sono in eccesso, prendo solo le 
                                                     //prime 3 nel caso del cognome; nel caso del nome la 0, 2, 3
    else if(consonanti.length() > 3) {
      // true indica il nome e false il cognome
      if(!cod) NomeCognomeModificati = consonanti.substring(0,3);
      else NomeCognomeModificati = consonanti.charAt(0) +""+ consonanti.charAt(2) +""+ consonanti.charAt(3);
    }
    
    return NomeCognomeModificati;
  }
  
  // Aggiunge le X sino a raggiungere una lunghezza complessiva di 3 caratteri
  
  private String aggiungiX(String NomeCognome) {
    while(NomeCognome.length() < 3) {
      NomeCognome += "x";
    }
    return NomeCognome;
  }
  
  // Aggiunge le vocali alla stringa passata per parametro
  
  private String aggiungiVocali(String NomeCognome, String vocali) {
    int index = 0;
    while(NomeCognome.length() < 3) {
      NomeCognome += vocali.charAt(index);
      index++;
    }
    return NomeCognome; 
  }
  
  // Toglie dalla stringa tutte le consonanti
  
  private String getVocali(String NomeCognome) {
    NomeCognome = NomeCognome.replaceAll("[^aeiou]", "");
    return NomeCognome;
  }
  
  // Toglie dalla stringa tutte le vocali
  
  private String getConsonanti(String NomeCognome) {
    NomeCognome = NomeCognome.replaceAll("[aeiou]","");
    return NomeCognome;
  }
  
  // Restituisce il codice del mese
  
  private String modificaMese() {
    for(int i=0; i<mese.length; i++) {
      if(mese[i][0].equalsIgnoreCase(meseNascita)) return mese[i][1];
    }
    return null;
  }
  
  // Elabora codice del comune
  
  private String elaboraCodiceComune() throws SQLException,NullPointerException  {
	  return DAO.getCodiceComuneByNome(comune.toUpperCase());
  }
  
  // Calcolo del Codice di Controllo
  
  private String calcolaCodice() throws SQLException, NullPointerException {
    String str = getCognome().toUpperCase()+getNome().toUpperCase()+getAnno()+getMese()+getGiorno()+getComune();
    int pari=0,dispari=0;
    
    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);              // i-esimo carattere della stringa
      
      // Il primo carattere e' il numero 1 non 0
      if((i+1) % 2 == 0) {
        int index = Arrays.binarySearch(elencoPari,ch);
        pari += (index >= 10) ? index-10 : index;
      } else {
        int index = Arrays.binarySearch(elencoPari,ch);
        dispari += elencoDispari[index];
      }
    }
    
    int controllo = (pari+dispari) % 26;
    controllo += 10;
    
    return elencoPari[controllo]+"";
  }
  
  // Viene richiamato per una stampa
  public String toString(){
   
	try {
		return getCognome().toUpperCase()+getNome().toUpperCase()+getAnno()+getMese()+getGiorno()+getComune()+getCodice();
	} catch (SQLException | NullPointerException e) {
		return "COMUNE NON VALIDO";
	}
	
  }
  
}