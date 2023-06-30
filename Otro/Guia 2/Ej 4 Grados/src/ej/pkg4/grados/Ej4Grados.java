//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package ej.pkg4.grados;
import java.util.Scanner;
public class Ej4Grados {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centígrados: ");
        double grados = leer.nextDouble(); 
        
        System.out.println("El valor en grados Fahrenheit es: " + (32 + (9 * grados / 5)) );
    }
    
}
