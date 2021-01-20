package DAO;

import java.sql.SQLException;

import Entità.Comune;

public interface ComuniDAO {
	public void insertComuni(Comune c) throws SQLException;
	public String getCodiceComuneByNome(String Nome) throws SQLException;

}
