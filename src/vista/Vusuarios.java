package vista;

import controlador.utilidades.Imagenes;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

public class Vusuarios extends javax.swing.JFrame {

    Menu m = new Menu(Proyecto.img);

    public Vusuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfañadir_us = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        txtnom_us = new javax.swing.JTextField();
        txtpass1 = new javax.swing.JPasswordField();
        txtpass2 = new javax.swing.JPasswordField();
        btnagregar_us = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtcod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbtipoUs = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        btnmodDatos = new javax.swing.JButton();
        jfmodificar = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        txtCpass = new javax.swing.JPasswordField();
        txtCpass2 = new javax.swing.JPasswordField();
        btnguardar = new javax.swing.JButton();
        txtCusuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtusuarios = new javax.swing.JTable();
        btnabrirAñadir = new javax.swing.JButton();
        btnabrirMod = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnabrirModDat = new javax.swing.JButton();
        fondobotones2 = new javax.swing.JPanel();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnpersonas = new javax.swing.JLabel();
        txtgraficas = new javax.swing.JLabel();
        btngraficas = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnsalir = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(225, 232, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnom_us.setBackground(new java.awt.Color(225, 232, 236));
        txtnom_us.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnom_us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnom_us.setBorder(null);
        txtnom_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_usActionPerformed(evt);
            }
        });
        jPanel2.add(txtnom_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 190, 20));

        txtpass1.setBackground(new java.awt.Color(225, 232, 236));
        txtpass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass1.setBorder(null);
        txtpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpass1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 20));

        txtpass2.setBackground(new java.awt.Color(225, 232, 236));
        txtpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass2.setBorder(null);
        jPanel2.add(txtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, 20));

        btnagregar_us.setBackground(new java.awt.Color(0, 134, 190));
        btnagregar_us.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagregar_us.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar_us.setText("Guardar usuario");
        btnagregar_us.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnagregar_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 210, -1));

        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Contraseña:");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 20));

        txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Confirmar Contraseña:");
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 20));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Agregar Usuario");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 10));

        Separator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 10));

        txtcod.setBackground(new java.awt.Color(225, 232, 236));
        txtcod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcod.setBorder(null);
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel2.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo del usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        cbtipoUs.setBackground(new java.awt.Color(0, 134, 190));
        cbtipoUs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbtipoUs.setForeground(new java.awt.Color(255, 255, 255));
        cbtipoUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Regular", "Sin permisos" }));
        cbtipoUs.setBorder(null);
        cbtipoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoUsActionPerformed(evt);
            }
        });
        jPanel2.add(cbtipoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tipo de usuario:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        Separator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 210, 10));

        btnmodDatos.setBackground(new java.awt.Color(0, 134, 190));
        btnmodDatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnmodDatos.setText("Guardar cambios");
        btnmodDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnmodDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 30));

        jfañadir_us.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(225, 232, 236));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCpass.setBackground(new java.awt.Color(225, 232, 236));
        txtCpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpass.setBorder(null);
        txtCpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpassActionPerformed(evt);
            }
        });
        jPanel3.add(txtCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, 20));

        txtCpass2.setBackground(new java.awt.Color(225, 232, 236));
        txtCpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpass2.setBorder(null);
        jPanel3.add(txtCpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 20));

        btnguardar.setBackground(new java.awt.Color(0, 134, 190));
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 30));

        txtCusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCusuario.setText("Nombre de usuario:");
        jPanel3.add(txtCusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 210, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cambiar Contraseña");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 20, 360, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 10));

        jfmodificar.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 232, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtusuarios.setBackground(new java.awt.Color(225, 232, 236));
        jtusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Ultima secion ", "Tipo de usuario"
            }
        ));
        jtusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtusuarios.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jtusuarios);
        jtusuarios.getAccessibleContext().setAccessibleName("");
        jtusuarios.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 410, 500));

        btnabrirAñadir.setBackground(new java.awt.Color(0, 134, 190));
        btnabrirAñadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirAñadir.setText("Añadir Usuario");
        btnabrirAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabrirAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnabrirAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnabrirMod.setBackground(new java.awt.Color(0, 134, 190));
        btnabrirMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirMod.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirMod.setText("Cambiar Contraseña");
        btnabrirMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnabrirMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        btneliminar.setBackground(new java.awt.Color(0, 134, 190));
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar Usuario");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnabrirModDat.setBackground(new java.awt.Color(0, 134, 190));
        btnabrirModDat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirModDat.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirModDat.setText("Modificar Datos");
        btnabrirModDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnabrirModDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 620, 500));

        fondobotones2.setBackground(new java.awt.Color(225, 232, 236));
        fondobotones2.setBorder(new javax.swing.border.MatteBorder(null));
        fondobotones2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones2.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

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
        fondobotones2.add(btnequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 50));

        txtpersonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondobotones2.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        btnpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnpersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/perifericos40.png"))); // NOI18N
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
        fondobotones2.add(btnpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        txtgraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones2.add(txtgraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, -1));

        btngraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btngraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/dpto40.png"))); // NOI18N
        btngraficas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngraficas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngraficasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngraficasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngraficasMouseExited(evt);
            }
        });
        fondobotones2.add(btngraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));

        txtAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones2.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, -1));

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
        fondobotones2.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        btnsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda.png"))); // NOI18N
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        fondobotones2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 90, 80));

        getContentPane().add(fondobotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 500));

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
    private void btnpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnpersonasMouseClicked

    private void btnpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseEntered
        m.perifericos_entra(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseEntered

    private void btnpersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseExited
        m.perifericos_sale(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseExited
//graficas
    private void btngraficasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseEntered
        m.departamento_entra(btngraficas, txtgraficas);
    }//GEN-LAST:event_btngraficasMouseEntered

    private void btngraficasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseExited
        m.departamento_sale(btngraficas, txtgraficas);
    }//GEN-LAST:event_btngraficasMouseExited
