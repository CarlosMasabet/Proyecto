package controlador.utilidades;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen {

    public void cambio_tam(JLabel j, String ruta) {

        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(j.getWidth(), j.getWidth(), Image.SCALE_DEFAULT));
        j.setIcon(icono);
    }

    public void cambio_img(JLabel j, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage());
        j.setIcon(icono);
    }

    public void bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }

    public void no_bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 232, 236)));
    }
}
