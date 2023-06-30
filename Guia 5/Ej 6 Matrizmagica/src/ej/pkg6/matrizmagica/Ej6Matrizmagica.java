//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
//Crear un programa que permita introducir un cuadrado por teclado y determine si 
//este cuadrado es mágico o no. El programa deberá comprobar que los números 
//introducidos son correctos, es decir, están entre el 1 y el 9.

package ej.pkg6.matrizmagica;
import java.util.Scanner;
public class Ej6Matrizmagica {

    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                do {
                    System.out.println("Ingrese un valor para: " + i + j);
                    num = leer.nextInt();
                
                    if (num > 9 || num < 1) {
                        System.out.println("Vuelva a ingresar: ");
                        } 
                } while (num > 9 || num < 1 );
                
                matriz[i][j] = num;
                
            }
        }
        
        mostrarVectorInt(matriz);
        verificar(matriz);
     
    }
    
    public static void mostrarVectorInt(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
    public static void verificar(int[][] matriz) {
        int suma,sumaAux;
        boolean bandera = true;
        
        suma = 0;
        
        for (int j = 0; j < 3; j++) {
            suma += matriz[0][j];
        }
        
        for (int i = 0; i < 3; i++) {
            sumaAux = 0;
            for (int j = 0; j < 3; j++) {
                sumaAux += matriz[i][j];
            }
            if (sumaAux != suma) {
                bandera = false;
                break;
            }
        }
        
        if (bandera) {
            for (int j = 0; j < 3; j++) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][j];
            }
            if (sumaAux != suma) {
                bandera = false;
                break;
            }
        }
    }
        
        if (bandera) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][i];
            }
            if (sumaAux != suma) {
                bandera = false;
            }
        }

        if (bandera) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][2-i];
            }
            if (sumaAux != suma) {
                bandera = false;
            }
        }
        
        System.out.println("La matriz es mágica: " + bandera);
        
    }
}
