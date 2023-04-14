package PatikaKlon.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private Connection connection = null;

    public Connection connectionDB(){
        try {
            this.connection = DriverManager.getConnection(Config.DB_Url,Config.DB_Username,Config.DB_password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return this.connection;
    }

    public static Connection getInstance(){
        DBConnector dbConnector = new DBConnector();

        return dbConnector.connectionDB();
    }
}
