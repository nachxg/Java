//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

package ej.pkg4.peliculas;

import Entidad.Peliculas;
import Servicio.PeliculasServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Ej4Peliculas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PeliculasServicio ps = new PeliculasServicio();
        boolean salir = true;
        
        ArrayList<Peliculas> pelis = new ArrayList();
        
        ps.crearPelicula(pelis);
        
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Mostrar todas las películas.");
            System.out.println("2. Mostrar películas con duración mayor a X.");
            System.out.println("3. Ordenar las películas de acuerdo a su duración, de mayor a menor.");
            System.out.println("4. Ordenar las películas de acuerdo a su duración, de menor a mayor.");
            System.out.println("5. Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("6. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("7. Salir.");
            int opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: 
                    ps.mostrar(pelis);
                    System.out.println("");break;
                    
                case 2: 
                    System.out.println("Ingrese la duración a comparar: ");
                    double dur = leer.nextDouble();
                    ps.segunDuracion(dur,pelis);
                    System.out.println(""); break;
                case 3:
                    Collections.sort(pelis, Comparator.comparingDouble(Peliculas::getDuracion).reversed());
                    ps.mostrar(pelis);
                    System.out.println(""); break;
                case 4:
                    Collections.sort(pelis, Comparator.comparingDouble(Peliculas::getDuracion));
                    ps.mostrar(pelis);
                    System.out.println(""); break;
                case 5:
                    Collections.sort(pelis, Comparator.comparing(Peliculas::getTitulo));
                    ps.mostrar(pelis);
                    System.out.println(""); break;
                case 6:
                    Collections.sort(pelis, Comparator.comparing(Peliculas::getDirector));
                    ps.mostrar(pelis);
                    System.out.println(""); break;
                case 7:
                    System.err.println("Saludos.");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("Opción inválida. Vuelva a intentarlo.");
                    System.out.println("");
            }
            
        } while (salir);

    }

}
