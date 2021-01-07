package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Cliente;



 public interface ClienteDAO {

	
	public ArrayList<Cliente> getCliente() throws SQLException;
	public int insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, String dataN) throws SQLException;
	
	
}
