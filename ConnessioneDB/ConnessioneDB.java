package ConnessioneDB;

import java.sql.*;



public class ConnessioneDB {
	private static ConnessioneDB instance;
    private Connection connection = null;
    private final String USERNAME = "postgres";
    private final String PASSWORD = "arancia123";
    private final String IP = "objectbasi-db.cbwq2rsh90hv.us-east-2.rds.amazonaws.com";
    private final String PORT = "5432";
    private String url = "jdbc:postgresql://"+IP+":"+PORT+"/postgres";

    private ConnessioneDB() throws SQLException {
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnessioneDB getInstance() throws SQLException {
        if (instance == null)
        {
            instance = new ConnessioneDB();
        }
        else
            if (instance.getConnection().isClosed())
            {
                instance = new ConnessioneDB();
            }

        return instance;
    }

}
