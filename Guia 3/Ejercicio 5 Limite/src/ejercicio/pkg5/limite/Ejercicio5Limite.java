//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
//solicite números al usuario hasta que la suma de los números introducidos supere 
//el límite inicial.
package ejercicio.pkg5.limite;

import java.util.Scanner;

public class Ejercicio5Limite {

  
    public static void main(String[] args) {
        
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número límite: ");
        int lim = leer.nextInt();
        
        while (lim > suma) {
            System.out.println("Ingrese un número:");
            int num = leer.nextInt();
            suma += num;
            System.out.println(suma);
        }
        
    }
    
}
