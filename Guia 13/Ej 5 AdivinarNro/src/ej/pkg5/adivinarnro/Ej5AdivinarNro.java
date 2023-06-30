//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

package ej.pkg5.adivinarnro;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej5AdivinarNro {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int aleatorio = random.nextInt(500) + 1;
        int intentos = 0;
        int adivino = 0;
        
        System.out.println(aleatorio);
        
        do {
            System.out.println("Ingresa un número entre 1 y 500 para adivinar");
            intentos++;
            
            try {
                adivino = leer.nextInt();
                if (adivino == aleatorio) {
                    System.out.println("Adivinaste!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO se ingresó un número");
                leer.nextLine();
            }
        } while (adivino != aleatorio);
        System.out.println("Se intentó adivinar " + intentos + " veces!!");
    }
       
}
