package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Cliente;
import Entità.Tessera;



 public interface ClienteDAO {

	
	public ArrayList<Tessera> getTessera() throws SQLException;
	public void insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date dataN) throws SQLException;
	public int deleteTessera (int nTessera) throws SQLException;
	public Cliente  getClienteByCF(int n_tessera) throws SQLException;
	
}
