
package controlador.utilidades;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Colores {
    
    public static final Color BONTON_CLARO = new Color(0x0086BE);
    public static final Color BONTON_OSCURO = new Color(0x233970);
    
    public static final Color AZUL =  new Color(0x001b42);
    public static final Color GRIS_OSCURO =  new Color(0x999eaa);
    public static final Color GRIS_CLARO =  new Color(0xdee7f0);
    public static final Color ROJO =  new Color(0xCE0000);

    //define los colores de los botones cunado entra y sale el mouse
    public void btnSale(JButton btn){
        Color a = btn.getBackground();
        
        if(a == ROJO){
            btn.setBackground(AZUL);
        } else {
            btn.setBackground(ROJO);
        } 
        
        
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    
    public void btnEntra(JButton btn){
        
        Color a = btn.getBackground();
        
        if(a == ROJO){
            btn.setBackground(AZUL);
        } else {
            btn.setBackground(ROJO);
        } 

        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    
    //define el color de los desplegables cunado entra y sale el mouse
    public void cbSale (JComboBox cb){
        Color a = cb.getBackground();
        
        if(a == ROJO){
            cb.setBackground(AZUL);
        } else {
            cb.setBackground(ROJO);
        } 
        
        cb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    
    public void cbEntra (JComboBox cb){
        Color a = cb.getBackground();
        
        if(a == ROJO){
            cb.setBackground(AZUL);
        } else {
            cb.setBackground(ROJO);
        } 
        
        cb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    
    
}
