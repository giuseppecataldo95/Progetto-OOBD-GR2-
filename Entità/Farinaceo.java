package Entità;
import java.sql.Date;

public class Farinaceo extends Prodotto_kg {
	private Date DataScadenza;
	private String LottoLavorazione;
	
	public Farinaceo(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		DataScadenza = data_scadenza;
	}
	
	
	public Farinaceo(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza,
			String lotto_lavorazione) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		DataScadenza = data_scadenza;
		LottoLavorazione = lotto_lavorazione;
	}


	public Date getDataScadenza() {
		return DataScadenza;
	}
	public void setDataScadenza(Date data_scadenza) {
		DataScadenza = data_scadenza;
	}
	public String getLottoLavorazione() {
		return LottoLavorazione;
	}
	public void setLottoLavorazione(String lotto_lavorazione) {
		LottoLavorazione = lotto_lavorazione;
	}
	
	

}
