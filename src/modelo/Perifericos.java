
package modelo;

public class Perifericos {
    
    private int id;
    private int pc;
    private int tipo;
    
    private String pcP;
    private String tipoP;
    private String serial;

    public Perifericos(int pc, int tipo, String serial) {
        this.pc = pc;
        this.tipo = tipo;
        this.serial = serial;
    }

    public Perifericos(int id, String pcP, String tipoP, String serial) {
        this.id = id;
        this.pcP = pcP;
        this.tipoP = tipoP;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPcP() {
        return pcP;
    }

    public void setPcP(String pcP) {
        this.pcP = pcP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    
}
