package ImplementazioniDAO;

import java.sql.*;
import java.util.ArrayList;

import DAO.MagazzinoDAO;
import Entità.Confezionato;
import Entità.Farinaceo;
import Entità.Frutta;
import Entità.Latticino;
import Entità.Uova;
import Entità.Verdura;

public class MagazzinoDAOPostgres implements MagazzinoDAO{
	private Connection connessione;
	private PreparedStatement inserisciFruttaPS;
	private PreparedStatement inserisciVerduraPS;
	private PreparedStatement inserisciConfezionatiPS;
	private PreparedStatement inserisciLatticiniPS;
	private PreparedStatement inserisciUovaPS;
	private PreparedStatement inserisciFarinaceiPS;

	public MagazzinoDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		inserisciFruttaPS = connessione.prepareStatement("INSERT INTO frutta VALUES (?,?,?,?,?,DEFAULT,?)");
		inserisciVerduraPS = connessione.prepareStatement("INSERT INTO verdura VALUES (?,?,?,?,DEFAULT,?,?)");
	    inserisciConfezionatiPS = connessione.prepareStatement("INSERT INTO confezionato VALUES (?,?,?,?,?,DEFAULT,?,?,?)");
		inserisciLatticiniPS = connessione.prepareStatement("INSERT INTO latticino VALUES (?,?,?,?,?,DEFAULT,?,?)");
	    inserisciUovaPS = connessione.prepareStatement("INSERT INTO uova VALUES (?,?,?,?,DEFAULT,?,?)");
	    inserisciFarinaceiPS = connessione.prepareStatement("INSERT INTO frutta VALUES (?,?,?,DEFAULT,?,?)");
	}
	
	@Override
	public ArrayList<Frutta> getFrutta() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM frutta");
		ArrayList<Frutta> ProdottiFrutta = new ArrayList<Frutta>();
		while(rs.next()) {
			
			Frutta f = new Frutta(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"));
			f.setData_raccolta(rs.getDate("data_raccolta"));
			f.setLotto_lavorazione(rs.getString("lotto_di_lavorazione"));
			f.setProvenienza(rs.getString("provenienza"));
			ProdottiFrutta.add(f);
		}
		rs.close();
		return ProdottiFrutta;
	}

	@Override
	public ArrayList<Verdura> getVerdura() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM verdura");
		ArrayList<Verdura> ProdottiVerdura = new ArrayList<Verdura>();
		while(rs.next()) {
			Verdura v = new Verdura(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"));
			v.setData_raccolta(rs.getDate("data_raccolta"));
			v.setLotto_lavorazione(rs.getString("lotto_di_lavorazione"));
			v.setProvenienza(rs.getString("provenienza"));
			ProdottiVerdura.add(v);
		}
		rs.close();
		return ProdottiVerdura;
	}

	@Override
	public ArrayList<Latticino> getLatticini() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM latticino");
		ArrayList<Latticino> ProdottiLatticini = new ArrayList<Latticino>();
		while(rs.next()) {
			Latticino l = new Latticino(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"), rs.getDate("data_scadenza"));
			l.setData_mungitura(rs.getDate("data_mungitura"));
			l.setPaese_mungitura(rs.getString("paese_mungitura"));
			l.setPaese_lavorazione(rs.getString("paese_lavorazione"));
			ProdottiLatticini.add(l);
		}
		rs.close();
		return ProdottiLatticini;
	}

	@Override
	public ArrayList<Confezionato> getConfezionati() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM confezionato");
		ArrayList<Confezionato> ProdottiConfezionati = new ArrayList<Confezionato>();
		while(rs.next()) {
			Confezionato c = new Confezionato(rs.getInt("id_prodotto"), rs.getString("nome"),  rs.getFloat("valore_unitario"), rs.getInt("scorte"), rs.getDate("data_scadenza"), rs.getString("marca"), rs.getFloat("peso"));
			c.setLotto_lavorazione(rs.getString("lotto_di_lavorazione"));
			c.setModalità_conservazione(rs.getString("modalità_conservazione"));
			ProdottiConfezionati.add(c);
		}
		rs.close();
		return ProdottiConfezionati;
	}

	@Override
	public ArrayList<Uova> getUova() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM uova");
		ArrayList<Uova> ProdottiUova = new ArrayList<Uova>();
		while(rs.next()) {
			Uova u = new Uova(rs.getInt("id_prodotto"), rs.getFloat("valore_unitario"), rs.getInt("scorte"), rs.getDate("data_scadenza"), rs.getInt("n_perconfezione"));
			u.setLotto_lavorazione(rs.getString("lotto_di_lavorazione"));
			u.setProvenienza(rs.getString("provenienza"));
			ProdottiUova.add(u);
		}
		rs.close();
		return ProdottiUova;
	}

	@Override
	public ArrayList<Farinaceo> getFarinacei() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM farinaceo");
		ArrayList<Farinaceo> ProdottiFarinacei = new ArrayList<Farinaceo>();
		while(rs.next()) {
			Farinaceo f = new Farinaceo(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"), rs.getDate("data_scadenza"));
			f.setLotto_lavorazione(rs.getString("lotto_di_lavorazione"));
			ProdottiFarinacei.add(f);
		}
		rs.close();
		return ProdottiFarinacei;
		
	}
	
	public void inserisciFrutta(String Nome, String Lotto, String Provenienza, String Data, float Peso, float Valore) throws SQLException {
		inserisciFruttaPS.setString(1, Data);
		inserisciFruttaPS.setString(2, Nome);
		inserisciFruttaPS.setString(3, Provenienza);
		inserisciFruttaPS.setString(4, Lotto);
		inserisciFruttaPS.setFloat(5,Peso);
		inserisciFruttaPS.setFloat(6, Valore);
		inserisciFruttaPS.executeUpdate();
		
	}
	
	public void inserisciVerdura(String Nome, String Lotto, String Provenienza, String Data, float Peso, float Valore) throws SQLException {
		inserisciVerduraPS.setString(1, Data);
		inserisciVerduraPS.setString(2, Nome);
		inserisciVerduraPS.setString(3, Provenienza);
		inserisciVerduraPS.setString(4, Lotto);
		inserisciVerduraPS.setFloat(5,Peso);
		inserisciVerduraPS.setFloat(6, Valore);
		inserisciVerduraPS.executeUpdate();
		
	}
	
	public void inserisciFarinacei(String Nome, String Lotto, String Data, float Peso, float Valore) throws SQLException {
		inserisciFarinaceiPS.setString(1, Data);
		inserisciFarinaceiPS.setString(2, Nome);
		inserisciFarinaceiPS.setString(3, Lotto);
		inserisciFarinaceiPS.setFloat(4, Peso);
		inserisciFarinaceiPS.setFloat(5,Valore);
		inserisciFarinaceiPS.executeUpdate();
		
	}
	
	public void inserisciLatticini(String Nome, String PaeseMungitura, String PaeseLavorazione, String DataMungitura, String DataScadenza, float Peso, float Valore) throws SQLException {
		inserisciLatticiniPS.setString(1, DataScadenza);
		inserisciLatticiniPS.setString(2, DataMungitura);
		inserisciLatticiniPS.setString(3, PaeseMungitura);
		inserisciLatticiniPS.setString(4, PaeseLavorazione);
		inserisciLatticiniPS.setString(5, Nome);
		inserisciLatticiniPS.setFloat(6, Peso);
		inserisciLatticiniPS.setFloat(7, Valore);
		inserisciLatticiniPS.executeUpdate();
		
		
	}
	
	public void inserisciConfezionati(String Nome, String Marca, String Lotto, String Conservazione, String DataScadenza, int NConfezioni, float PesoConfezione, float Valore) throws SQLException {
		inserisciLatticiniPS.setString(1, DataScadenza);
		inserisciLatticiniPS.setString(2, Nome);
		inserisciLatticiniPS.setString(3, Lotto);
		inserisciLatticiniPS.setString(4, Marca);
		inserisciLatticiniPS.setString(5, Conservazione);
		inserisciLatticiniPS.setInt(6, NConfezioni);
		inserisciLatticiniPS.setFloat(7, Valore);
		inserisciLatticiniPS.setFloat(8, PesoConfezione);
		inserisciLatticiniPS.executeUpdate();
		
		
	}
	
	public void inserisciUova(String Nome, String Lotto, String Data, String Provenienza, int NConfezioniUova, float Valore, int NPerConfezione) throws SQLException {
		inserisciUovaPS.setString(1, Data);
		inserisciUovaPS.setString(2, Lotto);
		inserisciUovaPS.setInt(3, NPerConfezione);
		inserisciUovaPS.setString(4, Provenienza);
		inserisciUovaPS.setInt(5,NConfezioniUova);
		inserisciUovaPS.setFloat(6, Valore);
		inserisciUovaPS.executeUpdate();
		
	}
	
}
