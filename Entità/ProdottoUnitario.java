package Entità;

public class ProdottoUnitario extends Prodotto {
	

	private int Scorte;
	
	public ProdottoUnitario(int iD_Prodotto, int scorte) {
		super(iD_Prodotto);
		Scorte = scorte;
	}
	
	public ProdottoUnitario(int iD_Prodotto,  float valore, int scorte) {
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
