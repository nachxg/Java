//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
//los muestre por pantalla en orden descendente.

package ej.pkg1.pkg100;

public class Ej1100 {

    public static void main(String[] args) {
       
        int[] vector = new int[101];
        
        for (int i = 0; i <= 100; i++) {
            vector[i] = i;
        }
        
        for (int i = 100; i >= 0; i--) {
            
            System.out.println("[" + vector[i] + "]");    
        }   
    }
}
