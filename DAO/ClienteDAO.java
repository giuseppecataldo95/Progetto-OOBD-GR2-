package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Cliente;



public interface ClienteDAO {

	
	public ArrayList<Cliente> getCliente() throws SQLException;
	public Cliente getClienteByCF() throws SQLException;
	
	
	
}
