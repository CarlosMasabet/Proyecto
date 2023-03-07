package controlador.consultas;

import controlador.utilidades.Tablas;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;

public class SQLdepartamentos extends Conexion_SQL {

    private final String COLUMNAS[] = {"Departamento", "Jefe", "Contacto"};
    private DefaultTableModel MODELO;
    
    private void seteoTabla(JTable tabla) {
        MODELO = new Tablas(COLUMNAS, 0);

        tabla.setModel(MODELO);
        tabla.getTableHeader().setReorderingAllowed(false);
    }

    public Boolean LlenadoTabla(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT nombre, jefe, contacto FROM departamentos;";
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

    public Boolean nuevoDepa(Departamentos depa) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO departamentos (nombre , jefe, contacto) VALUES (?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa.getNombre());
            ps.setString(2, depa.getJefe());
            ps.setString(3, depa.getContacto());
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

    public boolean Modificar(Departamentos depa) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String SQL = "UPDATE departamentos SET jefe = ? AND contacto = ? WHERE id = ?";

        try {

            ps = con.prepareStatement(SQL);
            ps.setString(1, depa.getJefe());
            ps.setString(2, depa.getContacto());
            ps.setInt(3, depa.getId());
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
    
    public int getId(String depa) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM departamentos WHERE nombre = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, depa);
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
    
    public int validaDepa(int depa) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM departamentos WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depa);
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
    
    public void getdepa(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT nombre FROM departamentos;";

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

}
