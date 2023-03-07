package proyecto;

import controlador.consultas.SQLusuarios;
import controlador.ventanas.login.Clogin;
import javax.swing.ImageIcon;
import modelo.Usuarios;
import vista.Login;


public class Proyecto {
    
    private static SQLusuarios sql;
    private static Usuarios us;
    private static Login ve;
    
    private static Clogin cl;
    
    public static final ImageIcon icono = new ImageIcon(Proyecto.class.getResource("/imagenes/icono.png"));
               
    public static void main(String[] args) {
        
        sql = new SQLusuarios();
        us =  new Usuarios();
        ve = new Login();
        ve.setIconImage(icono.getImage());
        
        cl = new Clogin(sql, ve, us);
    }

}
