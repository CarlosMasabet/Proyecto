package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;
import modelo.Equipos;

/**
 *
 * @author Carlos Masabet
 */
public class SQLequipos extends Conexion_SQL {
    
    private static SQLequipos instance;

    private final String COLUMNAS[] = {"Marca", "Modelo", "Serial"};
    private DefaultTableModel MODELO;

    private SQLequipos() {
    }
    
    
    
    //singleton
    public static SQLequipos getInstance(){
        if (instance == null){
            instance = new SQLequipos();
        }
        return instance;
    }

    private void seteoTabla(JTable tabla) {
        MODELO = new Tablas(COLUMNAS, 0);

        tabla.setModel(MODELO);
        tabla.setFocusable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setBackground(Colores.AZUL);
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setFont(new Font("time new roman", Font.BOLD, 18));
        tabla.getTableHeader().setOpaque(false);
        tabla.setSelectionForeground(Color.BLACK);
        tabla.setSelectionBackground(Colores.GRIS_OSCURO);
        tabla.setBackground(Color.WHITE);
        tabla.setRowHeight(20);
    }

    //CRUD
    public Boolean LlenadoTabla(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();//c.usuario ,pc.estado

        String sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id";
        try {
            seteoTabla(tabla);

            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int cant_column = mt.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[cant_column];
                for (int i = 0; i < cant_column; i++) {
                    lista[i] = rs.getObject(i + 1);
                }
                MODELO.addRow(lista);
            }
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public Boolean AñadirEquipos(Equipos eq, String nomModelo) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs;

        String SQL1 = "SELECT id FROM modelo WHERE nombre = ?";
        String SQL2 = "INSERT INTO pc (marca, modelo, serial, estado, usuario) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(SQL1);
            ps.setString(1, nomModelo);
            rs = ps.executeQuery();

            if (rs.next()) {
                eq.setModelo(rs.getInt("id"));

                ps = con.prepareStatement(SQL2);
                ps.setInt(1, eq.getMarca());
                ps.setInt(2, eq.getModelo());
                ps.setString(3, eq.getSerial());
                ps.setString(4, eq.getEstado());
                ps.setString(5, eq.getUs());
                ps.execute();
            }

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean Eliminar(String serial) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
        String sql = "SELECT id FROM pc WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");

                String eliminar = "DELETE FROM pc WHERE id = ?";
                ps = con.prepareStatement(eliminar);
                ps.setInt(1, id);
                ps.execute();
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean Modificar(Equipos eq, String nomModelo, int id) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs;

        String SQL1 = "SELECT id FROM modelo WHERE nombre = ?";
        String SQL2 = "UPDATE pc SET usuario = ?, marca = ?, modelo = ?, serial = ?, estado = ? WHERE id = ?";

        try {
            ps = con.prepareStatement(SQL1);
            ps.setString(1, nomModelo);
            rs = ps.executeQuery();

            if (rs.next()) {
                eq.setModelo(rs.getInt("id"));

                ps = con.prepareStatement(SQL2);
                ps.setString(1, eq.getUs());
                ps.setInt(2, eq.getMarca());
                ps.setInt(3, eq.getModelo());
                ps.setString(4, eq.getSerial());
                ps.setString(5, eq.getEstado());

                ps.setInt(6, id);

                ps.execute();
            }

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    //otras funciones
    public Boolean Buscar(int selector, String buscar, JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = null;
        switch (selector) {

            case 1:// marca
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where ma.Nombre = ?";
                break;

            case 2://serial
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where pc.serial = ?";
                break;

            case 4://estado
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where pc.estado = ?";
                break;

            case 5:
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where mo.nombre = ?";

        }
        try {
            seteoTabla(tabla);

            ps = con.prepareStatement(sql);
            ps.setString(1, buscar);
            rs = ps.executeQuery();

            ResultSetMetaData MD = rs.getMetaData();
            int num_t = MD.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[num_t];
                for (int i = 0; i < num_t; i++) {
                    lista[i] = rs.getObject(i + 1);
                }
                MODELO.addRow(lista);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public Departamentos getdepa(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM pc WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                int idpc = rs.getInt(1);

                String sql2 = "SELECT dep.id, dep.nombre, dep.jefe, dep.contacto FROM pc_dep as d inner join departamentos as dep on d.dep_id = dep.id  where d.pc_id = ?;";

                ps = con.prepareStatement(sql2);
                ps.setInt(1, idpc);
                rs = ps.executeQuery();

                if (rs.next()) {
                    int id = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String jefe = rs.getString(3);
                    String contacto = rs.getString(4);

                    Departamentos depa = new Departamentos(id, nombre, jefe, contacto);
                    return depa;
                }
                return null;
            }

            return null;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public Boolean añadirMarca(String nombre) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO marca (nombre) VALUES (?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public Boolean añadirModelo(String nombre, int marca) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql1 = "INSERT INTO modelo (nombre, marca) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql1);
            ps.setString(1, nombre);
            ps.setInt(2, marca);
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    //comprobaciones 
    public int validaPC(String serial) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM pc WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (Exception e) {
            System.out.println(e);
            return 1;

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public int validaMarca(String serial, String tabla) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM marca WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tabla);
            ps.setString(2, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (Exception e) {
            System.out.println(e);
            return 1;

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    //llenado de desplegables desde un base de datos
    public void cbMarca(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT nombre FROM marca";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString("nombre");
                }

                for (int i = 0; i < num; i++) {
                    cb.addItem(lista[i]);
                }
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void cbModelo(JComboBox cb, int marca) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select mo.nombre from modelo as mo inner join marca as ma on mo.marca = ma.id where ma.id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, marca);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString("nombre");

                }

                for (int i = 0; i < num; i++) {
                    cb.addItem(lista[i]);
                }
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    //retotnan datos
    public Equipos getEquipo(String serial) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT pc.id, pc.usuario, ma.Nombre, mo.Nombre, pc.estado FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id WHERE pc.serial = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String usuario = rs.getString(2);
                String marca = rs.getString(3);
                String modelo = rs.getString(4);
                String estado = rs.getString(5);

                Equipos equipo = new Equipos(id, marca, modelo, serial, estado, usuario);
                return equipo;
            }

            return null;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public int getid(String serial) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM pc WHERE serial = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }

            return 0;

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
