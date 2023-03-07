package controlador.consultas;

import java.sql.*;

/**
 *
 * @author Carlos Masabet
 */
public class Conexion_SQL {

    private final String USER = "root";
    private final String PASS = "123456";
    private final String BD = "mydb";
    private final String URL = "jdbc:mysql://localhost:3306/" + BD;
    Connection con = null;

    /**
     *
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.URL, this.USER, this.PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
