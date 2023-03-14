package controlador.consultas;

import java.sql.*;

/**
 *
 * @author Carlos Masabet
 */
public class Conexion_SQL {

    private static final String USER = "root";
    private static final String PASS = "123456";
    private static final String BD = "mydb";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;
    private static Connection con = null;


    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
