package DAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Confezionato;
import Entità.Farinaceo;
import Entità.Frutta;
import Entità.Latticino;
import Entità.Uova;
import Entità.Verdura;
import Risorse.MieEccezioni.ProdottoNonTrovatoException;


public interface MagazzinoDAO {
	public ArrayList<Frutta> getFrutta() throws SQLException;
	public ArrayList<Verdura> getVerdura() throws SQLException;
	public ArrayList<Latticino> getLatticini() throws SQLException;
	public ArrayList<Confezionato> getConfezionati() throws SQLException;
	public ArrayList<Uova> getUova() throws SQLException;
	public ArrayList<Farinaceo> getFarinacei() throws SQLException;
	public void inserisciFrutta(String Nome, String Lotto, String Provenienza, Date Data, float Peso, float Valore) throws SQLException;
	public void inserisciVerdura(String Nome, String Lotto, String Provenienza, Date Data, float Peso, float Valore) throws SQLException;
	public void inserisciFarinacei(String Nome, String Lotto, Date Data, float Peso, float Valore) throws SQLException;
	public void inserisciLatticini(String Nome, String PaeseMungitura, String PaeseLavorazione, Date DataMungitura, Date DataScadenza, float Peso, float Valore) throws SQLException;
	public void inserisciConfezionati(String Nome, String Marca, String Lotto, String Conservazione, Date DataScadenza, int NConfezioni, float PesoConfezione, float Valore) throws SQLException;
	public void inserisciUova(String Lotto, Date Data, String Provenienza, int NConfezioniUova, float Valore, int NPerConfezione) throws SQLException;
	public void eliminaFruttaConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
	public void eliminaVerduraConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
	public void eliminaFarinaceiConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
	public void eliminaUovaConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
	public void eliminaConfezionatiConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
	public void eliminaLatticiniConID(int IDProdotto) throws ProdottoNonTrovatoException, SQLException;
}

