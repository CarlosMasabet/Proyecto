
package vista;

import controlador.utilidades.Imagenes;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

public class Vdepartamentos extends javax.swing.JFrame {

    boolean derecha = false;
    Menu m = new Menu(Proyecto.img);
    
    public Vdepartamentos() {
        
        initComponents();
        this.setLocationRelativeTo(null);   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfagregar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtndepa = new javax.swing.JTextField();
        txtnjefe = new javax.swing.JTextField();
        txtncontacto = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        jfmodificar = new javax.swing.JFrame();
        jfsolicitud = new javax.swing.JFrame();
        jfAsignar = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        btnAsignar = new javax.swing.JButton();
        cbDepas = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtSerialEq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReasignar = new javax.swing.JButton();
        txtdepa = new javax.swing.JLabel();
        jfdetalles = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdetmarca = new javax.swing.JLabel();
        txtdetmodelo = new javax.swing.JLabel();
        txtdetserial = new javax.swing.JLabel();
        txtdetestado = new javax.swing.JLabel();
        txtdetususario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtperifericos1 = new javax.swing.JTable();
        txtdetdepar = new javax.swing.JLabel();
        fondobotones = new javax.swing.JPanel();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnperifericos = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAbrirAgregar = new javax.swing.JButton();
        btnAbrirModificar = new javax.swing.JButton();
        btndetalles = new javax.swing.JButton();
        btnAbrirAsignar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdepartamentos = new javax.swing.JTable();
        btnAbrirSolicitud = new javax.swing.JButton();
        cbtipobusqueda = new javax.swing.JComboBox<>();
        cbbuscar = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        Separado = new javax.swing.JSeparator();
        cbtabla = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(225, 232, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 20));

        txtndepa.setBackground(new java.awt.Color(225, 232, 236));
        txtndepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtndepa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtndepa.setBorder(null);
        jPanel2.add(txtndepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        txtnjefe.setBackground(new java.awt.Color(225, 232, 236));
        txtnjefe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnjefe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnjefe.setBorder(null);
        jPanel2.add(txtnjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        txtncontacto.setBackground(new java.awt.Color(225, 232, 236));
        txtncontacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtncontacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncontacto.setBorder(null);
        jPanel2.add(txtncontacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        btnagregar.setBackground(new java.awt.Color(0, 134, 190));
        btnagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Departamento:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jefe:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contacto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar nuevo departamento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, -1));

        btnactualizar.setBackground(new java.awt.Color(0, 134, 190));
        btnactualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("Actualizar");
        jPanel2.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 220, 120, -1));

        jfagregar.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(225, 232, 236));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsignar.setBackground(new java.awt.Color(0, 134, 190));
        btnAsignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignar.setText("Asignar");
        jPanel3.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        cbDepas.setBackground(new java.awt.Color(0, 134, 190));
        cbDepas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDepas.setForeground(new java.awt.Color(255, 255, 255));
        cbDepas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cbDepas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 10));

        txtSerialEq.setBackground(new java.awt.Color(225, 232, 236));
        txtSerialEq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSerialEq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerialEq.setBorder(null);
        jPanel3.add(txtSerialEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Departemento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Serial del Equipo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Asignar Equipo");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 10, 400, -1));

        btnReasignar.setBackground(new java.awt.Color(0, 134, 190));
        btnReasignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReasignar.setForeground(new java.awt.Color(255, 255, 255));
        btnReasignar.setText("Reasignar");
        jPanel3.add(btnReasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtdepa.setBackground(new java.awt.Color(225, 232, 236));
        txtdepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdepa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdepa.setText("jLabel5");
        jPanel3.add(txtdepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jfAsignar.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(225, 232, 236));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalles");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 40));

        txtdetmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmarca.setText("Marca");
        jPanel4.add(txtdetmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, -1));

        txtdetmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmodelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmodelo.setText("modelo");
        jPanel4.add(txtdetmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        txtdetserial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetserial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetserial.setText("serial");
        jPanel4.add(txtdetserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, -1));

        txtdetestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetestado.setText("estado");
        jPanel4.add(txtdetestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, -1));

        txtdetususario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetususario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetususario.setText("usuario");
        jPanel4.add(txtdetususario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, -1));

        jScrollPane2.setBackground(new java.awt.Color(225, 232, 236));

        jtperifericos1.setBackground(new java.awt.Color(225, 232, 236));
        jtperifericos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Periferico", "Serial"
            }
        ));
        jtperifericos1.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jtperifericos1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 200));

        txtdetdepar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetdepar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetdepar.setText("departamento");
        jPanel4.add(txtdetdepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 350, -1));

        jfdetalles.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondobotones.setBackground(new java.awt.Color(225, 232, 236));
        fondobotones.setBorder(new javax.swing.border.MatteBorder(null));
        fondobotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        btnequipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/computadora1.png"))); // NOI18N
        btnequipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnequiposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnequiposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnequiposMouseExited(evt);
            }
        });
        fondobotones.add(btnequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 50));

        txtpersonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondobotones.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));

        btnperifericos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnperifericos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/perifericos40.png"))); // NOI18N
        btnperifericos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnperifericos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnperifericosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnperifericosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnperifericosMouseExited(evt);
            }
        });
        fondobotones.add(btnperifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        txtusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, -1));

        btnusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/usuario1.png"))); // NOI18N
        btnusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuariosMouseExited(evt);
            }
        });
        fondobotones.add(btnusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));

        txtAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, -1));

        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/izquierda.png"))); // NOI18N
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
            }
        });
        fondobotones.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        btnsalir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda.png"))); // NOI18N
        btnsalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir2MouseClicked(evt);
            }
        });
        fondobotones.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 90, 80));

        getContentPane().add(fondobotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 500));

        jPanel1.setBackground(new java.awt.Color(225, 232, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbrirAgregar.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirAgregar.setText("Nuevo Departamento");
        btnAbrirAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        btnAbrirModificar.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirModificar.setText("Cambiar Datos");
        btnAbrirModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, -1));

        btndetalles.setBackground(new java.awt.Color(0, 134, 190));
        btndetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndetalles.setForeground(new java.awt.Color(255, 255, 255));
        btndetalles.setText("Detalles");
        btndetalles.setToolTipText("");
        btndetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btndetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, -1));

        btnAbrirAsignar.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirAsignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirAsignar.setText("Asignar Equipo");
        btnAbrirAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrirAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 170, -1));

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtdepartamentos.setBackground(new java.awt.Color(225, 232, 236));
        jtdepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Departamento", "Jefe", "Contacto"
            }
        ));
        jtdepartamentos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jtdepartamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        btnAbrirSolicitud.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirSolicitud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirSolicitud.setText("Crear Solicitud");
        btnAbrirSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 170, -1));

        cbtipobusqueda.setBackground(new java.awt.Color(0, 134, 190));
        cbtipobusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Departamento", "Serial" }));
        cbtipobusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbtipobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, -1));

        cbbuscar.setBackground(new java.awt.Color(0, 134, 190));
        cbbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbuscar.setForeground(new java.awt.Color(255, 255, 255));
        cbbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        txtbuscar.setBackground(new java.awt.Color(225, 232, 236));
        txtbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbuscar.setBorder(null);
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        Separado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Separado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 170, 20));

        cbtabla.setBackground(new java.awt.Color(0, 134, 190));
        cbtabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtabla.setForeground(new java.awt.Color(255, 255, 255));
        cbtabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Asignaciones" }));
        cbtabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbtabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//equipos
    private void btnequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseClicked
        m.equipos_click(this);
    }//GEN-LAST:event_btnequiposMouseClicked

    private void btnequiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseEntered
        m.equipos_entra(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseEntered

    private void btnequiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseExited
        m.equipos_sale(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseExited
//personas
    private void btnperifericosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnperifericosMouseClicked

    private void btnperifericosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseEntered
        m.perifericos_entra(btnperifericos, txtpersonas);
    }//GEN-LAST:event_btnperifericosMouseEntered

    private void btnperifericosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseExited
        m.perifericos_sale(btnperifericos, txtpersonas);
    }//GEN-LAST:event_btnperifericosMouseExited
