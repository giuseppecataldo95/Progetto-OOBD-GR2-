package Entità;
import java.util.*;

public class Verdura extends Prodotto_kg {
	
	private Date Data_raccolta;
	private String Provenienza;
    private String Lotto_lavorazione;
	
	public Verdura(int iD_Prodotto, String nome, float valore, float scorte_kg) {
		super(iD_Prodotto, nome, valore, scorte_kg);
	}
	
	
	public Verdura(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_raccolta, String provenienza,
			String lotto_lavorazione) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		Data_raccolta = data_raccolta;
		Provenienza = provenienza;
		Lotto_lavorazione = lotto_lavorazione;
	}


	public Date getData_raccolta() {
		return Data_raccolta;
	}
	public void setData_raccolta(Date data_raccolta) {
		Data_raccolta = data_raccolta;
	}
	public String getProvenienza() {
		return Provenienza;
	}
	public void setProvenienza(String provenienza) {
		Provenienza = provenienza;
	}
	public String getLotto_lavorazione() {
		return Lotto_lavorazione;
	}
	public void setLotto_lavorazione(String lotto_lavorazione) {
		Lotto_lavorazione = lotto_lavorazione;
	}

}
