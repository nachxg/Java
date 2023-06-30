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

package Servicio;

import Entidad.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculasServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void crearPelicula(ArrayList<Peliculas> pelis) {

        boolean salir = true;

        do {

            Peliculas p = new Peliculas();

            System.out.print("Ingrese el título de la película: ");
            p.setTitulo(leer.next());
            System.out.print("Ingrese el director de la película: ");
            p.setDirector(leer.next());
            System.out.print("Ingrese la duración de la película: ");
            p.setDuracion(leer.nextDouble());

            pelis.add(p);

            System.out.println("");
            System.out.println("¿Desea ingresar otra película? S/N.");
            String resp = leer.next();
            System.out.println("");
            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }

        } while (salir);
        
    }

    public void mostrar(ArrayList<Peliculas> pelis) {
        pelis.forEach((peli) -> {
            System.out.println(peli);
        });
    }
    
    public void segunDuracion(double dur,ArrayList<Peliculas> pelis) {
        pelis.forEach((peli) -> {
            if (peli.getDuracion() >= dur) {
                System.out.println(peli);
            }
        });
    }

}
    
    
    

