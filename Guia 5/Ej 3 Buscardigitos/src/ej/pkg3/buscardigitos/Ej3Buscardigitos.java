//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

package ej.pkg3.buscardigitos;
import java.util.Scanner;
import java.util.Random;
public class Ej3Buscardigitos {

    
    public static void main(String[] args) {
        
        int max = 99999, min = 1,numaleatorio,unDig=0,dosDig=0,tresDig=0,cuatroDig=0,cincoDig=0;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            numaleatorio = random.nextInt(99999) + 1;
            vector[i] = numaleatorio;           
            System.out.println("[" + vector [i] + "]");
        }
        
        for (int parteVector: vector) {
            
            if (parteVector < 10) {
                unDig++;
            } else if (parteVector < 100) {
                dosDig++;
            } else if (parteVector < 1000) {
                tresDig++;
            } else if (parteVector < 10000) {
                cuatroDig++;
            } else if (parteVector < 100000) {
                cincoDig++;
            }
            
        }
        
        System.out.println("Se encontraron: ");
        System.out.println(unDig + " nros de un dígito.");
        System.out.println(dosDig + " nros de dos dígitos.");
        System.out.println(tresDig + " nros de tres dígitos.");
        System.out.println(cuatroDig + " nros de cuatro dígitos.");
        System.out.println(cincoDig + " nros de cinco dígitos.");
        
    }
    
}
