package Entità;

import java.sql.Date;

public class Cliente {

	
	private String Nome;
	private String Cognome;
	private String LuogoNascita;
	private String Sesso;
	private String CF;
	private Date DataNascita;
	
	
	
	public Cliente(String nome, String cognome, String luogo_nascita, String sesso, String cF, Date data_nascita) {
		super();
		Nome = nome;
		Cognome = cognome;
		LuogoNascita = luogo_nascita;
		Sesso = sesso;
		CF = cF;
		DataNascita = data_nascita;
	}


	public Cliente(String nome, String cognome, String cF) {
		super();
		Nome = nome;
		Cognome = cognome;
		CF = cF;
	}


	public Cliente(String cf) {
		CF =cf;
		
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


	public String getLuogoNascita() {
		return LuogoNascita;
	}


	public void setLuogoNascita(String luogo_nascita) {
		LuogoNascita = luogo_nascita;
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


	public Date getDataNascita() {
		return DataNascita;
	}


	public void setDataNascita(Date data_nascita) {
		DataNascita = data_nascita;
	}


	
	


	

	
	


}