//menu
    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        //m.menu_accion(btnmenu, btnequipos, btngraficas, btnpersonas, btnsolicitudes);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
        Imagenes flechaD = new Imagenes();
        flechaD.bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        Imagenes flechaD = new Imagenes();
        flechaD.no_bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirMouseClicked
//grafica click
    private void btngraficasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseClicked
        m.departamento_click(this);
    }//GEN-LAST:event_btngraficasMouseClicked

    private void txtpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass1ActionPerformed

    private void txtnom_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_usActionPerformed

    private void btnabrirAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnabrirAñadirActionPerformed

    private void txtCpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpassActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void cbtipoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoUsActionPerformed

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
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vusuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSeparator Separator1;
    public javax.swing.JSeparator Separator2;
    public javax.swing.JButton btnabrirAñadir;
    public javax.swing.JButton btnabrirMod;
    public javax.swing.JButton btnabrirModDat;
    public javax.swing.JButton btnagregar_us;
    public javax.swing.JButton btneliminar;
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btngraficas;
    public javax.swing.JButton btnguardar;
    private javax.swing.JLabel btnmenu;
    public javax.swing.JButton btnmodDatos;
    private javax.swing.JLabel btnpersonas;
    private javax.swing.JLabel btnsalir;
    public javax.swing.JComboBox<String> cbtipoUs;
    private javax.swing.JPanel fondobotones2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JFrame jfañadir_us;
    public javax.swing.JFrame jfmodificar;
    public javax.swing.JTable jtusuarios;
    public javax.swing.JLabel titulo;
    public javax.swing.JLabel txt1;
    public javax.swing.JLabel txt2;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JPasswordField txtCpass;
    public javax.swing.JPasswordField txtCpass2;
    public javax.swing.JLabel txtCusuario;
    public javax.swing.JTextField txtcod;
    private javax.swing.JLabel txtequipo;
    private javax.swing.JLabel txtgraficas;
    public javax.swing.JTextField txtnom_us;
    public javax.swing.JPasswordField txtpass1;
    public javax.swing.JPasswordField txtpass2;
    private javax.swing.JLabel txtpersonas;
    // End of variables declaration//GEN-END:variables
}
