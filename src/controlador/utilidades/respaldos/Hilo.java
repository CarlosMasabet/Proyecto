package controlador.utilidades.respaldos;

import java.io.InputStream;
import javax.swing.JOptionPane;

public class Hilo extends Thread {

    private final InputStream is;

    public Hilo(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1000];
            int leido = is.read(buffer);
            while (leido > 0) {
                String texto = new String(buffer, 0, leido);
                System.out.print(texto);
                leido = is.read(buffer);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A ocurrido un error al generar el respaldo\n Error: " +e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

}
