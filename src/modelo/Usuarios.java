
package modelo;

public class Usuarios {
    private int id;
    private String codigo;
    private String nombre;
    private String contraseña;
    private int tipo_us;
    private String tipoNom;
    private String ulima_secion;

    public Usuarios(int id, String codigo, String nombre, String tipoNom) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoNom = tipoNom;
    }

    public Usuarios() {
    }
    

    public String getTipoNom() {
        return tipoNom;
    }

    public void setTipoNom(String tipoNom) {
        this.tipoNom = tipoNom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo_us() {
        return tipo_us;
    }

    public void setTipo_us(int tipo_us) {
        this.tipo_us = tipo_us;
    }

    public String getUlima_secion() {
        return ulima_secion;
    }

    public void setUlima_secion(String ulima_secion) {
        this.ulima_secion = ulima_secion;
    }
 
}
