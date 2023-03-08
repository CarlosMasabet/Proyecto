
package controlador.ventanas.perifericos;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vperifericos;


public class MousePerifericos implements MouseListener{
    
    Vperifericos ve;
    Colores col;

    public MousePerifericos(Vperifericos ve, Colores col) {
        this.ve = ve;
        this.col = col;
        
        ve.btnabriragregar.addMouseListener(this);
        ve.btnagregar.addMouseListener(this);
        
        ve.btnabrirReasignar.addMouseListener(this);
        ve.btnreasignar.addMouseListener(this);
        
        ve.btndetalles.addMouseListener(this);
        
        ve.btneliminar.addMouseListener(this);
        
        ve.btntipo.addMouseListener(this);
        ve.btnnuevoperi.addMouseListener(this);
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
    
    //pone los botones de color oscuro
    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(ve.btnabriragregar)){
            col.oscuro(ve.btnabriragregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.oscuro(ve.btnagregar);
        }
        
        if(me.getSource().equals(ve.btnabrirReasignar)){
            col.oscuro(ve.btnabrirReasignar);
        }
        if (me.getSource().equals(ve.btnreasignar)){
            col.oscuro(ve.btnreasignar);
        }
        
        if (me.getSource().equals(ve.btndetalles)){
            col.oscuro(ve.btndetalles);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.oscuro(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btntipo)){
            col.oscuro(ve.btntipo);
        }
        if (me.getSource().equals(ve.btnnuevoperi)){
            col.oscuro(ve.btnnuevoperi);
        }
    }

    //debuelbe los botones a su color original
    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(ve.btnabriragregar)){
            col.claro(ve.btnabriragregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.claro(ve.btnagregar);
        }
        
        if(me.getSource().equals(ve.btnabrirReasignar)){
            col.claro(ve.btnabrirReasignar);
        }
        if (me.getSource().equals(ve.btnreasignar)){
            col.claro(ve.btnreasignar);
        }
        
        if (me.getSource().equals(ve.btndetalles)){
            col.claro(ve.btndetalles);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.claro(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btntipo)){
            col.claro(ve.btntipo);
        }
        if (me.getSource().equals(ve.btnnuevoperi)){
            col.claro(ve.btnnuevoperi);
        }
    }
    
}
