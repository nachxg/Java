//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.

package ej.pkg3.barajaespañola;

import Entidades.Baraja;
import java.util.Scanner;

public class Ej3BarajaEspañola {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Baraja b = new Baraja();
        boolean salir = true;
        
        do {
            System.out.println("1. Barajar.");
            System.out.println("2. Siguiente carta.");
            System.out.println("3. Dar cartas.");
            System.out.println("4. Mostrar montón.");
            System.out.println("5. Mostrar baraja.");
            System.out.println("6. Mostrar cartas disponibles.");
            System.out.println("7. Salir.");
            System.out.println("8. Imprimir 2 columnas.");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    b.barajar();
                    break;
                case 2:
                    b.siguienteCarta();
                    break;
                case 3:
                    b.darCartas();
                    break;
                case 4:
                    b.cartasMonton();
                    break;
                case 5:
                    b.mostrarBaraja();
                    break;
                case 6:
                    System.out.println("Cartas disponibles: " + b.cartasDisponibles());
                    break;
                case 7:
                    System.out.println("Saludos.");
                    salir = false;
                    break;
                case 8:
                    b.mostrarColumnas();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida. Vuelva a intentarlo.");
            }
        } while (salir);

    }
    
}
