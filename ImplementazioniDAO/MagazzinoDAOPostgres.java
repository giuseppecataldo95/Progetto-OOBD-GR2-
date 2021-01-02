package ImplementazioniDAO;

import java.sql.*;
import java.util.ArrayList;

import DAO.MagazzinoDAO;
import Entità.Prodotto;

public class MagazzinoDAOPostgres implements MagazzinoDAO{
	private Connection connessione;

	public MagazzinoDAOPostgres(Connection connessione) {
		super();
		this.connessione = connessione;
	}
	
	public ArrayList<Prodotto> getProdotti(){
		return null;
	}
}
