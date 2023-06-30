package ej.pkg9.tuexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9TuException {

    public static void main(String[] args) {
        
        metodoC();
        
    }
    
    static void metodoC() throws InputMismatchException {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Inicial C1");
        
        try {
            
            System.out.println("Ingrese un numero (C2):");
            int c2 = leer.nextInt();
            System.out.println("Try C2");
             
            System.out.println("Ingrese un numero (C3):");
            int c3 = leer.nextInt();
            c3 = Integer.parseInt("1");
            System.out.println("Try C3");
        
        } catch (NumberFormatException e) {
            System.out.println("MioException C4");
        
        } catch (InputMismatchException e) {
            System.out.println("TuException C5");
            throw new InputMismatchException("Belgrano el mas grande");
        
        } finally {
            System.out.println("Finally C6");

        }
    }

}
