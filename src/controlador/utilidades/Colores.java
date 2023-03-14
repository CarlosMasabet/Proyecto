
package controlador.utilidades;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class Colores {
    
    public static final Color BONTON_CLARO = new Color(0x0086BE);
    public static final Color BONTON_OSCURO = new Color(0x233970);
    
    public static final Color AZUL =  new Color(0x001b42);
    public static final Color GRIS_OSCURO =  new Color(0x999eaa);
    public static final Color GRIS_CLARO =  new Color(0xdee7f0);
    public static final Color ROJO =  new Color(0xCE0000);

    
    public void claro(JButton btn){
        btn.setBackground(BONTON_CLARO);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    
    public void oscuro(JButton btn){
        btn.setBackground(BONTON_OSCURO);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
}
