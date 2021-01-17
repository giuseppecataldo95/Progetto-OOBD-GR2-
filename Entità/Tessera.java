package Entitā;

import java.sql.Date;

public class Tessera {
	
	private int NTessera;
	private String CF;
	private int PuntiFedeltā;
	private Date DataRilascio;
	private Date DataScadenza;
	private int PuntiFrutta;
	private int PuntiVerdura;
	private int PuntiConfezionati;
	private int PuntiUova;
	private int PuntiLatticini;
	private int PuntiFarinacei;
	private Cliente c;
	
	


	public Tessera(int nTessera, String cf, int puntiFedeltā, Date dataRilascio, Date dataScadenza) {
		super();
		NTessera = nTessera;
		CF = cf;
		PuntiFedeltā = puntiFedeltā;
		DataRilascio = dataRilascio;
		DataScadenza = dataScadenza;
		
	}
	
	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public Tessera(int nTessera,Cliente c,  int puntiFrutta, int puntiVerdura, int puntiConfezionati, int puntiUova,
			int puntiLatticini, int puntiFarinacei) {
		super();
		NTessera = nTessera;
		this.c = c;
		PuntiFrutta = puntiFrutta;
		PuntiVerdura = puntiVerdura;
		PuntiConfezionati = puntiConfezionati;
		PuntiUova = puntiUova;
		PuntiLatticini = puntiLatticini;
		PuntiFarinacei = puntiFarinacei;
	}


	public void setC(Cliente c) {
		this.c = c;
	}


	public int getPuntiFrutta() {
		return PuntiFrutta;
	}


	public void setPuntiFrutta(int puntiFrutta) {
		PuntiFrutta = puntiFrutta;
	}


	public int getPuntiVerdura() {
		return PuntiVerdura;
	}


	public void setPuntiVerdura(int puntiVerdura) {
		PuntiVerdura = puntiVerdura;
	}


	public int getPuntiConfezionati() {
		return PuntiConfezionati;
	}


	public void setPuntiConfezionati(int puntiConfezionati) {
		PuntiConfezionati = puntiConfezionati;
	}


	public int getPuntiUova() {
		return PuntiUova;
	}


	public void setPuntiUova(int puntiUova) {
		PuntiUova = puntiUova;
	}


	public int getPuntiLatticini() {
		return PuntiLatticini;
	}


	public void setPuntiLatticini(int puntiLatticini) {
		PuntiLatticini = puntiLatticini;
	}


	public int getPuntiFarinacei() {
		return PuntiFarinacei;
	}


	public void setPuntiFarinacei(int puntiFarinacei) {
		PuntiFarinacei = puntiFarinacei;
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
	
	public Cliente getC() {
		return c;
	}
	
	


}
