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

package Entidades;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {
    
    private ArrayList<Cartas> cartas;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Cartas> monton = new ArrayList();
    
    public Baraja() {
        
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Cartas carta = new Cartas(numero, palo);
                    cartas.add(carta);
                }
            }
        }
    }
    
    public void barajar() {
        
        Collections.shuffle(cartas);
        mostrarBaraja();
        
    }
        
    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public void siguienteCarta() {
        System.out.println("-----------------------------------------------------------------");
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas disponibles para repartir.");
        } else {

            System.out.println("La siguiente carta es: " + cartas.get(0));
            monton.add(cartas.get(0));
            cartas.remove(0);
            
        }
        System.out.println("-----------------------------------------------------------------");
    }
    
    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    
    public void darCartas() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingrese un número de cartas a repartir: ");
        int nro = leer.nextInt();
        if (nro > cartasDisponibles()) {
            System.out.println("No es posible repartir esa cantidad de cartas. Restan " + cartasDisponibles() + " cartas.");
        } else {

            for (int i = 0; i < nro; i++) {
                monton.add(cartas.get(i));
                cartas.remove(i);
            }

            cartasMonton();
            mostrarBaraja();  
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public void cartasMonton() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Cartas repartidas (" + monton.size() + "): ");
        System.out.println("-----------------------------------------------------------------");
        int columnas = 4;
        int elementosPorColumna = (int) Math.ceil((double) monton.size() / columnas);
        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < monton.size()) {
                    Cartas elemento = monton.get(index);
                    System.out.printf("%-15s", elemento); // Ajusta el ancho de columna según tus necesidades
                }
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Restantes: " + cartasDisponibles());
        System.out.println("-----------------------------------------------------------------");
    }

    public void mostrarBaraja() {
        System.out.println("-----------------------------------------------------------------");
        int columnas = 4;
        int elementosPorColumna = (int) Math.ceil((double) cartas.size() / columnas);

        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < cartas.size()) {
                    Cartas elemento = cartas.get(index);
                    System.out.printf("%-15s", elemento); // Ajusta el ancho de columna según tus necesidades
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public int cartasDisponibles() {
        return cartas.size();
    }
    
    public void mostrarColumnas() {
    
    
    int columnas = 4;
        int elementosPorColumna = (int) Math.ceil((double) cartas.size() / columnas);

        for (int i = 0; i < elementosPorColumna; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i + j * elementosPorColumna;
                if (index < cartas.size()) {
                    Cartas elemento = cartas.get(index);
                    System.out.printf("%-15s", elemento); // Ajusta el ancho de columna según tus necesidades
                }
            }
            System.out.println();
    
        }
    
    }
    
}
