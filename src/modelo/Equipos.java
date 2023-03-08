package modelo;

public class Equipos {

    private int id;

    private int marca;
    private int modelo;
    
    private String marcaP;
    private String modeloP;
    private String serial;
    private String estado;
    private String us;

    public Equipos(int marca, int modelo, String serial, String estado, String us) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.estado = estado;
        this.us = us;
    }
    
    public Equipos(int id, String marcaP, String modeloP, String serial, String estado, String us){
        this.id = id;
        this.marcaP = marcaP;
        this.modeloP = modeloP;
        this.serial = serial;
        this.estado = estado;
        this.us = us;
    }
    
    public Equipos(){
        
    }
    
    public Boolean comparar(Equipos viejo){
        if(this.marcaP.equals(viejo.marcaP) && this.modeloP.equals(viejo.modeloP) && this.serial.equals(viejo.serial) && this.estado.equals(viejo.estado) && this.us.equals(viejo.us)){
            return true;
        } else {
            return false;
        }
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public int getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public String getModeloP() {
        return modeloP;
    }

    public String getSerial() {
        return serial;
    }

    public String getEstado() {
        return estado;
    }

    public String getUs() {
        return us;
    }
    

    

    
}
