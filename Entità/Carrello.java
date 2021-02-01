package Entità;

public class Carrello {
	private int IDCarrello;
	private float PuntiFrutta;
	private float PuntiVerdura;
	private float PuntiConfezionati;
	private float PuntiUova;
	private float PuntiFarinacei;
	private float PuntiLatticini;
	private float PrezzoParziale;
	
	
	

	public Carrello(int iDCarrello, float puntiFrutta, float puntiVerdura, float puntiConfezionati, float puntiUova,
			float puntiFarinacei, float puntiLatticini, float prezzoParziale) {
		super();
		IDCarrello = iDCarrello;
		PuntiFrutta = puntiFrutta;
		PuntiVerdura = puntiVerdura;
		PuntiConfezionati = puntiConfezionati;
		PuntiUova = puntiUova;
		PuntiFarinacei = puntiFarinacei;
		PuntiLatticini = puntiLatticini;
		PrezzoParziale = prezzoParziale;
	}
	
	public Carrello(float puntiFrutta, float puntiVerdura, float puntiConfezionati, float puntiUova,
			float puntiFarinacei, float puntiLatticini) {
		super();
		PuntiFrutta = puntiFrutta;
		PuntiVerdura = puntiVerdura;
		PuntiConfezionati = puntiConfezionati;
		PuntiUova = puntiUova;
		PuntiFarinacei = puntiFarinacei;
		PuntiLatticini = puntiLatticini;
		
	}

	public Carrello(int IDCarrello) {
		this.IDCarrello = IDCarrello;
	}

	public int getIDCarrello() {
		return IDCarrello;
	}

	public float getPuntiFrutta() {
		return PuntiFrutta;
	}

	public float getPuntiVerdura() {
		return PuntiVerdura;
	}

	public float getPuntiConfezionati() {
		return PuntiConfezionati;
	}

	public float getPuntiUova() {
		return PuntiUova;
	}

	public float getPuntiFarinacei() {
		return PuntiFarinacei;
	}

	public float getPuntiLatticini() {
		return PuntiLatticini;
	}

	public float getPrezzoParziale() {
		return PrezzoParziale;
	}

	public void setIDCarrello(int iDCarrello) {
		IDCarrello = iDCarrello;
	}

	public void setPuntiFrutta(float puntiFrutta) {
		PuntiFrutta = puntiFrutta;
	}

	public void setPuntiVerdura(float puntiVerdura) {
		PuntiVerdura = puntiVerdura;
	}

	public void setPuntiConfezionati(float puntiConfezionati) {
		PuntiConfezionati = puntiConfezionati;
	}

	public void setPuntiUova(float puntiUova) {
		PuntiUova = puntiUova;
	}

	public void setPuntiFarinacei(float puntiFarinacei) {
		PuntiFarinacei = puntiFarinacei;
	}

	public void setPuntiLatticini(float puntiLatticini) {
		PuntiLatticini = puntiLatticini;
	}

	public void setPrezzoParziale(float prezzoParziale) {
		PrezzoParziale = prezzoParziale;
	}
	
	public float CalcolaPuntiParziali() {
		float PuntiParziali = PuntiFrutta + PuntiVerdura + PuntiLatticini + PuntiFarinacei + PuntiUova + PuntiConfezionati;
		return PuntiParziali;
	}
	
	
	

}
