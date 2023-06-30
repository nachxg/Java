//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)

package ej.pkg2.cine.entidades;

import java.util.Random;

public class Revolver {
    
    Random random = new Random();
    
    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }
    
    
    
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver() {
    
        posActual = random.nextInt(7);
        posAgua = random.nextInt(7);
        
        if (posActual == 0) {
            do {
            posActual = random.nextInt(7);
            } while (posActual == 0);
        }
        
        if (posAgua == 0) {
            do {
            posAgua = random.nextInt(7);
            } while (posAgua == 0);
        }
        
    
    }
    
    public boolean mojar(){
        return posActual == posAgua;
    }
    
    public void siguienteChorro() {
      
        if (posActual < 6) {
            posActual++;
        } else {
            posActual = 1;
        }
        
    }

    @Override
    public String toString() {
        return  "Actual: " + posActual + " Agua: " + posAgua;
    }
    
}
