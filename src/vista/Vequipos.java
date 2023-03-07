
package vista;

import controlador.utilidades.Menu;
import controlador.utilidades.Imagen; 
/**
 *
 * @author Carlos Masabet
 */
public class Vequipos extends javax.swing.JFrame {

     Menu m=new Menu();
     
    public Vequipos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfañadir = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        txtserial = new javax.swing.JTextField();
        cbestado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnañadir2 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cbmarca = new javax.swing.JComboBox<>();
        cbmodelo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbdepartamentos = new javax.swing.JComboBox<>();
        jfdetalles = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdetmarca = new javax.swing.JLabel();
        txtdetmodelo = new javax.swing.JLabel();
        txtdetserial = new javax.swing.JLabel();
        txtdetestado = new javax.swing.JLabel();
        txtdetususario = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtperifericos = new javax.swing.JTable();
        txtdetdepar = new javax.swing.JLabel();
        btnperiferico = new javax.swing.JButton();
        jfmarca = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnewMarca = new javax.swing.JTextField();
        btnnewMarca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jfmodelo = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtnewModelo = new javax.swing.JTextField();
        btnnewModelo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbnewModelo = new javax.swing.JComboBox<>();
        jfperiferico = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        txtserialperi = new javax.swing.JTextField();
        cbtipoperi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnnewperi = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtserialpc = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtequipos = new javax.swing.JTable();
        txtbusqueda = new javax.swing.JTextField();
        cbtipobusqueda = new javax.swing.JComboBox<>();
        btnañadir = new javax.swing.JButton();
        btndetalles = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        cbbusqueda = new javax.swing.JComboBox<>();
        lineaBuscar = new javax.swing.JSeparator();
        btnmarca = new javax.swing.JButton();
        btnmodelo = new javax.swing.JButton();
        cbbusModelos = new javax.swing.JComboBox<>();
        fondobotones = new javax.swing.JPanel();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnpersonas = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JLabel();
        txtsolicitudes = new javax.swing.JLabel();
        btnsolicitudes = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();

        jfañadir.setMinimumSize(new java.awt.Dimension(378, 371));

