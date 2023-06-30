//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
//cada operación matemática y deben devolver sus resultados para imprimirlos en el 
//main. 
package ej.pkg1.calculadora;
import java.util.Scanner;
public class Ej1Calculadora {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int n1 = leer.nextInt();
        System.out.print("Ingrese otro número: ");
        int n2 = leer.nextInt();
        
        System.out.println("¿Qué desea hacer? Ingrese una opción: ");
        System.out.println("A. Sumar.");
        System.out.println("B. Restar.");
        System.out.println("C. Multiplicar.");
        System.out.println("D. Dividir.");
        String opc = leer.next();
        
        while (!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("B") && !opc.equalsIgnoreCase("C") && !opc.equalsIgnoreCase("D")) {
            System.out.print("Ingrese una opción válida: ");
            opc = leer.next();
        }
        
        switch (opc.toUpperCase()) {
            case "A":
                System.out.println(n1 + " + " + n2 + " = " + sumar(n1,n2));
                break;
            case "B":
                System.out.println(n1 + " - " + n2 + " = " + restar(n1,n2));
                break;
            case "C":
                System.out.println(n1 + " * " + n2 + " = " + multiplicar(n1,n2));
                break;
            case "D":
                System.out.println(n1 + " / " + n2 + " = " + dividir(n1,n2));
                break;
        }
        
    }
    
    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }
    
    public static int restar(int n1, int n2) {
        int resta = n1 - n2;
        return resta;
    }
    
    public static int multiplicar(int n1, int n2) {
        int mult = n1 * n2;
        return mult;
    }
    
    public static double dividir(double n1, double n2) {
        double div = n1 / n2;
        return div;
    }
    
}
