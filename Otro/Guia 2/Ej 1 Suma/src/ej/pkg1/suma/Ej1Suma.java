
/* Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma */

package ej.pkg1.suma;

import java.util.Scanner;

public class Ej1Suma {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese otro número entero: ");
        int n2 = leer.nextInt();
        
        System.out.println("La suma de ambos números es: " + (n1 + n2));
        
    }
    
}
