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
import Entità.Tessera;

public class ClienteDAOPostgres implements ClienteDAO {

	private Connection connessione;
	private PreparedStatement getClienteByCF;
	private PreparedStatement insertCliente;
	private PreparedStatement deleteTessera;

	
	

	

	public ClienteDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		getClienteByCF = connessione.prepareStatement("SELECT * FROM cliente WHERE cliente.CF = ?");
		insertCliente = connessione.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?)");
		deleteTessera = connessione.prepareStatement("DELETE FROM TESSERA WHERE cf = ?");
		
	}
	
	public void insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date data_nascita) throws SQLException {
		
		
	
		insertCliente.setString(1, nome.toUpperCase());
		insertCliente.setString(2, cognome.toUpperCase());
		insertCliente.setString(3, cf.toUpperCase());
		insertCliente.setString(4, luogoNascita.toUpperCase());
		insertCliente.setDate(5, data_nascita);
		insertCliente.setString(6, sesso.toUpperCase());
		
	}
	
	public ArrayList<Tessera> getTessera() throws SQLException
	{
		Statement getTessera = connessione.createStatement();
		ResultSet rs = getTessera.executeQuery("SELECT * FROM tessera");
		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
		while(rs.next()) 
			
		{
			Tessera c = new Tessera(rs.getInt("n_tessera"),rs.getInt("punti_fedeltà"),rs.getString("cf"),rs.getDate("data_rilascio"), rs.getDate("data_scadenza"));
			Tessera.add(c);
			
		}
	
		rs.close();
		return Tessera;
		
	}
	
	
	
	public  ArrayList<Cliente> getClienteByCF(String cf) throws SQLException 
	{
	
		getClienteByCF.setString(1, cf);
		ResultSet rs = getClienteByCF.executeQuery();
		ArrayList<Cliente> Cliente = new ArrayList<Cliente>();

				while(rs.next()) 
		{
		Cliente c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
		
		
		
		
		}
		return Cliente;
	}

	public int deleteTessera(int NTessera) throws SQLException  {
		
		
		deleteTessera.setInt(1, NTessera);
		
		int row = deleteTessera.executeUpdate();
		return row;
		
		
	}





	
	
}
