package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.ClienteDAO;
import Entità.Cliente;

public class ClienteDAOPostgres implements ClienteDAO {

	private Connection connessione;
	private PreparedStatement getClienteByCF;
	private PreparedStatement insertCliente;


	public ClienteDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		getClienteByCF = connessione.prepareStatement("SELECT * FROM cliente WHERE cliente.CF = ?");
		insertCliente = connessione.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?");
	}
	
//	public boolean insertCliente() throws SQLException {
//		
//		
//		insertCliente.setString(1, "nome");
//		insertCliente.setString(2, "cognome");
//		insertCliente.setString(3, 
//				)
//		
//		return true;
//	}
	
	public ArrayList<Cliente> getCliente() throws SQLException {
		Statement getClienti = connessione.createStatement();
		ResultSet rs = getClienti.executeQuery("SELECT * FROM cliente");
		ArrayList<Cliente> Clienti = new ArrayList<Cliente>();
		while(rs.next()) {
			Cliente c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
			
			Clienti.add(c);
		}
		rs.close();
		return Clienti;
	
}
	
	public Cliente getClienteByCF() throws SQLException {
//		getClienteByCF.setString(1, "cliente");
//		ResultSet rs = getClienteByCF.executeQuery();
//		
//		
//			Cliente c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogoN"), rs.getString("meseNascita"), rs.getInt("giornoNascita"), rs.getInt("annoNascita"), rs.getString("sesso"));
//			
//			
//		rs.close();
//		return c;
	return null;
	
}
	
}
