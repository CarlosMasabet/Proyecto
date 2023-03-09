package controlador.utilidades;

import controlador.ventanas.usuarios.Cusuarios;
import AppPackage.AnimationClass;
import controlador.consultas.SQLdepartamentos;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.consultas.SQLusuarios;
import controlador.ventanas.perifericos.Cperifericos;
import controlador.ventanas.departamentos.Cdepartamentos;
import controlador.ventanas.equipo.Cequipos;
import vista.Vequipos;
import vista.Vreportes;
import vista.Vperifericos;
import vista.Vdepartamentos;
import vista.Vusuarios;

public class Menu {

    private Imagenes img;
    private boolean derecha;
    private boolean cambio = false;
    

    public Menu(Imagenes img) {
        this.img = img;
    }

    
    public void menu_accion(JLabel menu, JLabel boton1, JLabel boton2, JLabel boton3, JLabel boton4) {
        AnimationClass entrar = new AnimationClass();
        entrar.jLabelXRight(-50, 10, 15, 5, boton1);
        entrar.jLabelXRight(-50, 10, 15, 5, boton2);
        entrar.jLabelXRight(-50, 10, 15, 5, boton3);
        entrar.jLabelXRight(-50, 10, 15, 5, boton4);

        AnimationClass salir = new AnimationClass();
        salir.jLabelXLeft(10, -50, 15, 5, boton1);
        salir.jLabelXLeft(10, -50, 15, 5, boton2);
        salir.jLabelXLeft(10, -50, 15, 5, boton3);
        salir.jLabelXLeft(10, -50, 15, 5, boton4);

        if (derecha == true) {
            img.cambio_img(menu, Imagenes.FLECHA_IZQUIERDA);
            derecha = false;
        } else {
            img.cambio_img(menu, Imagenes.FLECHA_DERECHA);
            derecha = true;
        }
    }

    public void equipos_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Equipos");
        img.cambio_img(boton, Imagenes.COMPUTADORA_PEQUEÑO);
    }

    public void equipos_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
        img.cambio_img(boton, Imagenes.COMPUTADORA);
    }

    public void equipos_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            SQLequipos sql = new SQLequipos();
            Vequipos ve = new Vequipos();

            Cequipos ce = new Cequipos(sql, ve);
            ventana.setVisible(false);
        }
        
    }

    public void reportes_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Reportes");
        //img.cambio_img(boton, Imagenes.REPORTES_PEQUEÑO);
    }

    public void reportes_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
        //img.cambio_img(boton, Imagenes.REPORTES);
    }

    public void reportes_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vreportes b = new Vreportes();
            b.setVisible(true);
            ventana.setVisible(false);
        }
        
    }

    public void perifericos_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Perifericos");
        img.cambio_img(boton, Imagenes.PERIFERICOS_PEQUEÑO);
    }

    public void perifericos_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
        img.cambio_img(boton, Imagenes.PERIFERICOS);
    }

    public void perifericos_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vperifericos b = new Vperifericos();
            SQLperifericos sql = new SQLperifericos();

            Cperifericos cp = new Cperifericos(sql, b);
            ventana.setVisible(false);
        }
        
    }

    public void usuarios_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Usuarios");
        img.cambio_img(boton, Imagenes.USUARIOS_PEQUEÑO);
    }

    public void usuarios_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
        img.cambio_img(boton, Imagenes.USUARIOS);
    }

    public void usuarios_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            SQLusuarios sql = new SQLusuarios();
            Vusuarios a = new Vusuarios();

            Cusuarios cus = new Cusuarios(sql, a);
            ventana.setVisible(false);
        }
        
    }

    public void departamento_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Departamentos");
        img.cambio_img(boton, Imagenes.DEPARTAMENTOS_PEQUEÑO);
    }

    public void departamento_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
        img.cambio_img(boton, Imagenes.DEPARTAMENTOS);
    }

    public void departamento_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vdepartamentos b = new Vdepartamentos();
            SQLdepartamentos dep = new SQLdepartamentos();

            Cdepartamentos cd = new Cdepartamentos(dep, b);
            ventana.setVisible(false);
        }
        
    }
}
