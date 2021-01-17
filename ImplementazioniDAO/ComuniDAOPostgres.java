package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.ComuniDAO;
import Entità.Comune;

public class ComuniDAOPostgres implements ComuniDAO {
	
	private Connection connessione;
	private PreparedStatement insertComuni;
	
	public ComuniDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		insertComuni = connessione.prepareStatement("INSERT INTO COMUNI VALUES (?,?)");
	}
	
	
	public void insertComuni(Comune c) throws SQLException {
		
		insertComuni.setString(1, c.getNome());
		insertComuni.setString(2, c.getCodice());
		insertComuni.executeUpdate();
		
		
	}

}
