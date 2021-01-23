package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Fattura;

public interface VenditeDAO {

	public ArrayList<Fattura> getFattura() throws SQLException;
	public void inserisciCarrello() throws SQLException;
	public int getUltimoIDCarrello() throws SQLException;
	public void inserisciCompCarelloKG(int IDCarrello, int IDProdotto, float quantità) throws SQLException;
	public void inserisciCompCarelloN(int IDCarrello, int IDProdotto, int quantità) throws SQLException;
//	public void getCarrelloByIDCarrello(String iDCarrello);
	
	

}
