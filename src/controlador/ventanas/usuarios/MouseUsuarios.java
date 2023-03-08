package controlador.ventanas.usuarios;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vusuarios;

public class MouseUsuarios implements MouseListener {

    Vusuarios ve;
    Colores col;

    public MouseUsuarios(Vusuarios ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.btnabrirAñadir.addMouseListener(this);
        ve.btnagregar_us.addMouseListener(this);

        ve.btneliminar.addMouseListener(this);

        ve.btnabrirMod.addMouseListener(this);
        ve.btnguardar.addMouseListener(this);

        ve.btnabrirModDat.addMouseListener(this);
        ve.btnmodDatos.addMouseListener(this);
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

    //pone los botones de color oscuro cuando el mouse pasa por encima
    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(ve.btnabrirAñadir)) {
            col.oscuro(ve.btnabrirAñadir);
        }
        if (me.getSource().equals(ve.btnagregar_us)) {
            col.oscuro(ve.btnagregar_us);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.oscuro(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btnabrirMod)){
            col.oscuro(ve.btnabrirMod);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.oscuro(ve.btnguardar);
        }
        
        if(me.getSource().equals(ve.btnabrirModDat)){
            col.oscuro(ve.btnabrirModDat);
        }
        if (me.getSource().equals(ve.btnmodDatos)){
            col.oscuro(ve.btnmodDatos);
        }
    }

    //debuelve los botones a su color original
    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(ve.btnabrirAñadir)) {
            col.claro(ve.btnabrirAñadir);
        }
        if (me.getSource().equals(ve.btnagregar_us)) {
            col.claro(ve.btnagregar_us);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.claro(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btnabrirMod)){
            col.claro(ve.btnabrirMod);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.claro(ve.btnguardar);
        }
        
        if(me.getSource().equals(ve.btnabrirModDat)){
            col.claro(ve.btnabrirModDat);
        }
        if (me.getSource().equals(ve.btnmodDatos)){
            col.claro(ve.btnmodDatos);
        }
    }

}
