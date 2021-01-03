package DAO;
import java.sql.SQLException;
import java.util.ArrayList;

import Entità.Confezionato;
import Entità.Farinaceo;
import Entità.Frutta;
import Entità.Latticino;
import Entità.Uova;
import Entità.Verdura;


public interface MagazzinoDAO {
	public ArrayList<Frutta> getFrutta() throws SQLException;
	public ArrayList<Verdura> getVerdura() throws SQLException;
	public ArrayList<Latticino> getLatticini() throws SQLException;
	public ArrayList<Confezionato> getConfezionati() throws SQLException;
	public ArrayList<Uova> getUova() throws SQLException;
	public ArrayList<Farinaceo> getFarinacei() throws SQLException;

}

