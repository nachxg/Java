//Una obra social tiene tres clases de socios:
//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los 
//mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
//dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un 
//valor real que represente el costo del tratamiento (previo al descuento) y 
//determine el importe en efectivo a pagar por dicho socio.

package extra.pkg5.socios;
import java.util.Scanner;
public class Extra5Socios {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una opción: ");
        System.out.println("A. Socio tipo A.");
        System.out.println("B. Socio tipo B.");
        System.out.println("C. Socio tipo C.");
        
        String opc = leer.nextLine();
        
        while (!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("B") && !opc.equalsIgnoreCase("C")) {
            System.out.println("La opción ingresada no corresponde a ningún tipo de socio. Vuelva a intentarlo:");
            opc = leer.nextLine();
        }
        
        System.out.println("Ingrese el costo del tratamiento: ");
        double trat = leer.nextDouble();
        
        opc = opc.toUpperCase();
        
        switch (opc) {
            case "A":
                System.out.println("Usted es socio tipo A, por lo que obtiene un 50% de descuento en todos los tratamientos.");
                System.out.println("El costo final del tratamiento es de: $" + (trat * 0.5));
                break;
            case "B":
                System.out.println("Usted es socio tipo B, por lo que obtiene un 35% de descuento en todos los tratamientos.");
                System.out.println("El costo final del tratamiento es de: $" + (trat - trat * 0.35));
                break;
            case "C":
                System.out.println("Usted es socio tipo C, por lo que no recibe descuentos en los tratamientos.");
                System.out.println("El costo final del tratamiento es de: $" + trat);
                break;
        }
        
    }
    
}
