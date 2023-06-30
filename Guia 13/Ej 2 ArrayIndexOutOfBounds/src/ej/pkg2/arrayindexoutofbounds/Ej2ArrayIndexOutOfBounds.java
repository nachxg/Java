//Definir una clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).

package ej.pkg2.arrayindexoutofbounds;

import java.util.Scanner;

public class Ej2ArrayIndexOutOfBounds {

    public static void main(String[] args) {
        
        int[] hola = new int[1];
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        try{
        for (int i = 0; i < 2; i++) {
            hola[i] = leer.nextInt();
        }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Te fuiste de mambo!!!!");
        }
        
    }
    
}
