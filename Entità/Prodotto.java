package Entità;

public class Prodotto {
	private int IDProdotto;
	private float Valore;
	
	
	public Prodotto(int ID_Prodotto) {
		this.IDProdotto = ID_Prodotto;
	}
	
	public Prodotto(int iD_Prodotto, float valore) {
		super();
		IDProdotto = iD_Prodotto;
		Valore = valore;
	}
	public int getIDProdotto() {
		return IDProdotto;
	}
	public void setIDProdotto(int iD_Prodotto) {
		IDProdotto = iD_Prodotto;
	}
	
	
	public float getValore() {
		return Valore;
	}
	public void setValore(float valore) {
		Valore = valore;
	}
	
	

}
