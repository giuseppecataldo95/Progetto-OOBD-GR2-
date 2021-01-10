package Entità;

import java.sql.Date;

public class Uova extends Prodotto_unitario{
	private Date Data_scadenza;
	private int N_perConfezione;
	private String Lotto_lavorazione;
	private String Provenienza;
	
	public Uova(int iD_Prodotto, float valore, int scorte, Date data_scadenza, int n_perConfezione) {
		super(iD_Prodotto, valore, scorte);
		Data_scadenza = data_scadenza;
		N_perConfezione = n_perConfezione;
	}
	
	public Uova(int iD_Prodotto, float valore, int scorte, Date data_scadenza, int n_perConfezione,
			String lotto_lavorazione, String provenienza) {
		super(iD_Prodotto, valore, scorte);
		Data_scadenza = data_scadenza;
		N_perConfezione = n_perConfezione;
		Lotto_lavorazione = lotto_lavorazione;
		Provenienza = provenienza;
	}

	public Date getData_scadenza() {
		return Data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		Data_scadenza = data_scadenza;
	}
	public int getN_perConfezione() {
		return N_perConfezione;
	}
	public void setN_perConfezione(int n_perConfezione) {
		N_perConfezione = n_perConfezione;
	}
	public String getLotto_lavorazione() {
		return Lotto_lavorazione;
	}
	public void setLotto_lavorazione(String lotto_lavorazione) {
		Lotto_lavorazione = lotto_lavorazione;
	}
	public String getProvenienza() {
		return Provenienza;
	}
	public void setProvenienza(String provenienza) {
		Provenienza = provenienza;
	}
	
	

}
