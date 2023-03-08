
package controlador.utilidades;

import java.awt.Color;
import javax.swing.JButton;

public class Colores {
    
    public static final Color BONTON_CLARO = new Color(0x0086BE);
    public static final Color BONTON_OSCURO = new Color(0x233970);
    
    public void claro(JButton btn){
        btn.setBackground(BONTON_CLARO);
    }
    
    public void oscuro(JButton btn){
        btn.setBackground(BONTON_OSCURO);
    }
    
}
