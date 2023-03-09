package controlador.utilidades;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagenes {
    
    //rutas de las imagenes 
    public static final String FLECHA_IZQUIERDA = "imagenes/menu/izquierda.png";
    public static final String FLECHA_DERECHA = "imagenes/menu/derecha.png";
    
    public static final String COMPUTADORA = "imagenes/menu/computadora1.png";
    public static final String COMPUTADORA_PEQUEÑO = "imagenes/menu/computadora1-p.png";
    
    //public static final String REPORTES = "imagenes/menu/documento1.png";
    //public static final String REPORTES_PEQUEÑO = "imagenes/menu/documento1-p.png";
    
    public static final String PERIFERICOS = "imagenes/menu/perifericos40.png";
    public static final String PERIFERICOS_PEQUEÑO = "imagenes/menu/perifericos30.png";
    
    public static final String USUARIOS = "imagenes/menu/usuario1.png";
    public static final String USUARIOS_PEQUEÑO = "imagenes/menu/usuario1-p.png";
    
    public static final String DEPARTAMENTOS = "imagenes/menu/dpto40.png";
    public static final String DEPARTAMENTOS_PEQUEÑO = "imagenes/menu/dpto30.png";
    
    //public static final String = "";
    

    //agusta el tamaño de una imagen al del label
    public void cambio_tam(JLabel j, String ruta) {

        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(j.getWidth(), j.getWidth(), Image.SCALE_DEFAULT));
        j.setIcon(icono);
    }

    //cambia la imagen de un label
    public void cambio_img(JLabel j, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage());
        j.setIcon(icono);
    }

    //le pone bordes a un label
    public void bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }

    //le quita los margenes a un label
    public void no_bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 232, 236)));
    }
}
