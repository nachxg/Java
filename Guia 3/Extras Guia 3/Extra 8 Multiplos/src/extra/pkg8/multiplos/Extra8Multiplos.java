//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
//números pares y la cantidad de números impares. Al igual que en el ejercicio 
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
//sentencia break.
package extra.pkg8.multiplos;
import java.util.Scanner;
public class Extra8Multiplos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int c = 0,par = 0,impar = 0;
        
        while (1 < 2) {
            System.out.println("Ingrese un número entero: ");
            int num = leer.nextInt();
            
            if (num > 0) {
                c++;
                if (num%2 == 0) { par++; } 
                else { impar++; }
            }
            
            if (num%5 == 0) { break; }            
        }
        
        System.out.println("Cantidad de números ingresados: " + c);
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impar);
        
    }
    
}
