package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.VenditeDAO;
import Entità.Carrello;
import Entità.Fattura;
import Entità.Prodotto_kg;
import Entità.ProdottoUnitario;
import Risorse.MieEccezioni.CarrelloNonTrovatoException;
import Risorse.MieEccezioni.CarrelloVuotoException;
import Risorse.MieEccezioni.TesseraNonTrovataException;

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

			Fattura f = new Fattura(rs.getInt("n_tessera"), rs.getFloat("punti_acquisto"), rs.getFloat("prezzo_totale"), rs.getInt("id_fattura"), rs.getDate("data_emissione"), rs.getInt("id_carrello"));
			Fattura.add(f);

		}

		rs.close();
		return Fattura;


	}

	public void inserisciCarrello() throws SQLException {
		Statement creaCarrello = connessione.createStatement();
		creaCarrello.executeUpdate("INSERT INTO Carrello VALUES (DEFAULT,0,0,0,0,0,0,0)");
	}

	public int getUltimoIDCarrello() throws SQLException {
		Carrello c = null;
		Statement getCarrello = connessione.createStatement();
		ResultSet rs = getCarrello.executeQuery("SELECT * FROM carrello ORDER BY id_carrello DESC LIMIT 1");
		while(rs.next()) {
			 c = new Carrello(rs.getInt("id_carrello"));
		}
		rs.close();
		return c.getIDCarrello();
	}

	public void inserisciCompCarelloKG(int IDCarrello, int IDProdotto, float quantità) throws SQLException {
		Statement inserisci = connessione.createStatement();
		inserisci.executeUpdate("INSERT INTO comp_carrello_kg VALUES ("+IDCarrello+","+IDProdotto+","+quantità+")");
	}

	public void inserisciCompCarelloN(int IDCarrello, int IDProdotto, int quantità) throws SQLException {
		Statement inserisci = connessione.createStatement();
		inserisci.executeUpdate("INSERT INTO comp_carrello_n VALUES ("+IDCarrello+","+IDProdotto+","+quantità+")");
	}

	public ArrayList<Prodotto_kg> getCarrelloKGByID(int IDCarrello) throws SQLException {
		Statement getCarrello = connessione.createStatement();
		ResultSet rs = getCarrello.executeQuery("SELECT * FROM comp_carrello_kg WHERE id_carrello="+IDCarrello);
		ArrayList<Prodotto_kg> Prodotti = new ArrayList<Prodotto_kg>();
		while(rs.next()) {
			Prodotto_kg pr = new Prodotto_kg(rs.getInt("id_prodotto"),rs.getFloat("quantità_kg"));
			Prodotti.add(pr);
		}
		rs.close();
		return Prodotti;
	}

	public ArrayList<ProdottoUnitario> getCarrelloNByID(int IDCarrello) throws SQLException {
		Statement getCarrello = connessione.createStatement();
		ResultSet rs = getCarrello.executeQuery("SELECT * FROM comp_carrello_n WHERE id_carrello="+IDCarrello);
		ArrayList<ProdottoUnitario> Prodotti = new ArrayList<ProdottoUnitario>();
		while(rs.next()) {
			ProdottoUnitario pr = new ProdottoUnitario(rs.getInt("id_prodotto"),rs.getInt("n_articoli"));
			Prodotti.add(pr);
		}
		rs.close();
		return Prodotti;
	}

	public Carrello getPrezzoEPuntiByID(int IDCarrello) throws SQLException {
		Carrello CarrelloCorrente = null;
		Statement getCarrello = connessione.createStatement();
		ResultSet rs = getCarrello.executeQuery("SELECT * FROM carrello WHERE id_carrello="+IDCarrello);
		while(rs.next()) {
			CarrelloCorrente = new Carrello(rs.getInt("id_carrello"));
			CarrelloCorrente.setPrezzoParziale(rs.getFloat("prezzo_parziale"));
			CarrelloCorrente.setPuntiConfezionati(rs.getFloat("punti_confezionati"));
			CarrelloCorrente.setPuntiFarinacei(rs.getFloat("punti_farinacei"));
			CarrelloCorrente.setPuntiFrutta(rs.getFloat("punti_frutta"));
			CarrelloCorrente.setPuntiLatticini(rs.getFloat("punti_latticini"));
			CarrelloCorrente.setPuntiUova(rs.getFloat("punti_uova"));
			CarrelloCorrente.setPuntiVerdura(rs.getFloat("punti_verdura"));
		}
		rs.close();
		return CarrelloCorrente;

	}
	
	public void getTesserabyNTessera(int NTessera) throws TesseraNonTrovataException,SQLException {
		Statement getTessera = connessione.createStatement();
		ResultSet rs = getTessera.executeQuery("SELECT * FROM tessera WHERE n_tessera="+NTessera);
		while(rs.next()) {
			if(rs.getRow()==0) {
				throw new TesseraNonTrovataException();
			}
		}
	}
	
	public void inserisciFattura(Fattura FatturaDaGenerare) throws SQLException, CarrelloVuotoException {
		
		if(FatturaDaGenerare.getPrezzoTotale() == 0.0) {
		
			throw new CarrelloVuotoException();
			
		}
		
		else {
			
		
		Statement InserisciFattura = connessione.createStatement();
		InserisciFattura.executeUpdate("INSERT INTO fattura VALUES ("+FatturaDaGenerare.getNTessera()+","+FatturaDaGenerare.getPuntiTotali()+",DEFAULT,CURRENT_DATE,"+FatturaDaGenerare.getIDCarrello()+","+FatturaDaGenerare.getPrezzoTotale()+")");
		
		}
	}

	public Carrello getCarrello(int IDCarrello) throws SQLException {
		
		Carrello CarrelloCorrente = null;
		Statement getCarrello = connessione.createStatement();
		ResultSet rs = getCarrello.executeQuery("SELECT punti_frutta, punti_verdura, punti_confezionati, punti_uova, punti_farinacei, punti_latticini, id_fattura FROM fattura JOIN carrello on fattura.ID_Carrello = carrello.ID_Carrello WHERE fattura.id_carrello ="+IDCarrello);
		while(rs.next()) {
		CarrelloCorrente = new Carrello(rs.getFloat("punti_frutta"), rs.getFloat("punti_verdura"), rs.getFloat("punti_confezionati"), rs.getFloat("punti_uova"), rs.getFloat("punti_farinacei"), rs.getFloat("punti_latticini"));
		}
		
		return CarrelloCorrente;
	}

	public Carrello getIDCarrelloByIDFattura(String idFatturaTB)throws SQLException, CarrelloNonTrovatoException {
		
			
			Carrello c = null;
			Statement getIDCarrello = connessione.createStatement();
			ResultSet rs = getIDCarrello.executeQuery("SELECT fattura.id_carrello FROM fattura WHERE id_fattura = "+idFatturaTB);
			while(rs.next()) {
				
				c = new Carrello(rs.getInt("id_carrello"));
				
			}
			
			if(c == null)
			{
				
				throw new CarrelloNonTrovatoException();
				
			}
			return c;	
		
	}
	
	public void eliminaCarrello(int IDCarrello) throws SQLException {
		Statement elimina = connessione.createStatement();
		elimina.executeUpdate("DELETE FROM Carrello WHERE id_carrello="+IDCarrello);
	}
	
}
