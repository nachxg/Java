
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicios {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void introducirProductos(HashMap<String,Double> productos) {
        
        boolean salir = true;
        
        do {
            
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = leer.next().toUpperCase();
            System.out.print("Ingrese el precio del producto: ");
            Double precio = leer.nextDouble();

            productos.put(nombre, precio);
            System.out.println("");
            System.out.print("¿Desea seguir ingresando productos? S/N. ");
            String opc = leer.next();
            System.out.println("");
            
            if (opc.equalsIgnoreCase("N")) {
                salir = false;
            }
            
        } while (salir);

    }
    
    public void mostrar (HashMap<String,Double> productos) {
        
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println("Producto: " + nombre + ", Precio: " + precio); 
        }
        
    }
    
    public void modificarPrecio(HashMap<String,Double> productos) {
        System.out.println("Ingrese el nombre del producto a modificar: ");
        String nombre = leer.next().toUpperCase();
        
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio: ");
            double precio = leer.nextDouble();
            productos.put(nombre,precio);
            System.out.println("");
            System.out.println("Precio modificado correctamente.");
            System.out.println("");
        } else {
            System.err.println("El producto ingresado no existe.");
            System.out.println("");
        }
        
    }
    
     public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nombre = leer.next().toUpperCase();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.err.println("El producto no existe.");
        }

    }
    
}


