//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.

package ej.pkg6.tienda;

import Servicios.TiendaServicios;
import java.util.HashMap;
import java.util.Scanner;

public class Ej6Tienda {

    public static void main(String[] args) {
        
        HashMap<String,Double> productos = new HashMap();
        TiendaServicios ts = new TiendaServicios();
        boolean salir = true;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Introducir un producto.");
            System.out.println("2. Modificar el precio de un producto.");
            System.out.println("3. Eliminar un producto.");
            System.out.println("4. Mostrar todos los productos con su precio.");
            System.out.println("5. Salir.");
            int opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: ts.introducirProductos(productos); break;
                case 2: ts.modificarPrecio(productos); break;
                case 3: ts.eliminarProducto(productos); break;
                case 4: ts.mostrar(productos); break;
                case 5: salir = false; break;
                default: System.out.println("Opción incorrecta.");
            } 
        } while (salir);
        
    }
    
}