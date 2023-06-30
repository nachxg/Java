//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
//de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
//equals() de la clase String.

package extra.pkg3.vocal;
import java.util.Scanner;
public class Extra3Vocal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        
        while (letra.length() > 1) {
            System.out.println("Ingresó más de una letra. Vuelva a intentarlo: ");
            letra = leer.nextLine();
        }
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
        
    }
    
}
