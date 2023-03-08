
package controlador.ventanas.departamentos;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vdepartamentos;


public class MouseDepa implements MouseListener{
    
    Vdepartamentos ve;
    Colores col;

    public MouseDepa(Vdepartamentos ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.btnAbrirAsignar.addMouseListener(this);
        //ve.btn
        
        ve.btnAbrirModificar.addMouseListener(this);
        //ve.btn
        
        ve.btnAbrirSolicitud.addMouseListener(this);
        //ve.btn
        
        ve.btnAbrirAgregar.addMouseListener(this);
        ve.btnagregar.addMouseListener(this);
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

    //pone los botones de color oscuro cuando se pasael mouse por encima
    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(ve.btnAbrirAsignar)){
            col.oscuro(ve.btnAbrirAsignar);
        }
        
        if (me.getSource().equals(ve.btnAbrirModificar)){
            col.oscuro(ve.btnAbrirModificar);
        }
        
        if (me.getSource().equals(ve.btnAbrirSolicitud)){
            col.oscuro(ve.btnAbrirSolicitud);
        }
        
        if (me.getSource().equals(ve.btnAbrirAgregar)){
            col.oscuro(ve.btnAbrirAgregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.oscuro(ve.btnagregar);
        }
        
    }

    //pone lo botones de color claro cuando se pasa el mouse por encima
    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(ve.btnAbrirAsignar)){
            col.claro(ve.btnAbrirAsignar);
        }
        
        if (me.getSource().equals(ve.btnAbrirModificar)){
            col.claro(ve.btnAbrirModificar);
        }
        
        if (me.getSource().equals(ve.btnAbrirSolicitud)){
            col.claro(ve.btnAbrirSolicitud);
        }
        
        if (me.getSource().equals(ve.btnAbrirAgregar)){
            col.claro(ve.btnAbrirAgregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.claro(ve.btnagregar);
        }
    }
    
    
}
