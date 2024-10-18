package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    String URL = "jdbc:mysql://localhost:3306/jeuderole";
    String USER = "root";
    String PASSWORD = "";

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données: " + e.getMessage());
            return null;
        }
    }
}
