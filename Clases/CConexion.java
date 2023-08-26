package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CConexion {

    public static Connection getConnection() {

         String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=yourName;"
                + "user=yourUser;"
                + "password=userPassword;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True;";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException err) {
            System.out.println(err.toString());
            return null;
        }
    }
}
