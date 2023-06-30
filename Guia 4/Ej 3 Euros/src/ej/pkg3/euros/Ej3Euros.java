//Crea una aplicación que a través de una función nos convierta una cantidad de 
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
//libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
//convertir que será una cadena, este no devolverá ningún valor y mostrará un 
//mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

package ej.pkg3.euros;
import java.util.Scanner;
public class Ej3Euros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un monto en euros (€): ");
        double euros = leer.nextInt();
        
        System.out.println("Ingrese una opción según desee: ");
        System.out.println("A. Convertir a libras  (£)");
        System.out.println("B. Convertir a dólares ($)");
        System.out.println("C. Convertir a yenes   (¥)");
        
        String opc = leer.next();
        
        while (!opc.equalsIgnoreCase("A") && !opc.equalsIgnoreCase("B") && !opc.equalsIgnoreCase("A")) {
            System.out.println("La opción ingresada no es válida. Vuelva a intentarlo: ");
            opc = leer.next();
            
        }
        
        convertir(euros,opc);
        
    }
    
    public static void convertir(double euros, String opc) {
    
        switch (opc.toUpperCase()) {
            
            case "A":
                System.out.println("€" + euros + " = " + "£" + (euros*0.86));
                break;
            case "B":
                System.out.println("€" + euros + " = " + "$" + (euros*1.28611));
                break;
            case "C":
                System.out.println("€" + euros + " = " + "¥" + (euros*129.852));
                break;
        }
    
    }
}
