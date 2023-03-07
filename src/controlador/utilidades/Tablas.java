
package controlador.utilidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class Tablas extends DefaultTableModel{

    public Tablas(Object[] os, int i) {
        super(os, i);
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return  false;
    }
    
}
