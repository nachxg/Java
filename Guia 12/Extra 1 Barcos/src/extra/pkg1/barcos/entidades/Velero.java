
package extra.pkg1.barcos.entidades;

public class Velero extends Barco{
    
    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Velero(int nroMastiles, int matricula, long eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }
    
    @Override
    public String toString() {
        return "> Matrícula: " + matricula + "\n> Eslora: " + eslora + "\n> Año de fabricación: " + anioFabricacion + "\n> Nro. mástiles: " + nroMastiles;
    }
    
    @Override
    public double calcularModulo(){
        return eslora * 10 + nroMastiles;
    }
    
}
