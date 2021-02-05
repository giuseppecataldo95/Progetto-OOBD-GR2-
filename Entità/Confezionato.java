package Entit‡;

import java.sql.Date;

public class Confezionato extends ProdottoUnitario {
	private Date DataScadenza;
	private String LottoLavorazione;
	private String Modalit‡Conservazione;
	private String Marca;
	private float Peso;
	private String Nome;
	
	
	
	
	
	public Confezionato(int iD_Prodotto, String nome, float valore, int scorte, Date data_scadenza, String marca,  float peso) {
		super(iD_Prodotto, valore, scorte);
		DataScadenza = data_scadenza;
		Marca = marca;
		Peso = peso;
		Nome = nome;
	}
	
	
	
	public Confezionato(int iD_Prodotto, String nome, float valore, int scorte, Date data_scadenza,
			String lotto_lavorazione, String modalit‡_conservazione, String marca, float peso) {
		super(iD_Prodotto, valore, scorte);
		DataScadenza = data_scadenza;
		LottoLavorazione = lotto_lavorazione;
		Modalit‡Conservazione = modalit‡_conservazione;
		Marca = marca;
		Peso = peso;
	}
	



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
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
	public String getModalit‡Conservazione() {
		return Modalit‡Conservazione;
	}
	public void setModalit‡Conservazione(String modalit‡_conservazione) {
		Modalit‡Conservazione = modalit‡_conservazione;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}

}
