package controlador.ventanas.equipo;

import controlador.consultas.SQLequipos;
import controlador.ventanas.login.Clogin;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;
import modelo.Equipos;
import vista.Vequipos;
import controlador.consultas.SQLperifericos;
import modelo.Perifericos;

public class Cequipos implements ActionListener {

    private SQLequipos sql;
    private Vequipos ve;
    private MouseEquipos me;

    private String MARCA, MODELO, SERIAL, ESTADO, USUARIO;
    Boolean selecionado = false;

    private static TecladoEquipos teclado;

    public Cequipos(SQLequipos sql, Vequipos ve) {
        this.sql = sql;
        this.ve = ve;

        me = new MouseEquipos(ve);
        teclado = new TecladoEquipos(this);
        ve.setIconImage(proyecto.Proyecto.icono.getImage());

        ve.txtbusqueda.addKeyListener(teclado);

        ve.btnañadir.addActionListener(this);
        ve.btnañadir2.addActionListener(this);
        ve.btneliminar.addActionListener(this);
        ve.btndetalles.addActionListener(this);
        ve.btnmodificar.addActionListener(this);
        ve.btnguardar.addActionListener(this);
        ve.btnmarca.addActionListener(this);
        ve.btnmodelo.addActionListener(this);
        ve.btnperiferico.addActionListener(this);
        ve.btnnewperi.addActionListener(this);

        ve.btnmarca.addActionListener(this);
        ve.btnnewMarca.addActionListener(this);
        ve.btnmodelo.addActionListener(this);
        ve.btnnewModelo.addActionListener(this);

        ve.cbmarca.addActionListener(this);

        ve.cbtipobusqueda.addActionListener(this);
        ve.cbbusqueda.addActionListener(this);
        ve.cbbusModelos.addActionListener(this);

        ve.jtequipos.addMouseListener(new MouseAdapter() {
            DefaultTableModel modelo = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = ve.jtequipos.getSelectedRow();

                //USUARIO = ve.jtequipos.getValueAt(i, 0).toString();
                MARCA = ve.jtequipos.getValueAt(i, 0).toString();
                MODELO = (ve.jtequipos.getValueAt(i, 1).toString());
                SERIAL = (ve.jtequipos.getValueAt(i, 2).toString());
                //ESTADO = ve.jtequipos.getValueAt(i, 4).toString();

                selecionado = true;
            }
        });
        //faltan botones

