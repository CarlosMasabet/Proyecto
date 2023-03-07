
package controlador.ventanas.login;

import controlador.utilidades.Colores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Login;


public class MouseLogin implements MouseListener{
    private Login ve;

    public MouseLogin(Login ve) {
        this.ve = ve;
        
        ve.btnentrar.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        ve.btnentrar.setBackground(new Color(Colores.BONTON_ACTIVO));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        ve.btnentrar.setBackground(new Color(Colores.BONTON_VACIO));
    }
    
}
