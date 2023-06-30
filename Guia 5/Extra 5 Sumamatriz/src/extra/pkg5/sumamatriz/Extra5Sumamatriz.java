//Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
//y muestre la suma de sus elementos.

package extra.pkg5.sumamatriz;
import java.util.Scanner;
public class Extra5Sumamatriz {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma=0;
        
        System.out.println("Ingrese el nro. de filas de la matriz: ");
        int n = leer.nextInt();
        System.out.println("Ingrese el nro. de columnas de la matriz: ");
        int m = leer.nextInt();
       
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("La suma de los elementos de la matriz es: " + suma);
        
    }
    
}
