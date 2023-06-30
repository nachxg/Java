//Diseñe una función que pida el nombre y la edad de N personas e imprima los 
//datos de las personas ingresadas por teclado e indique si son mayores o menores 
//de edad. Después de cada persona, el programa debe preguntarle al usuario si 
//quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

package ej.pkg2.datos;
import java.util.Scanner;
public class Ej2Datos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas a analizar: ");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre, seguido de la edad de la persona Nº " + (i+1));
            String nombre = leer.next();
            int edad = leer.nextInt();
            mostrarDatos(edad,nombre);
            
            if (i != (n-1)) { 
                System.out.println("¿Desea seguir mostrando personas? Si/No");
                String opc = leer.next();
                if (opc.equalsIgnoreCase("no")) { System.out.println("Saludos."); break; }
            }
        }
    }
    
    public static void mostrarDatos(int edad, String nombre) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) { System.out.println("Es mayor de edad."); }
        else { System.out.println("No es mayor de edad."); }
    }
    
}
