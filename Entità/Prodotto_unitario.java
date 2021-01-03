package Entità;

public class Prodotto_unitario extends Prodotto {
	

	private int Scorte;
	
	public Prodotto_unitario(int iD_Prodotto,  float valore, int scorte) {
		super(iD_Prodotto, valore);
		Scorte = scorte;
	}

	public int getScorte() {
		return Scorte;
	}

	public void setScorte(int scorte) {
		Scorte = scorte;
	}
	
	

}
