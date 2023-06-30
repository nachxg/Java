//2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
//objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
//cada cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios.

package extra.pkg2.cantante;

import CantanteFamoso.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Extra2Cantante {

    public static void main(String[] args) {
        
        boolean salir = true;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<CantanteFamoso> lista = new ArrayList();
        
        do {
            System.out.println("\tMenú");
            System.out.println("1. Agregar un cantante.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Eliminar un cantante.");
            System.out.println("4. Salir.");
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    agregarCantantes(lista,leer);
                    break;
                case 2:
                    System.out.println(lista);
                    break;
                case 3: 
                    eliminarCantante(lista,leer);
                    break;
                case 4:
                    salir = false;
                    System.err.println("Saludos.");
                    break;
                default:
                    System.err.println("Opción inválida.");
            }
            
        } while (salir);
        
        
    }
    
    public static void agregarCantantes(ArrayList <CantanteFamoso> lista, Scanner leer) {
        
        boolean salir = true;
        
        do {
            
            System.out.println("Ingrese el nombre del cantante o banda: ");
            String nombre = leer.next();
            System.out.println("Ingrese su disco más vendido: ");
            String disco = leer.next();
            CantanteFamoso cf = new CantanteFamoso(nombre, disco);
            lista.add(cf);
            
            System.out.println("¿Desea agregar otro cantante?");
            String opc = leer.next();
            
            if (opc.equalsIgnoreCase("n")) {
                salir = false;
            }   
            
        } while (salir);
        
    }
    
    public static void eliminarCantante(ArrayList <CantanteFamoso> lista, Scanner leer) {
        
        System.out.println("Ingrese el nombre del cantante a eliminar: ");
        String nombre = leer.next();
        
        Iterator<CantanteFamoso> it = lista.iterator();
        
        while (it.hasNext()) {
            
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                System.out.println("El cantante fue eliminado.");
            }
            
        }
    
    
    }

}
