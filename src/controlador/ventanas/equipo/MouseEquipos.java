
package controlador.ventanas.equipo;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vequipos;


public class MouseEquipos implements MouseListener{
    private Vequipos ve;
    private Colores col;

    public MouseEquipos(Vequipos ve, Colores col) {
        this.ve = ve;
        this.col = col;
        
        ve.cbtipobusqueda.addMouseListener(this);
        
        ve.btnañadir.addMouseListener(this);
        ve.btnañadir2.addMouseListener(this);
        
        ve.btndetalles.addMouseListener(this);
        ve.btnmodificar.addMouseListener(this);
        ve.btnguardar.addMouseListener(this);
        ve.btnperiferico.addMouseListener(this);
        ve.btnnewperi.addMouseListener(this);
        
        ve.btneliminar.addMouseListener(this);
        
        ve.btnmarca.addMouseListener(this);
        ve.btnnewMarca.addMouseListener(this);
        
        ve.btnmodelo.addMouseListener(this);
        ve.btnnewModelo.addMouseListener(this);
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
        if(me.getSource().equals(ve.cbtipobusqueda)){
            ve.cbtipobusqueda.setBackground(col.BONTON_OSCURO);
        }
        
        
        
        if(me.getSource().equals(ve.btnañadir)){
            col.oscuro(ve.btnañadir);
        }
        
        if (me.getSource().equals(ve.btnañadir2)){
            col.oscuro(ve.btnañadir2);
        }
        
        
        if (me.getSource().equals(ve.btndetalles)){
            col.oscuro(ve.btndetalles);
        }
        if (me.getSource().equals(ve.btnmodificar)){
            col.oscuro(ve.btnmodificar);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.oscuro(ve.btnguardar);
        }
        if (me.getSource().equals(ve.btnperiferico)){
            col.oscuro(ve.btnperiferico);
        }
        if (me.getSource().equals(ve.btnnewperi)){
            col.oscuro(ve.btnnewperi);
        }
        
        
        if (me.getSource().equals(ve.btneliminar)){
            col.oscuro(ve.btneliminar);
        }
        
        
        if (me.getSource().equals(ve.btnmarca)){
            col.oscuro(ve.btnmarca);
        }
        if (me.getSource().equals(ve.btnnewMarca)){
            col.oscuro(ve.btnnewMarca);
        }
        
        
        if (me.getSource().equals(ve.btnmodelo)){
            col.oscuro(ve.btnmodelo);
        }
        if (me.getSource().equals(ve.btnnewModelo)){
            col.oscuro(ve.btnnewModelo);
        }
        
        
        
        
    }

    
    //pone lo botones de color claro cuando se pasa el mouse por encima
    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource().equals(ve.cbtipobusqueda)){
            ve.cbtipobusqueda.setBackground(col.BONTON_CLARO);
        }
        
        
        
        if(me.getSource().equals(ve.btnañadir)){
            col.claro(ve.btnañadir);
        }
        if (me.getSource().equals(ve.btnañadir2)){
            col.claro(ve.btnañadir2);
        }
        
        
        if (me.getSource().equals(ve.btndetalles)){
            col.claro(ve.btndetalles);
        }
        if (me.getSource().equals(ve.btnmodificar)){
            col.claro(ve.btnmodificar);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.claro(ve.btnguardar);
        }
        if (me.getSource().equals(ve.btnperiferico)){
            col.claro(ve.btnperiferico);
        }
        if (me.getSource().equals(ve.btnnewperi)){
            col.claro(ve.btnnewperi);
        }
        
        
        if (me.getSource().equals(ve.btneliminar)){
            col.claro(ve.btneliminar);
        }
        
        
        if (me.getSource().equals(ve.btnmarca)){
            col.claro(ve.btnmarca);
        }
        if (me.getSource().equals(ve.btnnewMarca)){
            col.claro(ve.btnnewMarca);
        }
        
        
        if (me.getSource().equals(ve.btnmodelo)){
            col.claro(ve.btnmodelo);
        }
        if (me.getSource().equals(ve.btnnewModelo)){
            col.claro(ve.btnnewModelo);
        }
        
        
        
    }
    
}
