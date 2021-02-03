package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Cliente;
import Entità.Tessera;
import Risorse.MieEccezioni.TesseraNonTrovataException;



 public interface ClienteDAO {

	
	public ArrayList<Tessera> getTessera() throws SQLException;
	public void insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date dataN) throws SQLException;
	public void deleteTessera (int nTessera) throws SQLException, TesseraNonTrovataException;
	public Cliente  getClienteByNTessera(int n_tessera) throws SQLException, TesseraNonTrovataException;
	public ArrayList<Tessera> getPuntiPerCategoria() throws SQLException;
}
