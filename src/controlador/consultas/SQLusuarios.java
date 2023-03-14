package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import modelo.Usuarios;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQLusuarios extends Conexion_SQL {
    
    private static SQLusuarios instance;
    public String error;
    
    private final String COLUMNAS[] = {"Codigo", "Nombre", "Ultima sesión", "Tipo de usuario"};
    private DefaultTableModel MODELO;

    private SQLusuarios() {
    }      
    
    //singleton
    public static SQLusuarios getInstance(){
        if (instance == null){
            instance = new SQLusuarios();
        }
        return instance;
    }
    
    private void seteoTabla(JTable tabla) {
        MODELO = new Tablas(COLUMNAS, 0);

        tabla.setModel(MODELO);
        
        tabla.setFocusable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setBackground(Color.black);
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setFont(new Font("time new roman", Font.BOLD, 12));
        tabla.getTableHeader().setOpaque(false);
        tabla.setSelectionForeground(Color.WHITE);
        tabla.setSelectionBackground(Colores.BONTON_CLARO);
        tabla.setBackground(Color.WHITE);
        tabla.setRowHeight(20);
    }
    
    

    public int InicioSesion(Usuarios us) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT id, nombre, contraseña, tipo_us FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (us.getContraseña().equals(rs.getString(3))) {

                    us.setId(rs.getInt("id"));
                    us.setTipo_us(rs.getInt("tipo_us"));
                    us.setNombre(rs.getString("nombre"));

                    String update = "UPDATE usuarios SET ult_sesion = ? WHERE id = ?";
                    ps = con.prepareCall(update);
                    ps.setString(1, us.getUlima_secion());
                    ps.setInt(2, us.getId());

                    ps.execute();
                    return 0;// 0 = entrar

                } else {
                    return 1;// 1 = error de contraseña
                }
            } else {
                return 2;// 2 = error de usuario
            }
            
        } catch (Exception e) {
            System.out.println("error: " + e);
            error = e.toString();
            return 3;// 3 = probelmas de connecion
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }

    }

    public boolean Reguistrar(Usuarios us) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO usuarios (codigo, nombre, contraseña, tipo_us) VALUES(?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getCodigo());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getContraseña());
            ps.setInt(4, us.getTipo_us());
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

    public int ValidarUsusario(String us) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us);
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

    public boolean TablaUsuarios(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = " SELECT us.codigo, us.nombre, us.ult_sesion, ti.desc FROM usuarios as us INNER JOIN tipo_us as ti ON us.tipo_us = ti.tipo";

        try {
            seteoTabla(tabla);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();

            int numCloumn = md.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[numCloumn];
                for (int i = 0; i < numCloumn; i++) {
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

    public boolean Eliminar(String us) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "DELETE FROM usuarios WHERE codigo = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, us);
            System.out.println(us);
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

    public boolean ModificarClave(Usuarios us) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "UPDATE usuarios SET contraseña = ? WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getContraseña());
            ps.setInt(2, us.getId());
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

    public boolean ModificarDatos(Usuarios us, String codigo) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs;
        String sql = "SELECT id FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {
                us.setId(rs.getInt(1));

                String update = "UPDATE usuarios SET codigo = ?, nombre = ?, tipo_us = ? WHERE id = ?";
                
                ps = con.prepareStatement(update);
                ps.setString(1, us.getCodigo());
                ps.setString(2, us.getNombre());
                ps.setInt(3, us.getTipo_us());
                ps.setInt(4, us.getId());
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
    
    
    public Usuarios getUs(String codigo){
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT us.id, us.codigo, us.nombre, ti.desc FROM usuarios AS us INNER JOIN tipo_us AS ti ON us.tipo_us = ti.tipo where codigo = ?;";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String cod = rs.getString(2);
                String nombre = rs.getString(3);
                String tipo = rs.getString(4);
                
                Usuarios us = new Usuarios(id, codigo, nombre, tipo);
                
                return us;
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
    
    public int getId(String codigo){
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select id from usuarios where codigo = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, codigo);
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
    
     public int getIdNom(String nombre){
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select id from usuarios where nombre = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, nombre);
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
