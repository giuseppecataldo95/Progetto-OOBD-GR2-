package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.Date;
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
//		getClienteByCF = connessione.prepareStatement("SELECT * FROM cliente WHERE cliente.CF = ?");
		insertCliente = connessione.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?)");
	}
	
	public int insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date data_nascita) throws SQLException {
		
		
	
		insertCliente.setString(1, nome.toUpperCase());
		insertCliente.setString(2, cognome.toUpperCase());
		insertCliente.setString(3, cf.toUpperCase());
		insertCliente.setString(4, luogoNascita.toUpperCase());
		insertCliente.setDate(5, data_nascita);
		insertCliente.setString(6, sesso.toUpperCase());
		int row = insertCliente.executeUpdate();
		connessione.close();
				
		
		return row;
	}
	
	public ArrayList<Cliente> getCliente() throws SQLException
	{
		Statement getClienti = connessione.createStatement();
		ResultSet rs = getClienti.executeQuery("SELECT * FROM cliente");
		ArrayList<Cliente> Clienti = new ArrayList<Cliente>();
		while(rs.next()) 
			
		{
			Cliente c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
			Clienti.add(c);
			
		}
	
		rs.close();
		return Clienti;
		
	}
	
	public Cliente getClienteByCF() throws SQLException 
	{
		getClienteByCF.setString(1, "cliente");
		ResultSet rs = getClienteByCF.executeQuery();		
		Cliente c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
		rs.close();
		return c;
	
	}







	
	
}
