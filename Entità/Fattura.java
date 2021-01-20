package Entità;

import java.sql.Date;

public class Fattura {
	
	private int NTessera;
	private int PuntiTotali;
	private int PrezzoTotale;
	private int IDFattura;
	private Date DataEmissione;
	private int IDCarrello;
	
	
	public Fattura(int nTessera, int puntiTotali, int prezzoTotale, int iDFattura, Date dataEmissione, int iDCarrello) {
		super();
		NTessera = nTessera;
		PuntiTotali = puntiTotali;
		PrezzoTotale = prezzoTotale;
		IDFattura = iDFattura;
		DataEmissione = dataEmissione;
		IDCarrello = iDCarrello;
	}


	public int getNTessera() {
		return NTessera;
	}


	public void setNTessera(int nTessera) {
		NTessera = nTessera;
	}


	public int getPuntiTotali() {
		return PuntiTotali;
	}


	public void setPuntiTotali(int puntiTotali) {
		PuntiTotali = puntiTotali;
	}


	public int getPrezzoTotale() {
		return PrezzoTotale;
	}


	public void setPrezzoTotale(int prezzoTotale) {
		PrezzoTotale = prezzoTotale;
	}


	public int getIDFattura() {
		return IDFattura;
	}


	public void setIDFattura(int iDFattura) {
		IDFattura = iDFattura;
	}


	public Date getDataEmissione() {
		return DataEmissione;
	}


	public void setDataEmissione(Date dataEmissione) {
		DataEmissione = dataEmissione;
	}


	public int getIDCarrello() {
		return IDCarrello;
	}


	public void setIDCarrello(int iDCarrello) {
		IDCarrello = iDCarrello;
	}
	
	
	

}
