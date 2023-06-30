//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones

package ej.pkg3.divisionnro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3DivisionNro {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n1;
        String n2;

        try {
            
            System.out.println("Ingrese el primer numero: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero:");
            n2 = leer.next();
            
            int n4 = Integer.parseInt(n2);
            
            System.out.println(n1/n4);
            
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato inválido");
        } catch (NumberFormatException e) {
            System.out.println("Uno de los números no se puede convertir a entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede realizar esa operación");
        }
        
    }
    
}
