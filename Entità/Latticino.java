package Entità;
import java.sql.Date;

public class Latticino extends Prodotto_kg {
	private Date DataScadenza;
	private Date DataMungitura;
	private String PaeseMungitura;
	private String PaeseLavorazione;
	
	
	
	public Latticino(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		DataScadenza = data_scadenza;
	}
	
	
	public Latticino(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_scadenza,
			Date data_mungitura, String paese_mungitura, String paese_lavorazione) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		DataScadenza = data_scadenza;
		DataMungitura = data_mungitura;
		PaeseMungitura = paese_mungitura;
		PaeseLavorazione = paese_lavorazione;
	}


	public Date getDataScadenza() {
		return DataScadenza;
	}
	public void setDataScadenza(Date data_scadenza) {
		DataScadenza = data_scadenza;
	}
	public Date getDataMungitura() {
		return DataMungitura;
	}
	public void setDataMungitura(Date data_mungitura) {
		DataMungitura = data_mungitura;
	}
	public String getPaeseMungitura() {
		return PaeseMungitura;
	}
	public void setPaeseMungitura(String paese_mungitura) {
		PaeseMungitura = paese_mungitura;
	}
	public String getPaeseLavorazione() {
		return PaeseLavorazione;
	}
	public void setPaeseLavorazione(String paese_lavorazione) {
		PaeseLavorazione = paese_lavorazione;
	}
	
	
	

}
