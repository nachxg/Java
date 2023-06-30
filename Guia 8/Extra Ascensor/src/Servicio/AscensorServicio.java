package Servicio;
import Entidad.Ascensor;
public class AscensorServicio {
    
    
    Ascensor asc = new Ascensor();
    
    public Ascensor crearAsc() {
        return new Ascensor(0,10);
    }
    
    public void subir() {
        
        if (asc.getPisoActual() < 10) {
            asc.setPisoActual(asc.getPisoActual()+1);
        }
        System.out.println("Piso actual: " + asc.getPisoActual());
        
    }
    
    public void bajar() {
        if (asc.getPisoActual() > 0) {
            asc.setPisoActual(asc.getPisoActual()-1);
        }
        System.out.println("Piso actual: " + asc.getPisoActual());
    }
    
    public void irA (int pisoElegido) {
        if (pisoElegido > asc.getPisoActual()) {
            System.out.println("");
            System.out.println("Piso de partida: " + asc.getPisoActual());
            for (int i = asc.getPisoActual(); i < pisoElegido; i++) {
                subir();
            }
        }
        if (pisoElegido < asc.getPisoActual()) {
            System.out.println("");
            System.out.println("Piso de partida: " + asc.getPisoActual());
            for (int i = asc.getPisoActual(); i > pisoElegido; i--) {
                bajar();
            }
        }
    }

}
