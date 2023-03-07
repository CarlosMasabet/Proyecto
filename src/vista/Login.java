
package vista;

public class Login extends javax.swing.JFrame {

    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new java.awt.Panel();
        logo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        lateral = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnentrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logocorpoelec.png"))); // NOI18N
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 290, 240));

        titulo1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Base de Datos");
        fondo.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 270, 50));

        titulo2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("De Equipos");
        fondo.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 270, 50));

        lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city.png"))); // NOI18N
        fondo.add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 300, -1));

        txtusuario.setBackground(new java.awt.Color(225, 232, 236));
        txtusuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        txtusuario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtusuarioInputMethodTextChanged(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });
        fondo.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, 40));

        txtcontraseña.setBackground(new java.awt.Color(225, 232, 236));
        txtcontraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        fondo.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 260, 40));

        contraseña.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        contraseña.setText("Contraseña:");
        fondo.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(225, 232, 236));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 270, 10));

        usuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        usuario.setText("Usuario:");
        fondo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(225, 232, 236));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 270, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel7.setText("INICIAR SESIÓN");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        btnentrar.setBackground(new java.awt.Color(0, 134, 190));
        btnentrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("Entrar");
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 170, 50));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
         
    }//GEN-LAST:event_txtusuarioMousePressed
    
    
    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed

       
    }//GEN-LAST:event_txtcontraseñaMousePressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtusuarioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioInputMethodTextChanged
//borra el texto de los cuadros de texto cuando se ponga un boton
    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed

    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        
    }//GEN-LAST:event_txtcontraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnentrar;
    private javax.swing.JLabel contraseña;
    private java.awt.Panel fondo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lateral;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    public javax.swing.JPasswordField txtcontraseña;
    public javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}