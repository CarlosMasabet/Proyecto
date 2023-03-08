package proyecto;

import controlador.consultas.SQLusuarios;
import controlador.utilidades.Colores;
import controlador.utilidades.Imagenes;
import controlador.ventanas.login.Clogin;
import javax.swing.ImageIcon;
import modelo.Usuarios;
import vista.Login;


public class Proyecto {
    
    private static SQLusuarios sql;
    private static Usuarios us;
    private static Login ve;
    
    private static Clogin cl;
    
    public static final ImageIcon ICONO = new ImageIcon(Proyecto.class.getResource("icono.png"));
    
    public static final String LLENAR_DATOS = "Debe rellenar todos lo campos solicitados";
    public static final String CAMBIAR_DATOS = "No se han modificado los campos solicitados";
    
    public static Colores color = new Colores();
    public static Imagenes img = new Imagenes();
               
    public static void main(String[] args) {
        
        sql = new SQLusuarios();
        us =  new Usuarios();
        ve = new Login();
        ve.setIconImage(ICONO.getImage());
        
        cl = new Clogin(sql, ve, us);
    }

}
