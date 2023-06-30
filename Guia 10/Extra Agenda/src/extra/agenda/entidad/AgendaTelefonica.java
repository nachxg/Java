//Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
//La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y 
//mostrar los contactos ordenados alfabéticamente por nombre.
//En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono). 
//Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre, mostrar todos 
//los contactos o mostrar los contactos ordenados alfabéticamente.

package extra.agenda.entidad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AgendaTelefonica {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void crearContactos (HashMap<String,Long> agenda) {
        
        boolean salir = true;
        
        do {
            System.out.println("Ingrese el nombre del contacto: ");
            String nombre = leer.next().toUpperCase();
            System.out.println("Ingrese el número de teléfono: ");
            long numero = leer.nextLong();

            agenda.put(nombre, numero);

            System.out.println("¿Desea agregar otro contacto? S/N");
            String rta = leer.next();
            if (rta.equalsIgnoreCase("n")) {
                salir = false;
            }
        } while (salir);

    }
    
    public void mostrarNormal (HashMap<String,Long> agenda) {
    
        System.out.println("\nOrden normal: ");
        
        agenda.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Long value = entry.getValue();
            
            System.out.println("Contacto: " + key + "\nNúmero: " + value);
        });
    
    }
    
    public void mostrarOrden(HashMap<String,Long> agenda) {
        
        TreeMap<String,Long> agendaT = new TreeMap(agenda);
        
        System.out.println("\nOrden alfabético: ");
        for (Map.Entry<String, Long> entry : agendaT.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            
            System.out.println("Contacto: " + key + "\nNúmero: " + value);
            
        }
        
    }
    
    public void borrarContactos(HashMap<String,Long> agenda) {
    
        System.out.println("\nIngrese el nombre del contacto a borrar: ");
        String nombre = leer.next().toUpperCase();

        if (agenda.containsKey(nombre)) {
            agenda.remove(nombre);
            System.out.println("Se borró el contacto " + nombre + ".");
        } else {
            System.err.println("No se encontró el contacto.");
        }

    }
    
}
