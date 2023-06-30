//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

package Servicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void pedirPaises(TreeSet<String> paises) {
        
        boolean salir = true;
        
        do {
            
            System.out.print("Ingrese un país: ");
            String pais = leer.next().toUpperCase();

            paises.add(pais);

            System.out.print("\n¿Desea ingresar otro país? S/N.");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        
        System.out.println("\nPaíses: " + paises);
        
    }
    
    public void recorrer(TreeSet<String> paises) {
        
        Iterator<String> it = paises.iterator();
        boolean encuentra = false;
        System.out.println("\nIngrese el país a eliminar: ");
        String pais = leer.next();
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)) {
                it.remove();
                encuentra = true;
                System.out.println("\nPaíses (actualizado): " + paises);
            }
        }
        
        if (!encuentra) {
            System.err.println("\nEl país no se encontró.");
        }
        
    }
}
