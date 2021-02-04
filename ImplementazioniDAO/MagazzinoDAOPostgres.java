package ImplementazioniDAO;

import java.sql.*;
import java.util.ArrayList;

import DAO.MagazzinoDAO;
import Entit‡.Confezionato;
import Entit‡.Farinaceo;
import Entit‡.Frutta;
import Entit‡.Latticino;
import Entit‡.Uova;
import Entit‡.Verdura;
import Risorse.MieEccezioni.ProdottoNonTrovatoException;

public class MagazzinoDAOPostgres implements MagazzinoDAO{
	private Connection connessione;
	private PreparedStatement inserisciFruttaPS;
	private PreparedStatement inserisciVerduraPS;
	private PreparedStatement inserisciConfezionatiPS;
	private PreparedStatement inserisciLatticiniPS;
	private PreparedStatement inserisciUovaPS;
	private PreparedStatement inserisciFarinaceiPS;
	private PreparedStatement eliminaFruttaPS;
	private PreparedStatement eliminaLatticiniPS;
	private PreparedStatement eliminaVerduraPS;
	private PreparedStatement eliminaFarinaceiPS;
	private PreparedStatement eliminaUovaPS;
	private PreparedStatement eliminaConfezionatiPS;

	public MagazzinoDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		inserisciFruttaPS = connessione.prepareStatement("INSERT INTO frutta VALUES (?,?,?,?,?,DEFAULT,?)");
		inserisciVerduraPS = connessione.prepareStatement("INSERT INTO verdura VALUES (?,?,?,?,DEFAULT,?,?)");
	    inserisciConfezionatiPS = connessione.prepareStatement("INSERT INTO confezionato VALUES (?,?,?,?,?,DEFAULT,?,?,?)");
		inserisciLatticiniPS = connessione.prepareStatement("INSERT INTO latticino VALUES (?,?,?,?,?,DEFAULT,?,?)");
	    inserisciUovaPS = connessione.prepareStatement("INSERT INTO uova VALUES (?,?,?,?,DEFAULT,?,?)");
	    inserisciFarinaceiPS = connessione.prepareStatement("INSERT INTO farinaceo VALUES (?,?,?,DEFAULT,?,?)");
	    eliminaFruttaPS = connessione.prepareStatement("DELETE FROM frutta WHERE id_prodotto = ? ");
	    eliminaLatticiniPS = connessione.prepareStatement("DELETE FROM latticino WHERE id_prodotto = ? ");
		eliminaVerduraPS = connessione.prepareStatement("DELETE FROM verdura WHERE id_prodotto = ? ");
		eliminaFarinaceiPS = connessione.prepareStatement("DELETE FROM farinaceo WHERE id_prodotto = ? ");
		eliminaUovaPS = connessione.prepareStatement("DELETE FROM uova WHERE id_prodotto = ? ");
		eliminaConfezionatiPS = connessione.prepareStatement("DELETE FROM confezionato WHERE id_prodotto = ? ");
	}
	
	@Override
	public ArrayList<Frutta> getFrutta() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM frutta WHERE esaurito IS NULL");
		ArrayList<Frutta> ProdottiFrutta = new ArrayList<Frutta>();
		while(rs.next()) {
			
			Frutta f = new Frutta(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"));
			f.setDataRaccolta(rs.getDate("data_raccolta"));
			f.setLottoLavorazione(rs.getString("lotto_di_lavorazione"));
			f.setProvenienza(rs.getString("provenienza"));
			ProdottiFrutta.add(f);
		}
		rs.close();
		return ProdottiFrutta;
	}

	@Override
	public ArrayList<Verdura> getVerdura() throws SQLException {
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM verdura WHERE esaurito IS NULL");
		ArrayList<Verdura> ProdottiVerdura = new ArrayList<Verdura>();
		while(rs.next()) {
			Verdura v = new Verdura(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"));
			v.setDataRaccolta(rs.getDate("data_raccolta"));
			v.setLottoLavorazione(rs.getString("lotto_di_lavorazione"));
			v.setProvenienza(rs.getString("provenienza"));
			ProdottiVerdura.add(v);
		}
		rs.close();
		return ProdottiVerdura;
	}

	@Override
	public ArrayList<Latticino> getLatticini() throws SQLException {
		Statement gestisciScadenze = connessione.createStatement();
		gestisciScadenze.execute("SELECT gestisci_scadenze_latticino()");
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM latticino WHERE esaurito IS NULL");
		ArrayList<Latticino> ProdottiLatticini = new ArrayList<Latticino>();
		while(rs.next()) {
			Latticino l = new Latticino(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"), rs.getDate("data_scadenza"));
			l.setDataMungitura(rs.getDate("data_mungitura"));
			l.setPaeseMungitura(rs.getString("paese_mungitura"));
			l.setPaeseLavorazione(rs.getString("paese_lavorazione"));
			ProdottiLatticini.add(l);
		}
		rs.close();
		return ProdottiLatticini;
	}

	@Override
	public ArrayList<Confezionato> getConfezionati() throws SQLException {
		Statement gestisciScadenze = connessione.createStatement();
		gestisciScadenze.execute("SELECT gestisci_scadenze_confezionato()");
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM confezionato WHERE esaurito IS NULL");
		ArrayList<Confezionato> ProdottiConfezionati = new ArrayList<Confezionato>();
		while(rs.next()) {
			Confezionato c = new Confezionato(rs.getInt("id_prodotto"), rs.getString("nome"),  rs.getFloat("valore_unitario"), rs.getInt("scorte"), rs.getDate("data_scadenza"), rs.getString("marca"), rs.getFloat("peso"));
			c.setLottoLavorazione(rs.getString("lotto_di_lavorazione"));
			c.setModalit‡Conservazione(rs.getString("modalit‡_conservazione"));
			ProdottiConfezionati.add(c);
		}
		rs.close();
		return ProdottiConfezionati;
	}

	@Override
	public ArrayList<Uova> getUova() throws SQLException {
		Statement gestisciScadenze = connessione.createStatement();
		gestisciScadenze.execute("SELECT gestisci_scadenze_uova()");
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM uova WHERE esaurito IS NULL");
		ArrayList<Uova> ProdottiUova = new ArrayList<Uova>();
		while(rs.next()) {
			Uova u = new Uova(rs.getInt("id_prodotto"), rs.getFloat("valore_unitario"), rs.getInt("scorte"), rs.getDate("data_scadenza"), rs.getInt("n_perconfezione"));
			u.setLottoLavorazione(rs.getString("lotto_di_lavorazione"));
			u.setProvenienza(rs.getString("provenienza"));
			ProdottiUova.add(u);
		}
		rs.close();
		return ProdottiUova;
	}

	@Override
	public ArrayList<Farinaceo> getFarinacei() throws SQLException {
		Statement gestisciScadenze = connessione.createStatement();
		gestisciScadenze.execute("SELECT gestisci_scadenze_farinaceo()");
		Statement getProd = connessione.createStatement();
		ResultSet rs = getProd.executeQuery("SELECT * FROM farinaceo WHERE esaurito IS NULL");
		ArrayList<Farinaceo> ProdottiFarinacei = new ArrayList<Farinaceo>();
		while(rs.next()) {
			Farinaceo f = new Farinaceo(rs.getInt("id_prodotto"), rs.getString("nome"), rs.getFloat("valore_kg"), rs.getFloat("scorte_kg"), rs.getDate("data_scadenza"));
			f.setLottoLavorazione(rs.getString("lotto_di_lavorazione"));
			ProdottiFarinacei.add(f);
		}
		rs.close();
		return ProdottiFarinacei;
		
	}
	
	public void inserisciFrutta(String Nome, String Lotto, String Provenienza, Date Data, float Peso, float Valore) throws SQLException {
		inserisciFruttaPS.setDate(1, Data);
		inserisciFruttaPS.setString(2, Nome.toUpperCase());
		inserisciFruttaPS.setString(3, Provenienza.toUpperCase());
		inserisciFruttaPS.setString(4, Lotto.toUpperCase());
		inserisciFruttaPS.setFloat(5,Peso);
		inserisciFruttaPS.setFloat(6, Valore);
		inserisciFruttaPS.executeUpdate();
		
	}
	
	public void inserisciVerdura(String Nome, String Lotto, String Provenienza, Date Data, float Peso, float Valore) throws SQLException {
		inserisciVerduraPS.setDate(1, Data);
		inserisciVerduraPS.setString(2, Nome.toUpperCase());
		inserisciVerduraPS.setString(3, Provenienza.toUpperCase());
		inserisciVerduraPS.setString(4, Lotto.toUpperCase());
		inserisciVerduraPS.setFloat(5,Peso);
		inserisciVerduraPS.setFloat(6, Valore);
		inserisciVerduraPS.executeUpdate();
		
	}
	
	public void inserisciFarinacei(String Nome, String Lotto, Date Data, float Peso, float Valore) throws SQLException {
		inserisciFarinaceiPS.setDate(1, Data);
		inserisciFarinaceiPS.setString(2, Nome.toUpperCase());
		inserisciFarinaceiPS.setString(3, Lotto.toUpperCase());
		inserisciFarinaceiPS.setFloat(4, Peso);
		inserisciFarinaceiPS.setFloat(5,Valore);
		inserisciFarinaceiPS.executeUpdate();
		
	}
	
	public void inserisciLatticini(String Nome, String PaeseMungitura, String PaeseLavorazione, Date DataMungitura, Date DataScadenza, float Peso, float Valore) throws SQLException {
		inserisciLatticiniPS.setDate(1, DataScadenza);
		inserisciLatticiniPS.setDate(2, DataMungitura);
		inserisciLatticiniPS.setString(3, PaeseMungitura.toUpperCase());
		inserisciLatticiniPS.setString(4, PaeseLavorazione.toUpperCase());
		inserisciLatticiniPS.setString(5, Nome.toUpperCase());
		inserisciLatticiniPS.setFloat(6, Peso);
		inserisciLatticiniPS.setFloat(7, Valore);
		inserisciLatticiniPS.executeUpdate();
		
		
	}
	
	public void inserisciConfezionati(String Nome, String Marca, String Lotto, String Conservazione, Date DataScadenza, int NConfezioni, float PesoConfezione, float Valore) throws SQLException {
		inserisciConfezionatiPS.setDate(1, DataScadenza);
		inserisciConfezionatiPS.setString(2, Nome.toUpperCase());
		inserisciConfezionatiPS.setString(3, Lotto.toUpperCase());
		inserisciConfezionatiPS.setString(4, Marca.toUpperCase());
		inserisciConfezionatiPS.setString(5, Conservazione.toUpperCase());
		inserisciConfezionatiPS.setInt(6, NConfezioni);
		inserisciConfezionatiPS.setFloat(7, PesoConfezione);
		inserisciConfezionatiPS.setFloat(8, Valore);
		inserisciConfezionatiPS.executeUpdate();
		
		
	}
	
	public void inserisciUova(String Lotto, Date Data, String Provenienza, int NConfezioniUova, float Valore, int NPerConfezione) throws SQLException {
		inserisciUovaPS.setDate(1, Data);
		inserisciUovaPS.setString(2, Lotto.toUpperCase());
		inserisciUovaPS.setInt(3, NPerConfezione);
		inserisciUovaPS.setString(4, Provenienza.toUpperCase());
		inserisciUovaPS.setInt(5,NConfezioniUova);
		inserisciUovaPS.setFloat(6, Valore);
		inserisciUovaPS.executeUpdate();
		
	}
	
	public void eliminaFruttaConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaFruttaPS.setInt(1, IDProdotto);
		int row = eliminaFruttaPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}
	
	public void eliminaVerduraConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaVerduraPS.setInt(1, IDProdotto);
		int row = eliminaVerduraPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}
	
	public void eliminaFarinaceiConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaFarinaceiPS.setInt(1, IDProdotto);
		int row = eliminaFarinaceiPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}
	
	public void eliminaLatticiniConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaLatticiniPS.setInt(1, IDProdotto);
		int row = eliminaLatticiniPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}public void eliminaUovaConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaUovaPS.setInt(1, IDProdotto);
		int row = eliminaUovaPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}
	
	public void eliminaConfezionatiConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException {

		eliminaConfezionatiPS.setInt(1, IDProdotto);
		int row = eliminaConfezionatiPS.executeUpdate();
		if (row == 0) {
			throw new ProdottoNonTrovatoException();
		}

	}
	
	
}
