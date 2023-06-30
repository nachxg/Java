//Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
//de tamaño N, con los valores ingresados por el usuario.

package extra.pkg1;
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + i);
            vector[i] = leer.nextInt();
        }
        
        mostrar(vector,n);
        
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de los valores de los vectores es: " + suma);
        
        
    }
    
    public static void mostrar(int[] vector,int n) {
            for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}
