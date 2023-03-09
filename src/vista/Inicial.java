
package vista;

import controlador.consultas.SQLdepartamentos;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.ventanas.usuarios.Cusuarios;
import controlador.consultas.SQLusuarios;
import controlador.ventanas.login.Clogin;
import controlador.ventanas.perifericos.Cperifericos;
import controlador.ventanas.departamentos.Cdepartamentos;
import controlador.ventanas.equipo.Cequipos;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Usuarios;

public class Inicial extends javax.swing.JFrame {

    private boolean ventana = false;
    
    public Inicial() {
        setTitle(Clogin.NomUsuario);
        setIconImage(proyecto.Proyecto.ICONO.getImage());
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new java.awt.Panel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        fondo_botones = new javax.swing.JPanel();
        equipos = new javax.swing.JLabel();
        btnequio2 = new javax.swing.JLabel();
        personas = new javax.swing.JLabel();
        btnperifericos = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        btnusuarios2 = new javax.swing.JLabel();
        graficas = new javax.swing.JLabel();
        btndepartamentos = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logopequeño.png"))); // NOI18N
        fondo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        titulo1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Base de Datos");

        titulo2.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("De Equipos");

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGroup(tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo2)
                .addContainerGap())
        );

        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 400, 130));

        fondo_botones.setBackground(new java.awt.Color(225, 232, 236));
        fondo_botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equipos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        equipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipos.setText("Equipos");
        fondo_botones.add(equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 140, -1));

        btnequio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computadora.png"))); // NOI18N
        btnequio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnequio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnequio2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnequio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnequio2MouseExited(evt);
            }
        });
        fondo_botones.add(btnequio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 140));

        personas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        personas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personas.setText("Perifericos");
        fondo_botones.add(personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 140, -1));

        btnperifericos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnperifericos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perifericos100.png"))); // NOI18N
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
        fondo_botones.add(btnperifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, 140));

        usuarios.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios.setText("Usuarios");
        fondo_botones.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, -1));

        btnusuarios2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        btnusuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseExited(evt);
            }
        });
        fondo_botones.add(btnusuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 140));

        graficas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        graficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        graficas.setText("Departamentos");
        fondo_botones.add(graficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, -1));

        btndepartamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpto100.png"))); // NOI18N
        btndepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseExited(evt);
            }
        });
        fondo_botones.add(btndepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 140, 140));

        btnsalir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda.png"))); // NOI18N
        btnsalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalir2MouseExited(evt);
            }
        });
        fondo_botones.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 100, 80));

        fondo.add(fondo_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 800, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public void cambio_img(JLabel j,String ruta){
        ImageIcon imagen=new ImageIcon(ruta);
        Icon icono=new ImageIcon(imagen.getImage());
        j.setIcon(icono);
    }
    public void bordes(JLabel a){
        a.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }
    public void no_bordes(JLabel b){
        b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225,232,236)));
    }
//boton de equipos
    private void btnequio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseEntered
        bordes(btnequio2);
        cambio_img(btnequio2, "imagenes/computadora-p.png");
    }//GEN-LAST:event_btnequio2MouseEntered

    private void btnequio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseExited
        no_bordes(btnequio2);
        cambio_img(btnequio2, "imagenes/computadora.png");
    }//GEN-LAST:event_btnequio2MouseExited

    private void btnequio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseClicked
        if(!ventana){
            ventana = true;
            SQLequipos sql = new SQLequipos();
            Vequipos ve = new Vequipos();

            Cequipos ce = new Cequipos(sql, ve);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnequio2MouseClicked
//boton perosnas
    private void btnperifericosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseEntered
        bordes(btnperifericos);
        cambio_img(btnperifericos, "imagenes/perifericos85.png");
    }//GEN-LAST:event_btnperifericosMouseEntered

    private void btnperifericosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseExited
        no_bordes(btnperifericos);
        cambio_img(btnperifericos, "imagenes/perifericos100.png");
    }//GEN-LAST:event_btnperifericosMouseExited

    private void btnperifericosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseClicked
        if(!ventana){
            ventana = true;
            Vperifericos a = new Vperifericos();
            SQLperifericos sql = new SQLperifericos();

            Cperifericos cp = new Cperifericos(sql, a);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnperifericosMouseClicked
//boton de usuarios
    private void btnusuarios2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseEntered
        bordes(btnusuarios2);
        cambio_img(btnusuarios2, "imagenes/usuario-p.png");
    }//GEN-LAST:event_btnusuarios2MouseEntered

    private void btnusuarios2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseExited
        no_bordes(btnusuarios2);
        cambio_img(btnusuarios2, "imagenes/usuario.png");
    }//GEN-LAST:event_btnusuarios2MouseExited

    private void btnusuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseClicked
        if(!ventana){
            ventana = true;
            SQLusuarios sql = new SQLusuarios();
            Vusuarios a = new Vusuarios();

            Cusuarios cus = new Cusuarios(sql, a);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnusuarios2MouseClicked
//boton de grafica
    private void btndepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseEntered
        bordes(btndepartamentos);
        cambio_img(btndepartamentos, "imagenes/dpto85.png");
    }//GEN-LAST:event_btndepartamentosMouseEntered

    private void btndepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseExited
        no_bordes(btndepartamentos);
        cambio_img(btndepartamentos, "imagenes/dpto100.png");
    }//GEN-LAST:event_btndepartamentosMouseExited

    private void btndepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseClicked
        if(!ventana){
            ventana = true;
            Vdepartamentos a = new Vdepartamentos();
            SQLdepartamentos dep = new SQLdepartamentos();

            Cdepartamentos cd = new Cdepartamentos(dep, a);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btndepartamentosMouseClicked
//boton salir
    private void btnsalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseEntered
        cambio_img(btnsalir2, "imagenes/flecha-izquierda-p.png");
        bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseEntered

    private void btnsalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseExited
        cambio_img(btnsalir2, "imagenes/flecha-izquierda.png");
        no_bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        int salir = JOptionPane.showConfirmDialog(this, "¿Quieres cerrar sesion?");
        System.out.println(salir);
        if(salir == 0){
            SQLusuarios sql = new SQLusuarios();
            Usuarios us = new Usuarios();
            Login ve = new Login();
            ve.setIconImage(proyecto.Proyecto.ICONO.getImage());

            Clogin cl = new Clogin(sql, ve, us);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnsalir2MouseClicked

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btndepartamentos;
    private javax.swing.JLabel btnequio2;
    private javax.swing.JLabel btnperifericos;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnusuarios2;
    private javax.swing.JLabel equipos;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo_botones;
    private javax.swing.JLabel graficas;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel personas;
    private java.awt.Panel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel usuarios;
    // End of variables declaration//GEN-END:variables
}
