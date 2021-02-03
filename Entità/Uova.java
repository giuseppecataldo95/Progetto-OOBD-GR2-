package Entità;

import java.sql.Date;

public class Uova extends ProdottoUnitario{
	private Date DataScadenza;
	private int NPerConfezione;
	private String LottoLavorazione;
	private String Provenienza;
	
	public Uova(int iD_Prodotto, float valore, int scorte, Date data_scadenza, int n_perConfezione) {
		super(iD_Prodotto, valore, scorte);
		DataScadenza = data_scadenza;
		NPerConfezione = n_perConfezione;
	}
	
	public Uova(int iD_Prodotto, float valore, int scorte, Date data_scadenza, int n_perConfezione,
			String lotto_lavorazione, String provenienza) {
		super(iD_Prodotto, valore, scorte);
		DataScadenza = data_scadenza;
		NPerConfezione = n_perConfezione;
		LottoLavorazione = lotto_lavorazione;
		Provenienza = provenienza;
	}

	public Date getData_scadenza() {
		return DataScadenza;
	}
	public void setDataScadenza(Date data_scadenza) {
		DataScadenza = data_scadenza;
	}
	public int getNPerConfezione() {
		return NPerConfezione;
	}
	public void setNPerConfezione(int n_perConfezione) {
		NPerConfezione = n_perConfezione;
	}
	public String getLottoLavorazione() {
		return LottoLavorazione;
	}
	public void setLottoLavorazione(String lotto_lavorazione) {
		LottoLavorazione = lotto_lavorazione;
	}
	public String getProvenienza() {
		return Provenienza;
	}
	public void setProvenienza(String provenienza) {
		Provenienza = provenienza;
	}
	
	

}
