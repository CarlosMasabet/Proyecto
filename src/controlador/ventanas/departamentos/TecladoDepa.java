
package controlador.ventanas.departamentos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TecladoDepa implements KeyListener{
    
    Cdepartamentos cd;

    public TecladoDepa(Cdepartamentos cd) {
        this.cd = cd;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        cd.buscar();
    }
    
}
