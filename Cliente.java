package Cliente;

public class Cliente {

	
	private String nome;
	private String cognome;
	private String luogoN;
	private String meseNascita;
	private String sesso;
	private int  giornoNascita;
	private int  annoNascita;
	
	
	
	public Cliente(String nome, String cognome, String luogoN, String  meseNascita, int giornoNascita,
			int annoNascita, String sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoN = luogoN;
		this.meseNascita = meseNascita;
		this.giornoNascita = giornoNascita;
		this.annoNascita = annoNascita;
		this.sesso = sesso;
	}



	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getLuogoN() {
		return luogoN;
	}



	public void setLuogoN(String luogoN) {
		this.luogoN = luogoN;
	}



	public String getMeseNascita() {
		return meseNascita;
	}



	public void setMeseNascita(String meseNascita) {
		this.meseNascita = meseNascita;
	}



	public String getSesso() {
		return sesso;
	}



	public void setSesso(String sesso) {
		this.sesso = sesso;
	}



	public int getGiornoNascita() {
		return giornoNascita;
	}



	public void setGiornoNascita(int giornoNascita) {
		this.giornoNascita = giornoNascita;
	}



	public int getAnnoNascita() {
		return annoNascita;
	}



	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}




	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", luogoN=" + luogoN + ", meseNascita=" + meseNascita
				+ ", sesso=" + sesso + ", giornoNascita=" + giornoNascita + ", annoNascita=" + annoNascita + "]";
	}




	
	
	
	
	
}
