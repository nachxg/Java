//Realice un programa que compruebe si una matriz dada es antisimétrica. 
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
//traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
//La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
//sus filas por columnas (o viceversa).

package ej.pkg5.antisimetrica;
import java.util.Scanner;
public class Ej5Antisimetrica {

    public static void main(String[] args) {
        
        int m1[][] = new int[3][3];
        int rangoMaximo = 100; // el rango máximo de los números aleatorios
        boolean bandera = true;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese: "+  i + j);
                int numero = leer.nextInt();
           m1[i][j] = numero;
            }
        }
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[j][i] != -m1[i][j]){
                    bandera = false;
                    break;
            }
            }
        }
        
        System.out.println("Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + m1[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
//        System.out.println("Matriz traspuesta: ");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("[" + m1[j][i] + "]");
//            }
//            System.out.println(" ");
//        }
//        
//        System.out.println(" ");
//        
//        System.out.println("Matriz antisimétrica: ");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("[" + -(m1[j][i]) + "]");
//            }
//            System.out.println(" ");
//        }
        System.out.println(" ");
        System.out.println("La matriz transpuesta es antisimétrica: " + bandera);
        
    }
        
      
        
        
        
    }
    

