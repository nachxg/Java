
package extra.pkg1.barcos.entidades;

import java.time.LocalDate;

public class BarcoAMotor extends Barco{
    
    private int potencia;

    public BarcoAMotor() {
    }
    
    public BarcoAMotor(int potencia, int matricula, long eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return "> Matrícula: " + matricula + "\n> Eslora: " + eslora + "\n> Año de fabricación: " + anioFabricacion + "\n> Potencia: " + potencia +" CV";
    }
    
    @Override
    public double calcularModulo(){
        return eslora * 10 + potencia;
    }
    
}
