package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entit�.Cliente;



public interface ClienteDAO {

	
	public ArrayList<Cliente> getCliente() throws SQLException;
	
	
	
}
