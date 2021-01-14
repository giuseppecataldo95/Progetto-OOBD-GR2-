package Entitā;

import java.sql.Date;

public class Tessera {
	
	int NTessera;
	int PuntiFedeltā;
	String CF;
	Date DataRilascio;
	Date DataScadenza;
	
	
	public Tessera(int nTessera, int puntiFedeltā, String cF, Date dataRilascio, Date dataScadenza) {
		super();
		NTessera = nTessera;
		PuntiFedeltā = puntiFedeltā;
		CF = cF;
		DataRilascio = dataRilascio;
		DataScadenza = dataScadenza;
	}


	public int getNTessera() {
		return NTessera;
	}


	public void setNTessera(int nTessera) {
		NTessera = nTessera;
	}


	public int getPuntiFedeltā() {
		return PuntiFedeltā;
	}


	public void setPuntiFedeltā(int puntiFedeltā) {
		PuntiFedeltā = puntiFedeltā;
	}


	public String getCF() {
		return CF;
	}


	public void setCF(String cF) {
		CF = cF;
	}


	public Date getDataRilascio() {
		return DataRilascio;
	}


	public void setDataRilascio(Date dataRilascio) {
		DataRilascio = dataRilascio;
	}


	public Date getDataScadenza() {
		return DataScadenza;
	}


	public void setDataScadenza(Date dataScadenza) {
		DataScadenza = dataScadenza;
	}
	
	

}
