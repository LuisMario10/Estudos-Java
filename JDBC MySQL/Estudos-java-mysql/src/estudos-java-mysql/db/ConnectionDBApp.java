package src.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDBApp {
    public final String USER = "root";
    public final String URL = "jdbc:msql://mysql//localhost:3306/Projetos";
    public final String PASSWORD = "";
    Connection conn = null;
    public Connection getConnectionWithDB() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(USER, URL, PASSWORD);
            System.out.println("Mensage: Conecxao Realizada!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}