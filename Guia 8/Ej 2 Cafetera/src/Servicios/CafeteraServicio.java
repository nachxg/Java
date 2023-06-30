//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
//los atributos capacidadMáxima (la cantidad máxima de café que puede contener la 
//cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
//Agregar constructor vacío y con parámetros así como setters y getters. Crear 
//clase CafeteraServicio en el paquete Servicios con los siguiente:
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
//máxima. 
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
//el tamaño de la taza y simula la acción de servir la taza con la capacidad 
//indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
//sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
//y de no haberse llenado en cuanto quedó la taza.
//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
//lo recibe y se añade a la cafetera la cantidad de café indicada.

package Servicios;
import Entidades.CafeteraEntidad;
import java.util.Scanner;
public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    CafeteraEntidad c1 = new CafeteraEntidad();
    
    public void llenarCafetera() {
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println(c1.getCantidadActual());
        System.out.println(c1.getCapacidadMaxima());
    }
    
    
    
    public void servirTaza() {
        System.out.println(c1.getCantidadActual());
        System.out.println("Ingrese el tamaño de la taza: ");
        int taza = leer.nextInt();

        if (c1.getCantidadActual() < taza) {
            System.out.println("No hay café para suficiente para llenar la taza. Se llenaron " + c1.getCantidadActual() + " litros.");
            c1.setCantidadActual(0);
        } else {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se llenó la taza correctamente. Restan " + c1.getCantidadActual() + " litros.");
        }
        
    }
    
    public void vaciarCafetera() {
  
        c1.setCantidadActual(0);
        System.out.println(c1.getCantidadActual());
    }
    
    public void agregarCafe() {
        System.out.println("Ingrese la cantidad de café a agregar: ");
        int cant = leer.nextInt();
        c1.setCantidadActual(c1.getCantidadActual() + cant);
        System.out.println(c1.getCantidadActual());
    }
    
}
