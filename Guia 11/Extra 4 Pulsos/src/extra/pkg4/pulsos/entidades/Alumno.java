package extra.pkg4.pulsos.entidades;

public class Alumno {
    
    private String nombreCompleto;
    private long dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, long dni, int cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantVotos=" + cantVotos + "}\n";
    }
  
}
