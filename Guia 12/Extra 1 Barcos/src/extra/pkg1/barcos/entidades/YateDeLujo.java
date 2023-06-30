package extra.pkg1.barcos.entidades;

import java.time.LocalDate;

public class YateDeLujo extends Barco{
    
    private int nroCamarotes;
    private int potencia;

    public YateDeLujo() {
    }

    public YateDeLujo(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    public YateDeLujo(int nroCamarotes, int potencia) {
        this.nroCamarotes = nroCamarotes;
        this.potencia = potencia;
    }

    public YateDeLujo(int nroCamarotes, int potencia, int matricula, long eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
        this.potencia = potencia;
    }

    
    @Override
    public String toString() {
        return "> Matrícula: " + matricula + "\n> Eslora: " + eslora + "\n> Año de fabricación: " + anioFabricacion + "\n> Potencia: " + potencia +" CV" + "\n> Nro. camarotes: " + nroCamarotes;
    }
    
    @Override
    public double calcularModulo(){
        return eslora * 10 + potencia + nroCamarotes ;
    }
    
}
