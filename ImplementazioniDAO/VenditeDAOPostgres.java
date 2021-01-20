package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.VenditeDAO;
import Entità.Cliente;
import Entità.Fattura;
import Entità.Tessera;

public class VenditeDAOPostgres implements VenditeDAO{
	
	private Connection connessione;
	


	public VenditeDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
	
	

}



	public ArrayList<Fattura> getFattura() throws SQLException {

		Statement getFattura = connessione.createStatement();
		ResultSet rs = getFattura.executeQuery("SELECT * FROM fattura");
		ArrayList<Fattura> Fattura = new ArrayList<Fattura>();
		while(rs.next()) 
			
		{
			
			Fattura f = new Fattura(rs.getInt("n_tessera"), rs.getInt("punti_acquisto"), rs.getInt("prezzo_totale"), rs.getInt("id_fattura"), rs.getDate("data_emissione"), rs.getInt("id_carrello"));
			Fattura.add(f);
			
		}
	
		rs.close();
		return Fattura;
		
		
	}


//	public void getCarrelloByIDCarrello(String iDCarrello) {
//
//		Statement CarrelloPerIDCarrello = connessione.createStatement();
//		
//		ResultSet rs = CarrelloPerIDCarrello.executeQuery("SELECT * FROM Visualizzaclienti");
//		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
//		
//		while(rs.next()) {
//			
//			Cliente c = new Cliente(rs.getString("cf"));
//			Tessera t = new Tessera (rs.getInt("n_tessera"), c, rs.getInt("punti_frutta"), rs.getInt("punti_verdura"), rs.getInt("punti_confezionati"), rs.getInt("punti_uova"), rs.getInt("punti_latticini"), rs.getInt("punti_farinacei"));
//			Tessera.add(t);
//		}
//		
//		rs.close();
//		return Tessera;
//		
//	}
}