package Entità;

public class Prodotto {
	private int ID_Prodotto;
	private float Valore;
	
	
	
	public Prodotto(int iD_Prodotto, float valore) {
		super();
		ID_Prodotto = iD_Prodotto;
		Valore = valore;
	}
	public int getID_Prodotto() {
		return ID_Prodotto;
	}
	public void setID_Prodotto(int iD_Prodotto) {
		ID_Prodotto = iD_Prodotto;
	}
	
	
	public float getValore() {
		return Valore;
	}
	public void setValore(float valore) {
		Valore = valore;
	}
	
	

}
