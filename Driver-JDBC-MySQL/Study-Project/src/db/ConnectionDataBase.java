package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastros";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conn = null;
    
    public static Connection getConnectionWithDataBase() {
        try {
            if(conn == null) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Data Base Mensage: Conexao concedida!!");
                return conn;
            }
        } catch (SQLException e) {
            System.out.println("Data Base Mensage: Conecxão falhou e esse foi o motivo: ");
            e.printStackTrace();
        }
        return null;
    }

}
