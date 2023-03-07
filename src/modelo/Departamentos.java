
package modelo;

public class Departamentos {
    private int id;
    private String nombre;
    private String jefe;
    private String contacto;

    public Departamentos(int id,String nombre, String jefe, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.jefe = jefe;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
}
