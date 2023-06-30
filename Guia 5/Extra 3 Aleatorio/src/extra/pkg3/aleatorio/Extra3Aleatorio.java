//Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
//por parámetro. Después haremos otra función o procedimiento que imprima el 
//vector.

package extra.pkg3.aleatorio;
import java.util.Scanner;
public class Extra3Aleatorio {

    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        rellenar(vector);
        mostrar(vector);
    }
    
    public static int[] rellenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        } 
        return vector;
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}
