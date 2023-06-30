//Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

package extra.pkg6.alturas;
import java.util.Scanner;
public class Extra6Alturas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double est, gral = 0, ms = 0;
        int n1 = 0, n2 = 0;
        
        System.out.println("A continuación, ingrese estaturas, o 0 (cero) para parar.");
        
        do {
            est = leer.nextDouble();
            gral += est;
            
            if (est != 0){
                n1++;
            }
        
            if (est < 1.60 && est != 0) {
                ms += est;
                n2++;  
            }
        } while (est != 0);
        
        System.out.print("El promedio general de estaturas es de: " + (gral/n1));
        System.out.println(" m.");
        System.out.print("El promedio de las estaturas por debajo de los 1.60 m es de: " + (ms/n2));
        System.out.println(" m.");
        
    }
    
}
