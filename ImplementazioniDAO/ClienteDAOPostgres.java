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
	private PreparedStatement getPuntiFrutta;
	

	
	

	

	public ClienteDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		getClienteByCF = connessione.prepareStatement("SELECT cliente.nome, cliente.cognome, cliente.data_nascita, cliente.luogo_nascita, cliente.sesso, cliente.cf FROM cliente join tessera on cliente.cf = tessera.cf WHERE tessera.n_tessera = ?");
		insertCliente = connessione.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?)");
		deleteTessera = connessione.prepareStatement("DELETE FROM TESSERA WHERE n_tessera = ?");
		
	}
	
	public void insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date data_nascita) throws SQLException {
		
		
	
		insertCliente.setString(1, nome.toUpperCase());
		insertCliente.setString(2, cognome.toUpperCase());
		insertCliente.setString(3, cf.toUpperCase());
		insertCliente.setString(4, luogoNascita.toUpperCase());
		insertCliente.setDate(5, data_nascita);
		insertCliente.setString(6, sesso.toUpperCase());
		insertCliente.executeUpdate();
		
	}
	
	public ArrayList<Tessera> getPuntiPerCategoria() throws SQLException{
		
		Statement PuntiPerCategoria = connessione.createStatement();
		
		ResultSet rs = PuntiPerCategoria.executeQuery("SELECT * FROM Visualizzaclienti");
		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
		
		while(rs.next()) {
			
			Cliente c = new Cliente(rs.getString("cf"));
			Tessera t = new Tessera (rs.getInt("n_tessera"), c, rs.getInt("punti_frutta"), rs.getInt("punti_verdura"), rs.getInt("punti_confezionati"), rs.getInt("punti_uova"), rs.getInt("punti_latticini"), rs.getInt("punti_farinacei"));
			Tessera.add(t);
		}
		
		rs.close();
		return Tessera;
		
	}
	
	public ArrayList  getTessera() throws SQLException
	{
		Statement getTessera = connessione.createStatement();
		ResultSet rs = getTessera.executeQuery("SELECT * FROM  VisualizzaClienti");
		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
		while(rs.next()) 
			
		{
			Cliente cliente = new Cliente (rs.getString("nome"), rs.getString("cognome"), rs.getString("cf"));

			Tessera t = new Tessera(rs.getInt("n_tessera"),rs.getInt("punti_totali"),rs.getDate("data_rilascio"), rs.getDate("data_scadenza"), cliente);
			Tessera.add(t);
			
		}
	
		rs.close();
		return Tessera;
		
	}

	
//	public ArrayList<Cliente> getCliente() throws SQLException
//	{
//		Statement getCliente = connessione.createStatement();
//		ResultSet rs = getCliente.executeQuery("SELECT nome, cognome FROM cliente, tessera WHERE tessera.cf = cliente.cf ");
//		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
//		while(rs.next()) 
//			
//		{
//			Tessera c = new Tessera(rs.getInt("n_tessera"),rs.getInt("punti_fedeltà"),rs.getString("cf"),rs.getDate("data_rilascio"), rs.getDate("data_scadenza"));
//			Tessera.add(c);
//			
//		}
//	
//		rs.close();
//		return Tessera;
//		
//	}
	
	
	public  Cliente getClienteByCF(int n_tessera) throws SQLException 
	{
	
		getClienteByCF.setInt(1, n_tessera);
		ResultSet rs = getClienteByCF.executeQuery();
		Cliente c = null;
		
		if (rs.next()) {
				
		 c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
		
		
		
		}
		rs.close();
		return c;
	
	}

	public int deleteTessera(int NTessera) throws SQLException  {
		
		
		deleteTessera.setInt(1, NTessera);
		
		int row = deleteTessera.executeUpdate();
		return row;
		
		
	}

	
	public int getPuntiClienteFrutta(int NTessera) throws SQLException {

		getPuntiFrutta.setInt(1, NTessera);
		
		ResultSet rs = getPuntiFrutta.executeQuery();
		
		int PuntiFrutta=0;
		
		if(rs.next()) 
		{
			
			 PuntiFrutta = rs.getInt("punti_frutta");
			
		}
		
		
		rs.close();
		return PuntiFrutta;
	}
	
	
	
		
	}

	
	





	
	

