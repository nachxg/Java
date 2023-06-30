//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//
//10
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

package ej.pkg2.cine.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver r = new Revolver();

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cant = leer.nextInt();
        
        if (cant < 1) {
            cant = 1;
        } else if (cant > 6){
            cant = 6;
        }
        
        for (int i = 1; i < cant+1; i++) {
            
            System.out.println("Ingrese el nombre del Jugador Nº " + i);
            Jugador jug = new Jugador(i,leer.next(),false);
            jugadores.add(jug);
            
        }
       
        
    }
    
    public boolean ronda(ArrayList<Jugador> jugadores){
        
        r.llenarRevolver();
        boolean terminar = true;
        System.out.println("\t |Progreso|");
        System.out.println("--------------------------------");
        
        while (terminar) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " " + r.toString());
                if (jugador.disparo(r)) {
                    System.out.println(jugador.getNombre() + " (jugador Nº " + jugador.getId() + ") se mojó. Se terminó la partida.");
                    terminar = false;
                    break;
                }
            }
        }
        System.out.println("--------------------------------");
        return terminar;
    }
    
    
}