        iniciar();
    }

    protected void iniciar() {
        ve.setTitle(Clogin.NomUsuario);
        ve.setFocusable(true);
        ve.setPreferredSize(new Dimension(800, 500));
        ve.setLocationRelativeTo(null);
        ve.setResizable(false);
        ve.setVisible(true);

        //seteo de botones
        if (!Clogin.Admin) {
            ve.btnmarca.setVisible(false);
            ve.btnmodelo.setVisible(false);
        }
        ve.lineaBuscar.setVisible(false);
        ve.txtbusqueda.setVisible(false);
        ve.cbbusqueda.setVisible(false);
        ve.cbbusModelos.setVisible(false);
        ve.cbbusqueda.removeAllItems();

        llenadoTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(ve.btnañadir)) {
            AbrirAñadir();
        }

        if (e.getSource().equals(ve.btnañadir2)) {
            Añadir();
        }

        if (e.getSource().equals(ve.btneliminar)) {
            Eliminar();
        }

        if (e.getSource().equals(ve.btndetalles)) {
            AbrirDetalles();
        }

        if (e.getSource().equals(ve.btnmodificar)) {
            AbrirModificar();
        }

        if (e.getSource().equals(ve.btnguardar)) {
            Guardarcambios();
        }

        if (e.getSource().equals(ve.cbtipobusqueda)) {
            tipoBusuqeda();
        }

        if (e.getSource().equals(ve.cbbusqueda)) {
            Buscar();
        }

        if (e.getSource().equals(ve.cbmarca)) {
            //llena la segunda barra desplegable con los modelos en la parte de añadir
            int mar = ve.cbmarca.getSelectedIndex();

            if (mar != 0) {
                ve.cbmodelo.removeAllItems();
                sql.getModelo(ve.cbmodelo, mar + 1);

            }
        }

        if (e.getSource().equals(ve.cbbusModelos)) {
            //busca por modelos
            int mod = ve.cbbusModelos.getSelectedIndex();
            String modelo = ve.cbbusModelos.getItemAt(mod);

            if (mod != 0) {
                sql.Buscar(5, modelo, ve.jtequipos);
            }
        }

        //funciones de para agregar marcas y modelos
        if (e.getSource().equals(ve.btnmarca)) {
            AbrirMarca();
        }
        if (e.getSource().equals(ve.btnnewMarca)) {
            newMarca();
        }

        if (e.getSource().equals(ve.btnmodelo)) {
            AbrirModelo();
        }
        if (e.getSource().equals(ve.btnnewModelo)) {
            newModelo();
        }
        if (e.getSource().equals(ve.btnperiferico)) {
            AbrirPerifericos();
        }
        if (e.getSource().equals(ve.btnnewperi)) {
            nuevoPeriferico();
        }
    }

    protected void llenadoTabla() {

        if (sql.LlenadoTabla(ve.jtequipos)) {

        } else {
            JOptionPane.showMessageDialog(ve, "Error al cargar la tabla");
        }
    }

    //funciones que abren las ventanas
    protected void AbrirAñadir() {
        if (Clogin.Regular || Clogin.Admin) {
            ve.cbmarca.removeAllItems();
            sql.getMarca(ve.cbmarca);
            ve.cbmarca.setSelectedIndex(0);

            //setero de la venta
            ve.jfañadir.setMinimumSize(new Dimension(400, 160));
            ve.jfañadir.setIconImage(proyecto.Proyecto.icono.getImage());
            ve.jfañadir.setResizable(false);
            ve.jfañadir.setLocationRelativeTo(ve);
            ve.jfañadir.setTitle("Añadir");
            ve.btnañadir2.setVisible(true);
            ve.btnguardar.setVisible(false);
            ve.jfañadir.setVisible(true);

            VaciarCampos();
        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    protected void AbrirDetalles() {
        if (selecionado) {
            Equipos det = sql.getEquipo(SERIAL);

            ve.txtdetmarca.setText("Marca: " + det.getMarcaP());
            ve.txtdetmodelo.setText("Modelo: " + det.getModeloP());
            ve.txtdetserial.setText("Serial: " + det.getSerial());
            ve.txtdetestado.setText("Estado: " + det.getEstado());
            ve.txtdetususario.setText("Usuario: " + det.getUs());

            Departamentos depa = sql.getdepa(SERIAL);

            if (depa != null) {
                ve.txtdetdepar.setText("Ubicación: " + depa.getNombre());
            } else {
                ve.txtdetdepar.setText("Ubicación: Sin asignar");
            }
            SQLperifericos peri = new SQLperifericos();
            peri.tablaDetalles(det.getId(), ve.jtperifericos);

            ve.jfdetalles.setMinimumSize(new Dimension(350, 390));
            ve.jfdetalles.setIconImage(proyecto.Proyecto.icono.getImage());
            ve.jfdetalles.setResizable(false);
            ve.jfdetalles.setLocationRelativeTo(ve);
            ve.jfdetalles.setTitle("Detalles");
            ve.jfdetalles.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(ve, "Debe selecionar un reguistro primero");
        }

    }

    protected void AbrirModificar() {

        if (Clogin.Regular || Clogin.Admin) {
            ve.cbmarca.removeAllItems();
            sql.getMarca(ve.cbmarca);

            ve.cbmarca.setSelectedItem(MARCA);
            ve.cbmodelo.setSelectedItem(MODELO);
            ve.txtserial.setText(SERIAL);
            ve.cbestado.setSelectedItem(ESTADO);
            ve.txtusuario.setText(USUARIO);

            //seteo de la ventana
            ve.jfañadir.setMinimumSize(new Dimension(400, 350));
            ve.jfañadir.setIconImage(proyecto.Proyecto.icono.getImage());
            ve.jfañadir.setResizable(false);
            ve.jfañadir.setLocationRelativeTo(ve.jfdetalles);
            ve.jfañadir.setTitle("Modificar");
            ve.btnañadir2.setVisible(false);
            ve.btnguardar.setVisible(true);
            ve.jfdetalles.setVisible(false);
            ve.jfañadir.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    private void AbrirPerifericos() {
        
        if (Clogin.Regular || Clogin.Admin) {
            
            ve.cbtipoperi.removeAllItems();
            ve.txtserialperi.setText("");

            Equipos pe = sql.getEquipo(SERIAL);

            SQLperifericos peri = new SQLperifericos();
            peri.getLista(ve.cbtipoperi);
            ve.txtserialpc.setText(pe.getSerial());

            ve.jfperiferico.setResizable(false);
            ve.jfperiferico.setIconImage(proyecto.Proyecto.icono.getImage());
            ve.jfperiferico.setSize(355, 300);
            ve.jfperiferico.setLocationRelativeTo(ve);
            ve.jfperiferico.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    protected void AbrirMarca() {
        ve.jfmarca.setMinimumSize(new Dimension(200, 220));
        ve.jfmarca.setIconImage(proyecto.Proyecto.icono.getImage());
        ve.jfmarca.setResizable(false);
        ve.jfmarca.setLocationRelativeTo(ve);
        ve.jfmarca.setVisible(true);
    }

    protected void AbrirModelo() {
        ve.jfmodelo.setMinimumSize(new Dimension(200, 300));
        ve.jfmodelo.setResizable(false);
        ve.jfmodelo.setLocationRelativeTo(ve);
        ve.cbnewModelo.removeAllItems();
        sql.getMarca(ve.cbnewModelo);
        ve.jfmodelo.setVisible(true);
    }

    //funciones del CRUD
    protected void Añadir() {

        String txtSerial = ve.txtserial.getText();
        String txtUsuario = ve.txtusuario.getText();

        int cbEstado = ve.cbestado.getSelectedIndex();
        int cbMarca = ve.cbmarca.getSelectedIndex();
        int cbModelo = ve.cbmodelo.getSelectedIndex();

        //confirma que se ingresen los datos
        if (cbEstado != 0 && cbMarca != 0 && !txtSerial.equals("") && !txtUsuario.equals("")) {

            if (sql.validaPC(txtSerial) == 0) {//valida que no exista otro pc con el mismo serial

                String estado1 = ve.cbestado.getItemAt(cbEstado);

                Equipos nuevo = new Equipos(cbMarca + 1, cbModelo, txtSerial, estado1, txtUsuario);

                String numModelo = ve.cbmodelo.getItemAt(cbModelo);

                if (sql.AñadirEquipos(nuevo, numModelo)) {
                    JOptionPane.showMessageDialog(ve.jfañadir, "Registro Guardado");
                    llenadoTabla();

                    ve.cbtipobusqueda.setSelectedIndex(0);

                    VaciarCampos();
                } else {
                    JOptionPane.showMessageDialog(ve, "Error al reguistrar");
                }

            } else {
                JOptionPane.showMessageDialog(ve.jfañadir, "Ya existe un registro con ese serial");
            }

        } else {
            JOptionPane.showMessageDialog(ve.jfañadir, "Debe espesificar todos los datos solicitados");
        }

    }

    protected void Eliminar() {

        if (Clogin.Admin) {

            if (selecionado) {//selecion

                int confrimacion = JOptionPane.showConfirmDialog(ve, "¿Esta seguro de querer eliminar este reguistro?");
                if (confrimacion == 0) {//confirmacion

                    if (sql.Eliminar(SERIAL)) {

                        JOptionPane.showMessageDialog(ve, "Registro eliminado");
                        llenadoTabla();
                        selecionado = false;

                    } else {
                        JOptionPane.showMessageDialog(ve, "Error al eliminar reguitro");
                    }
                } else {
                    selecionado = false;
                }

            } else {//selecion
                JOptionPane.showMessageDialog(ve, "Para elminar un reguitro primero debe selecionarlo");
            }

        } else {
            JOptionPane.showMessageDialog(ve, Clogin.SIN_PERMISO);
        }

    }

    protected void Guardarcambios() {
        int cbEstado = ve.cbestado.getSelectedIndex();
        int cbMarca = ve.cbmarca.getSelectedIndex();
        int cbModelo = ve.cbmodelo.getSelectedIndex();

        String marca = ve.cbmarca.getItemAt(cbMarca);
        String modelo = ve.cbmodelo.getItemAt(cbModelo);
        String estado = ve.cbestado.getItemAt(cbEstado);
        String txtSerial = ve.txtserial.getText();
        String txtUsuario = ve.txtusuario.getText();

        Equipos nuevo = new Equipos(sql.getid(SERIAL), marca, modelo, txtSerial, estado, txtUsuario);
        Equipos viejo = sql.getEquipo(SERIAL);

        //confirma que se ingresen los datos
        if (cbEstado != 0 && cbMarca != 0 && !txtSerial.equals("") && !txtUsuario.equals("")) {

            if (!nuevo.comparar(viejo)) {//valida que los datos no sean iguales

                if (sql.validaPC(txtSerial) >= 1) {// valida que el serial no este repetido
                    System.out.println(sql.validaPC(txtSerial));
                    JOptionPane.showMessageDialog(ve.jfañadir, "Ya existe un registro con ese serial");

                } else {

                    Equipos mod = new Equipos(cbMarca + 1, cbModelo, txtSerial, estado, txtUsuario);

                    String nomModelo = ve.cbmodelo.getItemAt(cbModelo);

                    if (sql.Modificar(mod, nomModelo, viejo.getId())) {
                        JOptionPane.showMessageDialog(ve.jfañadir, "Registro Cambiado");
                        llenadoTabla();

                        ve.cbtipobusqueda.setSelectedIndex(0);

                        VaciarCampos();
                        ve.jfañadir.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(ve, "Error al guardar cambio");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(ve.jfañadir, "Debe cambiar algun dato");
            }
        } else {
            JOptionPane.showMessageDialog(ve.jfañadir, "Debe espesificar todos los datos solicitados");
        }
    }

    //funciones de buscar y otros
    protected void tipoBusuqeda() {

        ve.cbbusqueda.removeAllItems();
        String estado[] = {"Seleccionar", "Activo", "Dañado"};

        int selecionado = ve.cbtipobusqueda.getSelectedIndex();

        switch (selecionado) {
            case 0://nada
                llenadoTabla();
                ve.txtbusqueda.setVisible(false);
                ve.cbbusqueda.setVisible(false);
                ve.lineaBuscar.setVisible(false);
                ve.cbbusModelos.setVisible(false);
                break;

            case 333://usuario
                ve.cbbusqueda.setVisible(false);
                ve.txtbusqueda.setText("");
                ve.txtbusqueda.setVisible(true);
                ve.lineaBuscar.setVisible(true);
                ve.cbbusModelos.setVisible(false);
                break;

            case 1://marca

                sql.getMarca(ve.cbbusqueda);

                ve.txtbusqueda.setVisible(false);
                ve.cbbusqueda.setVisible(true);
                ve.lineaBuscar.setVisible(false);
                ve.cbbusModelos.setVisible(true);
                break;

            case 2://serial
                ve.cbbusqueda.setVisible(false);
                ve.txtbusqueda.setText("");
                ve.txtbusqueda.setVisible(true);
                ve.lineaBuscar.setVisible(true);
                ve.cbbusModelos.setVisible(false);
                break;

            case 4546://estado
                for (int i = 0; i < estado.length; i++) {
                    ve.cbbusqueda.addItem(estado[i]);
                }
                ve.txtbusqueda.setVisible(false);
                ve.cbbusqueda.setVisible(true);
                ve.lineaBuscar.setVisible(false);
                ve.cbbusModelos.setVisible(false);
        }

    }

    protected void Buscar() {
        int selector = ve.cbtipobusqueda.getSelectedIndex();
        String buscar = null;
        Boolean buscando = false;
        switch (selector) {
            case 0: //nada, por defecto
                buscando = false;
                break;

            case 155://usuario
                buscar = ve.txtbusqueda.getText();
                buscando = true;
                break;

            case 1://marca
                int nMarca = ve.cbbusqueda.getSelectedIndex();
                buscar = ve.cbbusqueda.getItemAt(nMarca);
                ve.cbbusModelos.removeAllItems();
                buscando = true;
                break;

            case 2://serial
                buscar = ve.txtbusqueda.getText();
                buscando = true;
                break;

            case 4://estado
                ve.cbbusModelos.removeAllItems();
                int nEsatdo = ve.cbbusqueda.getSelectedIndex();
                buscar = ve.cbbusqueda.getItemAt(nEsatdo);
                buscando = true;
                break;
        }
        if (buscando) {

            if (sql.Buscar(selector, buscar, ve.jtequipos)) {
                //llena la segunda barra desplegable con los modelos en la parte de para buscar
                int mar = ve.cbbusqueda.getSelectedIndex();
                ve.cbbusModelos.removeAllItems();

                if (mar != 0) {
                    sql.getModelo(ve.cbbusModelos, mar + 1);
                }

            } else {
                JOptionPane.showMessageDialog(ve, "Error en la busqueda");
            }
        }

    }

    private void VaciarCampos() {
        ve.cbmarca.setSelectedIndex(0);
        ve.cbmodelo.removeAllItems();
        ve.txtusuario.setText("");
        ve.txtserial.setText("");
        ve.cbestado.setSelectedIndex(0);
    }

    private void newMarca() {
        String newMarca = ve.txtnewMarca.getText();

        if (!newMarca.equals("")) {//valida que no este vacio

            if (sql.validaMarca(newMarca, "marca") == 0) {//valida que no se repitan marcas

                if (sql.añadirMarca(newMarca)) {
                    ve.txtnewMarca.setText("");
                    JOptionPane.showMessageDialog(ve.jfmarca, "Registro guardado");

                } else {
                    JOptionPane.showMessageDialog(ve.jfmarca, "Error registro guardado");
                }
            } else {
                JOptionPane.showMessageDialog(ve.jfmarca, "Esa marca ya esta en el registro");
            }

        }
    }

    private void newModelo() {
        int getmarca = ve.cbnewModelo.getSelectedIndex();
        String modelo = ve.txtnewModelo.getText();

        if (getmarca != 0 && !modelo.equals("")) {//valida que no se repitan modelos

            if (sql.validaMarca(modelo, "modelo") == 0) {

                if (sql.añadirModelo(modelo, getmarca + 1)) {
                    ve.cbnewModelo.setSelectedIndex(0);
                    ve.txtnewModelo.setText("");
                    JOptionPane.showMessageDialog(ve.jfmodelo, "Modelo guardado");
                } else {
                    JOptionPane.showMessageDialog(ve.jfmodelo, "Error al guardae modelo");
                }

            } else {
                JOptionPane.showMessageDialog(ve.jfmodelo, "Debe llenar  todos los datos");
            }
        } else {
            JOptionPane.showMessageDialog(ve.jfmarca, "Ese modelo ya esta en el registro");
        }

    }

    private void nuevoPeriferico() {
        SQLperifericos peri = new SQLperifericos();

        String serial = ve.txtserialperi.getText();
        String serialPc = ve.txtserialpc.getText();

        int num = ve.cbtipoperi.getSelectedIndex();
        String periferico = ve.cbtipoperi.getItemAt(num);

        if (!serial.equals("") && !serialPc.equals("")) {//valida que los campos no esten vaios

            SQLequipos eq = new SQLequipos();
            int pc = eq.getid(serialPc);
            int tipo = peri.getIdLista(periferico);

            if (peri.validarPeriferico(serial) == 0) {//valida no exista otro periferico con ese serial

                if (peri.validaRepeticion(tipo, pc) == 0) {//valida que un equipo no tengo 2 veces el mismo periferico

                    Perifericos nuevo = new Perifericos(pc, tipo, serial);

                    if (peri.añadir(nuevo)) {
                        peri.tablaDetalles(pc, ve.jtperifericos);
                        ve.jfperiferico.setVisible(false);
                        JOptionPane.showMessageDialog(ve.jfañadir, "Registro guardado");

                    } else {
                        JOptionPane.showMessageDialog(ve.jfañadir, "Error al guardar reguistro");
                    }

                } else {
                    ve.txtserialperi.setText("");
                    JOptionPane.showMessageDialog(ve.jfañadir, "Este equipo ya tiene reguistrado un " + periferico);
                }

            } else {
                ve.txtserialperi.setText("");
                JOptionPane.showMessageDialog(ve.jfañadir, "Ese periferico ya esta registrado");
            }

        } else {
            JOptionPane.showMessageDialog(ve.jfañadir, "Debe llenar todos los campos");
        }

    }

}
