
package Entidad;

public class Ascensor {

    private int pisoActual;
    private int maximoPisos;

    public Ascensor() {
    }

    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
    
}
