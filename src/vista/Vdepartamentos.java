
package vista;

import controlador.utilidades.Imagenes;
import controlador.utilidades.Menu;
import proyecto.Proyecto;

public class Vdepartamentos extends javax.swing.JFrame {

    boolean derecha=false;
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
        txtnwedepa = new javax.swing.JTextField();
        txtnewjefe = new javax.swing.JTextField();
        txtnewcontacto = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jfmodificar = new javax.swing.JFrame();
        jfsolicitud = new javax.swing.JFrame();
        fondobotones = new javax.swing.JPanel();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnpersonas = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JLabel();
        txtgraficas = new javax.swing.JLabel();
        btngraficas = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAbrirAgregar = new javax.swing.JButton();
        btnAbrirAsignar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdepartamentos = new javax.swing.JTable();
        btnAbrirModificar = new javax.swing.JButton();
        btnAbrirSolicitud = new javax.swing.JButton();
        cbtipobusqueda = new javax.swing.JComboBox<>();
        cbbuscar = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        Separado = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(225, 232, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 20));

        txtnwedepa.setBackground(new java.awt.Color(225, 232, 236));
        txtnwedepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnwedepa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnwedepa.setBorder(null);
        jPanel2.add(txtnwedepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        txtnewjefe.setBackground(new java.awt.Color(225, 232, 236));
        txtnewjefe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewjefe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnewjefe.setBorder(null);
        jPanel2.add(txtnewjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        txtnewcontacto.setBackground(new java.awt.Color(225, 232, 236));
        txtnewcontacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewcontacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnewcontacto.setBorder(null);
        jPanel2.add(txtnewcontacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

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

        jfagregar.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

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
        fondobotones.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        btnpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnpersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/carne-de-identidad1.png"))); // NOI18N
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

        txtgraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtgraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, -1));

        btngraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btngraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/grafico-de-linea1.png"))); // NOI18N
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
        fondobotones.add(btngraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 50));

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
        btnAbrirAgregar.setText("Agregar Departamento");
        btnAbrirAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

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
        jPanel1.add(btnAbrirAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

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
        jScrollPane1.setViewportView(jtdepartamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        btnAbrirModificar.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirModificar.setText("Cambiar Datos");
        btnAbrirModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        btnAbrirSolicitud.setBackground(new java.awt.Color(0, 134, 190));
        btnAbrirSolicitud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirSolicitud.setText("Crear Solicitud");
        btnAbrirSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        cbtipobusqueda.setBackground(new java.awt.Color(0, 134, 190));
        cbtipobusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Departamento", "Jefe" }));
        cbtipobusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbtipobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        cbbuscar.setBackground(new java.awt.Color(0, 134, 190));
        cbbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbuscar.setForeground(new java.awt.Color(255, 255, 255));
        cbbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        txtbuscar.setBackground(new java.awt.Color(225, 232, 236));
        txtbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbuscar.setBorder(null);
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 130, -1));

        Separado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Separado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 20));

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
    private void btnpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnpersonasMouseClicked

    private void btnpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseEntered
        m.perifericos_entra(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseEntered

    private void btnpersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseExited
        m.perifericos_sale(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseExited
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
//graficos
    private void btngraficasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseEntered
        m.departamento_entra(btngraficas, txtgraficas);
    }//GEN-LAST:event_btngraficasMouseEntered

    private void btngraficasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseExited
        m.departamento_sale(btngraficas, txtgraficas);
    }//GEN-LAST:event_btngraficasMouseExited
//menu
    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
       m.menu_accion(btnmenu, btnequipos, btnpersonas, btnusuarios, btngraficas);
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
        Inicial atras=new Inicial();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked
//graficos click
    private void btngraficasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseClicked
        m.departamento_click(this);
    }//GEN-LAST:event_btngraficasMouseClicked

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
    public javax.swing.JButton btnagregar;
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btngraficas;
    private javax.swing.JLabel btnmenu;
    private javax.swing.JLabel btnpersonas;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnusuarios;
    public javax.swing.JComboBox<String> cbbuscar;
    public javax.swing.JComboBox<String> cbtipobusqueda;
    private javax.swing.JPanel fondobotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JFrame jfagregar;
    public javax.swing.JFrame jfmodificar;
    public javax.swing.JFrame jfsolicitud;
    public javax.swing.JTable jtdepartamentos;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel txtequipo;
    private javax.swing.JLabel txtgraficas;
    public javax.swing.JTextField txtnewcontacto;
    public javax.swing.JTextField txtnewjefe;
    public javax.swing.JTextField txtnwedepa;
    private javax.swing.JLabel txtpersonas;
    private javax.swing.JLabel txtusuarios;
    // End of variables declaration//GEN-END:variables
}
