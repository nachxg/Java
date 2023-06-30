//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
//le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
//se encuentra el numero y si se encuentra repetido.

package ej.pkg2.buscar;
import java.util.Scanner;
public class Ej2Buscar {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int vector[] = new int[n];
        
        System.out.println("Ingrese un número a encontrar: ");
        int num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println("[" + vector[i] + "]");
        }
        
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("La/s posicion/es donde fue encontrado el número es/son: " + i);
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("El número no se encontró.");
        } else if (contador == 1) {
            System.out.println("El número se encontró una sola vez. ");
        } else {
            System.out.println("El número se encuentra repetido. ");
        }
        
    }
    
}
