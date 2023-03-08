package controlador.consultas;

import controlador.utilidades.Tablas;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;

public class SQLdepartamentos extends Conexion_SQL {

    private final String COLUMNAS[] = {"Departamento", "Jefe", "Contacto"};
    private final String COLUMNAS2[] = {"Marca", "Serial", "Departamento"};
    private DefaultTableModel MODELO;

    //num es para decidir que columnas se va a usar
    private void seteoTabla(JTable tabla, int num) {

        if (num == 1) {
            MODELO = new Tablas(COLUMNAS, 0);
        } else {
            MODELO = new Tablas(COLUMNAS2, 0);
        }

        tabla.setModel(MODELO);
        tabla.getTableHeader().setReorderingAllowed(false);
    }

    //llenado de las tablas
    public Boolean tablaDepas(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT nombre, jefe, contacto FROM departamentos;";
        try {
            seteoTabla(tabla, 1);

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

    public Boolean tablaVinculos(JTable tabla) {
        PreparedStatement ps = null;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select ma.nombre, pc.serial,  dep.nombre from pc_dep as pd inner join pc on pd.pc_id = pc.id inner join departamentos as dep on pd.dep_id = dep.id inner join marca as ma on pc.Marca = ma.id;";
        try {
            seteoTabla(tabla, 2);

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

    //CRUD
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

    public Boolean ModificarDepa(Departamentos depa) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String SQL = "UPDATE departamentos SET nombre = ?, jefe = ?, contacto = ? WHERE id = ?;";

        try {

            ps = con.prepareStatement(SQL);
            ps.setString(1, depa.getNombre());
            ps.setString(2, depa.getJefe());
            ps.setString(3, depa.getContacto());
            ps.setInt(4, depa.getId());
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

    public Boolean AsignarEquipo(int depa, int eq) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO pc_dep (dep_id, pc_id) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depa);
            ps.setInt(2, eq);
            ps.execute();

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

    public Boolean ReasignarEquipo(int depa, int eq) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "UPDATE pc_dep SET dep_id = ? WHERE pc_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depa);
            ps.setInt(2, eq);
            ps.execute();

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

    //Retornan datos
    public Departamentos getDepa(String depa) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select * from departamentos where nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String jefe = rs.getString(3);
                String contacto = rs.getString(4);

                Departamentos datos = new Departamentos(id, nombre, jefe, contacto);
                return datos;
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

    public String getAsig(int idpc) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select dep.nombre from pc_dep as pd inner join departamentos as dep on pd.dep_id = dep.id where pd.pc_id = ?";

        try {
            ps =con.prepareStatement(sql);
            ps.setInt(1, idpc);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String nombre = rs.getString(1);
                
                return nombre;
            }
            return null;

        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;

        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }

    }

    //comprobaciones
    public int validaDepa(int depaid) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM departamentos WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depaid);
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
    
    public int validaDepa(String depa) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT COUNT(id) FROM departamentos WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa);
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

    public int validaAsignacion(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT COUNT(dep_id) FROM pc_dep WHERE pc_id = ?";

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
    }//valida si un pc ya esta asignado

    //llena los combobox
    public void cbDepa(JComboBox cb) {
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