//usuarios
    private void btnusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseClicked
        m.usuarios_click(this);
    }//GEN-LAST:event_btnusuariosMouseClicked

    private void btnusuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseEntered
        m.usuarios_entra(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseEntered

    private void btnusuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseExited
        m.usuarios_sale(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseExited
//menu
    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
       //m.menu_accion(btnmenu, btnequipos, btnperifericos, btnusuarios, btndepa);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
        Imagenes flechaD=new Imagenes();
        flechaD.bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        Imagenes flechaD=new Imagenes();
        flechaD.no_bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked

    private void btnAbrirAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirAsignarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vdepartamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSeparator Separado;
    public javax.swing.JButton btnAbrirAgregar;
    public javax.swing.JButton btnAbrirAsignar;
    public javax.swing.JButton btnAbrirModificar;
    public javax.swing.JButton btnAbrirSolicitud;
    public javax.swing.JButton btnAsignar;
    public javax.swing.JButton btnReasignar;
    public javax.swing.JButton btnactualizar;
    public javax.swing.JButton btnagregar;
    public javax.swing.JButton btndetalles;
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btnmenu;
    private javax.swing.JLabel btnperifericos;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnusuarios;
    public javax.swing.JComboBox<String> cbDepas;
    public javax.swing.JComboBox<String> cbbuscar;
    public javax.swing.JComboBox<String> cbtabla;
    public javax.swing.JComboBox<String> cbtipobusqueda;
    private javax.swing.JPanel fondobotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JFrame jfAsignar;
    public javax.swing.JFrame jfagregar;
    public javax.swing.JFrame jfdetalles;
    public javax.swing.JFrame jfmodificar;
    public javax.swing.JFrame jfsolicitud;
    public javax.swing.JTable jtdepartamentos;
    public javax.swing.JTable jtperifericos1;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JTextField txtSerialEq;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JLabel txtdepa;
    public javax.swing.JLabel txtdetdepar;
    public javax.swing.JLabel txtdetestado;
    public javax.swing.JLabel txtdetmarca;
    public javax.swing.JLabel txtdetmodelo;
    public javax.swing.JLabel txtdetserial;
    public javax.swing.JLabel txtdetususario;
    private javax.swing.JLabel txtequipo;
    public javax.swing.JTextField txtncontacto;
    public javax.swing.JTextField txtndepa;
    public javax.swing.JTextField txtnjefe;
    private javax.swing.JLabel txtpersonas;
    private javax.swing.JLabel txtusuarios;
    // End of variables declaration//GEN-END:variables
}
