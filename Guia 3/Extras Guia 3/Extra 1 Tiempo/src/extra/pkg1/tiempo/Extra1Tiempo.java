//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
//si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
//1 día, 2 horas.

package extra.pkg1.tiempo;

import java.util.Scanner;

public class Extra1Tiempo {

    public static void main(String[] args) {
        
        int dias = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos: ");
        int min = leer.nextInt();
        
        int horas = min / 60;
        while (horas >= 24) {
            horas = horas - 24;
            dias = dias + 1;
        }
        
        System.out.print("El tiempo ingresado equivale a: " + dias);
        System.out.print(" días, " + horas);
        System.out.print(" horas.     ");
    }
    
}
