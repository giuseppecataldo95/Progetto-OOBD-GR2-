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

	public MagazzinoDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
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
}
