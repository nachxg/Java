
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

package ej.pkg5.raiz;
import java.util.Scanner;
public class Ej5Raiz {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();
        
        System.out.println("El doble del número es: " + (2*num));
        System.out.println("El triple del número es: " + (3*num));
        System.out.println("La raíz cuadrada: " + (Math.sqrt(num)));
        
    }
    
}
