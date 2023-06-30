
package ej.pkg1y2.razas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Ej1y2Razas {

    public static void main(String[] args) {
        boolean opc = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> lista = new ArrayList();
        
        do {
            System.out.println("Ingrese una raza de perro para agregar a la lista: ");
            lista.add(leer.next().toUpperCase());
            System.out.println("¿Desea agregar otro elemento? (S/N)");
            if (leer.next().equalsIgnoreCase("n")) {
                opc = false;
            }
        } while (opc);
    
        Iterator<String> it = lista.iterator();
        
        System.out.println("");
        System.out.println("Lista: " + lista);
        System.out.println("");
        System.out.println("Ingrese una raza para remover de la lista: ");
        String raza = leer.next().toUpperCase();
        
        boolean noEsta = true;
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                noEsta = false;
            }
        }
        
        System.out.println("");
        
        if (noEsta) {
            System.err.println("La raza a eliminar no fue encontrada.");
        } 
        
        Collections.sort(lista);
        System.out.println("Lista actualizada: " + lista);
        
    }
    
}