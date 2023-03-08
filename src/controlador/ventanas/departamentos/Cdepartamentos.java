package controlador.ventanas.departamentos;

import controlador.ventanas.login.Clogin;
import controlador.consultas.SQLdepartamentos;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Departamentos;
import proyecto.Proyecto;
import vista.Vdepartamentos;

public class Cdepartamentos implements ActionListener {

    private SQLdepartamentos sql;
    private Vdepartamentos ve;
    private MouseDepa md;

    public Cdepartamentos(SQLdepartamentos sql, Vdepartamentos ve) {
        this.sql = sql;
        this.ve = ve;
        
        md = new MouseDepa(ve, Proyecto.color);
        
        ve.btnAbrirAgregar.addActionListener(this);
        ve.btnAbrirAsignar.addActionListener(this);
        ve.btnAbrirModificar.addActionListener(this);
        ve.btnAbrirSolicitud.addActionListener(this);
        ve.btnagregar.addActionListener(this);

        ve.cbtipobusqueda.addActionListener(this);
        ve.cbbuscar.addActionListener(this);

        Iniciar();
    }

    private void Iniciar() {
        ve.cbbuscar.setVisible(false);
        ve.txtbuscar.setVisible(false);
        ve.Separado.setVisible(false);

        ve.btnAbrirAgregar.setVisible(Clogin.Admin);

        llenadoTabla();

        ve.setSize(new Dimension(627, 520));
        ve.setResizable(false);
        ve.setTitle(Clogin.NomUsuario);
        ve.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.btnAbrirAgregar)) {
            abrirAgregarDepa();
        }
        if (e.getSource().equals(ve.btnAbrirAsignar)) {
            abrirAsignar();
        }
        if (e.getSource().equals(ve.btnAbrirModificar)) {
            abrirModificarDepa();
        }
        if (e.getSource().equals(ve.btnAbrirSolicitud)) {
            abrirSolicitud();
        }
        if (e.getSource().equals(ve.cbtipobusqueda)) {
            tipoBusqueda();
        }
        if (e.getSource().equals(ve.cbbuscar)) {
            buscar();
        }
        if (e.getSource().equals(ve.btnagregar)) {
            agregar();
        }
    }

    private void llenadoTabla() {
        if (sql.LlenadoTabla(ve.jtdepartamentos)) {

        } else {
            JOptionPane.showMessageDialog(ve, "Error al cargar la tabla");
        }
    }

    //abrir ventanas
    private void abrirAgregarDepa() {
        vaciarCampos();

        ve.jfagregar.setSize(new Dimension(360, 290));
        ve.jfagregar.setResizable(false);
        ve.jfagregar.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.jfagregar.setLocationRelativeTo(ve);
        ve.jfagregar.setVisible(true);
    }

    private void abrirAsignar() {
        //lo pueden hacer los admin y los regulares
        if (Clogin.Admin || Clogin.Regular) {

        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    private void abrirModificarDepa() {
        //solo lo puden hace los admin
        if (Clogin.Admin) {

        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    private void abrirSolicitud() {

    }

    //CRUD
    
    private void agregar() {
        String depa = ve.txtnwedepa.getText();
        String jefe = ve.txtnewjefe.getText();
        String contacto = ve.txtnewcontacto.getText();

        if (!depa.equals("") && !jefe.equals("") && !contacto.equals("")) {

            Departamentos nuevo = new Departamentos(sql.getId(depa), depa, jefe, contacto);

            if (sql.validaDepa(nuevo.getId()) == 0) {

                if (sql.nuevoDepa(nuevo)) {
                    vaciarCampos();
                    ve.jfagregar.setVisible(false);
                    llenadoTabla();
                    JOptionPane.showMessageDialog(ve.jfagregar, "Departamento registrado");

                } else {
                    JOptionPane.showMessageDialog(ve.jfagregar, "No se ha podio registrar el departemento");
                }
            } else {
                JOptionPane.showMessageDialog(ve.jfagregar, "Ese departamento ya esta registrado");
            }
        } else {
            JOptionPane.showMessageDialog(ve.jfagregar, "Debe llenar todos los datos");
        }
    }
    
    //otros

    private void tipoBusqueda() {
        int tipo = ve.cbtipobusqueda.getSelectedIndex();

        switch (tipo) {
            case 0:// nada por defecto
                llenadoTabla();
                ve.cbbuscar.setVisible(false);
                ve.txtbuscar.setVisible(false);
                ve.Separado.setVisible(false);

                ve.cbbuscar.removeAllItems();
                ve.txtbuscar.setText("");

                break;

            case 1://busqueda por departamento
                ve.txtbuscar.setVisible(false);
                ve.Separado.setVisible(false);
                ve.txtbuscar.setText("");

                ve.cbbuscar.removeAllItems();
                sql.getdepa(ve.cbbuscar);
                ve.cbbuscar.setVisible(true);
                break;

            case 2://busqueda por el nombre del jefe
                ve.cbbuscar.removeAllItems();
                ve.cbbuscar.setVisible(false);

                ve.txtbuscar.setText("");
                ve.txtbuscar.setVisible(true);
                ve.Separado.setVisible(true);
                break;
        }
    }

    private void buscar() {
    }

    private void vaciarCampos() {
        ve.txtnewcontacto.setText("");
        ve.txtnewjefe.setText("");
        ve.txtnwedepa.setText("");
    }

}
