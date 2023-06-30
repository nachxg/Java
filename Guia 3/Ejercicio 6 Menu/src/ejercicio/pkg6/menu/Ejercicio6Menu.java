//Realizar un programa que pida dos números enteros positivos por teclado y 
//muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
//el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
//El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
//que, si el usuario selecciona la opción 5, en vez de salir del programa 
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
//carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

package ejercicio.pkg6.menu;

import java.util.Scanner;

public class Ejercicio6Menu {

    public static void main(String[] args) {
        
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        double n1 = leer.nextInt();
        System.out.println("Ingrese otro número:");
        double n2 = leer.nextInt();
        int opc;
        double cuenta;
        boolean conf = false;
        
        do {
            cuenta = 0;
            System.out.println("");
            System.out.println("¿Qué desea hacer?"); 
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            opc = leer.nextInt();
            
            switch (opc) {
                
                case 1:
                    cuenta = n1 + n2;
                    System.out.println("La suma de ambos números es: " + cuenta);
                    break;
                
                case 2:
                    cuenta = n1 - n2;
                    System.out.println("La resta de ambos números es: " + cuenta);
                    break;
                
                case 3:
                    cuenta = n1 * n2;
                    System.out.println("La multiplicación de ambos números es: " + cuenta);
                    break;
                
                case 4:
                cuenta = n1 / n2;
                    System.out.println("La división entre ambos números es: " + cuenta);
                    break;
                
                case 5:
                    System.out.println("¿Desea salir? S/N");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        conf = true;
                        break;
                    } else { break; }
             
                     
                default:
                    System.out.println("El valor ingresado no es válido. Vuelva a intentarlo.");
            }
            
        } while (conf == false);
        
    }
    
}
