//
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

package ejercicio.pkg8.asteriscos;

import java.util.Scanner;

public class Ejercicio8Asteriscos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = leer.nextInt();
        
for (int i = 1; i <= n; i++) {
            //Imprime los caracteres de cada fila
            for (int j = 1; j <= n; j++) {
//                if (((i == 1 || i == n) || j == 1) || j == n) {
                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
            }
            //Salta a la siguiente línea para imprimir la siguiente fila
            System.out.println();
    
}
}
}
