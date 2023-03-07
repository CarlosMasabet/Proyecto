package controlador.utilidades;

import controlador.ventanas.Cusuarios;
import AppPackage.AnimationClass;
import controlador.consultas.SQLdepartamentos;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.consultas.SQLusuarios;
import controlador.ventanas.perifericos.Cperifericos;
import controlador.ventanas.Cdepartamentos;
import controlador.ventanas.equipo.Cequipos;
import modelo.Usuarios;
import vista.Vequipos;
import vista.Vreportes;
import vista.Vperifericos;
import vista.Vdepartamentos;
import vista.Vusuarios;

public class Menu {

    Imagen a = new Imagen();
    boolean derecha;

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
            a.cambio_img(menu, "imagenes/menu/izquierda.png");
            derecha = false;
        } else {
            a.cambio_img(menu, "imagenes/menu/derecha.png");
            derecha = true;
        }
    }

    public void equipos_entra(JLabel boton, JLabel txt) {
        a.bordes(boton);
        txt.setText("Equipos");
        a.cambio_img(boton, "imagenes/menu/computadora1-p.png");
    }

    public void equipos_sale(JLabel boton, JLabel txt) {
        a.no_bordes(boton);
        txt.setText("");
        a.cambio_img(boton, "imagenes/menu/computadora1.png");
    }

    public void equipos_click(JFrame ventana) {
        SQLequipos sql = new SQLequipos();
        Vequipos ve = new Vequipos();

        Cequipos ce = new Cequipos(sql, ve);
        ventana.setVisible(false);
    }

    public void reportes_entra(JLabel boton, JLabel txt) {
        a.bordes(boton);
        txt.setText("Reportes");
        a.cambio_img(boton, "imagenes/menu/documento1-p.png");
    }

    public void reportes_sale(JLabel boton, JLabel txt) {
        a.no_bordes(boton);
        txt.setText("");
        a.cambio_img(boton, "imagenes/menu/documento1.png");
    }

    public void reportes_click(JFrame ventana) {
        Vreportes b = new Vreportes();
        b.setVisible(true);
        ventana.setVisible(false);
    }

    public void perifericos_entra(JLabel boton, JLabel txt) {
        a.bordes(boton);
        txt.setText("Perifericos");
        a.cambio_img(boton, "imagenes/menu/carne-de-identidad1-p.png");
    }

    public void perifericos_sale(JLabel boton, JLabel txt) {
        a.no_bordes(boton);
        txt.setText("");
        a.cambio_img(boton, "imagenes/menu/carne-de-identidad1.png");
    }

    public void perifericos_click(JFrame ventana) {
        Vperifericos b = new Vperifericos();
        SQLperifericos sql = new SQLperifericos();

        Cperifericos cp = new Cperifericos(sql, b);
        ventana.setVisible(false);
    }

    public void usuarios_entra(JLabel boton, JLabel txt) {
        a.bordes(boton);
        txt.setText("Usuarios");
        a.cambio_img(boton, "imagenes/menu/usuario1-p.png");
    }

    public void usuarios_sale(JLabel boton, JLabel txt) {
        a.no_bordes(boton);
        txt.setText("");
        a.cambio_img(boton, "imagenes/menu/usuario1.png");
    }

    public void usuarios_click(JFrame ventana) {
        SQLusuarios sql = new SQLusuarios();
        Vusuarios a = new Vusuarios();

        Cusuarios cus = new Cusuarios(sql, a);
        ventana.setVisible(false);
    }

    public void departamento_entra(JLabel boton, JLabel txt) {
        a.bordes(boton);
        txt.setText("Departamentos");
        a.cambio_img(boton, "imagenes/menu/grafico-de-linea1-p.png");
    }

    public void departamento_sale(JLabel boton, JLabel txt) {
        a.no_bordes(boton);
        txt.setText("");
        a.cambio_img(boton, "imagenes/menu/grafico-de-linea1.png");
    }

    public void departamento_click(JFrame ventana) {
        Vdepartamentos b = new Vdepartamentos();
        SQLdepartamentos dep = new SQLdepartamentos();

        Cdepartamentos cd = new Cdepartamentos(dep, b);
        ventana.setVisible(false);
    }
}
