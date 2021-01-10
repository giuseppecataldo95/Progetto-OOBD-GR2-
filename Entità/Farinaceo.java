package Entità;
import java.sql.Date;

public class Farinaceo extends Prodotto_kg {
	private Date Data_scadenza;
	private String Lotto_lavorazione;
	
	public Farinaceo(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		Data_scadenza = data_scadenza;
	}
	
	
	public Farinaceo(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza,
			String lotto_lavorazione) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		Data_scadenza = data_scadenza;
		Lotto_lavorazione = lotto_lavorazione;
	}


	public Date getData_scadenza() {
		return Data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		Data_scadenza = data_scadenza;
	}
	public String getLotto_lavorazione() {
		return Lotto_lavorazione;
	}
	public void setLotto_lavorazione(String lotto_lavorazione) {
		Lotto_lavorazione = lotto_lavorazione;
	}
	
	

}