        jPanel1.setBackground(new java.awt.Color(225, 232, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtserial.setBackground(new java.awt.Color(225, 232, 236));
        txtserial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserial.setBorder(null);
        jPanel1.add(txtserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 20));

        cbestado.setBackground(new java.awt.Color(0, 134, 190));
        cbestado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbestado.setForeground(new java.awt.Color(255, 255, 255));
        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Activo", "Dañado" }));
        cbestado.setBorder(null);
        cbestado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Serial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, -1));

        btnañadir2.setBackground(new java.awt.Color(0, 134, 190));
        btnañadir2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnañadir2.setForeground(new java.awt.Color(255, 255, 255));
        btnañadir2.setText("Añadir");
        btnañadir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnañadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        btnguardar.setBackground(new java.awt.Color(0, 134, 190));
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modelo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, -1));

        txtusuario.setBackground(new java.awt.Color(225, 232, 236));
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setToolTipText("");
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 10));

        cbmarca.setBackground(new java.awt.Color(0, 134, 190));
        cbmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmarca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        cbmodelo.setBackground(new java.awt.Color(0, 134, 190));
        cbmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmodelo.setForeground(new java.awt.Color(255, 255, 255));
        cbmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmodeloActionPerformed(evt);
            }
        });
        jPanel1.add(cbmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Departamento: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 180, 160, -1));

        cbdepartamentos.setBackground(new java.awt.Color(0, 134, 190));
        cbdepartamentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbdepartamentos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbdepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, -1));

        jfañadir.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(225, 232, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalles");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 40));

        txtdetmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmarca.setText("Marca");
        jPanel2.add(txtdetmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, -1));

        txtdetmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmodelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmodelo.setText("modelo");
        jPanel2.add(txtdetmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        txtdetserial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetserial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetserial.setText("serial");
        jPanel2.add(txtdetserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, -1));

        txtdetestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetestado.setText("estado");
        jPanel2.add(txtdetestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, -1));

        txtdetususario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetususario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetususario.setText("usuario");
        jPanel2.add(txtdetususario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, -1));

        btnmodificar.setBackground(new java.awt.Color(0, 134, 190));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jtperifericos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtperifericos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 200));

        txtdetdepar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetdepar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetdepar.setText("departamento");
        jPanel2.add(txtdetdepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 350, -1));

        btnperiferico.setBackground(new java.awt.Color(0, 134, 190));
        btnperiferico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnperiferico.setForeground(new java.awt.Color(255, 255, 255));
        btnperiferico.setText("Agregar periferico");
        btnperiferico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnperiferico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jfdetalles.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(225, 232, 236));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 20));

        txtnewMarca.setBackground(new java.awt.Color(225, 232, 236));
        txtnewMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewMarca.setBorder(null);
        jPanel3.add(txtnewMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, -1));

        btnnewMarca.setBackground(new java.awt.Color(0, 134, 190));
        btnnewMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnnewMarca.setText("Agregar");
        btnnewMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnnewMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Marca de Pc");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, -1));

        jfmarca.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(225, 232, 236));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 20));

        txtnewModelo.setBackground(new java.awt.Color(225, 232, 236));
        txtnewModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewModelo.setBorder(null);
        jPanel4.add(txtnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, -1));

        btnnewModelo.setBackground(new java.awt.Color(0, 134, 190));
        btnnewModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewModelo.setText("Agregar");
        btnnewModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar Modelo");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 30, 240, -1));

        cbnewModelo.setBackground(new java.awt.Color(0, 134, 190));
        cbnewModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbnewModelo.setForeground(new java.awt.Color(255, 255, 255));
        cbnewModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbnewModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnewModeloActionPerformed(evt);
            }
        });
        jPanel4.add(cbnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, -1));

        jfmodelo.getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(225, 232, 236));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtserialperi.setBackground(new java.awt.Color(225, 232, 236));
        txtserialperi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserialperi.setBorder(null);
        jPanel5.add(txtserialperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        cbtipoperi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbtipoperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipoperi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoperiActionPerformed(evt);
            }
        });
        jPanel5.add(cbtipoperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Serial de la PC:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tipo de periferico:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Serial del periferico:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, -1));

        btnnewperi.setBackground(new java.awt.Color(0, 134, 190));
        btnnewperi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewperi.setForeground(new java.awt.Color(255, 255, 255));
        btnnewperi.setText("Guardar");
        btnnewperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnnewperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Agregra Periferico");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 350, -1));

        txtserialpc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserialpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtserialpc.setText("Serial de la pc");
        jPanel5.add(txtserialpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, -1));

        jfperiferico.getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtequipos.setBackground(new java.awt.Color(225, 232, 236));
        jtequipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtequipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Serial", "Estado"
            }
        ));
        jtequipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jtequipos);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 710, 350));

        txtbusqueda.setBackground(new java.awt.Color(225, 232, 236));
        txtbusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbusqueda.setBorder(null);
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        fondo.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, 30));

        cbtipobusqueda.setBackground(new java.awt.Color(0, 134, 190));
        cbtipobusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Marca", "Serial" }));
        cbtipobusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipobusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipobusquedaActionPerformed(evt);
            }
        });
        fondo.add(cbtipobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));

        btnañadir.setBackground(new java.awt.Color(0, 134, 190));
        btnañadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnañadir.setForeground(new java.awt.Color(255, 255, 255));
        btnañadir.setText("Añadir");
        btnañadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        btndetalles.setBackground(new java.awt.Color(0, 134, 190));
        btndetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndetalles.setForeground(new java.awt.Color(255, 255, 255));
        btndetalles.setText("Detalles");
        btndetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btndetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        btneliminar.setBackground(new java.awt.Color(0, 134, 190));
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        fondo.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        cbbusqueda.setBackground(new java.awt.Color(0, 134, 190));
        cbbusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(cbbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, -1));

        lineaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        fondo.add(lineaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 20));

        btnmarca.setBackground(new java.awt.Color(0, 134, 190));
        btnmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmarca.setForeground(new java.awt.Color(255, 255, 255));
        btnmarca.setText("Marca");
        btnmarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        btnmodelo.setBackground(new java.awt.Color(0, 134, 190));
        btnmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodelo.setForeground(new java.awt.Color(255, 255, 255));
        btnmodelo.setText("Modelo");
        btnmodelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        cbbusModelos.setBackground(new java.awt.Color(0, 134, 190));
        cbbusModelos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbusModelos.setForeground(new java.awt.Color(255, 255, 255));
        fondo.add(cbbusModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 160, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 730, 500));

        fondobotones.setBackground(new java.awt.Color(225, 232, 236));
        fondobotones.setBorder(new javax.swing.border.MatteBorder(null));
        fondobotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondobotones.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, -1));

        btnequipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/carne-de-identidad1.png"))); // NOI18N
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
        fondobotones.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        btnpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnpersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/usuario1.png"))); // NOI18N
        btnpersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpersonasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpersonasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpersonasMouseExited(evt);
            }
        });
        fondobotones.add(btnpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        txtusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, -1));

        btnusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/documento1.png"))); // NOI18N
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

        txtsolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtsolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, -1));

        btnsolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/grafico-de-linea1.png"))); // NOI18N
        btnsolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseExited(evt);
            }
        });
        fondobotones.add(btnsolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 50));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnequiposMouseClicked

    private void btnequiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseEntered
        m.perifericos_entra(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseEntered

    private void btnequiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseExited
        m.perifericos_sale(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseExited

    private void btnpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseClicked
        m.usuarios_click(this);
    }//GEN-LAST:event_btnpersonasMouseClicked

    private void btnpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseEntered
        m.usuarios_entra(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseEntered

    private void btnpersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseExited
        m.usuarios_sale(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseExited

    private void btnusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseClicked
        m.reportes_click(this);
    }//GEN-LAST:event_btnusuariosMouseClicked

    private void btnusuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseEntered
        m.reportes_entra(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseEntered

    private void btnusuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseExited
        m.reportes_sale(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseExited

    private void btnsolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseClicked
        m.departamento_click(this);
    }//GEN-LAST:event_btnsolicitudesMouseClicked

    private void btnsolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseEntered
        m.departamento_entra(btnsolicitudes, txtsolicitudes);
    }//GEN-LAST:event_btnsolicitudesMouseEntered

    private void btnsolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseExited
        m.departamento_sale(btnsolicitudes, txtsolicitudes);
    }//GEN-LAST:event_btnsolicitudesMouseExited

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        m.menu_accion(btnmenu, btnequipos, btnpersonas, btnusuarios, btnsolicitudes);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
        Imagen flechaD=new Imagen();
        flechaD.bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        Imagen flechaD=new Imagen();
        flechaD.no_bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        Inicial atras=new Inicial();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void cbmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmodeloActionPerformed

    private void cbtipobusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipobusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipobusquedaActionPerformed

    private void cbnewModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnewModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnewModeloActionPerformed

    private void cbtipoperiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoperiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoperiActionPerformed

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
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vequipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnañadir;
    public javax.swing.JButton btnañadir2;
    public javax.swing.JButton btndetalles;
    public javax.swing.JButton btneliminar;
    private javax.swing.JLabel btnequipos;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnmarca;
    private javax.swing.JLabel btnmenu;
    public javax.swing.JButton btnmodelo;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnnewMarca;
    public javax.swing.JButton btnnewModelo;
    public javax.swing.JButton btnnewperi;
    public javax.swing.JButton btnperiferico;
    private javax.swing.JLabel btnpersonas;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnsolicitudes;
    private javax.swing.JLabel btnusuarios;
    public javax.swing.JComboBox<String> cbbusModelos;
    public javax.swing.JComboBox<String> cbbusqueda;
    public javax.swing.JComboBox<String> cbdepartamentos;
    public javax.swing.JComboBox<String> cbestado;
    public javax.swing.JComboBox<String> cbmarca;
    public javax.swing.JComboBox<String> cbmodelo;
    public javax.swing.JComboBox<String> cbnewModelo;
    public javax.swing.JComboBox<String> cbtipobusqueda;
    public javax.swing.JComboBox<String> cbtipoperi;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondobotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JFrame jfañadir;
    public javax.swing.JFrame jfdetalles;
    public javax.swing.JFrame jfmarca;
    public javax.swing.JFrame jfmodelo;
    public javax.swing.JFrame jfperiferico;
    public javax.swing.JTable jtequipos;
    public javax.swing.JTable jtperifericos;
    public javax.swing.JSeparator lineaBuscar;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JTextField txtbusqueda;
    public javax.swing.JLabel txtdetdepar;
    public javax.swing.JLabel txtdetestado;
    public javax.swing.JLabel txtdetmarca;
    public javax.swing.JLabel txtdetmodelo;
    public javax.swing.JLabel txtdetserial;
    public javax.swing.JLabel txtdetususario;
    private javax.swing.JLabel txtequipo;
    public javax.swing.JTextField txtnewMarca;
    public javax.swing.JTextField txtnewModelo;
    private javax.swing.JLabel txtpersonas;
    public javax.swing.JTextField txtserial;
    public javax.swing.JLabel txtserialpc;
    public javax.swing.JTextField txtserialperi;
    private javax.swing.JLabel txtsolicitudes;
    public javax.swing.JTextField txtusuario;
    private javax.swing.JLabel txtusuarios;
    // End of variables declaration//GEN-END:variables
}
