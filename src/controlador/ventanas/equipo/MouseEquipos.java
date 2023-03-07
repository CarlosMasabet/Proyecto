
package controlador.ventanas.equipo;

import controlador.utilidades.Colores;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vequipos;


public class MouseEquipos implements MouseListener{
    private Vequipos ve;

    public MouseEquipos(Vequipos ve) {
        this.ve = ve;
        
        ve.cbbusqueda.addMouseListener(this);
        
        ve.btnañadir.addMouseListener(this);
        ve.btndetalles.addMouseListener(this);
        ve.btneliminar.addMouseListener(this);
        ve.btnmarca.addMouseListener(this);
        ve.btnmodelo.addMouseListener(this);
        ve.btnnewMarca.addMouseListener(this);
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

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource().equals(ve.cbbusqueda)){
            ve.cbbusqueda.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        
        
        if(me.getSource().equals(ve.btnañadir)){
            ve.btnañadir.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btndetalles)){
            ve.btndetalles.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btneliminar)){
            ve.btneliminar.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btnmarca)){
            ve.btnmarca.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btnmodelo)){
            ve.btnmodelo.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btnnewMarca)){
            ve.btnnewMarca.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        if (me.getSource().equals(ve.btnnewModelo)){
            ve.btnnewModelo.setBackground(new Color(Colores.BONTON_ACTIVO));
        }
        
        
        
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource().equals(ve.cbbusqueda)){
            ve.cbbusqueda.setBackground(new Color(Colores.BONTON_VACIO));
        }
        
        
        if(me.getSource().equals(ve.btnañadir)){
            ve.btnañadir.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btndetalles)){
            ve.btndetalles.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btneliminar)){
            ve.btneliminar.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btnmarca)){
            ve.btnmarca.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btnmodelo)){
            ve.btnmodelo.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btnnewMarca)){
            ve.btnnewMarca.setBackground(new Color(Colores.BONTON_VACIO));
        }
        if (me.getSource().equals(ve.btnnewModelo)){
            ve.btnnewModelo.setBackground(new Color(Colores.BONTON_VACIO));
        }
        
        
        
    }
    
}
