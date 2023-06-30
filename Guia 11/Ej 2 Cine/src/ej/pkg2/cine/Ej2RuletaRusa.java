package ej.pkg2.cine;

import ej.pkg2.cine.entidades.Juego;
import ej.pkg2.cine.entidades.Jugador;
import java.util.ArrayList;

public class Ej2RuletaRusa {
    
    public static void main(String[] args) {
        
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego j = new Juego();
        
        System.out.println("\t|Ruleta Rusa|");
        System.out.println("--------------------------------");
        j.llenarJuego(jugadores);
        
        System.out.println("\t|Lista de Jugadores|");
        System.out.println("--------------------------------");
        
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
        
        System.out.println("--------------------------------");
        j.ronda(jugadores);
                    
    }
    
}
