package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Perifericos;

public class SQLperifericos extends Conexion_SQL {
    
    private static SQLperifericos instance;

    private final String COLUMNAS1[] = {"Periferico", "Serial"};
    private final String COLUMNAS2[] = {"Serial", "Periferico", "PC"};
    private DefaultTableModel MODELO;

    private SQLperifericos() {
    }
    
    //singleton
    public static SQLperifericos getInstance(){
        if (instance == null){
            instance = new SQLperifericos();
        }
        return instance;
    }

    private void seteoTabla(JTable tabla,int columna) {
        
        if(columna == 1){
            MODELO = new Tablas(COLUMNAS1, 0);
        } else {
            MODELO = new Tablas(COLUMNAS2, 0);
        }

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
    public Boolean tablaDetalles(int id, JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT l.desc, p.serial FROM perifericos as p INNER JOIN lista AS l On p.tipo = l.idlista WHERE p.pc = ?";
        try {
            seteoTabla(tabla, 1);
            
            tabla.getTableHeader().setFont(new Font("time new roman", Font.BOLD, 12));

            ps = con.prepareCall(sql);
            ps.setInt(1, id);
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

    public Boolean LlenadoTabla(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id;";
        try {
            seteoTabla(tabla,2);

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

    public Boolean añadir(Perifericos pe) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO perifericos (pc, tipo, serial) VALUES (?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pe.getPc());
            ps.setInt(2, pe.getTipo());
            ps.setString(3, pe.getSerial());
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

    public Boolean reasignar(Perifericos pe, int id) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "update perifericos set pc = ? where id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pe.getPc());
            ps.setInt(2, id);
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
    
     public boolean Eliminar(String serial) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
        String sql = "SELECT id FROM perifericos WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");

                String eliminar = "DELETE FROM perifericos WHERE id = ?";
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


    //validaciones para añadir un registro
    public int validarPeriferico(String serial) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM perifericos WHERE serial = ?";

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

    public int validaRepeticion(int tipo, int pc) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM perifericos WHERE tipo = ? AND pc = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo);
            ps.setInt(2, pc);
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

    public int validaPC(int pc) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM pc WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pc);
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

    public int getId(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM perifericos where serial = ?";

        try {
            ps = con.prepareStatement(sql);
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

    //consultas de la tabla de tipos de perifericos
    public Boolean nuevoLista(String nombre) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO lista (lista.desc) VALUES (?)";

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

    public void cbPerifericos(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT lista.desc FROM lista";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString(1);
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

    public int getIdLista(String perifeico) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT idlista FROM lista WHERE lista.desc = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, perifeico);
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

    public Boolean Buscar(int selector, String buscar, JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = null;
        switch (selector) {
            case 1:// serial del periferico
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where p.serial = ?;";
                break;

            case 2:// tipo de periferico
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where l.desc = ?;";
                break;

            case 3://serial de la pc
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where pc.serial = ?;";
                break;
        }
        try {
            MODELO = new DefaultTableModel(COLUMNAS2, 0);
            tabla.setModel(MODELO);

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
}
