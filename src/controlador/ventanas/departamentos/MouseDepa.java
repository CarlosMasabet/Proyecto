
package controlador.ventanas.departamentos;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.Vdepartamentos;


public class MouseDepa implements MouseListener{
    
    private Vdepartamentos ve;
    private Colores col;
    
    static String depa, jefe, contacto, marca, serial;
    

    public MouseDepa(Vdepartamentos ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.btnAbrirAsignar.addMouseListener(this);
        ve.btnAsignar.addMouseListener(this);
        ve.btnReasignar.addMouseListener(this);
        
        ve.btnAbrirModificar.addMouseListener(this);
        ve.btnactualizar.addMouseListener(this);
        
        ve.btnAbrirSolicitud.addMouseListener(this);
        //ve.btn
        
        ve.btnAbrirAgregar.addMouseListener(this);
        ve.btnagregar.addMouseListener(this);
        
        ve.jtdepartamentos.addMouseListener(this);
        
        ve.btndetalles.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        //almacena  el contenido de la celdas seleccionada cuando se hace click en la tabla
        if (me.getSource().equals(ve.jtdepartamentos)){
            int i = ve.jtdepartamentos.getSelectedRow();
            Cdepartamentos.seleccionado = true;
            
            switch(Cdepartamentos.tabla){
                case "departemento":
                    depa = ve.jtdepartamentos.getValueAt(i, 0).toString();
                    jefe = ve.jtdepartamentos.getValueAt(i, 1).toString();
                    contacto = ve.jtdepartamentos.getValueAt(i, 2).toString();
                    break;
                    
                case "asignacione":
                    marca = ve.jtdepartamentos.getValueAt(i, 0).toString();
                    serial = ve.jtdepartamentos.getValueAt(i, 1).toString();
                    depa = ve.jtdepartamentos.getValueAt(i, 2).toString();
                    break;
                    
                case "solicitude":
                    JOptionPane.showMessageDialog(ve, "por hacer");
                
            }
        }
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
        if (me.getSource().equals(ve.btnAsignar)){
            col.oscuro(ve.btnAsignar);
        }
        if (me.getSource().equals(ve.btnReasignar)){
            col.oscuro(ve.btnReasignar);
        }
        
        if (me.getSource().equals(ve.btnAbrirModificar)){
            col.oscuro(ve.btnAbrirModificar);
        }
        if (me.getSource().equals(ve.btnactualizar)){
            col.oscuro(ve.btnactualizar);
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
        
        if (me.getSource().equals(ve.btndetalles)){
            col.oscuro(ve.btndetalles);
        }
        
    }

    //pone lo botones de color claro cuando se pasa el mouse por encima
    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(ve.btnAbrirAsignar)){
            col.claro(ve.btnAbrirAsignar);
        }
        if (me.getSource().equals(ve.btnAsignar)){
            col.claro(ve.btnAsignar);
        }
        if (me.getSource().equals(ve.btnReasignar)){
            col.claro(ve.btnReasignar);
        }
        
        
        if (me.getSource().equals(ve.btnAbrirModificar)){
            col.claro(ve.btnAbrirModificar);
        }
        if (me.getSource().equals(ve.btnactualizar)){
            col.claro(ve.btnactualizar);
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
        
        if (me.getSource().equals(ve.btndetalles)){
            col.claro(ve.btndetalles);
        }
    }
    
    
}
