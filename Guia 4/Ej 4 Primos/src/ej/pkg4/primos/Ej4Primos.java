
package ej.pkg4.primos;
import java.util.Scanner;
public class Ej4Primos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int n = leer.nextInt();
        
        System.out.println("¿El número ingresado es primo? --> "+ primo(n));
        
    }
    
    public static boolean primo(int n) {
        
        boolean primo = false;
        double resto;
        int c = 0;
        
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) { c++; } 
            primo = (c == 2);
            
        }
        
        return primo;
        
    }
        
    
}
