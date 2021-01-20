package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public String getCodiceComuneByNome(String Nome) throws SQLException, NullPointerException {
		Statement getCodice;
		getCodice = connessione.createStatement();
		ResultSet rs = getCodice.executeQuery("SELECT Codice FROM Comuni WHERE Nome = '"+Nome+"'");
		Comune c = null;
		if(rs.next())
		c = new Comune(Nome,rs.getString("codice"));
		rs.close();
		return c.getCodice();
	}

}
