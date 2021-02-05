package Entità;
import java.sql.Date;

public class Frutta extends Prodotto_kg{

	
	private Date DataRaccolta;
	private String Provenienza;
	private String LottoLavorazione;
	
	
	
	public Frutta(int iD_Prodotto, String nome, float valore, float scorte_kg) {
		super(iD_Prodotto, nome, valore, scorte_kg);
	}
	
	
	public Frutta(int iD_Prodotto, String nome, float valore, float scorte_kg, Date data_raccolta, String provenienza,
			String lotto_lavorazione) {
		super(iD_Prodotto, nome, valore, scorte_kg);
		DataRaccolta = data_raccolta;
		Provenienza = provenienza;
		LottoLavorazione = lotto_lavorazione;
	}


	public Date getDataRaccolta() {
		return DataRaccolta;
	}
	public void setDataRaccolta(Date data_raccolta) {
		DataRaccolta = data_raccolta;
	}
	public String getProvenienza() {
		return Provenienza;
	}
	public void setProvenienza(String provenienza) {
		Provenienza = provenienza;
	}
	public String getLottoLavorazione() {
		return LottoLavorazione;
	}
	public void setLottoLavorazione(String lotto_lavorazione) {
		LottoLavorazione = lotto_lavorazione;
	}
}
