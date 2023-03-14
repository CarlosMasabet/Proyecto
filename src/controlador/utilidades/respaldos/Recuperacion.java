package controlador.utilidades.respaldos;

import java.io.*;
import javax.swing.JOptionPane;

public class Recuperacion {

    public void recuperacion() {

        File respaldo = new File("backup_equipos.sql");

        if (respaldo.exists()) {

            try {
                Process p = Runtime.getRuntime().exec("mysql -u root -p123456 respaldo");
                new Hilo(p.getErrorStream()).start();

                OutputStream os = p.getOutputStream(); //Pedimos la salida
                FileInputStream fis = new FileInputStream("backup_equipos.sql"); //creamos el archivo para le respaldo
                byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer

                int leido = fis.read(buffer);//Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
                while (leido > 0) {
                    os.write(buffer, 0, leido); //Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
                    leido = fis.read(buffer);
                }

                os.flush(); //vacía los buffers de salida
                os.close(); //Cierra
                fis.close(); //Cierra respaldo
                
                JOptionPane.showMessageDialog(null, "Base de Datos recuperada");
                
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se exite un respaldo de la BD en esta pc");
        }

    }

}
