//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
//muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
//por B y se obtiene cambiando sus filas por columnas (o viceversa).

package ej.pkg4.matriztrasp;

public class Ej4Matriztrasp {

    public static void main(String[] args) {
        
        int m1[][] = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = (int) (Math.random() * 10);

            }
        }
       
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + m1[i][j] + "]");
            }
            System.out.println(" ");
        }
        
         System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + m1[j][i] + "]");
            }
            System.out.println(" ");
        }
        
    }
    
}
