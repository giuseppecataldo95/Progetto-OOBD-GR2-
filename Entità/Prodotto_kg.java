package Entità;
public class Prodotto_kg extends Prodotto {
	private float Scorte_kg;
	private String Nome;
	
	

	public Prodotto_kg(int iD_Prodotto, String nome, float valore, float scorte_kg) {
		super(iD_Prodotto, valore);
		Nome = nome;
		Scorte_kg = scorte_kg;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getScorte_kg() {
		return Scorte_kg;
	}

	public void setScorte_kg(float scorte_kg) {
		Scorte_kg = scorte_kg;
	}
	
	

}
