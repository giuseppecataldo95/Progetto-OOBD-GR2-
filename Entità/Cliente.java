package Entità;

import java.sql.Date;

public class Cliente {

	
	private String Nome;
	private String Cognome;
	private String Luogo_nascita;
	private String Sesso;
	private String CF;
	private Date Data_nascita;
	
	
	
	public Cliente(String nome, String cognome, String luogo_nascita, String sesso, String cF, Date data_nascita) {
		super();
		Nome = nome;
		Cognome = cognome;
		Luogo_nascita = luogo_nascita;
		Sesso = sesso;
		CF = cF;
		Data_nascita = data_nascita;
	}




	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String getLuogo_nascita() {
		return Luogo_nascita;
	}


	public void setLuogo_nascita(String luogo_nascita) {
		Luogo_nascita = luogo_nascita;
	}


	public String getSesso() {
		return Sesso;
	}


	public void setSesso(String sesso) {
		Sesso = sesso;
	}


	public String getCF() {
		return CF;
	}


	public void setCF(String cF) {
		CF = cF;
	}


	public Date getData_nascita() {
		return Data_nascita;
	}


	public void setData_nascita(Date data_nascita) {
		Data_nascita = data_nascita;
	}


	
	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", Cognome=" + Cognome + ", Luogo_nascita=" + Luogo_nascita + ", Sesso="
				+ Sesso + ", CF=" + CF + ", Data_nascita=" + Data_nascita + "]";
	}
	
	


	

	
	


}