package Entità;
import java.util.Date;

public class Latticino extends Prodotto_kg {
	private Date Data_scadenza;
	private Date Data_mungitura;
	private String Paese_mungitura;
	private String Paese_lavorazione;
	
	
	
	public Latticino(int iD_Prodotto, String nome, float valore, double scorte_kg, Date data_scadenza) {
		super(iD_Prodotto, valore, nome, scorte_kg);
		Data_scadenza = data_scadenza;
	}
	
	
	public Latticino(int iD_Prodotto, String nome, float valore, double scorte_kg, Date data_scadenza,
			Date data_mungitura, String paese_mungitura, String paese_lavorazione) {
		super(iD_Prodotto, valore, nome, scorte_kg);
		Data_scadenza = data_scadenza;
		Data_mungitura = data_mungitura;
		Paese_mungitura = paese_mungitura;
		Paese_lavorazione = paese_lavorazione;
	}


	public Date getData_scadenza() {
		return Data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		Data_scadenza = data_scadenza;
	}
	public Date getData_mungitura() {
		return Data_mungitura;
	}
	public void setData_mungitura(Date data_mungitura) {
		Data_mungitura = data_mungitura;
	}
	public String getPaese_mungitura() {
		return Paese_mungitura;
	}
	public void setPaese_mungitura(String paese_mungitura) {
		Paese_mungitura = paese_mungitura;
	}
	public String getPaese_lavorazione() {
		return Paese_lavorazione;
	}
	public void setPaese_lavorazione(String paese_lavorazione) {
		Paese_lavorazione = paese_lavorazione;
	}
	
	
	

}
